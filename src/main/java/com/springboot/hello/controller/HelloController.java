package com.springboot.hello.controller;

import com.springboot.hello.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")  // 스프링이 이걸 찾는다 , HTTP의 모든요청을 받는다
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)//요청형식 GET만 받음
    public String hello() {
        return "Hello World";
    }
    @GetMapping(value = "/name") //이걸쓴다
    public String getName() { //매개변수가 없다
        return "hakjun";

    }
    @GetMapping(value = "/variable1/{variable}")//매개변수 //여기에 들어가는 값을 바꿀수있다
    public String getVariable1(@PathVariable String variable) { //이름이 일치해야한다
        return variable;

    }
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {//이름통일
                            //@PathVariable(value = "variable")String var;
        return var;
    }
////
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }



}
