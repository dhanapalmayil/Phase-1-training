package com.lms.impl;

import com.lms.intf.ResultIntf;
import com.lms.models.Result;
import com.lms.repository.ResultRepository;

import java.util.List;

public class ResultImpl implements ResultIntf {
    private ResultRepository resultRepo = new ResultRepository();

    @Override
    public void addResult(Result result) {
        resultRepo.addResult(result);
    }

    @Override
    public Result getResult(int resultId) {
        return resultRepo.getResult(resultId);
    }

    @Override
    public List<Result> getAllResults() {
        return resultRepo.getAllResults();
    }

    @Override
    public void updateResult(int resultId, Result result) {
        resultRepo.updateResult(result.getResultId(), result);
    }

    @Override
    public void deleteResult(int resultId) {
        resultRepo.deleteResult(resultId);
    }
}
