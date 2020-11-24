package com.example.codeclan.hwannotatingonetomanyrelationships.components;

import com.example.codeclan.hwannotatingonetomanyrelationships.models.File;
import com.example.codeclan.hwannotatingonetomanyrelationships.models.Folder;
import com.example.codeclan.hwannotatingonetomanyrelationships.models.User;
import com.example.codeclan.hwannotatingonetomanyrelationships.repositories.FileRepository;
import com.example.codeclan.hwannotatingonetomanyrelationships.repositories.FolderRepository;
import com.example.codeclan.hwannotatingonetomanyrelationships.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        User user = new User("Lewis");
        userRepository.save(user);

        Folder folder1 = new Folder("apps",user);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("photos",user);
        folderRepository.save(folder2);

        File file1 = new File("doom","exe",50,folder1);
        fileRepository.save(file1);
        File file2 = new File("photo","jpg",2,folder2);
        fileRepository.save(file2);
        File file3 = new File("zoom","us",300,folder1);
        fileRepository.save(file3);
    }

}
