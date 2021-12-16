package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import client.ChatClientIF;

public class ChatServer extends UnicastRemoteObject implements ChatServerIF {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<ChatClientIF> chatClients;

	protected ChatServer() throws RemoteException {
		chatClients = new ArrayList<ChatClientIF>();
	}
	public synchronized void registerChatClient(ChatClientIF chatClient) throws RemoteException {
		// TODO Auto-generated method stub
		this.chatClients.add(chatClient);
	}
	public synchronized void brodcastMessage(String message) throws RemoteException {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<chatClients.size()) {
			chatClients.get(i++).retrieveMessage(message);
		}
	}

}
