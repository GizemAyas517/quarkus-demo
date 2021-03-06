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
        String testStr = "an.oth8r Sample.1nput-Str";
        String expectedResultStr = "an.oth8r Sample.1nput-Str an_oth8r Sample_1nput_Str AN_OTH8R SAMPLE_1NPUT_STR ";
        String result =  stringUtils.getLogMessage(testStr);
        Assertions.assertEquals(expectedResultStr,result);
    }

}
