package ma.elom.springmvc.web;


import ma.elom.springmvc.Repository.ProductRepository;
import ma.elom.springmvc.entities.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/index")
    public String index(Model model) {
       List<product> products= productRepository.findAll();
        model.addAttribute("productList", products);
        return "products";
    }
}
