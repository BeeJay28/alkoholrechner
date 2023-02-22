package com.example.alkoholrechner.controller;

import javax.validation.constraints.*;


public record Data(@NotBlank String name,
                   Gender gender,
                   @NotNull @Positive Integer weight,
                   @NotNull @PositiveOrZero Integer beer,
                   @NotNull @PositiveOrZero Integer wine,
                   @NotNull @PositiveOrZero Integer corn,
                   @NotNull @PositiveOrZero Integer vodka,
                   @NotNull @PositiveOrZero Integer whiskey) {

}

