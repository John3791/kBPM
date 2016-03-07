package engine;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NodeRepository extends CrudRepository<Node, UUID> {

    List<Node> findAll();
}