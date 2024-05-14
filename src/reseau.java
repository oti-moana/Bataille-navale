import java.net.*;
import java.io.*;


public class reseau {

	private int port;
	Socket socketClient;
	ServerSocket socketServer;
	
	//constructeur simple
	public reseau(){
		port = 9632;
	}
	
	//constructeur avec port different
	public reseau(int inPort){
		port = inPort;
	}
	
	//creation d'un serveur tcp
	public void Server(){
		
		try{
		socketServer = new ServerSocket(port);
		System.out.println("Lancement du serveur");
		
		socketClient = socketServer.accept();
		System.out.println("Connexion avec : " + socketClient.getInetAddress());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//creation d'un client tcp
	public void Client(String host){
		
		try{
			InetAddress server = InetAddress.getByName(host);
			socketClient = new Socket(server, port);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	//demande d'une nouvelle valeur
	public int getValReseau(){
		int truc = 0;
		return truc;
	}
	
	//ecriture d'une nouvelle valeur
	public void setValReseau(){
		
	}
	
	//arret du reseau tcp
	public void CloseReseau() throws IOException{
		socketClient.close();
	}
}
