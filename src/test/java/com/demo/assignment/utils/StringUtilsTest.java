package com.demo.assignment.utils;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;


@QuarkusTest
public class StringUtilsTest {

    @Inject
    StringUtils stringUtils;

    @Test
    public void testLogMessage() {
        String testStr = "com.SQILLS.assignment an.oth8r Sample.1nput-Str";
        String expectedResultStr = "COM_SQILLS_ASSIGNMENT AN_OTH8R SAMPLE_1NPUT_STR";
        String result =  stringUtils.getLogMessage(testStr);
        Assertions.assertEquals(expectedResultStr,result);
    }

}
