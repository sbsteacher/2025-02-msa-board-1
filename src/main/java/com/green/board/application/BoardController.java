package com.green.board.application;

import com.green.board.application.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/board")
    public String postBoard(@RequestBody BoardPostReq req) {
        System.out.println("req: " + req);
        int result = boardService.postBoard(req);
        return result == 1 ? "성공" : "실패";
    }

    @GetMapping("/board")
    public String getBoard(@RequestParam int id
                         , @RequestParam String title) {
        System.out.println("id: " + id);
        System.out.println("title: " + title);
        return "아무거나 적어보슈~~";
    }
}
