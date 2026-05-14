package com.leonardo.hotel_search_challenge;

import org.springframework.boot.SpringApplication;

public class TestHotelSearchChallengeApplication {

	static void main(String[] args) {
		SpringApplication.from(HotelSearchChallengeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
