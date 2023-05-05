package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import med.voll.api.domain.direccion.DatosDireccion;


public record DatosRegistroPaciente(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,

        @NotBlank
        @Size(min = 0, max = 15)
        String telefono,

        //@Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")
        @NotBlank
        String documento,

        @NotNull @Valid DatosDireccion direccion) {
}
