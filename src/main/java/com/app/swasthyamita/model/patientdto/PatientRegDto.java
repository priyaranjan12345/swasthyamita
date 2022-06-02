package com.app.swasthyamita.model.patientdto;

import com.app.swasthyamita.model.userdto.UserDocDto;
import com.app.swasthyamita.model.userdto.UserImgDto;
import com.app.swasthyamita.schema.patient.PatientHabit;
import com.app.swasthyamita.schema.user.User;
import com.app.swasthyamita.schema.user.UserAddress;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientRegDto {
    private User user;
    private UserAddress userAddress;

    private UserImgDto userImgDto;
    private UserDocDto userDocDto;
    private PatientHabit patientHabit;
    private List<PatientPrescriptionDto> patientPrescriptions;
    private List<PatientReportsDto> patientReports;
}
