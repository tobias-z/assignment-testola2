package io.github.tobiasz.assignmenttestola2.controller;

import io.github.tobiasz.assignmenttestola2.service.impl.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/string")
public class StringController {

    private final StringService stringService;

    @GetMapping("/reverse")
    public String reverseString(@RequestParam("string") String input) {
        return this.stringService.reverse(input);
    }

    @GetMapping("/uppercase")
    public String uppercaseString(@RequestParam("string") String input) {
        return this.stringService.uppercase(input);
    }

    @GetMapping("/lowercase")
    public String lowercaseString(@RequestParam("string") String input) {
        return this.stringService.lowercase(input);
    }

}
