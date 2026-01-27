package com.green.board.application;

import org.springframework.stereotype.Service;
/* 서버가 기동되면 @Service 애노테이션 가지고 있는 클래스는
싱글톤 객체화가 된다. 스프링 컨테이너가 객체화를 한다.
스프링 컨테이너는 객체의 주소값을 저장하고 있다.
그리고 누군가 해당 객체의 주소값을 달라고하면 DI해준다.
애노테이션을 붙이는 행위는 빈(Bean) 등록이라 한다. */
@Service
public class BoardService {
}
