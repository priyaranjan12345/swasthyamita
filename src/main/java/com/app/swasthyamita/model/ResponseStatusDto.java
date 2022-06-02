package com.app.swasthyamita.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStatusDto {
    private String message;
    private boolean isSuccess;
}
