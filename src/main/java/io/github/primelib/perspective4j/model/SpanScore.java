package io.github.primelib.perspective4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpanScore
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "score"
})
@JsonTypeName("SpanScore")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SpanScore {

    @JsonProperty("score")
    private Score score;


}
