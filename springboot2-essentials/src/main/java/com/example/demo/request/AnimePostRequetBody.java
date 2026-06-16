package com.example.demo.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

@Data
public class AnimePostRequetBody {
    @NotEmpty(message = "the anime name cannot be empty")
    @NotNull

    // essa class e um DTO
    private String name;
}
