@Repository
public interface PublicationsRepository extends JpaRepository<Publications, Long> {
 
    List<Publications> findByWholesaler(String wholesaler);
 
    List<Publications> findByName(String name);
 
    List<Publications> findByPublisher(String publisher);
 
    List<Publications> findByDays(int days);
 
    List<Publications> findByActive(boolean isActive);
 
    List<Publications> findByDatabaseId(String databaseId);
 
    List<Publications> findByDateCreated(LocalDate dateCreated);
 
    List<Publications> findByDateModified(LocalDate dateModified);
 
    List<Publications> findByAction(String action);
 
    void deleteByDatabaseId(String databaseId);
 
    void deleteByName(String name);
 
    void deleteByPublisher(String publisher);
 
    void deleteByDays(int days);
 
    void deleteByActive(boolean isActive);
 
    void deleteByDateCreated(LocalDate dateCreated);
 
    void deleteByDateModified(LocalDate dateModified);
 
    void deleteByAction(String action);
 
    void deleteByWholesaler(String wholesaler);
}