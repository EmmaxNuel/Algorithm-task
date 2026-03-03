package todo.todoapp.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import todo.todoapp.data.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
