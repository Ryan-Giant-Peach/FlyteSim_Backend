package com.codeclan.example.FlyteSimGame;
import models.Player;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repositories.PlayerRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FlyteSimGameApplicationTests {

	@Autowired
	PlayerRepository playerRepository;

	@Test
	void contextLoads() {
	}





}
