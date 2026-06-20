package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//Ela vai receber requisições HTTP e as respostas devem ser enviadas diretamente no formato JSON
@RequestMapping(value="/orders") // rota da minha api
public class OrderResource {

    @Autowired
    private OrderServices orderServices;

    @GetMapping
    //Diz que quando alguém fizer uma requisição do tipo GET
    // (que serve para buscar/consultar dados) no endereço /users, o método findAll() deve ser acionado.
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = orderServices.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value="/{id}")
    public ResponseEntity<Order> findById(@PathVariable  Long id) {//extrair valores da url diretamente da requisição
        Order obj = orderServices.findById(id);
        return  ResponseEntity.ok().body(obj);
    }

}
