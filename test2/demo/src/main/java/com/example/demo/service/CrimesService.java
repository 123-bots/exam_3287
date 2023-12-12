package com.example.demo.service;

import com.example.demo.entity.Crimes;
import com.example.demo.entity.CrimesRank;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CrimesService {
    public Map<Integer, List> getCrimesRankList();
    public int insertCrime(Crimes crime);
}
