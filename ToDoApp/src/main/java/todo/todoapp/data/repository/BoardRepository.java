package todo.todoapp.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import todo.todoapp.data.model.Board;

@Repository
public interface BoardRepository extends MongoRepository<Board,String> {

}
