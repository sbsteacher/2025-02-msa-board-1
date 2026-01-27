package com.green.board.application;

import com.green.board.application.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    /* 파라미터(매개변수)는 FE부터 날라오는 데이터를 받는 용도로 사용
           @RequestBody는 JSON형태로 BODY에 담겨져있는 데이터를 받을 때 사용.
           JSON형태와 일치하는 클래스를 만들어 주면 된다. (필드명과 Key값이 같아야 한다)
         */
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
