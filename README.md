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
    - [Controller.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/Controller.java) - POJO가 상속해야 할 인터페이스
    - [MemberContentController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberContentController.java) - 회원 정보 상세보기 POJO
    - [MemberDeleteController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberDeleteController.java) - 회원 정보 삭제 POJO
    - [MemberInsertController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberInsertController.java) - 회원 정보 등록 POJO
    - [MemberListController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberListController.java) - 회원 정보 리스트 출력 POJO
    - [MemberRegisterController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberRegisterController.java) - 회원 가입 화면 POJO
    - [MemberUpdateController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/controller/MemberUpdateController.java) - 회원 정보 수정 POJO
  - _Mybatis_
    - [MemberMapper.xml](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/mybatis/MemberMapper.xml) - MyBatis3의 작업 설정을 설명하는 XML 파일
    - [config.xml](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/mybatis/config.xml) - SQL 쿼리를 작성하는 파일
    - [db.properties](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/mybatis/db.properties) - DataBase 연결정보 기술(url,user,password)
  - _db_
    - [member.sql](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/db/member.sql) - 회원 DB 테이블 생성 및 테스트
  - _frontController_
    - [HandlerMapping.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/frontController/HandlerMapping.java) - 요청에 따른 분기작업
    - [MemberFrontController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/frontController/MemberFrontController.java) - 모든 요청을 처리하는 컨트롤러
    - [ViewResolver.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/src/kr/bit/frontController/ViewResolver.java) - View의 경로를 담당.
