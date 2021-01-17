package com.ssau.spring.controllers;

import com.ssau.spring.NotesRepository;
import com.ssau.spring.UserRepository;
import com.ssau.spring.entity.Notes;
import com.ssau.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/notes")
public class NotesController {

    @Autowired
    private NotesRepository notesRepository;

    @GetMapping
    public String main(Model model){
        Iterable<Notes> notes = notesRepository.findAll();
        model.addAttribute("notes", notes);
        return "notes.html";
    }
}
