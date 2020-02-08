package back.api.repositoy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import back.api.model.Extrato;

@Repository
public interface ExtratoRepository extends CrudRepository<Extrato, Long> {
	
}
