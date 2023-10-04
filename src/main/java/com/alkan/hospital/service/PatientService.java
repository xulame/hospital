package com.alkan.hospital.service;

import com.alkan.hospital.dto.PatientDto;
import com.alkan.hospital.entity.Patient;

public interface PatientService {

    Patient findById(int id);
    Patient toEntity(PatientDto dto);
    PatientDto toDto(Patient entity);
    PatientDto create(PatientDto dto);

}