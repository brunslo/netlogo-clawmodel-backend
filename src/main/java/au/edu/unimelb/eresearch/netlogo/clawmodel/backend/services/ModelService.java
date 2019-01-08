package au.edu.unimelb.eresearch.netlogo.clawmodel.backend.services;

import java.util.Map;

public interface ModelService {
    String getModelFilePath();

    Map<String, String> generateReporterSourceMap();
}
