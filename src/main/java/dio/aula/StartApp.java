package dio.aula;

import dio.aula.model.Users;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        /*List<Users> users = repository.findByNameContaining("ALVARO");
        for(Users u: users) System.out.println(u);*/
        Users user = repository.findByUsername("alvaropires");
        System.out.println(user);
    }
    public void insertUser(){
        Users user = new Users();
        user.setName("ALVARO PIRES SANTOS");
        user.setUsername("alvaropires@gm");
        user.setPassword("vamover");

        repository.save(user);


        for(Users u: repository.findAll()){
            System.out.println(u);
        }
    }

}
