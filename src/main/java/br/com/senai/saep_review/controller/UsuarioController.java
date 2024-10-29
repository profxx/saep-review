package br.com.senai.saep_review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.saep_review.entity.Usuario;
import br.com.senai.saep_review.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> insertNew(@RequestBody Usuario usuario){
        Usuario usuarioInserido = usuarioService.insertNew(usuario);
        return ResponseEntity.ok().body(usuarioInserido);
    }
}
