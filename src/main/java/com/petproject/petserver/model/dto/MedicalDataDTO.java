package com.petproject.petserver.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MedicalDataDTO {
    private Long id;

    private String type;
    private byte[] image;
    private String text;
}
