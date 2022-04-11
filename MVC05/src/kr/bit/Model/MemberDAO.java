package kr.bit.Model;

import java.io.InputStream;
// JDBC -> myBatis
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.bit.Model.MemberVO;

public class MemberDAO {
	private static SqlSessionFactory sqlSessionFactory; // [O O O O O]

	// 초기화 블럭 - 프로그램실행시 딱 한번만 실행되는 코드 영역
	static {
		try {
			String resource = "kr/bit/mybatis/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource); // 읽기, 이파일이 있을지 없을지 모르므로 예외처리.
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); // inputStream에 있는 내용 즉 xml 파일로 만든다.
																					// 커넥션풀을.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 회원 전체 리스트 보기
	public List<MemberVO> memberList() {
		// [Connection+Statement]=>SqlSession
		SqlSession session = sqlSessionFactory.openSession();
		List<MemberVO> list = session.selectList("memberList");
		session.close();// 반납
		return list;
	}

	// 회원 가입
	public int memberInsert(MemberVO vo) {
		SqlSession session = sqlSessionFactory.openSession();
		int cnt = session.insert("memberInsert", vo); // (SQL_ID, vo)
		session.commit();
		session.close(); // 반납
		return cnt;
	}
	
	// 회원 삭제
	public int memberDelete(int num) {
		SqlSession session = sqlSessionFactory.openSession();
		int cnt = session.delete("memberDelete", num);
		session.commit();
		session.close();
		return cnt;	
	}
	
	// 회원 상세보기
	public MemberVO memberContent(int num)
	{
		SqlSession session = sqlSessionFactory.openSession();
		MemberVO vo = session.selectOne("memberContent",num);
		session.close();
		return vo;
	}
	
	// 회원 수정하기
	public int memberUpdate(MemberVO vo) {
		SqlSession session = sqlSessionFactory.openSession();
		int cnt = session.update("memberUpdate", vo);
		session.commit();
		session.close();
		return cnt;
	}
}
