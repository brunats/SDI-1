/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjava;

/**
 *
 * @author Adriano ZJ
 */
public class Chat {

     private static int lstMsg;

     Chat() {
	  starter();
     }

     public void starter() {
	  System.out.println("ocorreu algo 1");
	  InterfaceChat.getInstance();
	  lstMsg = getNumMsg();
	  System.out.println("ocorreu algo 2");
	  new Thread() {
	       @Override
	       public void run() {
		    while (true) {
			 receberMsg();
		    }
	       }
	  }.start();
     }

     /*
     *	  Metodos de receber mensagens
      */
     public static void receberMsg() {
	  int tam = getNumMsg();
	  System.out.println(tam);
	  String msg;
	  if (lstMsg < tam) {
	       msg = receiveMsg(lstMsg);
	       InterfaceChat.getInstance().addMenssagem(msg);
	       lstMsg++;
	       System.out.println(msg);
	  }
     }

     /*
     * Metodos para enviar mensagens
      */
     public static void enviarMsg(String msg) {
	  if(0 < msg.length())
	       System.out.println(sendMsg2(msg));
     }

     private static int getNumMsg() {
	  clientjava.ChatService_Service service = new clientjava.ChatService_Service();
	  clientjava.ChatService port = service.getChatServicePort();
	  return port.getNumMsg();
     }

     private static Boolean sendMsg2(java.lang.String mensagem) {
	  clientjava.ChatService_Service service = new clientjava.ChatService_Service();
	  clientjava.ChatService port = service.getChatServicePort();
	  return port.sendMsg2(mensagem);
     }

     private static String receiveMsg(int lstMsg) {
	  clientjava.ChatService_Service service = new clientjava.ChatService_Service();
	  clientjava.ChatService port = service.getChatServicePort();
	  return port.receiveMsg(lstMsg);
     }
}
