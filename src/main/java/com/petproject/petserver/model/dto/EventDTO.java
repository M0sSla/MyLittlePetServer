package com.petproject.petserver.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class EventDTO {
    private Long id;

    private Long time;
    private String label;
    private Boolean repeatable;
}
