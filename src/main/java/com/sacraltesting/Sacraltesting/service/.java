package com.sacraltesting.Sacraltesting.service;

import com.sacraltesting.Sacraltesting.model.TransferNote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetExistingDepositNotes_DepositTransferService {
    List<TransferNote> findAllByTransferId(String transferId); 
}