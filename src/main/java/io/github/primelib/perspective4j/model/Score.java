package io.github.primelib.perspective4j.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Score
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "value",
    "type"
})
@JsonTypeName("Score")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Score {

    @JsonProperty("value")
    private Double value;

    @JsonProperty("type")
    private String type;


}
