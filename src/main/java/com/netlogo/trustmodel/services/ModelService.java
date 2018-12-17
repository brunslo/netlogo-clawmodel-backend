package com.netlogo.trustmodel.services;

import java.util.Map;

public interface ModelService {
    String getModelFilePath();

    Map<String, String> generateReporterSourceMap();
}
