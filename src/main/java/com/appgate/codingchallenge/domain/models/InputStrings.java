package com.appgate.codingchallenge.domain.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class InputStrings {

    @Size(min = 1, max = 1000,message = "El tamaño del campo sourceSubsequences debe tener una longitud mayor a 0 y meno o igual a 1000.")
    @Pattern(regexp = "[a-zA-Z]+",message = "El atributo sourceSubsequences solo admite letras inglesas.")
    private String sourceSubsequences;

    @Size(min = 1, max = 1000,message = "El tamaño del campo targetSubsequences debe tener una longitud mayor a 0 y meno o igual a 1000.")
    @Pattern(regexp = "[a-zA-Z]+",message = "El atributo targetSubsequences solo admite letras inglesas.")
    private String targetSubsequences;

}
