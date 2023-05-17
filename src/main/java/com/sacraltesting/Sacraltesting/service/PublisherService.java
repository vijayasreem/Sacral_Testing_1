package com.sacraltesting.Sacraltesting.service;

import com.sacraltesting.Sacraltesting.model.Publisher;
import com.sacraltesting.Sacraltesting.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public Publisher findByDatabaseId(Long databaseId) {
        return publisherRepository.findByDatabaseId(databaseId);
    }

    public Publisher findByName(String name) {
        return publisherRepository.findByName(name);
    }

    public Publisher findByActive(boolean active) {
        return publisherRepository.findByActive(active);
    }

    public Publisher findByDateCreated(Date dateCreated) {
        return publisherRepository.findByDateCreated(dateCreated);
    }

    public Publisher findByLastModified(Date lastModified) {
        return publisherRepository.findByLastModified(lastModified);
    }

    public void deleteByDatabaseId(Long databaseId) {
        publisherRepository.deleteByDatabaseId(databaseId);
    }

    public void deleteByName(String name) {
        publisherRepository.deleteByName(name);
    }

    public void deleteByActive(boolean active) {
        publisherRepository.deleteByActive(active);
    }

    public void deleteByDateCreated(Date dateCreated) {
        publisherRepository.deleteByDateCreated(dateCreated);
    }

    public void deleteByLastModified(Date lastModified) {
        publisherRepository.deleteByLastModified(lastModified);
    }

    public List<Publisher> getAllPublishers(){
        return publisherRepository.findAll();
    }

    public void savePublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

}