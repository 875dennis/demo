package ProjetoMVCBanda.demo.controllers;

import ProjetoMVCBanda.demo.models.Banda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/banda")
public class BandaApiController {

    private static final List<Banda> banda = new ArrayList<Banda>();

    public BandaApiController(){
        banda.add(new Banda("Iron Maiden","Inglaterra","Heavy Metal",250));
        banda.add(new Banda("Gojira","França","Heavy Metal",230));
        banda.add(new Banda("Metallica","EUA","Thrash Metal",290));
        banda.add(new Banda("Sepultura","Brasil","Thrash Metal",209));
        banda.add(new Banda("Queen","Inglaterra","Rock",110));
        banda.add(new Banda("Pearl Jam","EUA","Grunge",142));
        banda.add(new Banda("Angra","Brasil","Power Metal",122));
        banda.add(new Banda("Blind Guardian","Alemanha","Power Metal",137));
    }

    @GetMapping
    public List<Banda> getBanda(){
        return banda;
    }

}
