@Repository
public interface GetExistingDepositNotes_DepositTransferRepository extends JpaRepository<TransferNote, Long> {
    @Query("SELECT tn FROM TransferNote tn WHERE tn.transferId = :transferId AND tn.deleted = false ORDER BY tn.transferId DESC")
    List<TransferNote> findAllByTransferId(@Param("transferId") String transferId); 
}