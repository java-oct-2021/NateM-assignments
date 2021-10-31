package com.ncm.dojoNinja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncm.dojoNinja.models.Dojo;
import com.ncm.dojoNinja.models.Ninja;
import com.ncm.dojoNinja.repositories.NinjaRepository;

@Service
public class NinjaService {

		@Autowired
		
		private NinjaRepository ninjaRepo;
		
		public List<Ninja> allNinjas(Dojo dojo){
			return ninjaRepo.findAll();
		}
		
		public Ninja oneNinja(Long id) {
			return ninjaRepo.findById(id).orElse(null);
		}
		
		public Ninja createNinja(Ninja newNinja) {
			return ninjaRepo.save(newNinja);
		}
}
