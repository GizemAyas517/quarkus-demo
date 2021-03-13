package com.demo.assignment.utils;


import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class StringUtils {


    private static String replaceNonAlphaNumericChar(String str){
        return str.replaceAll("([^A-Za-z0-9])+", "_");
    }

    private static List<String> convertStrToLogMessage(String str){
        List<String> stringResultList = new ArrayList<>();
        if (!str.isEmpty()){
            String[] strlist =  str.split(" ");
            stringResultList =  Arrays.stream(strlist).map(word -> replaceNonAlphaNumericChar(word)).collect(Collectors.toList());
            stringResultList = stringResultList.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());
        }
        return stringResultList;
    }

    public static String getLogMessage(String str){
        List<String> convertedStrList = convertStrToLogMessage(str);

        String message = convertedStrList.stream().collect(Collectors.joining(" "));

        return message;
    }


}
