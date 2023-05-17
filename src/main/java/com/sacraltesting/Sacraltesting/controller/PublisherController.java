package com.sacraltesting.Sacraltesting.controller;

import com.sacraltesting.Sacraltesting.model.Publisher;
import com.sacraltesting.Sacraltesting.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/get/{databaseId}")
    public Publisher getPublisherByDatabaseId(@PathVariable Long databaseId) {
        return publisherService.findByDatabaseId(databaseId);
    }

    @GetMapping("/getByName/{name}")
    public Publisher getPublisherByName(@PathVariable String name) {
        return publisherService.findByName(name);
    }

    @GetMapping("/getByActive/{active}")
    public Publisher getPublisherByActive(@PathVariable boolean active) {
        return publisherService.findByActive(active);
    }

    @GetMapping("/getByDateCreated/{dateCreated}")
    public Publisher getPublisherByDateCreated(@PathVariable Date dateCreated) {
        return publisherService.findByDateCreated(dateCreated);
    }

    @GetMapping("/getByLastModified/{lastModified}")
    public Publisher getPublisherByLastModified(@PathVariable Date lastModified) {
        return publisherService.findByLastModified(lastModified);
    }

    @DeleteMapping("/delete/{databaseId}")
    public void deletePublisherByDatabaseId(@PathVariable Long databaseId) {
        publisherService.deleteByDatabaseId(databaseId);
    }

    @DeleteMapping("/deleteByName/{name}")
    public void deletePublisherByName(@PathVariable String name) {
        publisherService.deleteByName(name);
    }

    @DeleteMapping("/deleteByActive/{active}")
    public void deletePublisherByActive(@PathVariable boolean active) {
        publisherService.deleteByActive(active);
    }

    @DeleteMapping("/deleteByDateCreated/{dateCreated}")
    public void deletePublisherByDateCreated(@PathVariable Date dateCreated) {
        publisherService.deleteByDateCreated(dateCreated);
    }

    @DeleteMapping("/deleteByLastModified/{lastModified}")
    public void deletePublisherByLastModified(@PathVariable Date lastModified) {
        publisherService.deleteByLastModified(lastModified);
    }

    @GetMapping("/all")
    public List<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    @PostMapping("/save")
    public void savePublisher(@RequestBody Publisher publisher) {
        publisherService.savePublisher(publisher);
    }

}