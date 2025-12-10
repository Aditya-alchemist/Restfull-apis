package com.example.demo.Entity;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@Document(collection = "journal_entries")
public class JournalEntry {

    @Id
    private String id;
    private String Name;
    private String Email;
    private Date date;
}
