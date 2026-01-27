package com.green.board.application.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

//board테이블에 post통신으로 들어오는 요청
@Setter
@Getter
@ToString
public class BoardPostReq {
    private String title;
    private String contents;
}
