package com.jwilliams

class Librarian {
		String name
		String email
		String office
		String userName
		String password
		int telephone
		String library

    static constraints = {
		name blank:false, nullable:false
		email blank:false, nullable:false, email:true
		office blank:false, nullalbe:false
		userName blank:false, nullable:false, unique:true
		password blank:false, nullable:false
		telephone blank:false, nullable:false, minSize:10 maxSize:15
		library blank:false, nullable:false
    }
}
