package com.example.demo.Controller;


import com.example.demo.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {


    private  Map<Long,JournalEntry> journalEntryMap = new HashMap();

    @GetMapping
    public List<JournalEntry> getAll() {
   return new ArrayList<>(journalEntryMap.values());
    }

    @PostMapping
    public  boolean CreateEntry(@RequestBody JournalEntry journalEntry){
     journalEntryMap.put(journalEntry.getId(),journalEntry);
     return true;

    }

    @GetMapping("id/{myid}")
    public JournalEntry getAllId(@PathVariable Long myid) {
        return journalEntryMap.get(myid);
    }


}

