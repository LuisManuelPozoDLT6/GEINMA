package mx.edu.utez.GEINMA.comment.controller;

import mx.edu.utez.GEINMA.comment.model.Comment;
import mx.edu.utez.GEINMA.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/comment")
@CrossOrigin(origins = {"*"})
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/")
    public ResponseEntity<Message>save(@RequestBody CommentDTO commentDTO){
        return commentService.save(new Comment(commentDTO.getDescription(), new Date().toString(), commentDTO.getUser(), commentDTO.getIncidence()));
    }
}
