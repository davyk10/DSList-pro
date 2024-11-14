package com.davy.dslist.DSlist_pro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davy.dslist.DSlist_pro.dtos.GameListDTO;
import com.davy.dslist.DSlist_pro.services.GameListService;

@RestController
@RequestMapping(value = "api/list")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        List<GameListDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
