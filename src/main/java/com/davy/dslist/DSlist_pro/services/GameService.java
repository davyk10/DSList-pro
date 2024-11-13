package com.davy.dslist.DSlist_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davy.dslist.DSlist_pro.dtos.GameMinDTO;
import com.davy.dslist.DSlist_pro.models.GameModel;
import com.davy.dslist.DSlist_pro.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<GameMinDTO> games = repository.findAll().stream().map(GameMinDTO::new).toList();
        return games;
    }

    public void insert(GameModel game) {
        if (game.getName() == null) {
            throw new IllegalArgumentException("Name can't be null.");
        }
        repository.save(game);
    }
}
