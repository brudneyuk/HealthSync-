package med.HealthSync.api.dto;

import med.HealthSync.api.domain.paciente.Paciente;

public record ListagemPacienteDTO(Long id, String nome, String email, String cpf) {

    public ListagemPacienteDTO(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }

}
