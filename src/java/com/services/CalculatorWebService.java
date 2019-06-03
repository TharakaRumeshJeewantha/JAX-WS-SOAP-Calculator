
package com.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class CalculatorWebService {
    
    @WebMethod
    public int add(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2) {
        return num1 + num2;
    }
    
        @WebMethod
    public int substract(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2) {
        return num1 - num2;
    }
    
        @WebMethod
    public int multifly(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2) {
        return num1 * num2;
    }
    
        @WebMethod
    public int divide(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2) {
        return num1 / num2;
    }
}
