package com.umu.ddaa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class AppRestController {

    @GetMapping
    public String getMessage() {
        return "Hello Everyone. Wish you a good day";
    }

    public int addTwoNumbers(int i, int i1) {
        return i + i1;
    }
}
