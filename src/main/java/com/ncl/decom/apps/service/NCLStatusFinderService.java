package com.ncl.decom.apps.service;

import com.ncl.decom.apps.dao.InfraStoreRepository;
//import com.ncl.decom.apps.entity.ServiceStore;
import com.ncl.decom.apps.entity.ServiceStore;
import com.ncl.decom.apps.pojo.InfraStore;
import com.ncl.decom.apps.pojo.SummaryDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NCLStatusFinderService {
    private InfraStoreRepository infraStoreRepository;


    @Autowired
    NCLStatusFinderService(InfraStoreRepository infraStoreRepository){
        this.infraStoreRepository=infraStoreRepository;
    }

    public String saveInfraStoreDetail(ServiceStore serviceStore){
        serviceStore =infraStoreRepository.saveAndFlush(serviceStore);
        return serviceStore.toString();
    }

    public List<SummaryDetails> getAdminView(String mpid) {
        List<SummaryDetails> res= infraStoreRepository.getAdminViewDetails(mpid);
        return res;
    }

    public List<InfraStore> getICTOInfraDetails(String icto, String mpid) {
        List<InfraStore> res= infraStoreRepository.getICTOInfraDetails(icto,mpid);
        return res;
    }
}
