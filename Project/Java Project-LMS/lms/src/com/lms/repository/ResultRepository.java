package com.lms.repository;

import com.lms.models.Result;
import java.util.ArrayList;
import java.util.List;

public class ResultRepository {
    private List<Result> results = new ArrayList<>();

    public void addResult(Result result) {
        results.add(result);
    }

    public Result getResult(int resultId) {
        return results.stream()
                .filter(r -> r.getResultId() == resultId)
                .findFirst()
                .orElse(null);
    }

    public List<Result> getAllResults() {
        return new ArrayList<>(results);
    }

    public void updateResult(int resultId, Result updatedResult) {
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i).getResultId() == resultId) {
                results.set(i, updatedResult);
                break;
            }
        }
    }

    public void deleteResult(int resultId) {
        results.removeIf(r -> r.getResultId() == resultId);
    }
}
