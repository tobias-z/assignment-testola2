package io.github.tobiasz.assignmenttestola2.acceptance.cucumberconfig;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
@CucumberContextConfiguration
public class CucumberSpringContextConfig {

}
