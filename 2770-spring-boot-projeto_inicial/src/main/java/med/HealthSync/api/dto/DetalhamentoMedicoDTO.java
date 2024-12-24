package med.HealthSync.api.dto;

import med.HealthSync.api.domain.endereco.Endereco;
import med.HealthSync.api.domain.medico.Especialidade;
import med.HealthSync.api.domain.medico.Medico;

public record DetalhamentoMedicoDTO(Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {

    public DetalhamentoMedicoDTO(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
