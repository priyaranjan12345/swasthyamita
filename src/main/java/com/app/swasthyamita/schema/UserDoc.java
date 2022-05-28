package com.app.swasthyamita.schema;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_doc")
public class UserDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doc_id")
    private long id;

    @Column(name = "doc_number")
    private String idNumber;

    @Column(name = "doc_name")
    private String fileName;

    @Column(name = "doc_path")
    private String filePath;
}