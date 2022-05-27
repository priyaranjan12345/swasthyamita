package com.app.swasthyamita.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_img")
public class UserImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userImgId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_path")
    private String filePath;
}
