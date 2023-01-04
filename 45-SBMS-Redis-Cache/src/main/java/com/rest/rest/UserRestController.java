package com.rest.rest;

import java.util.List;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.binding.User;

@RestController
public class UserRestController {

	private HashOperations<String, Integer, User> hashOps;

	public UserRestController(RedisTemplate<String, User> redisTemplate) {
		hashOps = redisTemplate.opsForHash();
	}

	// Here "Persons" is hash name which contains key-value
	@PostMapping("/store")
	public String storeData(@RequestBody User user) {
		hashOps.put("Persons", user.getUid(), user);
		return "Success";
	}

	@GetMapping("/user/{uid}")
	public User getData(@PathVariable Integer uid) {
		User value = hashOps.get("Persons", uid);
		return value;
	}

	@GetMapping("/users")
	public List<User> gwtAllValues() {
		return hashOps.values("Persons");
	}

	@DeleteMapping("/user/{uid}")
	public String deleteUsers(@PathVariable Integer uid) {
		hashOps.delete("Persons", uid);
		return "User Deleted Successfully";
	}
}
