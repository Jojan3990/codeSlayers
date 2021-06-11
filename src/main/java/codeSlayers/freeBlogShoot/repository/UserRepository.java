package codeSlayers.freeBlogShoot.repository;

import codeSlayers.freeBlogShoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //as soon as spring boot starts you need database connection due to which u need this
public interface UserRepository extends JpaRepository<User,Integer> {

}
