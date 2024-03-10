package org.tts.spring.scaffold.web;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App {
    public static void main(final String[] args) {
        final SpringApplicationBuilder applicationBuilder =
                new SpringApplicationBuilder()
                        .main(App.class)
                        .sources(App.class)
                        .bannerMode(Mode.CONSOLE)
                        .logStartupInfo(true);
        applicationBuilder.run(args);
    }
}
