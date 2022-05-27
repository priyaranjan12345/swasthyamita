package com.app.swasthyamita.model.patientdto;

import com.app.swasthyamita.model.UserAddressDto;
import com.app.swasthyamita.model.UserImgDto;
import com.app.swasthyamita.schema.PatientReports;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientRegDto {
    private String name;
    private String dob;
    private String gender;
    private String email;
    private String password;
    private String mobile;
    private String userType;
    private boolean isVerified;

    private UserAddressDto userAddressDto;
    private UserImgDto userImgDto;

    private List<PatientPrescriptionDto> patientPrescriptions;
    private List<PatientReports> patientReports;

}
