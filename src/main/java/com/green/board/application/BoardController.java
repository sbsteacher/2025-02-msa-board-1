package com.green.board.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @PostMapping("/board")
    public String postBoard() {
        return "이것은 포스트 통신입니다.";
    }

    @GetMapping("/board")
    public String getBoard(@RequestParam int id) {
        System.out.println("id:" + id);
        return "아무거나 적어보슈~~";
    }
}
