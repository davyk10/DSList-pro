package com.davy.dslist.DSlist_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.davy.dslist.DSlist_pro.models.GameModel;

public interface GameRepository extends JpaRepository<GameModel, Long> {

}
