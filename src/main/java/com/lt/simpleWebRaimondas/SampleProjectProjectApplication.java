package com.lt.simpleWebRaimondas;

import com.lt.simpleWebRaimondas.controler.dto.QuizElementDTO;
import com.lt.simpleWebRaimondas.domain.Answer;
import com.lt.simpleWebRaimondas.domain.Question;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by Raimondas on 2017.08.08.
 */
@SpringBootApplication
public class SampleProjectProjectApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SampleProjectProjectApplication.class);
    }
    public static void main(String[] args) {

        SpringApplication.run(SampleProjectProjectApplication.class, args);

    }
}



//susikuriame 2 lentas vartotoja, ir Atsakymu lenta kurioje yra atsakymo id, vartotoja, questionValueId, input (kai
// pasirinktas input tipas), t.y. rankele iraso
//pasiskaityt apie DB OneToMany, OneToOne, ManyToMany, index, ProimaryKey, ForeignKey,
//Html formas, formu tagus
//http post, get

// jsp formos pasiziureti kaip isvesti atsakymus