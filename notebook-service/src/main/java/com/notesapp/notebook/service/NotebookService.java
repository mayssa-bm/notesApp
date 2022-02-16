package com.notesapp.notebook.service;

import com.notesapp.notebook.entity.Notebook;
import com.notesapp.notebook.repository.NotebookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotebookService {
    @Autowired
    private NotebookRepository notebookRepository;

    public Notebook createNotebook(Notebook notebook) {
        log.info("createNotebook method in NotebookService class");
        return notebookRepository.save(notebook);
    }

    public Notebook findNotebookByName(String name) {
        log.info("findNotebookByName method in NotebookService class");
        return  notebookRepository.findByName(name);
    }
}
