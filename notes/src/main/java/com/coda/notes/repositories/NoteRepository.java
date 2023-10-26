package com.coda.notes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coda.notes.models.Note;

public interface NoteRepository extends JpaRepository<Note,Integer>{
    
}
