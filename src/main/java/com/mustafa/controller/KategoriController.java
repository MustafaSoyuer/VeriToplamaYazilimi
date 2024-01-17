package com.mustafa.controller;

import com.mustafa.service.KategoriService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kategori")
@RequiredArgsConstructor
public class KategoriController {
    private final KategoriService kategoriService;
}
