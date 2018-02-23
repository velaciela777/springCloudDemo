package ink.hcode.cloud.springcloudprovider.repository;

import ink.hcode.cloud.springcloudprovider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
