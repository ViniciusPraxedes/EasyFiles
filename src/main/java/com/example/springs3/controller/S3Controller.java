//package com.example.springs3.controller;

import com.amazonaws.services.quicksight.model.Dashboard;
import com.example.springs3.FileInfo.FileInfo;
import com.example.springs3.FileInfo.FileInfoRepository;
import com.example.springs3.service.S3Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.time.LocalDate;
import java.util.List;

import static java.net.HttpURLConnection.HTTP_OK;
/*
@RestController
public class S3Controller {

    @Autowired
    private S3Service s3Service;

    @Autowired
    private FileInfoRepository fileInfoRepository;
    int id = 1;


    @PostMapping("upload")
    public String upload(@RequestParam("file")MultipartFile file,@Valid @RequestParam("description")String description){
        String nameOfTheFile = file.getOriginalFilename();
        if (fileInfoRepository.existsByName(nameOfTheFile)){
            return "file already exists";
        }
        FileInfo fileToBeSaved = new FileInfo(id++,file.getOriginalFilename(),description, LocalDate.now());
        fileInfoRepository.save(fileToBeSaved);
        return s3Service.saveFile(file);
    }
     */

    /*

    @GetMapping("download/{filename}")
    public ResponseEntity<byte[]> download(@PathVariable("filename") String filename){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-type", MediaType.ALL_VALUE);
        headers.add("Content-Disposition", "attachment; filename="+filename);
        byte[] bytes = s3Service.downloadFile(filename);

        return ResponseEntity.status(HTTP_OK).headers(headers).body(bytes);

    }


     */

   /*@GetMapping("delete/{filename}")
    public String deleteFile(@PathVariable("filename") String filename){

        if (fileInfoRepository.getFileInfoByName(filename).getName().equals(filename)){
            int fileToBeDeletedId = fileInfoRepository.getFileInfoByName(filename).getId();
            fileInfoRepository.deleteById(fileToBeDeletedId);
            System.out.println("Success");
            System.out.println(fileInfoRepository.findAll());
            s3Service.deleteFile(filename);
        }

        return "redirect:dashboard";

    }



    @GetMapping("list")
    public List<String> getAllFiles(ModelMap model){
        List<FileInfo> fileInfos = fileInfoRepository.findAll();
        model.addAttribute("fileInfos",fileInfos);
        return  s3Service.listAllFiles();
    }
}
        */