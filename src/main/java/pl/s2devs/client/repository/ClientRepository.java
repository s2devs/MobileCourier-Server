package pl.s2devs.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.s2devs.client.model.Client;

/**
 * Created by rafal on 14.11.17.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByEmail(String email);

}
