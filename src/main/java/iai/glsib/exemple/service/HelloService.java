package iai.glsib.exemple.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/*@Component*/
@Service
public class HelloService implements  IHelloService{

    @Override
    public List<String> Hello() {
        return List.of("Ceci est notre deuxième API via le service");
    }
}
