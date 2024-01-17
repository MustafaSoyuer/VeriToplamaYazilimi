package com.mustafa.service;

import com.mustafa.entity.FiyatDegisimleri;
import com.mustafa.repository.FiyatDegisimleriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FiyatDegisimleriService {
    private final FiyatDegisimleriRepository fiyatDegisimleriRepository;

    public void save(FiyatDegisimleri fiyatDegisimleri){
        fiyatDegisimleriRepository.save(fiyatDegisimleri);
    }

    public List<FiyatDegisimleri> findAll(){
        return fiyatDegisimleriRepository.findAll();
    }
}
