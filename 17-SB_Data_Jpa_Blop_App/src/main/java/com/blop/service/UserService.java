package com.blop.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blop.entity.User;
import com.blop.repository.UserRepository;

@Service
public class UserService  {

    @Autowired
	private UserRepository userRepo;
    
    public void saveUser()throws Exception {
    	
    	String imagePath= "‪C:\\Users\\KIRAN\\Desktop\\Class\\download.jpg";
    	long size=Files.size(Paths.get(imagePath));
    	System.out.println(size);
    	User user=new User();
    	user.setUserName("Suresh");
    	user.setUserEmail("Suresh@gmail.com");
    	FileInputStream fis = new FileInputStream(new File(imagePath));
    
    	
    	byte[] arr = new byte[(int) size];
    	
    	fis.read(arr);
    	
    	user.setUserImage(arr);
    	
    	userRepo.save(user);
    }
	
}
