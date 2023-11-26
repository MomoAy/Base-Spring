package iai.glsib.exemple.service;

import org.springframework.stereotype.Service;

import java.util.List;

/*@Component*/
@Service
public class HelloService implements  IHelloService{

    @Override
    public String Hello() {
        return "Ceci est notre deuxième API via le service";
    }

    @Override
    public List<String> Hello2() {
        return List.of("Ceci", "est", "un", "second", "type", "de", "retour");
    }


}
