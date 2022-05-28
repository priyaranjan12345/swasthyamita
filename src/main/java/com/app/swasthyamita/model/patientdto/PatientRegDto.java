package com.app.swasthyamita.model.patientdto;

import com.app.swasthyamita.model.UserImgDto;
import com.app.swasthyamita.schema.PatientDetails;
import com.app.swasthyamita.schema.UserAddress;
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

    private PatientDetails patientDetails;
    private UserAddress userAddress;
    private UserImgDto userImg;

    private List<PatientPrescriptionDto> patientPrescriptions;
    private List<PatientReportsDto> patientReports;

}
