package com.green.board.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    private BoardService boardService;
    //BoardService 객체 주소값을 받아서 멤버필드에 대입하는 생성자 생성!



    @PostMapping("/board")
    public String postBoard() {
        return "이것은 포스트 통신입니다.";
    }

    @GetMapping("/board")
    public String getBoard(@RequestParam int id
                         , @RequestParam String title) {
        System.out.println("id: " + id);
        System.out.println("title: " + title);
        return "아무거나 적어보슈~~";
    }
}
