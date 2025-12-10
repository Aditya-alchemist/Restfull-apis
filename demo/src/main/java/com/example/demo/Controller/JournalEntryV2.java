package com.example.demo.Controller;


import com.example.demo.Entity.JournalEntry;
import com.example.demo.Service.JavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryV2 {

@Autowired
private JavaService javaService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return null;
    }

    @PostMapping
    public  boolean CreateEntry(@RequestBody JournalEntry journalEntry){
        javaService.saveEntry(journalEntry);
        return true;

    }

    @GetMapping("id/{myid}")
    public JournalEntry getAllId(@PathVariable Long myid) {
        return null;
    }



}

