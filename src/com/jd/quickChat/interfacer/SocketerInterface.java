package com.jd.quickChat.interfacer;


public interface SocketerInterface {
	
	public String sendHttpRequest(String params);
	public int startListening(int port);
	public void stopListening();
	public void exit();
	public int getListeningPort();

}
