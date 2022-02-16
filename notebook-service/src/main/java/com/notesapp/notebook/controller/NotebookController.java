package com.notesapp.notebook.controller;

import com.notesapp.notebook.entity.Notebook;
import com.notesapp.notebook.service.NotebookService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notebook")
@Slf4j
public class NotebookController {

    @Autowired
    private NotebookService notebookService;

    @PostMapping("/")
    public Notebook createNotebook (@RequestBody Notebook notebook){
        log.info("createNotebook in NotebookController class");
        return notebookService.createNotebook(notebook);
    }

    @GetMapping("/{name}")
    public  Notebook findNotebookByName (@PathVariable("name") String name){
        log.info("findNotebookByName in NotebookController class");
        return notebookService.findNotebookByName(name);
    }


}
