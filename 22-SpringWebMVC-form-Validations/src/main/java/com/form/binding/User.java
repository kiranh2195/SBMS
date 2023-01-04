package com.form.binding;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {

	@NotEmpty(message="uname is mandatory filed")
	@Size(min=4,max=5 , message="uname sholud be {min} to {max} charcter")
	private String uname;

	@NotEmpty(message="pwd is mandarory filed")
	private String pwd;

	@NotEmpty(message="email is madatory filed")
	@Email(message="enter valid email address")
	private String email;

	@NotEmpty(message="Phone no is required ")
	@Size(min=10 , message= "phone no must be 10 digits")
	private String phno;

	@NotNull(message="age is mandatory")// it is wrapper class so NotNull
	//@Size(min=21 , max=60 , message="Age should between {min} to {max} only")
	private Integer age; //if we take int then default value will be shown as 0 in the form because when we load the form all default values will be assign to instance variable 

}
