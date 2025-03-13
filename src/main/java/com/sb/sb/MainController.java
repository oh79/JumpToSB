package com.sb.sb;

import com.sb.sb.answer.AnswerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private final AnswerRepository answerRepository;

    MainController(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }
    @GetMapping("/sbb")
    @ResponseBody
    public String index(){
        return "안녕하세요 sbb에 오신 것을 환영합니다.";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }
}
