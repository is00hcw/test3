package com.pagoda.bgkj.web;

import com.pagoda.bgkj.config.ApplicationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 处理上传文件
 *
 * @author PagodaGenerator
 * @generated
 */
@Controller
@Slf4j
public class BgkjUploadController {

  @Autowired private ApplicationProperties applicationProperties;

  @PostMapping("/upload")
  @ResponseBody
  public boolean singleFileUpload(@RequestParam("file") MultipartFile file) {

    if (file.isEmpty()) {
      return false;
    }
    try {
      // Get the file and save it somewhere
      byte[] bytes = file.getBytes();
      Path path = Paths.get(applicationProperties.getUploadFolder() + file.getOriginalFilename());
      Files.write(path, bytes);
      return true;

    } catch (IOException e) {
      log.error("UploadController.singleFileUpload", e);
    }
    return false;
  }
}
