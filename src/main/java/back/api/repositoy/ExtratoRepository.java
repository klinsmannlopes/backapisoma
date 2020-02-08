package back.api.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import back.api.model.Extrato;

@Repository
public interface ExtratoRepository extends CrudRepository<Extrato, Long> {
	
	@Query(value = "select e from Extrato e")
	public List<Extrato> buscaTodos ();
	
	@Query(value = "select sum(valor) from Extrato e")
	public Long saldo ();
	
}
