package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//Ela vai receber requisições HTTP e as respostas devem ser enviadas diretamente no formato JSON
@RequestMapping(value="/products") // rota da minha api
public class ProductResource {

    @Autowired
    private ProductServices service;

    @GetMapping
    //Diz que quando alguém fizer uma requisição do tipo GET
    // (que serve para buscar/consultar dados) no endereço /users, o método findAll() deve ser acionado.
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<Product> findById(@PathVariable  Long id) {//extrair valores da url diretamente da requisição
        Product obj = service.findById(id);
        return  ResponseEntity.ok().body(obj);
    }

}
