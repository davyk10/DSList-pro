package com.davy.dslist.DSlist_pro.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class BelongingPk {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private GameModel game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameListModel gameList;

}
