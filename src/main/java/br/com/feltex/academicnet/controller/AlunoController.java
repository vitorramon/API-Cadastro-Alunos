package br.com.feltex.academicnet.controller;

import br.com.feltex.academicnet.model.Aluno;
import br.com.feltex.academicnet.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;
    // LISTAR
    @GetMapping
    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }
    //INCLUIR
    @PostMapping
    public void incluirAluno(@RequestBody Aluno aluno){
        alunoRepository.save(aluno);
    }

    //ALTERAR
    @PutMapping
    public void alterar(@RequestBody Aluno aluno){
        alunoRepository.save(aluno);
    }

    // Deletar
    @DeleteMapping("/{matricula}")
    public void deletar(@PathVariable Long matricula){
        alunoRepository.deleteById(matricula);
    }

    // CONSULTAR
    @GetMapping("/{matricula}")
    public Optional<Aluno> ler(@PathVariable Long matricula){
        return alunoRepository.findById(matricula);
    }


}
