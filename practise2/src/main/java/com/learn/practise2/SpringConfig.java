package com.learn.practise2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.learn.practise2")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    /*
    here we can use @Bean to create 'beans' manually, and also we can do DI here manually:

    @Bean
    public PunkMusic punkMusic() {
        return new PunkMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(punkMusic());
    }

    NOTE: remember do delete @ComponentScan and @Component / @Autowired annotations. Also, you can use @Scope methods
    */
}
