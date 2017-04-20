/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webchat_t;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author adrianojr
 */
@WebService(serviceName = "ChatService")
public class ChatService {

    private ArrayList<String> clientes;
    private String lastMensage;
    private int numMsg;

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     *
     * @param username
     * @return
     */
    @WebMethod(operationName = "ConnectClient")
    public Boolean ConnectClient(@WebParam(name = "username") String username) {
        if (clientes == null) {
	  clientes = new ArrayList();
	  numMsg = 0;
        } else if (clientes.contains(username)) {
	  return false;
        }
        clientes.add(username);
        lastMensage = "O usuário ".concat(username).concat(" se conectou!");
        numMsg++;
        return true;
    }

    /**
     * Operação de Web service
     *
     * @param username
     * @return
     */
    @WebMethod(operationName = "DisconnectClient")
    public Boolean DisconnectClient(@WebParam(name = "username") String username) {
        if (clientes == null) {
	  return true;
        } else {
	  if (clientes.remove(username)) {
	      lastMensage = "O usuário ".concat(username).concat(" se desconectou!");
	      numMsg++;
	      return true;
	  }
        }
        return false;
    }

    /**
     * Operação de Web service
     *
     * @param username
     * @param mensage
     * @return
     */
    @WebMethod(operationName = "SendMsg")
    public Boolean SendMsg(@WebParam(name = "username") String username, @WebParam(name = "mensage") String mensage) {
        if (clientes != null) {
	  if (clientes.contains(username)) {
	      lastMensage = username.concat(": ").concat(mensage);
	      numMsg++;
	      return true;
	  }
        }
        return false;
    }

    /**
     * Operação de Web service
     *
     * @param username
     * @param lstMsg
     * @return
     */
    @WebMethod(operationName = "ReceiveMsg")
    public String ReceiveMsg(@WebParam(name = "username") String username, @WebParam(name = "lstMsg") int lstMsg) {
        //TODO write your implementation code here:
        if (clientes != null) {
	  if (clientes.contains(username)) {
	      if (numMsg > lstMsg) {
		return lastMensage;
	      } else {
		return "nMsg";
	      }
	  }

        }
        return "Você não está conectado!";
    }
}
