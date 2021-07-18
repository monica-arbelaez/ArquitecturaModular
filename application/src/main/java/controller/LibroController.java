package controller;


import format.LibroFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.LibroService;

@RestController
@Component
@RequestMapping("/libro")
public class LibroController {
    @Autowired
    LibroService libroService;

    @PostMapping("/crear")
    public ResponseEntity<LibroFormat>crear(@RequestBody LibroFormat libroFormat){
        return new ResponseEntity<>(libroService.crearLibro(libroFormat), HttpStatus.CREATED);
    }
}

