package bff_router.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bff_router.service.BffService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@CrossOrigin
@RequestMapping("/bff")
public class BffController {

    private final BffService bffService;

    public BffController(BffService bffService) {
		this.bffService = bffService;
	}

    @GetMapping
    public ResponseEntity<String> read() {
        return ResponseEntity.ok(bffService.read());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<String> read(@PathVariable("id") String id) {
        return ResponseEntity.ok(bffService.read(id));
    }
    
    @PostMapping
    public ResponseEntity<String> create(@RequestBody Map<String, String> body) {       
        return ResponseEntity.ok(bffService.create(body));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestParam("status") String status) {
        return ResponseEntity.ok(bffService.update(status));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@RequestParam("id") String id){
        return ResponseEntity.ok(bffService.delete(id));
    }
}
