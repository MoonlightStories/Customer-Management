package com.example.cw1.controller;

import com.example.cw1.data.Response;
import com.example.cw1.data.Review;
import com.example.cw1.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResponseController {

    @Autowired
    private ResponseService responseService;

    @GetMapping(path = "/response")
    public List<Response> getAllFeedback()
    {
        return responseService.getAllResponse();
    }

    @GetMapping(path = "/response/{responseId}")
    public Response findResponseById(@PathVariable int responseId)
    {
        return responseService.getResponseById(responseId);
    }

    @PostMapping(path = "/response")
    public Response createResponse(@RequestBody Response response)
    {
        return responseService.createResponse(response);
    }

    @PutMapping(path = "/response")
    public Response updateResponse(@RequestBody Response response)
    {
        return responseService.updateResponse(response);
    }

    @DeleteMapping(path = "/response/{responseId}")
    public Response deleteResponseById(@PathVariable int responseId)
    {
        return responseService.deleteResponseBytId(responseId);
    }
}
