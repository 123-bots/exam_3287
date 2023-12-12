package com.example.demo.service;

import com.example.demo.dao.CrimeDao;
import com.example.demo.entity.Crimes;
import com.example.demo.entity.CrimesRank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CrimesSeviceImpl implements CrimesService {
    @Autowired
    private CrimeDao crimeDao;
    @Override
    public Map<Integer, List> getCrimesRankList() {
        List<CrimesRank> crimesRank = crimeDao.getCrimesRank(2020);
        List<CrimesRank> crimesRank1 = crimeDao.getCrimesRank(2021);
        List<CrimesRank> crimesRank2 = crimeDao.getCrimesRank(2022);
        List<CrimesRank> crimesRank3 = crimeDao.getCrimesRank(2023);

        Map<Integer, List> mapRank = new HashMap<>();
        mapRank.put(2020,crimesRank);
        mapRank.put(2021,crimesRank1);
        mapRank.put(2022,crimesRank2);
        mapRank.put(2023,crimesRank3);
        return mapRank;
    }

    @Override
    public int insertCrime(Crimes crime) {
        return crimeDao.insertCrime(crime);
    }
}

