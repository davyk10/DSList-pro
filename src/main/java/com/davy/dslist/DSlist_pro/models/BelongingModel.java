package com.davy.dslist.DSlist_pro.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tb_belonging")
@EqualsAndHashCode(of = "id")
public class BelongingModel {

    @EmbeddedId
    private BelongingPk id = new BelongingPk();
    private Integer position;

    public BelongingModel() {
    }

    public BelongingModel(GameModel game, GameListModel list, Integer position) {
        this.id.setGame(game);
        this.id.setGameList(list);
        this.position = position;
    }

    public void setGame(GameModel game) {
        id.setGame(game);
    }

    public GameModel getGame() {
        return id.getGame();
    }

    public void setGameList(GameListModel list) {
        id.setGameList(list);
    }

    public GameListModel getGameList() {
        return id.getGameList();
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPosition() {
        return position;
    }
}
