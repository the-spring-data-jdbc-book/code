package com.tsdjb.chapter1;

import org.springframework.data.annotation.Id;

class BoardGame {
    @Id
    Long id;
    String name;

    public BoardGame(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
