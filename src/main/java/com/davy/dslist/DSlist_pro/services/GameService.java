package com.davy.dslist.DSlist_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.davy.dslist.DSlist_pro.dtos.GameMaxDTO;
import com.davy.dslist.DSlist_pro.dtos.GameMinDTO;
import com.davy.dslist.DSlist_pro.models.GameModel;
import com.davy.dslist.DSlist_pro.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> games = repository.findAll().stream().map(GameMinDTO::new).toList();
        return games;
    }

    @Transactional(readOnly = true)
    public GameMaxDTO findById(Long id) {
        GameModel game = repository.findById(id).get();
        return new GameMaxDTO(game);
    }
}
