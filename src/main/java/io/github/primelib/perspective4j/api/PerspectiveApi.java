package io.github.primelib.perspective4j.api;

import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.perspective4j.model.CommentAnalyzeRequest;
import io.github.primelib.perspective4j.model.CommentAnalyzeResult;
import feign.RequestLine;
import feign.Param;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface PerspectiveApi {

    /**
     * Analyze the comment
     *
     * @param key                  API key for authentication (required)
     * @param commentAnalyzeRequest  (required)
     */
    @RequestLine("POST /v1alpha1/comments:analyze?key={key}")
    CommentAnalyzeResult analyzeCommentV1Alpha1(@Param("key") @NotNull String key,  @NotNull CommentAnalyzeRequest commentAnalyzeRequest);

}
