package mx.uv.fei.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller 
public class PlantillaControlador{
    
    @RequestMapping("/plantilla")
    public String plantilla(Model modelo){
        modelo.addAttribute("mensaje", "Hola mundo");
        return "pagina";
    }
}