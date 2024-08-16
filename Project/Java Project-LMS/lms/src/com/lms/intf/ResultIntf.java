package com.lms.intf;

import com.lms.models.Result;
import java.util.List;

public interface ResultIntf {
    void addResult(Result result);
    Result getResult(int resultId);
    List<Result> getAllResults();
    void updateResult(int resultId, Result result);
    void deleteResult(int resultId);
}
