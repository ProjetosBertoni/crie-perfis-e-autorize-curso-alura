package med.voll.web_application.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosRecuperacaoSenha(
        @NotBlank
        String novaSenha,
        @NotBlank
        String novaSenhaConfirmacao
) {
}
