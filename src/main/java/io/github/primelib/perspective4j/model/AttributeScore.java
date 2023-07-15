package io.github.primelib.perspective4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "spanScores",
    "summaryScore"
})
@JsonTypeName("AttributeScore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttributeScore {

    /**
     * Constructs a validated implementation of {@link AttributeScore}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AttributeScore(Consumer<AttributeScore> spec) {
        spec.accept(this);
    }

    @JsonProperty("spanScores")
    protected List<SpanScore> spanScores;

    @JsonProperty("summaryScore")
    protected Score summaryScore;


}
