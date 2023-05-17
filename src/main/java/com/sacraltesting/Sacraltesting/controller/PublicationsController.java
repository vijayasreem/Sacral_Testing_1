package com.sacraltesting.Sacraltesting.controller;

import com.sacraltesting.Sacraltesting.model.Publications;
import com.sacraltesting.Sacraltesting.service.PublicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/publications")
public class PublicationsController {

    @Autowired
    private PublicationsService publicationsService;

    @GetMapping("/byWholesaler")
    public List<Publications> findByWholesaler(@RequestParam String wholesaler) {
        return publicationsService.findByWholesaler(wholesaler);
    }

    @GetMapping("/byName")
    public List<Publications> findByName(@RequestParam String name) {
        return publicationsService.findByName(name);
    }

    @GetMapping("/byPublisher")
    public List<Publications> findByPublisher(@RequestParam String publisher) {
        return publicationsService.findByPublisher(publisher);
    }

    @GetMapping("/byDays")
    public List<Publications> findByDays(@RequestParam int days) {
        return publicationsService.findByDays(days);
    }

    @GetMapping("/byActive")
    public List<Publications> findByActive(@RequestParam boolean isActive) {
        return publicationsService.findByActive(isActive);
    }

    @GetMapping("/byDatabaseId")
    public List<Publications> findByDatabaseId(@RequestParam String databaseId) {
        return publicationsService.findByDatabaseId(databaseId);
    }

    @GetMapping("/byDateCreated")
    public List<Publications> findByDateCreated(@RequestParam LocalDate dateCreated) {
        return publicationsService.findByDateCreated(dateCreated);
    }

    @GetMapping("/byDateModified")
    public List<Publications> findByDateModified(@RequestParam LocalDate dateModified) {
        return publicationsService.findByDateModified(dateModified);
    }

    @GetMapping("/byAction")
    public List<Publications> findByAction(@RequestParam String action) {
        return publicationsService.findByAction(action);
    }

    @DeleteMapping("/byDatabaseId")
    public void deleteByDatabaseId(@RequestParam String databaseId) {
        publicationsService.deleteByDatabaseId(databaseId);
    }

    @DeleteMapping("/byName")
    public void deleteByName(@RequestParam String name) {
        publicationsService.deleteByName(name);
    }

    @DeleteMapping("/byPublisher")
    public void deleteByPublisher(@RequestParam String publisher) {
        publicationsService.deleteByPublisher(publisher);
    }

    @DeleteMapping("/byDays")
    public void deleteByDays(@RequestParam int days) {
        publicationsService.deleteByDays(days);
    }

    @DeleteMapping("/byActive")
    public void deleteByActive(@RequestParam boolean isActive) {
        publicationsService.deleteByActive(isActive);
    }

    @DeleteMapping("/byDateCreated")
    public void deleteByDateCreated(@RequestParam LocalDate dateCreated) {
        publicationsService.deleteByDateCreated(dateCreated);
    }

    @DeleteMapping("/byDateModified")
    public void deleteByDateModified(@RequestParam LocalDate dateModified) {
        publicationsService.deleteByDateModified(dateModified);
    }

    @DeleteMapping("/byAction")
    public void deleteByAction(@RequestParam String action) {
        publicationsService.deleteByAction(action);
    }

    @DeleteMapping("/byWholesaler")
    public void deleteByWholesaler(@RequestParam String wholesaler) {
        publicationsService.deleteByWholesaler(wholesaler);
    }
}