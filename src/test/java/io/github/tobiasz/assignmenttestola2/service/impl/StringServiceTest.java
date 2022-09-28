package io.github.tobiasz.assignmenttestola2.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringServiceTest {

    @Autowired
    private StringService stringService;

    @Test
    @DisplayName("can reverse a string")
    void canReverseAString() throws Exception {
        String actual = this.stringService.reverse("hello");
        assertThat(actual).isEqualTo("olleh");
    }

    @Test
    @DisplayName("can uppercase string")
    void canUppercaseString() throws Exception {
        String actual = this.stringService.uppercase("bob");
        assertThat(actual).isEqualTo("BOB");
    }

    @Test
    @DisplayName("can lowercase string")
    void canLowercaseString() throws Exception {
        String actual = this.stringService.lowercase("BOB");
        assertThat(actual).isEqualTo("bob");
    }

}