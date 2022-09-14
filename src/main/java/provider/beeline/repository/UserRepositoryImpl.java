package provider.beeline.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import provider.beeline.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl {
    
    private final EntityManager entityManager;
    
//    public List<User> findByPhoneNumber(String phone_number){
//        String param =String.format("select u from users u where u.phone_number like '%s'", phone_number);
//        Query query = entityManager.createNativeQuery(param, User.class);
//        return ;
//    }
}
