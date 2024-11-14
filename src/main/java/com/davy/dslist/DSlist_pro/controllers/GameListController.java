package com.davy.dslist.DSlist_pro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davy.dslist.DSlist_pro.dtos.GameListDTO;
import com.davy.dslist.DSlist_pro.dtos.GameMinDTO;
import com.davy.dslist.DSlist_pro.services.GameListService;
import com.davy.dslist.DSlist_pro.services.GameService;

@RestController
@RequestMapping(value = "api/list")
public class GameListController {

    @Autowired
    private GameListService service;

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        List<GameListDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId) {
        List<GameMinDTO> games = gameService.findByList(listId);
        return ResponseEntity.ok().body(games);
    }
}
