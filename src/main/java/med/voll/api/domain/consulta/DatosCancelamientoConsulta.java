package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.consulta.MotivoCancelamiento;

public record DatosCancelamientoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamiento motivo) {
}
