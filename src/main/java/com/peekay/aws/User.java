package com.peekay.aws;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="users")
public class User {
	
	@Id
	private Long id;
	private String username;
	private String firstName;
	private String lastName;

}
