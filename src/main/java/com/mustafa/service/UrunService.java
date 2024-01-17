package com.mustafa.service;

import com.mustafa.entity.FiyatDegisimleri;
import com.mustafa.entity.Urun;
import com.mustafa.repository.UrunRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UrunService {
    private final UrunRepository urunRepository;

    public void save(Urun urun){
        urunRepository.save(urun);
    }

    public List<Urun> findAll(){
        return urunRepository.findAll();
    }

    //1.soru
    public List<FiyatDegisimleri> belliTarihArasindaFiyatlar(String urunAdi,Long baslangic, Long bitis){
        Urun urun = (Urun) urunRepository.findAll().stream().filter(x->x.getAd().equalsIgnoreCase(urunAdi));
        return urun.getFiyatDegisimi().stream().filter(f->f.getTarih()>baslangic && f.getTarih()<bitis).toList();
    }

    //2.soru


    //3.soru
    public double belliTarihAraligindaUrunlerinDegisimYuzdesi(String urunAdi, Long baslangic, Long bitis){
        Urun urun = (Urun) urunRepository.findAll().stream().filter(x->x.getAd().equalsIgnoreCase(urunAdi));
        List<FiyatDegisimleri> fiyatlar = urun.getFiyatDegisimi().stream().filter(f -> f.getTarih() > baslangic && f.getTarih() < bitis).toList();
        
    }

}
