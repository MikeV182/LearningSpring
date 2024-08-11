package com.learn.JUnitPractise.repositories;

import com.learn.JUnitPractise.models.Worker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("workerDAO")
public class WorkerDAO {
    List<Worker> workers;

    {
        workers = new ArrayList<>();

        workers.add(new Worker(20_000, Gender.MALE, 20, "Jake"));
        workers.add(new Worker(40_000, Gender.MALE, 35, "Mike"));
        workers.add(new Worker(100_000, Gender.FEMALE, 28, "Alice"));
        workers.add(new Worker(300_000, Gender.HELICOPTER, 78, "UH-1D Huey"));
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public List<Worker> getAllFemaleWorkers() {
        return workers.stream().filter(worker -> worker.getGender() == Gender.FEMALE).toList();
    }

    public List<Worker> getAllMaleWorkers() {
        return workers.stream().filter(worker -> worker.getGender() == Gender.MALE).toList();
    }

    public List<Worker> getAllHelicopterWorkers() {
        return workers.stream().filter(worker -> worker.getGender() == Gender.HELICOPTER).toList();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void deleteWorker(Worker worker) {
        if (!workers.contains(worker))
            throw new IllegalArgumentException("Worker is not found");
        workers.remove(worker);
    }

}
