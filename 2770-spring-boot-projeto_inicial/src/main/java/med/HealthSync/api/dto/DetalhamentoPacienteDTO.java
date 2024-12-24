package med.HealthSync.api.dto;

import med.HealthSync.api.domain.paciente.Paciente;
import med.HealthSync.api.domain.endereco.Endereco;

public record DetalhamentoPacienteDTO(Long id, String nome, String email, String cpf, Endereco endereco) {

    public DetalhamentoPacienteDTO(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco());
    }
}
