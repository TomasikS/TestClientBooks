/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.FeignV2;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stefan.tomasik
 */
@RestController
public class Controller {



       
    @Autowired
     public ProductClient BookClient;
   
 
 
    @RequestMapping("/todos")
    @GetMapping()
    public List<Book> getBooks()
    {
        return BookClient.getBooks();
    }
}
