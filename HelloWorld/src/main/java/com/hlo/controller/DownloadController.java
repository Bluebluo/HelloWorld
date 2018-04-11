package com.hlo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hlo.webclass.utils.WeixinCst;
import com.thoughtworks.xstream.io.path.Path;

@Controller
public class DownloadController {

	@RequestMapping("/downloadFile")
	public ResponseEntity<byte[]> downloadFile(@RequestParam("name")String name,HttpServletRequest request) throws IOException {
		name = new String(name.getBytes("iso-8859-1"),"utf-8");
		String path = request.getServletContext().getRealPath("/"+name);
		File file = new File(path);
	    byte[] body = null;
	    InputStream is = new FileInputStream(file);
	    body = new byte[is.available()];
	    String fileName = file.getName();
	    is.read(body);
	    HttpHeaders headers = new HttpHeaders();
	    String downloadFileName=new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
	    headers.add("Content-Disposition", "attachment;fileName=" + downloadFileName);
	    HttpStatus statusCode = HttpStatus.OK;
	    ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
	    return entity;
	}
	/*
	@RequestMapping("/download")
	public void download(@RequestParam("name")String name) 
			throws Exception {
				name = new String(name.getBytes("iso-8859-1"),"utf-8");
			    //声明本次下载状态的记录对象
				//String path = WeixinCst.PATH+name;
				String path = request.getServletContext().getRealPath("/"+name);
				File file = new File(path);
				String fileName = file.getName();
			    //设置响应头和客户端保存文件名
				response.setContentType("application/octet-stream; charset=utf-8"); 
				response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
			    //用于记录以完成的下载的数据量，单位是byte
			    long downloadedLength = 0l;
			    try {
			        //打开本地文件流
			        InputStream inputStream = new FileInputStream(path);
			        //激活下载操作
			        OutputStream os = response.getOutputStream();

			        //循环写入输出流
			        byte[] b = new byte[2048];
			        int length;
			        while ((length = inputStream.read(b)) > 0) {
			            os.write(b, 0, length);
			            downloadedLength += b.length;
			        }

			        // 这里主要关闭。
			        os.close();
			        inputStream.close();
			    } catch (Exception e){
			    	e.printStackTrace();
			    }
			}
	*/
}
