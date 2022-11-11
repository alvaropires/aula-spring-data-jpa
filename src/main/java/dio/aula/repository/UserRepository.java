package dio.aula.repository;

import dio.aula.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


//Extendemos da interface JpaRepository para reutilizar os métodos
//de manipulação e visualização do banco de dados.
public interface UserRepository extends JpaRepository<Users, Integer> {
    //Query Method
    List<Users> findByNameContaining(String name);
    //Query Override - Retorna a lista de usuários contendo a parte do name
    @Query("SELECT u FROM Users u WHERE u.name LIKE %:name%")
    List<Users> filtrarPorNome(@Param("name") String name);

    //Query Method - Retorna um usuário pelo campo username
    Users findByUsername(String username);
}
