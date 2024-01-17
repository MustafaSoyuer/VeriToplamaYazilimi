package com.mustafa.service;

import com.mustafa.entity.Model;
import com.mustafa.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository modelRepository;

    public void save(Model model){
        modelRepository.save(model);
    }
    public List<Model> findAll(){
        return modelRepository.findAll();
    }
}
