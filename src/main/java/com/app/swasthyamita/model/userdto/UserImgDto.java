package com.app.swasthyamita.model.userdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserImgDto {
    private String fileName;
    private MultipartFile imgFile;
}
