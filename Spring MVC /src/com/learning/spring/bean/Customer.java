package com.learning.spring.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.learning.spring.validation.CourseCode;


public class Customer {

	private String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=18,message="age should be greater than equal to 18")
	@Max(value=35,message="age should be less than equal to 35")
	private Integer age;
	
    @Pattern(regexp="^[a-zA-Z0-9]{5}",message="Invalid Postal code - only 5chars/digits")
	private String postalCode;
    
    @CourseCode(value="TOP",message="must starts with TOP")
    @NotNull(message="is required")
    private String courseCode;
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
