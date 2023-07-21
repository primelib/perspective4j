package io.github.primelib.perspective4j.model;

import java.util.HashMap;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CommentAnalyzeRequest
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "comment",
    "requestedAttributes",
    "languages"
})
@JsonTypeName("CommentAnalyzeRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CommentAnalyzeRequest {

    @JsonProperty("comment")
    protected Comment comment;

    @JsonProperty("requestedAttributes")
    protected Map<AttributeType, Object> requestedAttributes;

    @JsonProperty("languages")
    protected List<String> languages;

    /**
     * Constructs a validated instance of {@link CommentAnalyzeRequest}.
     *
     * @param spec the specification to process
     */
    public CommentAnalyzeRequest(Consumer<CommentAnalyzeRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CommentAnalyzeRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CommentAnalyzeRequest(Consumer)} instead.
     * @param comment var.name
     * @param requestedAttributes var.name
     * @param languages var.name
     */
    @ApiStatus.Internal
    public CommentAnalyzeRequest(Comment comment, Map<AttributeType, Object> requestedAttributes, List<String> languages) {
        this.comment = comment;
        this.requestedAttributes = requestedAttributes;
        this.languages = languages;
    }

}
