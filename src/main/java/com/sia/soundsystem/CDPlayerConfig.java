package com.sia.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={CDPlayer.class, DVDPlayer.class})
public class CDPlayerConfig {

}
