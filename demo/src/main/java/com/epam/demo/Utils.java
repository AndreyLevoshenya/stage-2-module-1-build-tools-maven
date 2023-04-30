package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       if(args == null || args.isEmpty()) {
           return false;
       }
       else {
           for (String arg : args) {
               if(arg == null || arg.isEmpty()) {
                   return false;
               }
               else {
                   if(!StringUtils.isPositiveNumber(arg)) {
                       return false;
                   }
               }
           }
           return true;
       }
    }
}