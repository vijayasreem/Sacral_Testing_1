package com.sacraltesting.sacraltesting.service;

import com.sacraltesting.sacraltesting.entity.DepositTransferTempEntity;
import com.sacraltesting.sacraltesting.repository.SaveDepositTransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SaveDepositTransferService {

    @Autowired
    private SaveDepositTransferRepository saveDepositTransferRepository;

    public int setIsActiveFalseByTransferId(String transferId) {
        return saveDepositTransferRepository.setIsActiveFalseByTransferId(transferId);
    }

    public DepositTransferTempEntity getDepositTransferTempEntityById(String transferId) {
        return saveDepositTransferRepository.getDepositTransferTempEntityById(transferId);
    }

    public Integer getDepositSeq() {
        return saveDepositTransferRepository.getDepositSeq();
    }

    public int setTransferStatusAndWorkflowStatusByTransferId(String transferId, Integer transferStatus, Integer workflowStatus) {
        return saveDepositTransferRepository.setTransferStatusAndWorkflowStatusByTransferId(transferId, transferStatus, workflowStatus);
    }

    public int saveDepositNotes(String transferId, String depositNote) {
        return saveDepositTransferRepository.saveDepositNotes(transferId, depositNote);
    }

    public int saveDepositTransferTempEntity(Integer referenceNumber, String transferId, Integer transferStatus, Integer workflowStatus, boolean isActive) {
        return saveDepositTransferRepository.saveDepositTransferTempEntity(referenceNumber, transferId, transferStatus, workflowStatus, isActive);
    }

}