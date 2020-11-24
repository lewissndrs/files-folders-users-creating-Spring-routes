package com.example.codeclan.hwannotatingonetomanyrelationships.repositories;

import com.example.codeclan.hwannotatingonetomanyrelationships.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
