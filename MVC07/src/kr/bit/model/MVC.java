/*
 * JQuery
 * ajax(비동기식 자바스크립트 XML(Asynchronous Javascript And XML))
 * 
 *	var id=$("#id").val();
 * 	 $.ajax({
 * 		 url  	 : "<c:url value='/memberDbcheck.do'/>", // 전달받을 서버 url, jstl -> <c:url 하면 컨텍스트 패스를 가져온다.
 * 		 type 	 : " POST", 	// 전송방식
 * 		 data 	 : {"id" : id} // 변수 : 파라메터
 * 		 success : dbCheck,	//함수(calllback) 성공시 처리할 함수.
 * 		 error	 : function(){alert("error");}
 * 	 });
 * 
 * ajax (비동기통신)이란?
 * 
 * 
 * 1. 동기식 일처리방식
 * CLIENT             SERVER
 *   |
 *   |    요청
 *   v------------>
 *   대기 
 *                      처리
 *   |<------------
 *   |    응답
 *   |
 *   |
 *   |    요청
 *   v------------->
 *   대기                            처리
 *   
 *   |<------------
 *	 |    응답
 *   v
 *   
 * 2. 비동기식 일처리방식(ajax)
 * 
 * 
 *                  CLIENT                        SERVER
 *                    |          요청
 *                    |-------------------------->
 *         callback   |<-------------------------
 *             |      |          응답
 *             |      |
 *             |      |          요청
 *             v      |-------------------------->
 *         callback   |<-------------------------
 *             |      |          응답
 *             |      |
 *			   v	  v 
 * 
 * 1. 계속 일은 진행하되 시간이 걸리는 일은
 * 2. 콜백함수를 둬서 일을 진행한다.
 * 
 * 
 * 
 */