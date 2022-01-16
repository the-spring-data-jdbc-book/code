package com.tsdjb.chapter1;

import org.springframework.data.repository.CrudRepository;

interface BoardGameRepository extends CrudRepository<BoardGame, Long> {
    BoardGame findByName(String name);
}
