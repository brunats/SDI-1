/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webchat_t;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author adrianojr
 */
@WebService(serviceName = "CalcTst00")
public class CalcTst00 {

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     *//*
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
     */

    /**
     *
     * @param iVal1
     * @param iVal2
     * @return
     */
    @WebMethod(operationName = "soma")
    public int soma(@WebParam(name = "iVal1") int iVal1, @WebParam(name = "iVal2") int iVal2) {
        return iVal1 + iVal2;
    }

    /**
     * Operação de Web service
     *
     * @param iVal1
     * @param iVal2
     * @return
     */
    @WebMethod(operationName = "subtracao")
    public int subtracao(@WebParam(name = "iVal1") int iVal1, @WebParam(name = "iVal2") int iVal2) {
        //TODO write your implementation code here:
        return iVal1 - iVal2;
    }
}
