package br.edu.unifalmg;

import br.edu.unifalmg.repository.impl.FileChoreRepository;
import br.edu.unifalmg.service.ChoreService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class TodoApplication {

    public static void main(String[] args) {
        ChoreService service = new ChoreService(new FileChoreRepository());
        service.loadChores();
        System.out.println("Tamanho da lista de chores: " + service.getChores().size());
    }

}
