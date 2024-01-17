package com.mustafa.controller;

import com.mustafa.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urun")
@RequiredArgsConstructor
public class UrunController {
    private final UrunService urunService;
}