* _WebContent_
  - _WEB-INF/member_
    - [memberContent.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/WebContent/WEB-INF/member/memberContent.jsp) - 회원 상세보기 페이지 UI
    - [memberList.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/WebContent/WEB-INF/member/memberList.jsp) - 회원 정보 리스트 페이지 UI
    - [memberRegister.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC05/WebContent/WEB-INF/member/memberRegister.jsp) - 회원 가입 페이지 UI
  - _사용중인 lib_
    - [lib](https://github.com/mungkeu/Nafp_Series2/tree/main/MVC05/WebContent/WEB-INF/lib) - 사용중인 라이브러리

</br>

---

</br>

**3. MVC07 버전 Ajax기술을 이용한 회원관리 및 파일업로드 다운로드 기능 구현**
* _src.kr.bit_
  - _Model_
    - [MemberDAO.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/Model/MemberDAO.java) - MyBatis DAO 클래스
    - [MemberVO.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/Model/MemberVO.java) - 회원 VO 클래스  
    - [MVC.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/Model/MVC.java) - MVC06 정리
  - _controller_
    - [Controller.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/controller/Controller.java) - POJO가 상속해야 할 인터페이스
    - [MemberContentController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/controller/MemberContentController.java) - 회원 정보 상세보기 POJO
    - [MemberDeleteController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/controller/MemberDeleteController.java) - 회원 정보 삭제 POJO
    - [MemberInsertController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/controller/MemberInsertController.java) - 회원 정보 등록 POJO
    - [MemberListController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/controller/MemberListController.java) - 회원 정보 리스트 출력 POJO
    - [MemberRegisterController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/controller/MemberRegisterController.java) - 회원 가입 화면 POJO
    - [MemberUpdateController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/controller/MemberUpdateController.java) - 회원 정보 수정 POJO
    - [MemberLoginController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/controller/MemberLoginController.java) - 로그인 POJO(쿠키,세션)
    - [MemberLogoutController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/controller/MemberLogoutController.java) - 로그아웃 POJO(쿠키,세션)
  - _Mybatis_
    - [MemberMapper.xml](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/mybatis/MemberMapper.xml) - MyBatis3의 작업 설정을 설명하는 XML 파일, Login, Logout 동작 쿼리 추가.
    - [config.xml](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/mybatis/config.xml) - SQL 쿼리를 작성하는 파일
    - [db.properties](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/mybatis/db.properties) - DataBase 연결정보 기술(url,user,password)
  - _db_
    - [member.sql](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/db/member.sql) - 회원 DB 테이블 생성 및 테스트
  - _frontController_
    - [HandlerMapping.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/frontController/HandlerMapping.java) - 요청에 따른 분기작업, Login, Logout mapping 추가
    - [MemberFrontController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/frontController/MemberFrontController.java) - 모든 요청을 처리하는 컨트롤러
    - [ViewResolver.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/src/kr/bit/frontController/ViewResolver.java) - View의 경로를 담당.
* _WebContent_
  - _WEB-INF/member_
    - [memberContent.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/WebContent/WEB-INF/member/memberContent.jsp) - 회원 상세보기 페이지 UI(수정)
    - [memberList.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/WebContent/WEB-INF/member/memberList.jsp) - 회원 정보 리스트 페이지 UI(수정)
    - [memberRegister.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC06/WebContent/WEB-INF/member/memberRegister.jsp) - 회원 가입 페이지 UI(수정)
  - _사용중인 lib_
    - [lib](https://github.com/mungkeu/Nafp_Series2/tree/main/MVC06/WebContent/WEB-INF/lib) - 사용중인 라이브러리

</br>

---

</br>

**2. MVC06 버전 HttpSession을 이용한 회원인증(로그인)기능 추가하기**
* _src.kr.bit_
  - _Model_
    - [MemberDAO.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/Model/MemberDAO.java) - MyBatis DAO 클래스
    - [MemberVO.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/Model/MemberVO.java) - 회원 VO 클래스  
    - [MVC.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/Model/MVC.java) - MVC07 정리
  - _controller_
    - [Controller.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/Controller.java) - POJO가 상속해야 할 인터페이스
    - [MemberContentController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberContentController.java) - 회원 정보 상세보기 POJO
    - [MemberDeleteController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberDeleteController.java) - 회원 정보 삭제 POJO
    - [MemberInsertController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberInsertController.java) - 회원 정보 등록 POJO
    - [MemberListController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberListController.java) - 회원 정보 리스트 출력 POJO
    - [MemberRegisterController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberRegisterController.java) - 회원 가입 화면 POJO
    - [MemberUpdateController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberUpdateController.java) - 회원 정보 수정 POJO
    - [MemberLoginController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberLoginController.java) - 로그인 POJO(쿠키,세션)
    - [MemberLogoutController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberLogoutController.java) - 로그아웃 POJO(쿠키,세션)
    - [MemberAjaxListController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberAjaxListController.java) - Ajax를 적용한 리스트 구현
    - [MemberAjaxDeleteController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/MemberAjaxDeleteController.java) - Ajax를 적용한 리스트 삭제.
    - [FileAddController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/FileAddController.java) - 파일 업로드 구현
    - [FileDelController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/FileDelController.java) - 파일 삭제 구현
    - [FileGetController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/controller/FileGetController.java) - 파일 수정 구현
  - _Mybatis_
    - [MemberMapper.xml](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/mybatis/MemberMapper.xml) - MyBatis3의 작업 설정을 설명하는 XML 파일, Login, Logout 동작 쿼리 추가.
    - [config.xml](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/mybatis/config.xml) - SQL 쿼리를 작성하는 파일
    - [db.properties](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/mybatis/db.properties) - DataBase 연결정보 기술(url,user,password)
  - _db_
    - [member.sql](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/db/member.sql) - 회원 DB 테이블 생성 및 테스트
  - _frontController_
    - [HandlerMapping.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/frontController/HandlerMapping.java) - 요청에 따른 분기작업, Login, Logout mapping 추가
    - [MemberFrontController.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/frontController/MemberFrontController.java) - 모든 요청을 처리하는 컨트롤러
    - [ViewResolver.java](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/src/kr/bit/frontController/ViewResolver.java) - View의 경로를 담당.
* _WebContent_
  - _WEB-INF/member_
    - [memberContent.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/WebContent/WEB-INF/member/memberContent.jsp) - 회원 상세보기 페이지 UI(Ajax사용)
    - [memberList.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/WebContent/WEB-INF/member/memberList.jsp) - 회원 정보 리스트 페이지 UI(Ajax사용)
    - [memberRegister.jsp](https://github.com/mungkeu/Nafp_Series2/blob/main/MVC07/WebContent/WEB-INF/member/memberRegister.jsp) - 회원 가입 페이지 UI(Ajax사용)
  - _사용중인 lib_
    - [lib](https://github.com/mungkeu/Nafp_Series2/tree/main/MVC07/WebContent/WEB-INF/lib) - 사용중인 라이브러리

</br>

---

</br>

