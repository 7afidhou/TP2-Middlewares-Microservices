package com.msgroups.msformation;

import com.msgroups.msformation.entities.Formation;
import com.msgroups.msformation.repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsFormationApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }
    @Autowired
    FormationRep formationRep;
    @Override
    public void  run(String... args) throws Exception  {
        formationRep.save(new Formation(null,"web dev", 20));
        formationRep.save(new Formation(null,"mobile dev", 10));

    }


}
