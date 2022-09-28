package io.github.tobiasz.assignmenttestola2.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RevereStringServiceTest {

    @Autowired
    private RevereStringService revereStringService;

    @Test
    @DisplayName("can reverse a string")
    void canReverseAString() throws Exception {
        String actual = this.revereStringService.perform("hello");
        assertThat(actual).isEqualTo("olleh");
    }

}