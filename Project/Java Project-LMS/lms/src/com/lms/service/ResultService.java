package com.lms.service;

import com.lms.models.Result;
import com.lms.repository.ResultRepository;
import java.util.List;

public class ResultService {
    private ResultRepository resultRepository;

    public ResultService() {
        this.resultRepository = new ResultRepository();
    }

    public void addResult(Result result) {
        resultRepository.addResult(result);
    }

    public void updateResult(int resultId, Result updatedResult) {
        resultRepository.updateResult(resultId, updatedResult);
    }

    public void deleteResult(int resultId) {
        resultRepository.deleteResult(resultId);
    }

    public List<Result> getAllResults() {
        return resultRepository.getAllResults();
    }
}
