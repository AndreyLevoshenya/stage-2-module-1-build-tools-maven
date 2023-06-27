package com.epam.demo;

import java.util.List;

import static com.epam.utils.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isPositive = false;
        if(args != null) {
            if(!args.isEmpty()) {
                for (String arg : args) {
                    isPositive = isPositiveNumber(arg);
                    if(!isPositive) {
                        return false;
                    }
                }
            }
        }
        return isPositive;
    }
}