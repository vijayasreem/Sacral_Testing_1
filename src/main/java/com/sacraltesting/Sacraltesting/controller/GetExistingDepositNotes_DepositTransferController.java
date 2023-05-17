package com.sacraltesting.Sacraltesting.controller;

import com.sacraltesting.Sacraltesting.model.TransferNote;
import com.sacraltesting.Sacraltesting.service.GetExistingDepositNotes_DepositTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deposittransfer")
public class GetExistingDepositNotes_DepositTransferController {

    @Autowired
    GetExistingDepositNotes_DepositTransferService getExistingDepositNotes_DepositTransferService;

    @GetMapping("/{transferId}")
    public List<TransferNote> getExistingDepositNotes(@PathVariable String transferId) {
        return getExistingDepositNotes_DepositTransferService.findAllByTransferId(transferId);
    }
}