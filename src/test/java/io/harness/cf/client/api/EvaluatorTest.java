package io.harness.cf.client.api;


import com.github.benmanes.caffeine.cache.Caffeine;
import io.harness.cf.client.dto.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class EvaluatorTest {

  private static Evaluator evaluator;

  @BeforeClass
  public static void beforeClass() {

    evaluator = new Evaluator(Caffeine.newBuilder().maximumSize(10000).build());
  }

  @Test
  public void evaluate() throws CfClientException {

    // FIXME:
    //
    //    FeatureConfig featureConfig =
    //        FeatureConfigBuilder.aFeatureConfig()
    //            .state(FeatureState.ON)
    //            .variations(
    //                ImmutableList.<Variation>builder()
    //                    .add(
    //                        VariationBuilder.aVariation()
    //                            .identifier("false")
    //                            .name("false")
    //                            .value("false")
    //                            .build())
    //                    .add(
    //                        VariationBuilder.aVariation()
    //                            .identifier("true")
    //                            .name("true")
    //                            .value("true")
    //                            .build())
    //                    .build())
    //            .variationToTargetMap(
    //                Collections.singletonList(
    //                    VariationMapBuilder.aVariationMap()
    //                        .variation("true")
    //                        .targets(Arrays.asList("target2"))
    //                        .build()))
    //            .rules(
    //                Arrays.asList(
    //                    ServingRuleBuilder.aServingRule()
    //                        .clauses(
    //                            Collections.singletonList(
    //                                ClauseBuilder.aClause()
    //                                    .withAttribute("non-existing-attribute")
    //                                    .withValue(Arrays.asList("any-value"))
    //                                    .withOp("equal")
    //                                    .build()))
    //                        .build()))
    //            .defaultServe(ServeBuilder.aServe().variation("true").build())
    //            .build();
    //    Target target = Target.builder().identifier("target1").build();
    //    Object result = evaluator.evaluate(featureConfig, target);
    //    assertEquals("true", result);
  }
}
