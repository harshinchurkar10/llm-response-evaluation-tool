package com.bezkoder.spring.jpa.h2.model;

public class EvaluateResponse {

    private String responseA;
    private String responseB;

    public EvaluateResponse(String responseA, String responseB) {
        this.responseA = responseA;
        this.responseB = responseB;
    }

    public String getResponseA() {
        return responseA;
    }

    public String getResponseB() {
        return responseB;
    }
}