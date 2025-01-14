package bff_router.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import bff_router.restclient.DatosPacientes;
import bff_router.service.BffService;



@Service
public class BffServiceImpl implements BffService{

    private final DatosPacientes datosRest;

    public BffServiceImpl(DatosPacientes datosRest) {
        this.datosRest = datosRest;
    }


    public String read() {
        return datosRest.read();
    }

    public String read(String id) {
        return datosRest.read(id);
    }

    public String create(Map<String, String> body) {
        return datosRest.create(body);
    }


    public String update(String status) {
        return datosRest.update(status);
    }

    public String delete(String id) {
        return datosRest.delete(id);
    }
    

}
