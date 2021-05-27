package com.eventos.repository;

import com.eventos.entity.BoardGameInfo;
import com.eventos.entity.BoardGameInfoExterno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardGameRepositoryBga extends JpaRepository<BoardGameInfo, String> {

        List<BoardGameInfoExterno> findByNomeContainingIgnoreCase(String nome);

}
