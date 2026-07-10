package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//Ela vai receber requisições HTTP e as respostas devem ser enviadas diretamente no formato JSON
@RequestMapping(value="/categories") // rota da minha api
public class CategoryResource {

    @Autowired
    private CategoryServices categoryServices;

    @GetMapping
    //Diz que quando alguém fizer uma requisição do tipo GET
    // (que serve para buscar/consultar dados) no endereço /categories, o método findAll() deve ser acionado.
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = categoryServices.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<Category> findById(@PathVariable  Long id) {//extrair valores da url diretamente da requisição
        Category obj = categoryServices.findById(id);
        return  ResponseEntity.ok().body(obj);
    }

}
