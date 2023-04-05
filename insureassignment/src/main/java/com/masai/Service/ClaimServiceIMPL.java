package com.masai.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.masai.Bean.Claims;
import com.masai.Bean.Clients;
import com.masai.Exception.ClaimException;
import com.masai.Exception.ClientException;
import com.masai.Repository.ClaimRepo;

@Service
public class ClaimServiceIMPL implements ClaimService {

	@Autowired
	private ClaimRepo cl;

	@Override
	public Claims addClient(Claims add) throws ClaimException {
		  Claims   cv = cl.save(add);
			
			if(cv==null) {
				throw new ClientException("No Added");
			}
			return cv;
	}

	@Override
	public Claims removeClient(Claims add) throws ClaimException {
		
Optional<Claims> cm = cl.getById(add.getId());
		
		if(cm.isEmpty()) {
			throw new ClaimException("Not Deleted");
		}
		else {
			cl.delete(add);
		}
		return cm.get();
	}

	@Override
	public Claims updateClient(Claims add) throws ClaimException {
Optional<Claims> cm = cl.getById(add.getId());
		
		if(cm.isEmpty()) {
			throw new ClaimException("Not updated");
		}
		else {
			cl.save(add);
		}
		return cm.get();
	}

	@Override
	public Claims getClient(Claims add) throws ClaimException {
Optional<Claims> cm = cl.getById(add.getId());
		
		if(cm.isEmpty()) {
			throw new ClaimException("Not detected");
		}
		else 
		return cm.get();
	}

	@Override
	public List<Clients> getallClient() throws ClaimException {
List<Claims> cm = cl.findAll();
		
		if(cm.isEmpty()) {
			throw new  Claims("Not detected");
		}
		else {
			return cm;
		}
	}

	
}
