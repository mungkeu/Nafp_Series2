package kr.bit.Model;
/*
 * JDBC
 * - Java소스 + SQL = 코드      =>   유지보수가 어렵다.
 * - 개발속도가 느리다.
 * 
 * --------------위의 단점을 해결하는 API -----------
 * 
 * iBatis 프레임워크 ==> MyBatis 프레임워크.
 * - Java소스와 SQL을 분리하자. (방법론과 API를 사용)
 * 
 * 
 * 				MyBatis(SQL Mapping Framework)
 * 
 *     java소스---------------------------------SQL
 *    1.노출(보안)		      Mappint
 *    2.개발속도가 느리다.
 *    3.유지보수가 어렵다.
 *    
 *    MyBatis 다운로드
 *    1. https://blog.mybatis.org/ -> Products -> MyBatis3의 Links의 docs를 클릭. 
 *    -> 왼쪽에 Getting Started 클릭 -> configuration XML file 아래 xml 파일 복사(아래와 같은 형식이 필요.)
 *    -> mybatis 패키지에 config.xml 파일 생성 후(패키지 우클릭 new -> other -> xml파일) 아래의 형식을 붙여 넣는다.
 *	    
 *<?xml version="1.0" encoding="UTF-8" ?>
 *<!DOCTYPE configuration
 *  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
 *  "http://mybatis.org/dtd/mybatis-3-config.dtd">
 *<configuration>
 *  <environments default="development">
 *    <environment id="development">
 *      <transactionManager type="JDBC"/>
 *      <dataSource type="POOLED">  ========================================> POOLED, 커넥션 풀을 만들어라
 *        <property name="driver" value="${driver}"/>
 *        <property name="url" value="${url}"/>
 *        <property name="username" value="${username}"/>
 *        <property name="password" value="${password}"/>
 *      </dataSource>
 *    </environment>
 *  </environments>
 *  <mappers>
 *    <mapper resource="org/mybatis/example/BlogMapper.xml"/>
 *  </mappers>
 *</configuration>
 *
 *	  2. DB 접속을 위한 URL, driver, username, passworld 파일이 필요하다.
 *       즉 properties 파일이 필요.
 *       (패키지 우클릭 new -> other -> general -> file -> 파일명을 db.properties로 한다. 확장자가 중요.
 *    
 *    driver=com.mysql.jdbc.Driver
 *    url=jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimeZone=UTC
 *    username=root
 *	  password=admin12345
 *
 * 	  위와 같이 key value형식으로 작성하면 된다. 주의 사항. 뒤쪽에 공백이 있는지 확인 있으면 꼭제거!
 * 
 * 	 3. SQL문장을 저장해놓은 파일(Mapper file)
 * 		https://blog.mybatis.org/ -> Products -> MyBatis3의 Links의 docs를 클릭. 
 *    	-> 왼쪽에 Getting Started 클릭 -> Exploring Mapped SQL Statements 부분까지 스크롤 내려서 아래 xml 파일 복사
 *    
 *<?xml version="1.0" encoding="UTF-8" ?>
 *<!DOCTYPE mapper
 * PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
 * "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
 *<mapper namespace="org.mybatis.example.BlogMapper">
 *<select id="selectBlog" resultType="Blog">
 *   select * from Blog where id = #{id}
 * </select>
 *</mapper>
 *
 * 	 패키지 우클릭 new -> other -> xml파일 생성 후 이름을 MemberMapper.xml로 설정
 * 
 * Mybatis를 사용하기 위해서는 위의 3가지 설정파일이 꼭필요하다.
 * 특히 config.xml이 가장중요 아래 properties 파일과 Mapper.xml 파일을 연동하기 때문이다.
 * 
 * 이렇게 각 파일을 설정 후 config.xml에 연동하고 마지막으로 이것을 읽기 위해서 MyBatis API가 필요하다.
 * 
 * https://blog.mybatis.org/ -> Products -> MyBatis3의 download 클릭 -> 원하는 버전 클릭 후 맨아래에서 zip파일 다운.
 * 
 * 이제 사용할 때는 XML로 부터 SqlSessionFactory를 Building해서 사용한다.
 * 
 *	String resource = "org/mybatis/example/mybatis-config.xml";
 *	InputStream inputStream = Resources.getResourceAsStream(resource);
 *	SqlSessionFactory sqlSessionFactory =
 *	new SqlSessionFactoryBuilder().build(inputStream);
 *
 * Connection POOL 기법
 * 		  connection(JDBC)  
 * java <-------------------> db
 * - 사용자가 사용할때 연결하고 끝나면 끊는다 유저가 많아질 수록 성능이 떨어진다.
 * 
 * - 그래서 만들어진 connection을 없애지 말고 재활용하자는 것이 MyBatis다.
 * 
 *          				Connection POOL 기법         -----이렇게 SqlSession들이 모아져 있는 곳을 SqlSessionFactory라고 한다.
 *   미리 커넥션을 만들어논다.    ㅁ   ㅁ   ㅁ   ㅁ   ㅁ   ㅁ  ㅁ   (이렇게 미리 커넥션을 만들어 놓는 것을 ConnectionPOOL), 5~8개 정도 만든다.
 *                              ^    ^    ^      
 *                              |    |    |        - user가 커넥션 풀에 있는 커넥션을 사용후 버리는게 아니라 반납한다.
 *                              v    v    v        - 만일 모든 커넥션 풀에 있는 커넥션을 사용하면 반납할 때까지 기다려야 한다.
 *                                 D   B
 * JDBC에서는 Connection이라고 했지만 MyBatis에서는 SqlSession이라고 부른다.
 * 
 * 즉 ConnectionPOOL을 만들고 SqlSessionFactory 객체가 가리키도록 하는게 가장 중요하다.
 */