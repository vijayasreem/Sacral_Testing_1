@Repository
public interface SaveDepositTransferRepository extends JpaRepository<DepositTransferTempEntity, Long> {

    @Modifying
    @Query("UPDATE DepositTransferTempEntity d SET d.isActive = false WHERE d.transferId = :transferId")
    int setIsActiveFalseByTransferId(@Param("transferId") String transferId);

    @Query("SELECT d FROM DepositTransferTempEntity d WHERE d.transferId = :transferId")
    DepositTransferTempEntity getDepositTransferTempEntityById(@Param("transferId") String transferId);

    @Query("SELECT MAX(d.referenceNumber) FROM DepositTransferTempEntity d")
    Integer getDepositSeq();

    @Transactional
    @Modifying
    @Query("UPDATE DepositTransferTempEntity d SET d.transferStatus = :transferStatus, d.workflowStatus = :workflowStatus WHERE d.transferId = :transferId")
    int setTransferStatusAndWorkflowStatusByTransferId(@Param("transferId") String transferId, @Param("transferStatus") Integer transferStatus, @Param("workflowStatus") Integer workflowStatus);

    @Transactional
    @Modifying
    @Query("INSERT INTO DepositTransferNotesTempEntity (transferId, depositNote) VALUES (:transferId, :depositNote)")
    int saveDepositNotes(@Param("transferId") String transferId, @Param("depositNote") String depositNote);

    @Transactional
    @Modifying
    @Query("INSERT INTO DepositTransferTempEntity (referenceNumber, transferId, transferStatus, workflowStatus, isActive) VALUES (:referenceNumber, :transferId, :transferStatus, :workflowStatus, :isActive)")
    int saveDepositTransferTempEntity(@Param("referenceNumber") Integer referenceNumber, @Param("transferId") String transferId, @Param("transferStatus") Integer transferStatus, @Param("workflowStatus") Integer workflowStatus, @Param("isActive") boolean isActive);

}