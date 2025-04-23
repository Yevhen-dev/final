package org.example.finalproject.config;


import org.example.finalproject.repositories.MenuItemRepository;
import org.example.finalproject.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class DataBaseConfig implements WebMvcConfigurer {


    @Bean
    public CommandLineRunner commandLineRunner(final UserService userService, final MenuItemRepository menuItemRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                userService.registerUser("admin", "1234", "admin@gmail.com", "ROLE_ADMIN");
//                userService.registerUser("Me", "1234", "springtrialmail@gmail.com", "ROLE_USER");
//
//                MenuItem burger = new MenuItem("BigBro", "burger with cheese", 12.5);
//                MenuItem sand = new MenuItem("BLT", "bacon, lettuce, tomato", 10.0);
//                MenuItem hotDog = new MenuItem("HotDog", "sausage and bread", 8.7);
//
//                menuItemRepository.save(burger);
//                menuItemRepository.save(sand);
//                menuItemRepository.save(hotDog);


            }
        };
    }
}
