package com.example.ecommrce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    private ProductData productData ;



    @GetMapping("/getproduct")
    public List<ProductModel> getProduct(){
        return   productData.GetAllProduct();
    }
}
