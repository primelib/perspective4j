package io.github.primelib.perspective4j.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CommentAnalyzeResult
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributeScores",
    "languages",
    "detectedLanguages"
})
@JsonTypeName("CommentAnalyzeResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentAnalyzeResult {

    /**
     * Constructs a validated implementation of {@link CommentAnalyzeResult}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CommentAnalyzeResult(Consumer<CommentAnalyzeResult> spec) {
        spec.accept(this);
    }

    @JsonProperty("attributeScores")
    protected Map<String, AttributeScore> attributeScores = new HashMap<>();

    @JsonProperty("languages")
    protected List<String> languages;

    @JsonProperty("detectedLanguages")
    protected List<String> detectedLanguages;


}
