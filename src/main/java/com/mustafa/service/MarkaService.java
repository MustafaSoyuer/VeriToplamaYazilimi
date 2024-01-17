package com.mustafa.service;

import com.mustafa.entity.Marka;
import com.mustafa.repository.MarkaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarkaService {
    private final MarkaRepository markaRepository;
    public void save(Marka marka){
        markaRepository.save(marka);
    }

    public List<Marka> findAll(){
        return markaRepository.findAll();
    }
}
