package com.learn.JUnitPractise.services;

import com.learn.JUnitPractise.models.Worker;
import com.learn.JUnitPractise.repositories.Gender;
import com.learn.JUnitPractise.repositories.WorkerDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class WorkerServiceTests {

    @InjectMocks
    private WorkerService workerService;

    @Mock
    private WorkerDAO workerDAO;

    @Test
    void sumSalaries_allWorkers() {
        Worker worker1 = new Worker(300_000, Gender.HELICOPTER, 78, "UH-1D Huey");
        Worker worker2 = new Worker(40_000, Gender.MALE, 35, "Mike");
        Mockito.when(workerDAO.getWorkers()).thenReturn(List.of(worker1, worker2));

        Assertions.assertEquals(340_000, workerService.sumSalaries(workerDAO.getWorkers()));
    }

}

/*
if you want to verify how many times something was called, then use mockito.verify
 */