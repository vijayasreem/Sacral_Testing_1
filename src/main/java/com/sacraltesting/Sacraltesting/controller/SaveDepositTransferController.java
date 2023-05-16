package com.sacraltesting.sacraltesting.controller;

import com.sacraltesting.sacraltesting.entity.DepositTransferTempEntity;
import com.sacraltesting.sacraltesting.service.SaveDepositTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveDepositTransferController {

    @Autowired
    private SaveDepositTransferService saveDepositTransferService;

    @GetMapping(value = "/setIsActiveFalseByTransferId")
    public int setIsActiveFalseByTransferId(@RequestParam String transferId) {
        return saveDepositTransferService.setIsActiveFalseByTransferId(transferId);
    }

    @GetMapping(value = "/getDepositTransferTempEntityById")
    public DepositTransferTempEntity getDepositTransferTempEntityById(@RequestParam String transferId) {
        return saveDepositTransferService.getDepositTransferTempEntityById(transferId);
    }

    @GetMapping(value = "/getDepositSeq")
    public Integer getDepositSeq() {
        return saveDepositTransferService.getDepositSeq();
    }

    @PostMapping(value = "/setTransferStatusAndWorkflowStatusByTransferId")
    public int setTransferStatusAndWorkflowStatusByTransferId(@RequestParam String transferId,
                                                             @RequestParam Integer transferStatus,
                                                             @RequestParam Integer workflowStatus) {
        return saveDepositTransferService.setTransferStatusAndWorkflowStatusByTransferId(transferId, transferStatus, workflowStatus);
    }

    @PostMapping(value = "/saveDepositNotes")
    public int saveDepositNotes(@RequestParam String transferId, @RequestParam String depositNote) {
        return saveDepositTransferService.saveDepositNotes(transferId, depositNote);
    }

    @PostMapping(value = "/saveDepositTransferTempEntity")
    public int saveDepositTransferTempEntity(@RequestParam Integer referenceNumber,
                                            @RequestParam String transferId,
                                            @RequestParam Integer transferStatus,
                                            @RequestParam Integer workflowStatus,
                                            @RequestParam boolean isActive) {
        return saveDepositTransferService.saveDepositTransferTempEntity(referenceNumber, transferId, transferStatus, workflowStatus, isActive);
    }

}