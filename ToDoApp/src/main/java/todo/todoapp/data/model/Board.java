package todo.todoapp.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document


public class Board {
    @Id
    private String id;
    private String title;
    private Date dateCreated;

}
