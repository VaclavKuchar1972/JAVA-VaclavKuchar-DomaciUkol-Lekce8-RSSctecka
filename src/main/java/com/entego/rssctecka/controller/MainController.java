package com.entego.rssctecka.controller;

import com.entego.rssctecka.fileloaders.FileLoaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/books")
public class MainController {

    FileLoaders fileLoader = new FileLoaders();
    
    @GetMapping("/scifi")
    public String getSciFiArticle() {
        return fileLoader.readBookTextFile("scifi");
    }

    @GetMapping("/romantic")
    public String getRomanticArticle() {
        return fileLoader.readBookTextFile("romantic");
    }

    @GetMapping("/historic")
    public String getHistoricArticle() {
        return fileLoader.readBookTextFile("historic");
    }

    // URL adresy pro otestování správného chodu
    //localhost:8080/books/scifi
    //localhost:8080/books/romantic
    //localhost:8080/books/historic
}
