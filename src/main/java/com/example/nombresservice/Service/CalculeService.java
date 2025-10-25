package com.example.nombresservice.Service;

import com.example.nombresservice.entities.Nombres;
import org.springframework.stereotype.Service;

@Service
public class CalculeService {
    public Double Somme (Nombres nombres){
     return nombres.getA()+nombres.getB();
    }
}