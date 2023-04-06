package com.iset;

import com.iset.dao.OffreRepository;
import com.iset.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceOffreEmploiApplication implements CommandLineRunner {
    @Autowired

     OffreRepository OffreRepository;
    public static void main(String[] args) {
        SpringApplication.run(ServiceOffreEmploiApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        OffreRepository.save(new Offre("WebDesign","Informatique","AXA", 2, "France"));
        OffreRepository.save(new Offre("Developpeur","Informatique","Talys", 3, "Tunisie"));
        OffreRepository.save(new Offre("Architecte",  "Informatique","SIS", 2, "Allemagne"));

    }
}