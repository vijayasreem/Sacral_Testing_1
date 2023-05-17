package com.sacraltesting.Sacraltesting.service;

import com.sacraltesting.Sacraltesting.model.Publications;
import com.sacraltesting.Sacraltesting.repository.PublicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PublicationsService {

    @Autowired
    private PublicationsRepository publicationsRepository;

    public List<Publications> findByWholesaler(String wholesaler) {
        return publicationsRepository.findByWholesaler(wholesaler);
    }

    public List<Publications> findByName(String name) {
        return publicationsRepository.findByName(name);
    }

    public List<Publications> findByPublisher(String publisher) {
        return publicationsRepository.findByPublisher(publisher);
    }

    public List<Publications> findByDays(int days) {
        return publicationsRepository.findByDays(days);
    }

    public List<Publications> findByActive(boolean isActive) {
        return publicationsRepository.findByActive(isActive);
    }

    public List<Publications> findByDatabaseId(String databaseId) {
        return publicationsRepository.findByDatabaseId(databaseId);
    }

    public List<Publications> findByDateCreated(LocalDate dateCreated) {
        return publicationsRepository.findByDateCreated(dateCreated);
    }

    public List<Publications> findByDateModified(LocalDate dateModified) {
        return publicationsRepository.findByDateModified(dateModified);
    }

    public List<Publications> findByAction(String action) {
        return publicationsRepository.findByAction(action);
    }

    public void deleteByDatabaseId(String databaseId) {
        publicationsRepository.deleteByDatabaseId(databaseId);
    }

    public void deleteByName(String name) {
        publicationsRepository.deleteByName(name);
    }

    public void deleteByPublisher(String publisher) {
        publicationsRepository.deleteByPublisher(publisher);
    }

    public void deleteByDays(int days) {
        publicationsRepository.deleteByDays(days);
    }

    public void deleteByActive(boolean isActive) {
        publicationsRepository.deleteByActive(isActive);
    }

    public void deleteByDateCreated(LocalDate dateCreated) {
        publicationsRepository.deleteByDateCreated(dateCreated);
    }

    public void deleteByDateModified(LocalDate dateModified) {
        publicationsRepository.deleteByDateModified(dateModified);
    }

    public void deleteByAction(String action) {
        publicationsRepository.deleteByAction(action);
    }

    public void deleteByWholesaler(String wholesaler) {
        publicationsRepository.deleteByWholesaler(wholesaler);
    }
}