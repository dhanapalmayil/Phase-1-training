package com.lms.service;

import com.lms.models.Result;
import com.lms.repository.ResultRepository;
import java.util.List;
import com.lms.intf.*;
public  class ResultService implements ResultIntf {
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

	@Override
	public Result getResult(int resultId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateResult(Result result) {
		// TODO Auto-generated method stub
		
	}
}
