package br.com.vizi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RequestMapping("/viziapp/v1/embaixadores")
public class EmbaixadorController {

}
