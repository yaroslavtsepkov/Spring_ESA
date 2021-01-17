package com.ssau.spring.service;

import com.ssau.spring.NotesRepository;
import com.ssau.spring.UserRepository;
import com.ssau.spring.entity.Notes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class NotesService {

    private final NotesRepository notesRepository;

    @Autowired
    public NotesService(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public List<Notes> getUsers(){
        return notesRepository.findAll();
    }

}
