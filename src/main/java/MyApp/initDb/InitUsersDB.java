package MyApp.initDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import MyApp.model.User;
import MyApp.service.UserService;

import javax.annotation.PostConstruct;

@Component
public class InitUsersDB {

    private UserService userService;

    @Autowired
    public InitUsersDB(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void initApiUserData() {
        userService.add(new User("Eugene","Eugene@mail.ru",(byte) 22 ));
        userService.add(new User("Mira","Mira@mail.ru",(byte) 23));
        userService.add(new User("Lilia","Lili@mail.ru",(byte) 21));
    }
}
