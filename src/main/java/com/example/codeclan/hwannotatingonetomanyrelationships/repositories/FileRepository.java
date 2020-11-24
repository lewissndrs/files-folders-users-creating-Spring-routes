package com.example.codeclan.hwannotatingonetomanyrelationships.repositories;

import com.example.codeclan.hwannotatingonetomanyrelationships.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File,Long> {
}
