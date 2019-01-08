package au.edu.unimelb.eresearch.netlogo.clawmodel.backend.services;

import lombok.val;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Profile("trust")
public class TrustModelService implements ModelService {
    private static final String MODEL_FILE_PATH = "models/TrustModel.nlogo";

    @Override
    public String getModelFilePath() {
        return MODEL_FILE_PATH;
    }

    @Override
    public Map<String, String> generateReporterSourceMap() {
        val map = new HashMap<String, String>();

        // World State
        map.put("tickCount", "ticks");

        // Modifiers
        map.put(
                "injurySeverity_Modifier",
                "mean [ InjurySeverity ] of clients"
        );
        map.put(
                "atFaultStatus_Modifier",
                "mean [ AtFaultStatus ] of clients"
        );
        map.put(
                "healthStatus_Modifier",
                "mean [ HealthStatus ] of clients"
        );
        map.put(
                "previousInjury_Modifier",
                "mean [ PreviousInjury ] of clients"
        );
        map.put(
                "employmentStatus_Modifier",
                "mean [ EmploymentStatus ] of clients"
        );
        map.put(
                "vulnerableStatus_Modifier",
                "mean [ VulnerableStatus ] of clients"
        );
        map.put(
                "gender_Modifier",
                "mean [ Gender ] of clients"
        );
        map.put(
                "age_Modifier",
                "mean [ Age ] of clients"
        );
        map.put(
                "claimDuration_Modifier",
                "mean [ ClaimDuration ] of clients"
        );
        map.put(
                "injuryClassification_Modifier",
                "mean [ InjuryClassification ] of clients"
        );
        map.put(
                "education_Modifier",
                "mean [ Education ] of clients"
        );

        // Labels
        map.put(
                "clientsMoreThan5Years_Label",
                "count clients with [ xcor > 250 ]"
        );
        map.put(
                "embeddedness_Label",
                "mean [ Embeddedness ] of clients"
        );
        map.put(
                "drift_Label",
                "mean [ Drift ] of clients"
        );
        map.put(
                "waitListEffect_Label",
                "mean [ Waitlisteffect ] of clients"
        );
        map.put(
                "driftWaitListEffect_Label",
                "mean [ Drift - Waitlisteffect ] of clients"
        );
        map.put(
                "currentDrift_Label",
                "CurrentDrift"
        );
        map.put(
                "time_Label",
                "time"
        );
        map.put(
                "recalculateDrift_Label",
                "RecalculateDrift"
        );
        map.put(
                "costs_Label",
                "costs"
        );
        map.put(
                "meanRecoveryStatus_Label",
                "mean [ ycor ] of clients + 100"
        );
        map.put(
                "totalClients_Label",
                "TotalClients"
        );
        map.put(
                "exit_Label",
                "TotalClients - count clients"
        );
        map.put(
                "goodExit6Months_Label",
                "GoodExit6Months"
        );
        map.put(
                "goodExit18Months_Label",
                "GoodExit18Months"
        );
        map.put(
                "goodExit24Months_Label",
                "GoodExit24Months"
        );
        map.put(
                "goodExit36Months_Label",
                "GoodExit36Months"
        );
        map.put(
                "neutralExit36PlusMonths_Label",
                "NeutralExit36PlusMonths"
        );
        map.put(
                "bottom6Months_Label",
                "BadExit6Months"
        );
        map.put(
                "bottom18Months_Label",
                "BadExit18Months"
        );
        map.put(
                "bottom24Months_Label",
                "BadExit24Months"
        );
        map.put(
                "bottom36Months_Label",
                "BadExit36Months"
        );
        map.put(
                "bottom36PlusMonths_Label",
                "BadExit36PlusMonths"
        );
        map.put(
                "commonLawNumber_Label",
                "CommonLawCapture"
        );
        map.put(
                "countClient_Label",
                "count clients"
        );
        map.put(
                "commonLawRatio_Label",
                "100 * CommonLawCapture / (TotalClients - count clients)"
        );
        map.put(
                "goodExitRatio_Label",
                "100 * ( GoodExit6Months + GoodExit18Months + GoodExit24Months + GoodExit36Months ) / ( TotalClients - count clients )"
        );
        map.put(
                "badExitRatio_Label",
                "100 * count clients with [RockBottom = 1] / (TotalClients - count clients)"
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
                "recalculateDrift_Slider",
                "RecalculateDrift"
        );
        map.put(
                "shockZone1Starts_Slider",
                "ShockZone1Starts"
        );
        map.put(
                "shockZone1Ends_Slider",
                "ShockZone1Ends"
        );
        map.put(
                "shockZone2Starts_Slider",
                "ShockZone2Starts"
        );
        map.put(
                "shockZone2Ends_Slider",
                "ShockZone2Ends"
        );
        map.put(
                "reliefZone1Starts_Slider",
                "ReliefZone1Starts"
        );
        map.put(
                "reliefZone1Ends_Slider",
                "ReliefZone1Ends"
        );
        map.put(
                "reliefZone2Starts_Slider",
                "ReliefZone2Starts"
        );
        map.put(
                "reliefZone2Ends_Slider",
                "ReliefZone2Ends"
        );
        map.put(
                "shockZone1Increase_Slider",
                "ShockZone1Increase"
        );
        map.put(
                "shockZone2Increase_Slider",
                "ShockZone2Increase"
        );
        map.put(
                "reliefZone1Decrease_Slider",
                "ReliefZone1Decrease"
        );
        map.put(
                "reliefZone2Decrease_Slider",
                "ReliefZone2Decrease"
        );
        map.put(
                "driftModifier_Slider",
                "DriftModifier"
        );
        map.put(
                "solicitors_Slider",
                "Solicitors"
        );

        return map;
    }
}
