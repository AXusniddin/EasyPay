package provider.beeline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import provider.beeline.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//    @Query(value = "select u from users u where u.phone_number like ?1")
    User findByPhoneNumber(String phone_number);
}
