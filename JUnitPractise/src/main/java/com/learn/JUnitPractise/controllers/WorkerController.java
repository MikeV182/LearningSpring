package com.learn.JUnitPractise.controllers;

import com.learn.JUnitPractise.repositories.WorkerDAO;
import com.learn.JUnitPractise.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkerController {
    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerDAO workerDAO) {
        this.workerService = new WorkerService(workerDAO);
    }

    @GetMapping("/sum-salaries")
    public int sumOfSalariesPage() {
        return workerService.sumSalaries(workerService.getListOfWorkers());
    }

}
