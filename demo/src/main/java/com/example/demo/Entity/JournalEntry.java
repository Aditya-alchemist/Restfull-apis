package com.example.demo.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JournalEntry {
    private Long id;
    private String Name;
    private String Email;
}
