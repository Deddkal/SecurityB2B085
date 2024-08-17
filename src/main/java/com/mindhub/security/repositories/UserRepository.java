package com.mindhub.security.repositories;

import com.mindhub.security.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    Optional<UserEntity> findByEmail(String email);

    Optional<UserEntity> findByUserName(String username);

//    Optional<UserEntity> findByUserNameOrEmail(String username);

}
