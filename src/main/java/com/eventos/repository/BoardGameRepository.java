package com.eventos.repository;

import com.eventos.models.boardgameinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardGameRepository extends JpaRepository<boardgameinfo, String>{

    boardgameinfo findByCodigo(long codigo);
    boardgameinfo findByNomeContainingIgnoreCase(String nome);
}
