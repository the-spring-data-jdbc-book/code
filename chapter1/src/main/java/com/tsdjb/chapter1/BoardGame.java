package com.tsdjb.chapter1;

import org.springframework.data.annotation.Id;

public class BoardGame {
    @Id
    Long id;
    String name;

    public BoardGame(String name) {
        this.name = name;
    }
}
