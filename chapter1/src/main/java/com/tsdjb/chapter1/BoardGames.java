package com.tsdjb.chapter1;

import org.springframework.data.repository.CrudRepository;

interface BoardGames extends CrudRepository<BoardGame, Long> {
    BoardGame findByName(String name);
}
