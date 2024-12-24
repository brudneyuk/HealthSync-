package med.voll.api.dto;

import med.voll.api.domain.paciente.Paciente;
import med.voll.api.domain.endereco.Endereco;

public record DetalhamentoPacienteDTO(Long id, String nome, String email, String cpf, Endereco endereco) {

    public DetalhamentoPacienteDTO(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco());
    }
}
