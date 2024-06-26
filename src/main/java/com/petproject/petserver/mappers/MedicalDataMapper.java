package com.petproject.petserver.mappers;

import com.petproject.petserver.model.MedicalData;
import com.petproject.petserver.model.dto.MedicalDataDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MedicalDataMapper {
    MedicalDataDTO toMedicalDataDTO(MedicalData medicalData);
}
