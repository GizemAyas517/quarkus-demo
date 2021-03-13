package com.demo.assignment.model;

import javax.validation.constraints.NotBlank;

public class InputJSON {

    @NotBlank(message="InputStr may not be blank")
    public String inputStr;

    public InputJSON(){
    }

    public InputJSON(String inputStr){
        this.inputStr = inputStr;
    }
}
