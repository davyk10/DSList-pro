package com.davy.dslist.DSlist_pro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davy.dslist.DSlist_pro.dtos.GameMaxDTO;
import com.davy.dslist.DSlist_pro.dtos.GameMinDTO;
import com.davy.dslist.DSlist_pro.services.GameService;

@RestController
@RequestMapping(value = "api/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll() {
        List<GameMinDTO> games = service.findAll();
        return ResponseEntity.ok().body(games);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GameMaxDTO> findById(@PathVariable Long id) {
        GameMaxDTO game = service.findById(id);
        return ResponseEntity.ok().body(game);
    }
}
