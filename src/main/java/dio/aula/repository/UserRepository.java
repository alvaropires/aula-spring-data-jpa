package dio.aula.repository;

import dio.aula.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


//Extendemos da interface JpaRepository para reutilizar os métodos
//de manipulação e visualização do banco de dados.
public interface UserRepository extends JpaRepository<Users, Integer> {

}
