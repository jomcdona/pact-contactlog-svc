package com.redhat.serverless.serverlessdemo.repository;

import com.redhat.serverless.serverlessdemo.model.contactdm;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<contactdm, Long>
{
}

