package com.example.demo.controller;

import com.example.demo.entity.Crimes;
import com.example.demo.entity.CrimesRank;
import com.example.demo.service.CrimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CrimesController {

    @Autowired
    private CrimesService crimesService;

    @RequestMapping(value = "/api/crime/stat", method = RequestMethod.GET)
    public Map<Integer, List> getCrimesRankList(){
        return crimesService.getCrimesRankList();
    }

    @RequestMapping(value="/api/crime",method = RequestMethod.POST)
    public int insertCrimes(@RequestBody Crimes crimes){
        int x = crimesService.insertCrime(crimes);
        return x;
    }
}


