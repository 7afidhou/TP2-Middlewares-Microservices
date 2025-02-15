package com.msgroups.msformation;

import com.msgroups.msformation.entities.Formation;
import com.msgroups.msformation.repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsFormationApplication implements CommandLineRunner {

    @Autowired
    FormationRep formationRep;

    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void  run(String... args) throws Exception  {

    }


}
