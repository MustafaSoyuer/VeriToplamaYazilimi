package com.mustafa.controller;

import com.mustafa.service.MarkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marka")
@RequiredArgsConstructor
public class MarkaController {
    private final MarkaService markaService;
}
