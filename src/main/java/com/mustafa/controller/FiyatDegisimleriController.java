package com.mustafa.controller;

import com.mustafa.service.FiyatDegisimleriService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fiyat-degisimleri")
@RequiredArgsConstructor
public class FiyatDegisimleriController {
    private final FiyatDegisimleriService fiyatDegisimleriService;
}
