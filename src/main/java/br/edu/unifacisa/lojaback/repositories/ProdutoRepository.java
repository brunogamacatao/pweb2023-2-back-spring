package br.edu.unifacisa.lojaback.repositories;

import br.edu.unifacisa.lojaback.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
