package mx.edu.utez.GEINMA.incedence.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.GEINMA.comment.model.Comment;
import mx.edu.utez.GEINMA.experience.model.Experience;
import mx.edu.utez.GEINMA.status.model.Status;
import mx.edu.utez.GEINMA.user.model.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Incidence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String dateRegistered;
    @OneToOne
    @JoinColumn(name = "client_id")
    private User client;
    @OneToOne
    @JoinColumn(name = "technical_id")
    private User technical;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
    @OneToOne
    @JoinColumn(name = "experience_id")
    private Experience experience;
    @OneToMany(mappedBy = "incidence")
    @JsonIgnore
    private List<Comment> comments;

}
