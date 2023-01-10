package com.game.gamerunner;

import com.game.gamerunner.Game.Mario;
import com.game.gamerunner.Game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.game.gamerunner.Game.Game;

@Configuration
public class GameRunnerConfiguration {

    @Bean
    public Game MarioGame(){
        return new Mario();
    }

    @Bean
    public Game PacmanGame(){
        return new Pacman();
    }
}
