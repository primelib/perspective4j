package io.github.primelib.perspective4j.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.processing.Generated;

/**
 * AttributeType
 *
 */
@JsonTypeName("AttributeType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public enum AttributeType {
    TOXICITY,
    SEVERE_TOXICITY,
    IDENTITY_ATTACK,
    INSULT,
    PROFANITY,
    THREAT,
}
