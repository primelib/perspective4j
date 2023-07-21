package io.github.primelib.perspective4j.spec;

import io.github.primelib.perspective4j.model.AttributeType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.processing.Generated;
import java.util.Set;
import java.util.function.Consumer;

/**
 * AnalyzeCommentV1Alpha1Spec
 * <p>
 * Specification for the AnalyzeCommentV1Alpha1 operation.
 * <p>
 * Analyze the comment
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AnalyzeCommentV1Alpha1OperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    @NotNull
    private String text;

    @Nullable
    private Set<String> languages;

    @NotNull
    private Set<AttributeType> requestedAttributes;

    /**
     * Constructs a validated instance of {@link AnalyzeCommentV1Alpha1OperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AnalyzeCommentV1Alpha1OperationSpec(Consumer<AnalyzeCommentV1Alpha1OperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AnalyzeCommentV1Alpha1OperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param text
     * @param languages
     * @param requestedAttributes
     */
    @ApiStatus.Internal
    public AnalyzeCommentV1Alpha1OperationSpec(String text, Set<String> languages, Set<AttributeType> requestedAttributes) {
        this.text = text;
        this.languages = languages;
        this.requestedAttributes = requestedAttributes;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {

    }
}
