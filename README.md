# JAVA, 전자정부 프레임워크 3.10.0
Used IDE : eGovframe.edu</br>
강의 : 인프런, [NarP Series]MVC 프레임워크는 내손에[나프2탄]
 
</br>

---

</br>

**1. MVC05 버전 MyBatis Framework를 이용한 회원관리 만들기**
* _src.kr.bit_
  - _Model_
    - [MemberDAO.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/Model/MemberDAO.java) - MyBatis DAO 클래스
    - [MemberVO.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/Model/MemberVO.java) - 회원 VO 클래스  
    - [MVC.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/Model/MVC.java) - MVC05 정리
  - _controller_
    - [Controller.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/Controller.java)
    - [MemberContentController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberContentController.java)
    - [MemberDeleteController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberDeleteController.java)
    - [MemberInsertController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberInsertController.java)
    - [MemberListController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberListController.java)
    - [MemberRegisterController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberRegisterController.java)
    - [MemberUpdateController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberUpdateController.java)
  - _Mybatis_
    - [MemberMapper.xml](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/mybatis/MemberMapper.xml)
    - [config.xml](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/mybatis/config.xml)
    - [db.properties](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/mybatis/db.properties)
  - _db_
    - [member.sql](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/db/member.sql) - 회원 DB 테이블 생성 및 테스트
  - _frontController_
    - [HandlerMapping.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/frontController/HandlerMapping.java)
    - [MemberFrontController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/frontController/MemberFrontController.java)
    - [ViewResolver.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/frontController/ViewResolver.java)
* _WebContent_
  - _WEB-INF/member_
    - [memberContent.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/WebContent/WEB-INF/member/memberContent.jsp)
    - [memberList.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/WebContent/WEB-INF/member/memberList.jsp)
    - [memberRegister.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/WebContent/WEB-INF/member/memberRegister.jsp)
  - _사용중인 lib_
    - [lib](https://github.com/mungkeu/Nafp_Series2/tree/main/MVC05/WebContent/WEB-INF/lib) - 사용중인 라이브러리

</br>

---

</br>
