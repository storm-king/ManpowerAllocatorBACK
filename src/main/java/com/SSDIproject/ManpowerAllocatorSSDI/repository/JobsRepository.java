/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SSDIproject.ManpowerAllocatorSSDI.repository;

import com.SSDIproject.ManpowerAllocatorSSDI.model.Jobs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author matthewthayer
 */
@Repository
public interface JobsRepository extends CrudRepository<Jobs, Integer>{
    
}