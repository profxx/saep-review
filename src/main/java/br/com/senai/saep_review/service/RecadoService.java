package br.com.senai.saep_review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.saep_review.entity.Recado;
import br.com.senai.saep_review.repository.RecadoRepository;

@Service
public class RecadoService {

    @Autowired
    private RecadoRepository recadoRepository;

    // Find All
    public List<Recado> findAll(){
        return recadoRepository.findAll();
    }

    // Find By Id
    public Recado findById(Long id){
        return recadoRepository.findById(id).orElse(null);
    }

    // Insert New Recado
    public Recado insertNew(Recado recado){
        return recadoRepository.save(recado);
    }

    // Update
    public Recado update(Long id, Recado recadoAlterado){
        Recado recadoAtual = findById(id);
        recadoAtual.setLido(true);
        return recadoRepository.save(recadoAtual);
    }

    // Delete
    public Boolean deleteById(Long id){
        Recado recado = findById(id);
        if (recado == null){
            return false;
        }else{
            recadoRepository.deleteById(id);
            return true;
        }
    }





}
