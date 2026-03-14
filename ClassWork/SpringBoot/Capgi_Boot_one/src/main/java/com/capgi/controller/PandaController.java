package com.capgi.controller;

import com.capgi.entity.Panda;
import com.capgi.service.PandaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/panda")
public class PandaController{
    private final PandaService pandaService;
    @PostMapping("/save")
    public String savePanda(@RequestBody Panda panda)
    {
        pandaService.save(panda);
        return "panda saved in db";
    }
}
