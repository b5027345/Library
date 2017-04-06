package com.jwilliams

class Student {
		String name
		String email
		String userName
		String password
		String studentId
		String course

    static constraints = {
		name blank:false, nullable:false
		email blank:false, nullable:false, email:true
		userName blank:false, nullable:false, unique:true
		password blank:false, nullable:false
		studentId blank:false, nullable:false
		course blank:false, nullable:false
		
    }
}
