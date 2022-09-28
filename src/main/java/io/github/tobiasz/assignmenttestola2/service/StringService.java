package io.github.tobiasz.assignmenttestola2.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String reverse(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }

    public String uppercase(String input) {
        return this.transform(input, TransformationMethod.UPPERCASE);
    }

    public String lowercase(String input) {
        return this.transform(input, TransformationMethod.LOWERCASE);
    }

    private String transform(String input, TransformationMethod method) {
        StringBuilder result = new StringBuilder();
        for (char aChar : input.toCharArray()) {
            int uppercaseAscii = ((int) aChar) - method.getAmount();
            if (method.isValidNumber(uppercaseAscii)) {
                result.append((char) uppercaseAscii);
            } else {
                result.append(aChar);
            }
        }
        return result.toString();
    }

    @RequiredArgsConstructor
    @Getter
    enum TransformationMethod {
        UPPERCASE(32),
        LOWERCASE(-32);

        private final int amount;

        public boolean isValidNumber(int number) {
            return switch (this) {
                case LOWERCASE -> number >= 97 && number <= 122;
                case UPPERCASE -> number >= 65 && number <= 90;
            };
        }
    }
}
