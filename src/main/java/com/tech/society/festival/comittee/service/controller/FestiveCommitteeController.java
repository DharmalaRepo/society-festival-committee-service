package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestiveCommittee;
import com.tech.society.festival.comittee.service.services.FestiveCommitteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-committees")
public class FestiveCommitteeController {

    @Autowired
    private FestiveCommitteeService service;

    @GetMapping("/health")
    public ResponseEntity<?> health() {
        return ResponseEntity.ok("Hello, welcome to Society Festival Committee Service..!!");
    }

    @PostMapping
    public FestiveCommittee create(@RequestBody FestiveCommittee committee) {
        return service.create(committee);
    }

    @PutMapping
    public FestiveCommittee update(@RequestBody FestiveCommittee committee) {
        return service.update(committee);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) {
        return service.delete(id);
    }

    @GetMapping("/{id}")
    public FestiveCommittee getById(@PathVariable String id) {
        return service.getById(id);
    }

    @GetMapping("/society/{societyId}")
    public List<FestiveCommittee> getBySocietyId(@PathVariable String societyId) {
        return service.getBySocietyId(societyId);
    }
}