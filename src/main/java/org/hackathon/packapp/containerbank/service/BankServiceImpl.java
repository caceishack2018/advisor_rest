
package org.hackathon.packapp.containerbank.service;

import java.util.Collection;

import org.hackathon.packapp.containerbank.model.Advisor;
import org.hackathon.packapp.containerbank.repository.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Mostly used as a facade for all ContainerBank controllers
 * Also a placeholder for @Transactional and @Cacheable annotations
 *
 * @author Wavestone
 */
@Service
public class BankServiceImpl implements BankService {

   
    private AdvisorRepository advisorRepository;
    

    @Autowired
    public BankServiceImpl(AdvisorRepository advisorRepository) {
     
        this.advisorRepository = advisorRepository;
      
    }




    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "advisors")
    public Collection<Advisor> findAdvisors() throws DataAccessException {
        return advisorRepository.findAll();
    }

	


}
