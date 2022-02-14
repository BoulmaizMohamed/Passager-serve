package AL.Passagerserver.repository;

import AL.Passagerserver.model.Passager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PassagerRepository extends JpaRepository<Passager, Long> {

    Optional<Passager> findByNum(int num);
}
