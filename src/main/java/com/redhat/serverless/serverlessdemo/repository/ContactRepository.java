package com.redhat.serverless.serverlessdemo.repository;

import java.util.ArrayList;
import java.util.List;

import com.redhat.serverless.serverlessdemo.model.contactdm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<contactdm, Long>
{
    
    public List<contactdm> findContactByState(String state);
    public List<contactdm> findContactByCountry(String country);
        
}

