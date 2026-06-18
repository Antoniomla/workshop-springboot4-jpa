package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Ela vai receber requisições HTTP e as respostas devem ser enviadas diretamente no formato JSON
@RequestMapping(value="/users") // rota da minha api
public class UserResource {
    @GetMapping
    //Diz que quando alguém fizer uma requisição do tipo GET
    // (que serve para buscar/consultar dados) no endereço /users, o método findAll() deve ser acionado.
    public ResponseEntity<User> findAll(){
        //encapsula toda a resposta HTTP
        User u = new User(1L,"maria@gmail.com","maria","99aQjhs2","87282726");
        return ResponseEntity.ok().body(u);
    }
}
