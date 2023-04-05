package com.masai.Service;

import java.util.List;

import com.masai.Bean.Claims;
import com.masai.Bean.Clients;
import com.masai.Bean.Insurance;
import com.masai.Exception.ClaimException;
import com.masai.Exception.InsurnceException;

public interface InsuranceService {
public Insurance addClient(Insurance add) throws InsurnceExceptionr;
	
	public Insurance removeClient(Insurance add) throws InsurnceExceptionr;
	
	public Insurance updateClient(Insurance add) throws InsurnceExceptionr;
	
	public Insurance getClient(Insurance add) throws InsurnceExceptionr;
	
	public  List<Insurance>  getallClient() throws InsurnceExceptionr;
}s
