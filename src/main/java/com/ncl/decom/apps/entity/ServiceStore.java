package com.ncl.decom.apps.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="SERVERSTORE")
public class ServiceStore {

    @Id
    @Column(name="INFRAID")
    private Long infraId;
    @Column(name="SERVER_NAME")
    private String serverName;
    @Column(name="SERVER_TYPE")
    private String serverType;

}
