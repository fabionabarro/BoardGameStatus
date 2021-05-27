package com.eventos.service;

import com.eventos.controller.BoardgameController;
import com.eventos.entity.BoardGameInfoExterno;
import com.eventos.entity.BoardGameInfo;
import com.eventos.models.ApiGame;
import com.eventos.models.BoardGameApiExternaDTO;
import com.eventos.models.BoardGameInfoDTO;
import com.eventos.repository.BoardGameRepository;
import com.eventos.repository.BoardGameRepositoryBga;
import com.eventos.resources.ParameterStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardGameService {
    @Autowired
    BoardGameRepository boardGameRepository;
    @Autowired
    BoardGameRepositoryBga boardGameRepositoryBga;

    @Autowired
    RestTemplate restTemplate;

    private String CLIENT_ID = "JLBr5npPhV";


    static Logger LOGGER = LoggerFactory.getLogger(BoardGameService.class);
    public List<BoardGameInfoDTO> getAll() {
        List<BoardGameInfo> boardGameInfoList = boardGameRepository.findAll();
        List<BoardGameInfoDTO> boardGameInfoDTOList = new ArrayList<>();
        for (BoardGameInfo boardGameInfo : boardGameInfoList) {
            BoardGameInfoDTO boardGameInfoDTO = new BoardGameInfoDTO(boardGameInfo);
            boardGameInfoDTOList.add(boardGameInfoDTO);
        }
        return boardGameInfoDTOList;
    }

    public List<BoardGameInfoDTO> findByNomeContainingIgnoreCase(String nome) {
        List<BoardGameInfo> boardGameInfoList = boardGameRepository.findByNomeContainingIgnoreCase(nome);
        List<BoardGameInfoDTO> boardGameInfoDTOList = new ArrayList<>();
        for (BoardGameInfo boardGameInfo : boardGameInfoList) {
            BoardGameInfoDTO boardGameInfoDTO = new BoardGameInfoDTO(boardGameInfo);
            boardGameInfoDTOList.add(boardGameInfoDTO);
        }
        return boardGameInfoDTOList;
    }
    public BoardGameApiExternaDTO findByNomeContainingIgnoreCaseBga(String name) throws IOException {
        return restTemplate.getForObject("https://api.boardgameatlas.com/api/search?name={nome}&client_id={cliente}",BoardGameApiExternaDTO.class,name,CLIENT_ID);
    }

    public BoardGameInfoDTO save(BoardGameInfoDTO boardGameInfoDTO) {
        BoardGameInfo boardGameInfo = new BoardGameInfo(boardGameInfoDTO);
        BoardGameInfo save = boardGameRepository.save(boardGameInfo);
        return new BoardGameInfoDTO(save);
    }

    public BoardGameInfoDTO delete(BoardGameInfoDTO boardGameInfoDTO) {
        BoardGameInfo boardGameInfo = new BoardGameInfo(boardGameInfoDTO);
        boardGameRepository.delete(boardGameInfo);
        return new BoardGameInfoDTO(boardGameInfo);
    }


}