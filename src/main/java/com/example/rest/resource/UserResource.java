package com.example.rest.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
	@GetMapping
	public List<User> getUsers() {
		return Arrays.asList(new User("Peter", 2000L), new User("John", 3000L), new User("Mark", 4000L),
				new User("Rony", 5000L));

	}
	
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName")final String userName) {
		return new User(userName, 2000L);
	}

	private class User {
		private String userName;
		private Long salary;

		public User(String userName, Long salary) {
			super();
			this.userName = userName;
			this.salary = salary;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getSalary() {
			return salary;
		}

		public void setSalary(Long salary) {
			this.salary = salary;
		}

	}

}
