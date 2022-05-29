package com.app.swasthyamita.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDocDto {
    private String fileName;
    private MultipartFile idProofFile;
}
