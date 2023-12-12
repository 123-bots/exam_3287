package com.example.demo.dao;

import com.example.demo.entity.Crimes;
import com.example.demo.entity.CrimesRank;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface CrimeDao {
    public List<CrimesRank> getCrimesRank(@Param("year") int year);
    public int insertCrime(@RequestBody Crimes crime);
}
