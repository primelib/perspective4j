package io.github.primelib.perspective4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "attributeScores",
    "languages",
    "detectedLanguages"
})
@JsonTypeName("CommentAnalyzeResult")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentAnalyzeResult {

    @JsonProperty("attributeScores")
    private Map<String, AttributeScore> attributeScores = new HashMap<>();

    @JsonProperty("languages")
    private List<String> languages;

    @JsonProperty("detectedLanguages")
    private List<String> detectedLanguages;


}
