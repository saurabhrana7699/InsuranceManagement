package com.masai.Service;

import java.util.List;

import com.masai.Bean.Claims;
import com.masai.Bean.Clients;
import com.masai.Exception.ClaimException;
import com.masai.Exception.ClientException;

public interface ClaimService {

public Claims addClient(Claims add) throws ClaimException;
	
	public Claims removeClient(Claims add) throws ClaimException;
	
	public Claims updateClient(Claims add) throws ClaimException;
	
	public Claims getClient(Claims add) throws ClaimException;
	
	public  List<Clients>  getallClient() throws ClaimException;
	
}
