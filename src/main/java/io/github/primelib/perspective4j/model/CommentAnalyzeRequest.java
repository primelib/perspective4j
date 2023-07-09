package io.github.primelib.perspective4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CommentAnalyzeRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "comment",
    "requestedAttributes",
    "languages"
})
@JsonTypeName("CommentAnalyzeRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentAnalyzeRequest {

    @JsonProperty("comment")
    private Comment comment;

    @JsonProperty("requestedAttributes")
    private Map<AttributeType, Object> requestedAttributes = new HashMap<>();

    @JsonProperty("languages")
    private List<String> languages;


}
