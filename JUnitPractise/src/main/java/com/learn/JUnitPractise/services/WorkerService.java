package com.learn.JUnitPractise.services;

import com.learn.JUnitPractise.models.Worker;
import com.learn.JUnitPractise.repositories.WorkerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    private final WorkerDAO workerDAO;

    @Autowired
    public WorkerService(WorkerDAO workerDAO) {
        this.workerDAO = workerDAO;
    }

    public int sumSalaries(List<Worker> workerList) {
        return workerList.stream()
                .mapToInt(Worker::getSalary)
                .sum();
    }

    public List<Worker> getListOfWorkers() {
        return workerDAO.getWorkers();
    }

}
