package com.example.cw1.service;

import com.example.cw1.data.Response;
import com.example.cw1.data.ResponseRepository;
import com.example.cw1.data.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    public List<Response> getAllResponse()
    {
        return responseRepository.findAll();
    }

    public Response getResponseById(int responseId)
    {
        Optional<Response> response = responseRepository.findById(responseId);
        if (response.isPresent())
        {
            return response.get();
        }
        return null;
    }

    public Response createResponse(Response response)
    {
        return responseRepository.save(response);
    }

    public Response updateResponse(Response response)
    {
        return responseRepository.save(response);
    }

    public Response deleteResponseBytId(int responseId)
    {
        Optional<Response> response = responseRepository.findById(responseId);
        if (response.isPresent())
        {
            responseRepository.deleteById(responseId);
        }
        return null;
    }
}
