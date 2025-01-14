package bff_router.restclient;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


//Aqui va la URL del Servicio del BackEnd que trae la información..
//DockerLab http://ip172-18-0-8-cu23jsq91nsg00dlbkfg-9090.direct.labs.play-with-docker.com/api/pacientes
//@FeignClient(name = "datos-pacientes", url = "http://ip172-18-0-8-cu23jsq91nsg00dlbkfg-9090.direct.labs.play-with-docker.com/api/pacientes")
@FeignClient(name = "datos-pacientes", url = "34.239.33.247:9092/api/pacientes")
public interface DatosPacientes {

    //Obtiene todos los Pacientes
    @GetMapping
    String read();

    //Obtiene a un paciente por su id
    @GetMapping("pacientes/{id}")
    String read (@PathVariable("id") String id);

    //Crea a los pacientes
    @PostMapping
    String create(@RequestBody Map<String, String> body);

    //Actualiza Pacientes
    @PutMapping("/{id}")
    String update(@RequestParam("status") String status);

    //Borra Pacientes (no se debería usar este método.)
    @DeleteMapping("/{id}")
    String delete(@RequestParam("id") String id);

}
