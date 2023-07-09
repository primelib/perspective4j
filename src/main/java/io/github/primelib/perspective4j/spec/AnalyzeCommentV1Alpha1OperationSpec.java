package io.github.primelib.perspective4j.spec;

import io.github.primelib.perspective4j.model.AttributeType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.processing.Generated;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/**
 * AnalyzeCommentV1Alpha1Spec
 * <p>
 * Specification for the AnalyzeCommentV1Alpha1 operation.
 * <p>
 * Analyze comments
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyzeCommentV1Alpha1OperationSpec {

    /**
     * API key for authentication
     */
    @NotNull 
    private String apiKey;

    @NotNull
    private String text;

    @Nullable
    private Set<String> languages;

    @NotNull
    private Set<AttributeType> requestedAttributes;

    /**
     * Constructs a validated implementation of {@link AnalyzeCommentV1Alpha1OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnalyzeCommentV1Alpha1OperationSpec(Consumer<AnalyzeCommentV1Alpha1OperationSpec> spec) {
        spec.accept(this);
        validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(apiKey, "apiKey is a required parameter!");
        Objects.requireNonNull(text, "text is a required parameter!");
        Objects.requireNonNull(requestedAttributes, "requestedAttributes is a required parameter!");
    }

}
