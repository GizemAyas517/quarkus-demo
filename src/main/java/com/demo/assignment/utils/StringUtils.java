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

    private static List<List<String>> convertStrToLogMessage(String str){
        ArrayList<List<String>> steps = new ArrayList<>();
        if (!str.isEmpty()){
            String[] strlist =  str.split("(\\s)+");

            steps.add(Arrays.stream(strlist).collect(Collectors.toList()));

            List<String> stepTwo =  Arrays.stream(strlist).map(word -> replaceNonAlphaNumericChar(word)).collect(Collectors.toList());
            steps.add(stepTwo);
            List<String> stepThree = stepTwo.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());
            steps.add(stepThree);
        }
        return steps;
    }

    public static String getLogMessage(String str){
        List<List<String>> steps = convertStrToLogMessage(str);
        StringBuilder stringBuilder = new StringBuilder();

        for (List<String> step : steps){
            String message = step.stream().collect(Collectors.joining(" ")) + " ";
            stringBuilder.append(message);
        }


        return stringBuilder.toString();
    }


}
