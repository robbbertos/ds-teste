package br.com.prova.desafio.controller;

import br.com.prova.desafio.DesafioService;
import br.com.prova.desafio.error.ResourceNotFoundException;
import br.com.prova.desafio.model.Patrimonio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/desafio/")
public class DesafioController {

    DesafioService desafioService;

    public DesafioController(DesafioService desafioService) {
        this.desafioService = desafioService;
    }

    @GetMapping(path = "all")
    public List<Patrimonio> listAll() {
        return desafioService.listAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Patrimonio> findPatrimonioById(@PathVariable("id") int id) {
        buscarById(id);
        return desafioService.findPatrimonioById(id);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<?> save(@Valid @RequestBody Patrimonio patrimonio) {
        return new ResponseEntity<>(desafioService.save(patrimonio), HttpStatus.OK);
    }

    private void buscarById(Integer id) {
        if (isNull(desafioService.findPatrimonioById(id))) {
            throw new ResourceNotFoundException("Patrimônio inexistente");
        }
    }
}
