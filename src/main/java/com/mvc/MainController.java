package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  // controller zawiera w sobie komponent
public class MainController {

//    robimy zapytanie do strony poprzez get i post
//    zapytanie ma nagłówki i ciało(body)

    @RequestMapping(path = "Imperator", method = RequestMethod.GET  )//mapuje zapytanie http na poniższa metode
    public void getImperatorPage(){
        System.out.println("odpalamy stronke z zarzadzaniem flotami imperium");
    }




}
