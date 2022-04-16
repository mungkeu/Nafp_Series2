package kr.bit.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class FileAddController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String UPLOAD_DIR="file_repo";										// 운영체제에 맞게 설정.
		String uploadPath=request.getServletContext().getRealPath("")+File.separator+UPLOAD_DIR;
		File currentDirPath=new File(uploadPath); // 업로드할 경로를 File객체로 만들기.
		if(!currentDirPath.exists()) { // 디렉터리가 없으면 생성.
			currentDirPath.mkdir();
		}
		// 파일을 업로드 할때 먼저 저장될 임시 저장경로를 설정
		// file upload시 필요한 API - commons-fileupload, commons-io
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setRepository(currentDirPath); // 경로
		factory.setSizeThreshold(1024*1024); // 업로드 가능 용량
		
		String fileName=null;
		ServletFileUpload upload=new ServletFileUpload(factory);  // upload 객체에 경로 및 용량저장.
		try {	// items --> FileItem[ ], FileItem[ ], FileItem[ ]
			List<FileItem> items = upload.parseRequest(request); // request안에 여러개의 파일이 업로드 된 경우.
			for(int i=0;i<items.size();i++) {
				FileItem fileItem = items.get(i);
				if(fileItem.isFormField()) // 폼필드이면, 즉 파일업로드가 아닌 id pass등의 필드이면.
				{
					System.out.println(fileItem.getFieldName()+"="+fileItem.getString("utf-8"));
				}else { // 파일이면
					if(fileItem.getSize()>0) {
						int idx = fileItem.getFieldName().lastIndexOf("\\"); // (Window)
						if(idx==-1) {
							idx=fileItem.getFieldName().lastIndexOf("/");
						}
						fileName=fileItem.getName().substring(idx+1); // 파일 이름, idx가 \파일이름 이므로 인덱스를 하나 증가시켜서 이름을가져온다.
						File uploadFile=new File(currentDirPath+"\\"+fileName);
						// 파일 중복체크
						if(uploadFile.exists()) {
							fileName=System.currentTimeMillis()+"_"+fileName;
							uploadFile=new File(currentDirPath+"\\"+fileName);
						}
						fileItem.write(uploadFile); // 임시경로->새로운 경로에 파일 쓰기 (우리는 임시경로 겸 실제 경로로 사용.)
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		// $.ajax()쪽으로 업로드된 최종 파일이름을 전송시켜준다.
		response.setContentType("text/html;charset=euc-kr");
		response.getWriter().print(fileName);
		
		return null;
	}

}
