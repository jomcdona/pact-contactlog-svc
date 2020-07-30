package com.redhat.serverless.serverlessdemo.repository;

import java.util.ArrayList;
import java.util.List;

import com.redhat.serverless.serverlessdemo.model.contactdm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<contactdm, Long>
{
    
    //Interface for finding contact events by state
    public List<contactdm> findContactByState(String state);
    //Interface for finding contact events by country
    public List<contactdm> findContactByCountry(String country);
        
}

