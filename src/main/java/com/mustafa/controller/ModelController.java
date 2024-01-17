package com.mustafa.controller;

import com.mustafa.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
@RequiredArgsConstructor
public class ModelController {
    private final ModelService modelService;
}
