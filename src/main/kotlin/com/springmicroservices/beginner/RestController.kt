package com.springmicroservices.beginner
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/employee")
class RestController {
	@RequestMapping("/welcome")
	fun welcome():String
	{
		var employee:Employee=Employee(1,"Rahul",30,"HR")
		return "Hello.."
	}
} 
