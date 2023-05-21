package com.example.springs3.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class S3Service implements FileServiceImpl {
    private String bucketName = "easy-files-s3";
    private final AmazonS3 s3;

    public S3Service(AmazonS3 s3) {
        this.s3 = s3;
    }


    //Saves file to S3 bucket
    //Needs convertMultiPartToFile to work
    @Override
    public String saveFile(MultipartFile file) {
        String originalFilename = file.getOriginalFilename();
        try {
           File file1 = convertMultiPartToFile(file);
            PutObjectResult putObjectResult = s3.putObject(bucketName, originalFilename,file1);
            return putObjectResult.getContentMd5();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Downloads file from s3 bucket
    @Override
    public byte[] downloadFile(String filename) {
        S3Object object = s3.getObject(bucketName, filename);
        S3ObjectInputStream objectContent = object.getObjectContent();
        try {
           return IOUtils.toByteArray(objectContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    //Deletes file from s3 bucket
    @Override
    public String deleteFile(String filename) {
        s3.deleteObject(bucketName,filename);
        return "File deleted";
    }

    //List all the files from s3 buckets
    @Override
    public List<String> listAllFiles() {

        ListObjectsV2Result listObjectsV2Result = s3.listObjectsV2(bucketName);
        return listObjectsV2Result.getObjectSummaries().stream().map(S3ObjectSummary::getKey).collect(Collectors.toList());

    }

    //Converts multipart file to file so the save file function can work properly
    private File convertMultiPartToFile(MultipartFile file) throws IOException{
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream( convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }
}
