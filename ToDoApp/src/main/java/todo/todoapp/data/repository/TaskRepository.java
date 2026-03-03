package todo.todoapp.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import todo.todoapp.data.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task,String>{
}
