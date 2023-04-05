package com.masai.Service;

import java.util.List;

import com.masai.Bean.Clients;
import com.masai.Exception.ClientException;

public interface CLientService  {

	public Clients addClient(Clients add) throws ClientException;
	
	public Clients removeClient(Clients add) throws ClientException;
	
	public Clients updateClient(Clients add) throws ClientException;
	
	public Clients getClient(Clients add) throws ClientException;
	
	public  List<Clients>  getallClient() throws ClientException;
	
	
	
}
