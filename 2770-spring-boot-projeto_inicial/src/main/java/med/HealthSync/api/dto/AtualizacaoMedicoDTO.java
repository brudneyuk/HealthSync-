package med.HealthSync.api.dto;

import jakarta.validation.constraints.NotNull;
import med.HealthSync.api.domain.endereco.DadosEndereco;

public record AtualizacaoMedicoDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
