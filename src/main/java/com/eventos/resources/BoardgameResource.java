package com.eventos.resources;

import javax.validation.Valid;

import com.eventos.models.boardgameinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.eventos.repository.BoardGameRepository;


@RestController
@RequestMapping("/boardgame")
public class BoardgameResource {

	@Autowired
	private BoardGameRepository br;

	@GetMapping(produces="application/json")
	public @ResponseBody  Iterable<boardgameinfo> listaBoardgames(){
		Iterable<boardgameinfo> boardGameInfos = br.findAll();
		return boardGameInfos;
	}

//	@GetMapping(value = "/", produces="application/json" )
//	public @ResponseBody boardgameinfo boardcode(@RequestParam(value="codigo") long codigo){
//		boardgameinfo board = br.findByCodigo(codigo);
//		return board;
//	}
	@GetMapping(value="/{nome}", produces="application/json")
	public @ResponseBody boardgameinfo boardname(@PathVariable(value="nome") String nome){
		return br.findByNomeContainingIgnoreCase(nome);
	}

	@PostMapping()
	public boardgameinfo cadastraBoardgame(@RequestBody @Valid boardgameinfo boardGameInfo){
		br.save(boardGameInfo);
		return boardGameInfo;
	}
	
	@DeleteMapping()
	public boardgameinfo deletaBoardgame(@RequestBody boardgameinfo boardGameInfo){
		br.delete(boardGameInfo);
		return boardGameInfo;
	}
}
