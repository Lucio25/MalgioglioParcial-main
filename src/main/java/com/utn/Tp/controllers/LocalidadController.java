package com.utn.Tp.controllers;

import com.utn.Tp.entities.Localidad;
import com.utn.Tp.servicies.LocalidadServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = "")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends  BaseControllerImpl<Localidad, LocalidadServiceImpl> {
    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}
