package com.davy.dslist.DSlist_pro.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.davy.dslist.DSlist_pro.dtos.GameListDTO;
import com.davy.dslist.DSlist_pro.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameListDTO> list = repository.findAll().stream().map(GameListDTO::new).toList();
        return list;
    }

}
