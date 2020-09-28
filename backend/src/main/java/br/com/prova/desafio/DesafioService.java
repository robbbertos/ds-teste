package br.com.prova.desafio;

import br.com.prova.desafio.model.Patrimonio;
import br.com.prova.desafio.repository.DesafioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesafioService {

    DesafioRepository desafioRepository;

    public DesafioService(DesafioRepository desafioRepository) {
        this.desafioRepository = desafioRepository;
    }

    public List<Patrimonio> listAll() {
        return desafioRepository.findAll();
    }

    public Optional<Patrimonio> findPatrimonioById(int id) {
        return desafioRepository.findById(id);
    }

    public Object save(Patrimonio patrimonio) {
        return desafioRepository.save(patrimonio);
    }
}
