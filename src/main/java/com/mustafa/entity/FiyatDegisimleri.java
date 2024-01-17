package com.mustafa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_fiyatdegisimleri")
public class FiyatDegisimleri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long tarih;
    Double fiyat;
    String siteLinki;
    String siteAdi;

}
