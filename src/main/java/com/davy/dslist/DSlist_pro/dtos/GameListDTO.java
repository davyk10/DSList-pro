package com.davy.dslist.DSlist_pro.dtos;

import com.davy.dslist.DSlist_pro.models.GameListModel;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameListModel list) {
        id = list.getId();
        name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
