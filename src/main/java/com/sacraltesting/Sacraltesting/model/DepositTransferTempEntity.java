package com.sacraltesting.Sacraltesting.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DepositTransferTempEntity")
public class DepositTransferTempEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "referenceNumber")
    private Integer referenceNumber;

    @Column(name = "transferId")
    private String transferId;

    @Column(name = "transferStatus")
    private Integer transferStatus;

    @Column(name = "workflowStatus")
    private Integer workflowStatus;

    @Column(name = "isActive")
    private boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public Integer getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(Integer transferStatus) {
        this.transferStatus = transferStatus;
    }

    public Integer getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(Integer workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}