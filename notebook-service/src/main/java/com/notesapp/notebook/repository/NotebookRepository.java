package com.notesapp.notebook.repository;

import com.notesapp.notebook.entity.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook, String> {
    Notebook findByName(String name);
}
