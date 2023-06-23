package service;

import jakarta.annotation.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StorageService {

    List<String> loadAll();
    String store(MultipartFile file);
    Resource load(String fileName);
    void delete(String fileName);

}
