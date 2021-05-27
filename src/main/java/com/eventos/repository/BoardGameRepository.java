package com.eventos.repository;

import com.eventos.entity.BoardGameInfoExterno;
import com.eventos.entity.BoardGameInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BoardGameRepository extends JpaRepository<BoardGameInfo, String> {

    List<BoardGameInfo> findByNomeContainingIgnoreCase(String nome);




}
