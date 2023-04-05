package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Bean.Clients;
import com.masai.Bean.Insurance;
import com.masai.Exception.ClientException;
import com.masai.Repository.ClientRepo;
import com.masai.Repository.InsuranceRepo;

@Service
public class InsuranceServiceIMPL  implements InsuranceService{

	@Autowired
	private InsuranceRepo cl;

	@Override
	public Insurance addClient(Insurance add) throws InsurnceExceptionr {
Clients cv = cl.save(add);
		
		if(cv==null) {
			throw new ClientException("No Added");
		}
		return cv;
	}

	@Override
	public Insurance removeClient(Insurance add) throws InsurnceExceptionr {
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
	public Insurance updateClient(Insurance add) throws InsurnceExceptionr {
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
	public Insurance getClient(Insurance add) throws InsurnceExceptionr {
Optional<Clients> cm = cl.getById(add.getId());
		
		if(cm.isEmpty()) {
			throw new ClientException("Not detected");
		}
		else 
		return cm.get();
	}

	@Override
	public List<Insurance> getallClient() throws InsurnceExceptionr {
List<Clients> cm = cl.findAll();
		
		if(cm.isEmpty()) {
			throw new  ClientException("Not detected");
		}
		else {
			return cm;
		}
	}
}
