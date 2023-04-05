package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.masai.Bean.Clients;
import com.masai.Exception.ClientException;
import com.masai.Service.CLientService;

public class InsuranceController {
	@Autowired
	private CLientService cl;
	
	@PostMapping("/api/clients")
	public ResponseEntity<Clients> addClients(@RequestBody Clients cmr)throws ClientException{
		if(cmr == null) {
			throw new ClientException();
		}
		else {
			Clients sd = cl.addClient(cmr);
			return new ResponseEntity<Clients>(sd,HttpStatus.ACCEPTED);
		}
		
	}
	
	@DeleteMapping("/api/clients/{id}")
	ResponseEntity<Clients> Deleteclient(@PathVariable("id") Clients plant) throws ClientException{
		
		Clients pe = cl.removeClient(plant);
	
		return new ResponseEntity<Clients>(pe ,HttpStatus.ACCEPTED);
		
	}
	
	
	@GetMapping("/api/clients")
	public ResponseEntity<List<Clients>> viewAll()throws ClientException{

		List<Clients> find = cl.getallClient();

		return new ResponseEntity<List<Clients>>(find,HttpStatus.ACCEPTED);

	}
	
	
	
	@GetMapping("//api/clients/{id}")
	public ResponseEntity<Clients> findbyid(@PathVariable("id") Clients id)throws ClientException{

		Clients byid = cl.getClient(id);

		return new ResponseEntity<Clients>(byid,HttpStatus.ACCEPTED);

	}
	
	@PutMapping("/api/clients/{id}")
	ResponseEntity<Clients> putcliengt(@PathVariable("id") Clients pl) throws ClientException{
		
		Clients pe = cl.updateClient(pl);
	
		return new ResponseEntity<Clients>(pe ,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
}
