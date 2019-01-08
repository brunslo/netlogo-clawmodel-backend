package au.edu.unimelb.eresearch.netlogo.clawmodel.backend.services;

import lombok.val;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Profile("claw")
public class ClawModelService implements ModelService {
    private static final String MODEL_FILE_PATH = "models/CLAWModel.nlogo";

    @Override
    public String getModelFilePath() {
        return MODEL_FILE_PATH;
    }

    @Override
    public Map<String, String> generateReporterSourceMap() {
        val map = new HashMap<String, String>();

        // World State
        map.put(
                "tickCount",
                "ticks"
        );

        // Sliders
        map.put(
                "newClients_Slider",
                "NewClients"
        );
        map.put(
                "roadSafetyEffectiveness_Slider",
                "Road_Safety_Effectiveness"
        );
        map.put(
                "injuryRecovery_Slider",
                "InjuryRecovery"
        );
        map.put(
                "randomVariation_Slider",
                "RandomVariation"
        );
        map.put(
                "issueCount_Slider",
                "Issue_Count"
        );
        map.put(
                "solicitors_Slider",
                "Solicitors"
        );

        // Switches
        map.put(
                "traceClients_Switch",
                "Traceclients"
        );

        // Choosers
        map.put(
                "eventType_Chooser",
                "Event_Type"
        );

        // Monitors
        map.put(
                "goodExit6Months_Monitor",
                "GoodExit6Months"
        );
        map.put(
                "goodExit18Months_Monitor",
                "GoodExit18Months"
        );
        map.put(
                "goodExit24Months_Monitor",
                "GoodExit24Months"
        );
        map.put(
                "goodExit36Months_Monitor",
                "GoodExit36Months"
        );
        map.put(
                "neutralExit36PlusMonths_Monitor",
                "NeutralExit36PlusMonths"
        );
        map.put(
                "badExit6Months_Monitor",
                "BadExit6Months"
        );
        map.put(
                "badExit18Months_Monitor",
                "BadExit18Months"
        );
        map.put(
                "badExit24Months_Monitor",
                "BadExit24Months"
        );
        map.put(
                "badExit36Months_Monitor",
                "BadExit36Months"
        );
        map.put(
                "badExit36PlusMonths_Monitor",
                "BadExit36PlusMonths"
        );
        map.put(
                "badExitPercentage_Monitor",
                "100 * count clients with [RockBottom = 1] / (TotalClients - count clients)"
        );
        map.put(
                "commonLawCapture_Monitor",
                "CommonLawCapture"
        );
        map.put(
                "meanHealthStatus_Monitor",
                "mean [ HealthStatus ] of clients"
        );
        map.put(
                "meanClientCost_Monitor",
                "mean [ clientcost] of clients"
        );
        map.put(
                "meanSatisfaction_Monitor",
                "mean [ satisfaction ] of clients"
        );
        map.put(
                "totalClientsGreaterThan5Years_Monitor",
                "count clients with [ xcor > 250 ]"
        );
        map.put(
                "totalClients_Monitor",
                "TotalClients"
        );

        return map;
    }
}
