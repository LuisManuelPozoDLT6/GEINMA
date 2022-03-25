package mx.edu.utez.GEINMA.comment.model;

import mx.edu.utez.GEINMA.incedence.model.Incidence;
import mx.edu.utez.GEINMA.user.model.User;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String time;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "incidence_is")
    private Incidence incidence;

}
