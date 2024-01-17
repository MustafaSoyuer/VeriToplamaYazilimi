package com.mustafa.service;

import com.mustafa.entity.Kategori;
import com.mustafa.repository.KategoriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KategoriService {
    private final KategoriRepository kategoriRepository;

    public void save(Kategori kategori){
        kategoriRepository.save(kategori);
    }

    public List<Kategori> findAll(){
        return kategoriRepository.findAll();
    }

}
