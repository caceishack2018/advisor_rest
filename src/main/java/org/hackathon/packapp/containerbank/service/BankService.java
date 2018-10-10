
package org.hackathon.packapp.containerbank.service;

import java.util.Collection;

import org.hackathon.packapp.containerbank.model.Advisor;
import org.springframework.dao.DataAccessException;


/**
 * Mostly used as a facade so all controllers have a single point of entry
 *
 * @author Wavestone
 */
public interface BankService {

   

    Collection<Advisor> findAdvisors() throws DataAccessException;

  
}
