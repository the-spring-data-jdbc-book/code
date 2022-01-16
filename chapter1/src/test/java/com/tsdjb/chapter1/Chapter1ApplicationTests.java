package com.tsdjb.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJdbcTest
class Chapter1ApplicationTests {
	@Autowired
	BoardGameRepository games;

	@Test
	void contextLoads() {

		BoardGame splendor = games.save(new BoardGame("Splendor"));

		assertThat(splendor.id).isNotNull();

		BoardGame splendorReloaded = games.findByName("Splendor");

		assertThat(splendorReloaded.name).isEqualTo(splendor.name);

		System.out.println(splendorReloaded);
	}

}
