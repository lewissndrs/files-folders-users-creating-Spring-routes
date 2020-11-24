package com.example.codeclan.hwannotatingonetomanyrelationships.repositories;

import com.example.codeclan.hwannotatingonetomanyrelationships.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
