package com.arise.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamMapsAndCollect {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		users.add(new User(1,"Kumar","secrete","kumar@gmail.com"));
		users.add(new User(2,"dhinesh","secrete","dhinesh@gmail.com"));
		users.add(new User(3,"vijay","secrete","vijay@gmail.com"));
		users.add(new User(4,"ajith","secrete","ajith@gmail.com"));
		
		List<UserDTO> usersDTO = new ArrayList<>();
		
		for(User user : users) {
			usersDTO.add(new  UserDTO(user.getId(),user.getUsername(),user.getEmail()));
		}
		
		for(UserDTO dto : usersDTO) {
			System.out.println(dto);
		}
		
		//using the stream API Map method
		users.stream().map(new Function<User, UserDTO>(){
			@Override
			public UserDTO apply(User user) {
				return new UserDTO(user.getId(),user.getUsername(),user.getEmail());
			}
		});
		
		// using the Lambda Expression.
		users.stream().map((User user)-> 
				 new UserDTO(user.getId(),user.getUsername(),user.getEmail()))
				.forEach((userdto)->
				{System.out.println(userdto);
				});
		
	}
}

class UserDTO {
	private int id;
	private String username;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDTO(int id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

}

class User{
	private int id;
	private String username;
	private String password;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
}
