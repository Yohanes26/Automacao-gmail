package JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.DestinatarioEmail;

@Repository
public interface DestinatarioRepository extends JpaRepository<DestinatarioEmail, Long> {


}
