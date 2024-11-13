package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	private final GameRepository gameRepository;
	
	public GameService(GameRepository gameRepository){
		this.gameRepository = gameRepository;
	}
	
	public List<GameMinDTO> findAll(){
	return gameRepository
			.findAll()
			.stream()
			.map(x -> new GameMinDTO(x))
			.toList();
	}
}
