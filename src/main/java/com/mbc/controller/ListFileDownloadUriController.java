
package com.mbc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbc.service.FileStorageService;

@RestController
public class ListFileDownloadUriController {

    private static final Logger logger = LoggerFactory.getLogger(FileDownloadController.class);

    @Autowired
    private FileStorageService fileStorageService;

    @GetMapping("/getListFileDownloadUri")
    public ResponseEntity<List<String>> getListFileDownloadUri() {
        logger.info("===========================getListFileAsResource=========================");
        // Load file as Resource
        List<String> fileDownloadUriList = fileStorageService.getListFileDownloadUri();

        return ResponseEntity.ok(fileDownloadUriList);
    }

}
