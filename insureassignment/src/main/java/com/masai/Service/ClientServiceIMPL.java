package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Bean.Clients;
import com.masai.Exception.ClientException;
import com.masai.Repository.ClientRepo;
@Service
public class ClientServiceIMPL implements CLientService {

	@Autowired
	private ClientRepo cl;
	
	
	@Override
	public Clients addClient(Clients add) throws ClientException {
		
		Clients cv = cl.save(add);
		
		if(cv==null) {
			throw new ClientException("No Added");
		}
		return cv;
		
		
		
	}

	@Override
	public Clients removeClient(Clients add) throws ClientException {
		
		Optional<Clients> cm = cl.getById(add.getId());
		
		if(cm.isEmpty()) {
			throw new ClientException("Not Deleted");
		}
		else {
			cl.delete(add);
		}
		return cm.get();
	}

	@Override
	public Clients updateClient(Clients add) throws ClientException {
	Optional<Clients> cm = cl.getById(add.getId());
		
		if(cm.isEmpty()) {
			throw new ClientException("Not updated");
		}
		else {
			cl.save(add);
		}
		return cm.get();
	}

	@Override
	public Clients getClient(Clients add) throws ClientException {
	Optional<Clients> cm = cl.getById(add.getId());
		
		if(cm.isEmpty()) {
			throw new ClientException("Not detected");
		}
		else 
		return cm.get();
	}

	@Override
	public List<Clients> getallClient() throws ClientException {
		List<Clients> cm = cl.findAll();
		
		if(cm.isEmpty()) {
			throw new  ClientException("Not detected");
		}
		else {
			return cm;
		}
	}

}
