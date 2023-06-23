package service;

import model.Product;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {

    void addProduct(Product product, MultipartFile productImage);

}
