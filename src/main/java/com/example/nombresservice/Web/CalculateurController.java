package com.example.nombresservice.Web;

import com.example.nombresservice.Service.CalculeService;
import com.example.nombresservice.entities.Nombres;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/calculs")
public class CalculateurController {
    private CalculeService calculeService;
    public CalculateurController(CalculeService calculeService) {
        this.calculeService = calculeService;
    }

    @PostMapping
    public ResponseEntity<Double> calcul_somme(@RequestBody Nombres nombres) {
        Double somme = calculeService.Somme(nombres);
        if(nombres!=null) return  ResponseEntity.ok(somme);{
            return ResponseEntity.internalServerError().build();
        }
    }
}
