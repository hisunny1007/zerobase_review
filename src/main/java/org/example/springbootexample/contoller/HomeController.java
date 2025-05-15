package org.example.springbootexample.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Spring이 index.html or index.jsp 같은 뷰 파일 찾아서 사용자에게 응답으로 보여줌
    }

    // 브라우저에 표시할 HTML 파일 이름
    // resources/templates/index.html

}
