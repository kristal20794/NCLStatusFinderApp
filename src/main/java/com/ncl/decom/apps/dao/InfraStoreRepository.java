package com.ncl.decom.apps.dao;

import com.ncl.decom.apps.entity.ServiceStore;
import com.ncl.decom.apps.pojo.InfraStore;
import com.ncl.decom.apps.pojo.SummaryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InfraStoreRepository extends JpaRepository<ServiceStore,Long> {

    @Query(value="SELECT COUNT(ICTO),COUNT(SERVER),COUNT(DATABASE),SUM(TCOCOST) FROM INFRASTORE WHERE OWNER=:mpid",nativeQuery = true)
    List<SummaryDetails> getAdminViewDetails(String mpid);

    @Query(value="SELECT * FROM INFRASTORE WHERE OWNER=:mpid AND ICTO=:icto",nativeQuery = true)
    List<InfraStore> getICTOInfraDetails(String icto,String mpid);
}
