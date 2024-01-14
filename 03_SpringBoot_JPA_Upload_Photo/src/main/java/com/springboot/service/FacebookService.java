package com.springboot.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.FacebookUser;
import com.springboot.repository.FacebookRepository;

@Service
public class FacebookService {

	@Autowired
  private FacebookRepository facebookRepository;
	
	
	public void faceBookSave() throws Exception {
		String path="C:\\Users\\MD NABI ALAM\\OneDrive\\Desktop\\Income\\Islamic Wallpaper\\Q.jpg";
		
		FacebookUser user = new FacebookUser();
		user.setName("MD NABI ALAM");
		user.setPw("1122@nabi");
		user.setUserName("nabi123@");
	
		
		long kb=Files.size(Paths.get(path));
		byte[] arr= new byte[(int) kb];
		FileInputStream fileInputStream=new FileInputStream(new File(path));
		fileInputStream.read(arr);
		fileInputStream.close();
		
		user.setUserPhoto(arr);
		
		facebookRepository.save(user);
	}
}
