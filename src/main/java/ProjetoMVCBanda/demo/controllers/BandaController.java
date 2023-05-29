package ProjetoMVCBanda.demo.controllers;

import ProjetoMVCBanda.demo.models.Banda;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bandas")
public class BandaController {

    private List<Banda> bandas = new ArrayList<Banda>();

    public BandaController(){
        bandas.add(new Banda("Iron Maiden","Inglaterra","Heavy Metal",250));
        bandas.add(new Banda("Gojira","França","Heavy Metal",230));
        bandas.add(new Banda("Metallica","EUA","Thrash Metal",290));
        bandas.add(new Banda("Sepultura","Brasil","Thrash Metal",209));
        bandas.add(new Banda("Queen","Inglaterra","Rock",110));
        bandas.add(new Banda("Pearl Jam","EUA","Grunge",142));
        bandas.add(new Banda("Angra","Brasil","Power Metal",122));
        bandas.add(new Banda("Blind Guardian","Alemanha","Power Metal",137));
    }

    @GetMapping
    public String getBanda(Model model)
    {
        model.addAttribute("bandas", this.bandas);
        return "index";
    }
}
