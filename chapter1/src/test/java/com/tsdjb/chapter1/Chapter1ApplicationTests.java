package com.tsdjb.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;

@DataJdbcTest
class Chapter1ApplicationTests {
	@Autowired
	BoardGames games;

	@Test
	void contextLoads() {
		BoardGame splendor = games.save(new BoardGame("Splendor"));
		BoardGame splendorReloaded = games.findByName("Splendor");
		System.out.println(splendorReloaded);
	}

}
