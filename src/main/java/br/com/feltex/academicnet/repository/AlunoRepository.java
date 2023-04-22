package br.com.feltex.academicnet.repository;

import br.com.feltex.academicnet.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
