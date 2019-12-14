package it.unisa.C9Tutorial.authentication.dao;

import it.unisa.C9Tutorial.authentication.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Long> {
    //@Query("select u from User u left join fetch u.roles where u.email = :email")
    User findByEmail(String email);

}
