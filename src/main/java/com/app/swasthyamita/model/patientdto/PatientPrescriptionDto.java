package com.app.swasthyamita.model.patientdto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientPrescriptionDto {
    private String prescriptionName;
    private MultipartFile file;
}
