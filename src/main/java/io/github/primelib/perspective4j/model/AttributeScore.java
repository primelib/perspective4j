package io.github.primelib.perspective4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttributeScore
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "spanScores",
    "summaryScore"
})
@JsonTypeName("AttributeScore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttributeScore {

    @JsonProperty("spanScores")
    private List<SpanScore> spanScores;

    @JsonProperty("summaryScore")
    private Score summaryScore;


}
