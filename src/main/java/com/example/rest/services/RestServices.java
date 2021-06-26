package com.example.rest.services;

import com.example.rest.model.RestModel;
import com.example.rest.repository.RestRepository;
import org.springframework.stereotype.Service;

@Service
public class RestServices {
    private RestRepository restRepository;
    public RestModel addBLMethod(RestModel restModel){
          return  restRepository.save(restModel);
    }
}
