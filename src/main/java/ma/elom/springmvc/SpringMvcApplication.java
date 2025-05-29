package ma.elom.springmvc;

import ma.elom.springmvc.Repository.ProductRepository;
import ma.elom.springmvc.entities.product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    @Bean

    public CommandLineRunner  start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(product.builder()

                            .name("Computer")
                            .price(5000.0)
                            .quantity(12.0)
                    .build());

            productRepository.save(product.builder()

                    .name("Hp")
                    .price(6000.0)
                    .quantity(2.0)
                    .build());

            productRepository.save(product.builder()

                    .name("Dell")
                    .price(9000.0)
                    .quantity(20.0)
                    .build());

            productRepository.findAll().forEach(p -> {
                System.out.println(p.toString());
            });


        };
    }

}
