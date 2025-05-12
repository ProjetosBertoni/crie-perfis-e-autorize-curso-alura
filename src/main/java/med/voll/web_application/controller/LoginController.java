package med.voll.web_application.controller;

import jakarta.validation.Valid;
import med.voll.web_application.domain.RegraDeNegocioException;
import med.voll.web_application.domain.usuario.DadosAlteracaoSenha;
import med.voll.web_application.domain.usuario.Usuario;
import med.voll.web_application.domain.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    private final UsuarioService usuarioService;

    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @GetMapping("/login")
    public String carregaPaginaLogin(){
        return "autenticacao/login";
    }

    @GetMapping("/alterar-senha")
    public String carregarPaginaAlteracao(){
        return "autenticacao/formulario-alteracao-senha";
    }

    @PostMapping("/alterar-senha")
    public String alterarSenha(@Valid @ModelAttribute DadosAlteracaoSenha dados, BindingResult result, Model model, @AuthenticationPrincipal Usuario logado){
        if (result.hasErrors()){
            model.addAttribute("dados", dados);
            return "autenticacao/formulario-alteracao-senha";
        }

        try {
            usuarioService.alterarSenha(dados,  logado);
            return "redirect:home";
        }catch (RegraDeNegocioException e){
            model.addAttribute("erro", e.getMessage());
            model.addAttribute("dados", dados);
            return "autenticacao/formulario-alteracao-senha";

        }
    }
}
