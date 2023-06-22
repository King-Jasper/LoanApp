package com.peerLender.profile;

import com.peerLender.profile.domain.model.User;
import com.peerLender.profile.repositories.UserRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Builder
@SpringBootApplication
public class ProfileApplication {

//	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		userRepository.save(new User(1, "David", "Mark", 29, "Software Engineer"));
//		userRepository.save(new User(2, "John", "Smart", 35, "Quality Assurance"));
//		userRepository.save(new User(3, "Joy", "Steve", 40, "Pilot"));
//
//	}
}
