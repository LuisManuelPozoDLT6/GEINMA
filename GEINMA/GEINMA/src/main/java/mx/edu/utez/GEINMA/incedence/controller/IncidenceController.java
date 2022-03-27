package mx.edu.utez.GEINMA.incedence.controller;

import mx.edu.utez.GEINMA.incedence.model.Incidence;
import mx.edu.utez.GEINMA.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/incidence")
@CrossOrigin(origins = {"*"})
public class IncidenceController {
    @Autowired
    IncidenceService incidenceService;

    @GetMapping("/")
    public ResponseEntity<Message> getAll(){return incidenceService.findAll();}

    @GetMapping("/{client}")
    public ResponseEntity<Message> getByClient(@PathVariable("client") long id){
        return incidenceService.findAllByClient(id);
    }

    @GetMapping("/{technical}")
    public ResponseEntity<Message> getByTechnical(@PathVariable("technical") long id){
        return incidenceService.findAllByTechnical(id);
    }

    @GetMapping("/{status}")
    public ResponseEntity<Message> getByStatus(@PathVariable("status") long id){
        return incidenceService.findAllByStatus(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> getById(@PathVariable("id") long id){
        return incidenceService.findById(id);
    }

    @PostMapping("/")
    public ResponseEntity<Message> save(@RequestBody IncidenceDTO incidenceDTO){
        return incidenceService.save(new Incidence(incidenceDTO.getDescription(), new Date().toString(), incidenceDTO.getClient(), incidenceDTO.getTechnical(), incidenceDTO.getStatus(), incidenceDTO.getExperience()));
    }

    @PutMapping("/")
    public ResponseEntity<Message> update(@RequestBody IncidenceDTO incidenceDTO){
        return incidenceService.save(new Incidence(incidenceDTO.getId(), incidenceDTO.getDescription(), new Date().toString(), incidenceDTO.getClient(), incidenceDTO.getTechnical(), incidenceDTO.getStatus(), incidenceDTO.getExperience()));
    }


}
