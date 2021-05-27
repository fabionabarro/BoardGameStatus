package com.eventos.controller;

import com.eventos.models.BoardGameApiExternaDTO;
import com.eventos.models.BoardGameInfoDTO;
import com.eventos.service.BoardGameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/boardgame")
public class BoardgameController {
    static Logger LOGGER = LoggerFactory.getLogger(BoardgameController.class);

    @Autowired
    private BoardGameService boardGameService;

    @GetMapping
    public @ResponseBody
    ResponseEntity<List<BoardGameInfoDTO>> listaBoardgames() {
		List<BoardGameInfoDTO> boardGameInfoDTOList = boardGameService.getAll();
		LOGGER.info("GET info" + boardGameInfoDTOList.toString());

        return new ResponseEntity<>(boardGameInfoDTOList,HttpStatus.OK);
    }

    @GetMapping(value = "/internal/{nome}")
    public @ResponseBody
    ResponseEntity<List<BoardGameInfoDTO>> boardname (@PathVariable(value = "nome") String nome) {
        List<BoardGameInfoDTO> boardGameInfoDTOList = boardGameService.findByNomeContainingIgnoreCase(nome);
        return new ResponseEntity<>(boardGameInfoDTOList,HttpStatus.OK);
    }

    @GetMapping(value = "/external/{nome}")
    public @ResponseBody
    ResponseEntity<?> boardnamebga (@PathVariable(value = "nome") String name) throws IOException {
        return new ResponseEntity<>(boardGameService.findByNomeContainingIgnoreCaseBga(name),HttpStatus.OK);
    }

    @PostMapping()
    public BoardGameInfoDTO cadastraBoardgame(@RequestBody @Valid BoardGameInfoDTO boardGameInfoDTO) {
        BoardGameInfoDTO save = boardGameService.save(boardGameInfoDTO);
        LOGGER.info("POST "+ save.toString());
        return save;
    }

    @DeleteMapping()
    public BoardGameInfoDTO deletaBoardgame(@RequestBody BoardGameInfoDTO boardGameInfoDTO) {
        BoardGameInfoDTO delete = boardGameService.delete(boardGameInfoDTO);
        LOGGER.info("POST "+ delete.toString());
        return delete;
    }

    //@GetMapping(value = "/", produces="application/json" )
//	public @ResponseBody boardgameinfo boardcode(@RequestParam(value="codigo") long codigo){
//		boardgameinfo board = br.findByCodigo(codigo);
//		return board;
//	}
}