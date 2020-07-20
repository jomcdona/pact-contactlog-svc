package com.redhat.serverless.serverlessdemo.repository;

import com.redhat.serverless.serverlessdemo.model.contactdm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<contactdm, Long>
{
}

