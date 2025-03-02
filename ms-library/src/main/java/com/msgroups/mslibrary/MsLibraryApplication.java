package com.msgroups.mslibrary;

import com.msgroups.mslibrary.entities.Emprunt;
import com.msgroups.mslibrary.entities.Livre;
import com.msgroups.mslibrary.repositories.EmpruntRepository;
import com.msgroups.mslibrary.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import java.sql.Date;



@SpringBootApplication
@EnableFeignClients
public class MsLibraryApplication implements CommandLineRunner {
    @Autowired
    private LivreRepository livreRepository;
    @Autowired
    private EmpruntRepository empruntRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsLibraryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Livre l1=livreRepository.save(new Livre(null,"les miserables","victor hugo","disponible",null)) ;

        empruntRepository.save(new Emprunt(null,Date.valueOf("2020-01-01"),Date.valueOf("2020-01-02"),l1));
        empruntRepository.save(new Emprunt(null,Date.valueOf("2020-01-04"),Date.valueOf("2020-01-08"),l1));

    }
}
