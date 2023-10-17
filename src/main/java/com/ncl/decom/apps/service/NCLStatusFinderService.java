package com.ncl.decom.apps.service;

import com.ncl.decom.apps.dao.InfraStoreRepository;
import com.ncl.decom.apps.entity.InfraStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NCLStatusFinderService {
    private InfraStoreRepository infraStoreRepository;


    @Autowired
    NCLStatusFinderService(InfraStoreRepository infraStoreRepository){
        this.infraStoreRepository=infraStoreRepository;
    }

    public Long saveInfraStoreDetail(InfraStore infraStore){
        infraStore=infraStoreRepository.saveAndFlush(infraStore);
        return infraStore.infraId;
    }
}
