package com.tsdjb.chapter1;

import org.springframework.data.repository.CrudRepository;

public interface BoardGames extends CrudRepository<BoardGame, Long> {
    BoardGame findByName(String name);
}
