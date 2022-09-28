package io.github.tobiasz.assignmenttestola2.controller;

import io.github.tobiasz.assignmenttestola2.service.impl.RevereStringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/string")
public class StringUtilityController {

    private final RevereStringService revereStringService;

    @GetMapping("/reverse")
    public String reverseString(@RequestParam("string") String input) {
        return this.revereStringService.perform(input);
    }

}
