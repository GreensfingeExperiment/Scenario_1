package net.sf.esfinge.experiment.scenario1;

import net.sf.esfinge.experiment.scenario1.service.RecommendationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecommendationServiceTest {

    private static final String RECOMMENDATION = "Tenis Casual received 106 visits this month.\n Also check out Mochila Executiva!";
    private static final String MINUS_ENERGY_RECOMMENDATION = " received  visits this month.\n Also check out !";

    @Test
    void testFindRecommendation() {
        RecommendationService recommendationService = new RecommendationService();
        StringBuilder sb = new StringBuilder();
        recommendationService.findRecommendation(sb);

        assertEquals(RECOMMENDATION, sb.toString());
    }

    @Test
    void testFindRecommendationUsingToggle() {
        RecommendationService recommendationService = new RecommendationService();
        StringBuilder sb = new StringBuilder();
        recommendationService.findRecommendation(sb);

        assertEquals(MINUS_ENERGY_RECOMMENDATION, sb.toString());
    }

}
