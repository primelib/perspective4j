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
public class PerspectiveConsumerApi {
    private final PerspectiveApi api;

    public PerspectiveConsumerApi(PerspectiveApi api) {
        this.api = api;
    }

    /**
     * Analyze the comment
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>commentAnalyzeRequest: </li>
     * </ul>
     */
    public CommentAnalyzeResult analyzeCommentV1Alpha1(Consumer<AnalyzeCommentV1Alpha1OperationSpec> spec) {
        AnalyzeCommentV1Alpha1OperationSpec r = new AnalyzeCommentV1Alpha1OperationSpec(spec);

        CommentAnalyzeRequest body = new CommentAnalyzeRequest(commentAnalyzeRequest -> {
            commentAnalyzeRequest.comment(new Comment(comment -> comment.text(r.text())));
            commentAnalyzeRequest.languages(new ArrayList<>(r.languages()));
            commentAnalyzeRequest.requestedAttributes(r.requestedAttributes()
                    .stream()
                    .collect(Collectors.toMap(attributeType -> attributeType, attributeType -> new Object())));
            commentAnalyzeRequest.context(r.context());
            commentAnalyzeRequest.doNotStore(r.doNotStore());
            commentAnalyzeRequest.spanAnnotations(r.spanAnnotations());
            commentAnalyzeRequest.communityId(r.communityId());
            commentAnalyzeRequest.clientToken(r.clientToken());
        });
        return api.analyzeCommentV1Alpha1(body);
    }

}
