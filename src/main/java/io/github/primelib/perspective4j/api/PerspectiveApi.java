package io.github.primelib.perspective4j.api;

import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.perspective4j.model.CommentAnalyzeRequest;
import io.github.primelib.perspective4j.model.CommentAnalyzeResult;
import feign.RequestLine;
import feign.Headers;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface PerspectiveApi {

    /**
     * Analyze the comment
     *
     * @param commentAnalyzeRequest  (required)
     */
    @RequestLine("POST /v1alpha1/comments:analyze")
    @Headers({
        "Content-Type: application/json"
    })
    CommentAnalyzeResult analyzeCommentV1Alpha1(@NotNull CommentAnalyzeRequest commentAnalyzeRequest);

}
