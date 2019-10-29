/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.FeignV2;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author stefan.tomasik
 */

@FeignClient(name="product-service", url="localhost:8081")
public interface ProductClient {

 @GetMapping(value="/todos",consumes=MediaType.APPLICATION_JSON_VALUE)
  public   List<Book> getBooks();


 
}

