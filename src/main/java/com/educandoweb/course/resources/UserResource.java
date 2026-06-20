package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//Ela vai receber requisições HTTP e as respostas devem ser enviadas diretamente no formato JSON
@RequestMapping(value="/users") // rota da minha api
public class UserResource {

    @Autowired
    private UserServices userServices;

    @GetMapping
    //Diz que quando alguém fizer uma requisição do tipo GET
    // (que serve para buscar/consultar dados) no endereço /users, o método findAll() deve ser acionado.
    public ResponseEntity<List<User>> findAll(){
        List<User> list = userServices.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<User> findById(@PathVariable  Long id){
        User obj = userServices.findById(id);
        return  ResponseEntity.ok().body(obj);
    }

}
