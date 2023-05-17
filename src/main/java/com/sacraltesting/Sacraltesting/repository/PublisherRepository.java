import org.springframework.data.jpa.repository.JpaRepository;

import com.sacraltesting.Sacraltesting.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    Publisher findByDatabaseId(Long databaseId);
    Publisher findByName(String name);
    Publisher findByActive(boolean active);
    Publisher findByDateCreated(Date dateCreated);
    Publisher findByLastModified(Date lastModified);
    void deleteByDatabaseId(Long databaseId);
    void deleteByName(String name);
    void deleteByActive(boolean active);
    void deleteByDateCreated(Date dateCreated);
    void deleteByLastModified(Date lastModified);
}