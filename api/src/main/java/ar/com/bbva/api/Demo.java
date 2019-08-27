package ar.com.bbva.api;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class Demo {

    @RequestMapping(value="/saludo/{nombre}", method = RequestMethod.GET)
    public Persona holamundo(@PathVariable String nombre, @RequestParam String apellido){
        return new Persona(nombre, apellido);
    }
    @RequestMapping(value="/saludo2/{nombre}", method = RequestMethod.GET)
    public String holamundo2(@PathVariable String nombre){
        return "hola " + nombre;
    }

    @RequestMapping(value="/saludo3/{nombre}", method = RequestMethod.GET)
    public String holamundo2(@PathVariable String nombre, @RequestParam String apellido){
        return "hola " + nombre + " " + apellido ;
    }
}
