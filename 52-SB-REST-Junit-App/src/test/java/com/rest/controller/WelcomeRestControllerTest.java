package com.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.rest.service.WelcomeService;

@WebMvcTest(value=WelcomeRestControllerTest.class) // this annotation represent for which class we are performing unit testing 
public class WelcomeRestControllerTest {
 
	@MockBean  // this is used to create mock annotation 
	private WelcomeService service;
	
	@Autowired
	private MockMvc mockMvc;  // MockMvc is predefined class in spring boot test framework which is used to send request to webMvc method  
	
	@Test //It is used to represent this is junit test method  
	private void welcomeMsgTest() throws Exception {
		
		//here we created mock object 
		//defining mock obj behaviour     (this method tell when service.getMsg() method called then return given msg 
		when(service.getMsg()).thenReturn("Welcome to Ashok It");
		
		//Preparing request     ( to send the request to our rest controller and create  MockMvcRequestBuilders object
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");
		
		//Sending Request     (in above request is prepared now we want to send the req 
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();
		
		//Get the Response       (in above we send the request now we want to validate response getting from the method 
		MockHttpServletResponse response = mvcResult.getResponse();
		
		//validate response status code
		int status = response.getStatus();
		assertEquals(200, status);
	}
}
