package com.demo.assignment;

import com.demo.assignment.model.InputJSON;
import com.demo.assignment.utils.StringUtils;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ApplicationScoped
public class DemoService {

    @Inject
    Logger log;

    @Inject
    StringUtils stringUtils;

    public boolean validateInput(InputJSON inputJSON){
        if (inputJSON.inputStr.isEmpty()){
            log.warn("Given inputStr is empty.");
            return false;
        }
        return true;
    }

    public void convertStringToDesiredFormat(InputJSON inputJSON){
        if (validateInput(inputJSON)){
            String str = inputJSON.inputStr;
            log.info(stringUtils.getLogMessage(str));
        }
    }

}
