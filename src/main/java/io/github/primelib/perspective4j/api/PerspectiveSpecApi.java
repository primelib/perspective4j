package io.github.primelib.perspective4j.api;

import javax.annotation.processing.Generated;

import io.github.primelib.perspective4j.model.Comment;
import io.github.primelib.perspective4j.model.CommentAnalyzeRequest;
import io.github.primelib.perspective4j.model.CommentAnalyzeResult;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import io.github.primelib.perspective4j.spec.AnalyzeCommentV1Alpha1OperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PerspectiveSpecApi {
    private final PerspectiveApi api;

    public PerspectiveSpecApi(PerspectiveApi api) {
        this.api = api;
    }

    /**
     * Analyze the comment
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CommentAnalyzeResult analyzeCommentV1Alpha1(Consumer<AnalyzeCommentV1Alpha1OperationSpec> spec) {
        AnalyzeCommentV1Alpha1OperationSpec r = new AnalyzeCommentV1Alpha1OperationSpec(spec);
        CommentAnalyzeRequest body = new CommentAnalyzeRequest(new Comment(r.text()), r.requestedAttributes()
                .stream()
                .collect(Collectors.toMap(attributeType -> attributeType, attributeType -> new Object())), new ArrayList<>(r.languages()));
        return api.analyzeCommentV1Alpha1(body);
    }

}
