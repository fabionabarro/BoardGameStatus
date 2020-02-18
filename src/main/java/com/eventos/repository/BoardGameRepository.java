package com.eventos.repository;

import com.eventos.models.boardgameinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface BoardGameRepository extends JpaRepository<boardgameinfo, String>{

    boardgameinfo findByCodigo(long codigo);
    ArrayList<boardgameinfo> findByNomeContainingIgnoreCase(String nome);
}
