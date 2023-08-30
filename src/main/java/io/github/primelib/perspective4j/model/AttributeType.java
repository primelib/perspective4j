package io.github.primelib.perspective4j.model;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AttributeType
 * 
 *
 */
@JsonTypeName("AttributeType")
@AllArgsConstructor
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum AttributeType {
    TOXICITY("TOXICITY"),
    SEVERE_TOXICITY("SEVERE_TOXICITY"),
    IDENTITY_ATTACK("IDENTITY_ATTACK"),
    INSULT("INSULT"),
    PROFANITY("PROFANITY"),
    THREAT("THREAT");

    private final String value;
}
