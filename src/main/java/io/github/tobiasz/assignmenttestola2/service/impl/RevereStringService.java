package io.github.tobiasz.assignmenttestola2.service.impl;

import io.github.tobiasz.assignmenttestola2.service.StringUtilityService;
import org.springframework.stereotype.Service;

@Service
public class RevereStringService implements StringUtilityService {

    @Override
    public String perform(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = input.length() -1; i >= 0; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }
}
