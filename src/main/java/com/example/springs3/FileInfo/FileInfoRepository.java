package com.example.springs3.FileInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileInfo, Integer> {
    public FileInfo getFileInfoByName(String name);

    //public void deleteFileInfoByName(String name);
    public boolean existsByName(String name);
}
