package io.github.primelib.perspective4j;

import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.perspective4j.api.PerspectiveApi;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * A specification to construct a {@link PerspectiveApi} instance.
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public final class PerspectiveFactorySpec<T> {

    /**
     * The name of the backend to use
     */
    @NotNull
    private String backendName = "perspective4j";

    /**
     * The API interface to use
     */
    @NotNull
    private Class<T> api;

    /**
     * The api base URL
     */
    @NotNull
    private String baseUrl = "https://commentanalyzer.googleapis.com";

    /**
     * MeterRegistry to use for metrics
     */
    @NotNull
    private MeterRegistry meterRegistry = new CompositeMeterRegistry();

    /**
     * Constructs a validated implementation of {@link PerspectiveApi}.
     *
     * @param spec the specification to process
     */
    @NotNull
    public PerspectiveFactorySpec(@NotNull Consumer<PerspectiveFactorySpec<T>> spec) {
        spec.accept(this);
        validate();
    }

    /**
     * Ensures the configured specification is valid.
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(backendName, "backendName must not be null");
        Objects.requireNonNull(api, "api must not be null");
        Objects.requireNonNull(baseUrl, "baseUrl must not be null");
        if (baseUrl.isEmpty()) {
            throw new IllegalArgumentException("baseUrl must not be empty");
        }
    }

    public void applySpec(PerspectiveFactorySpec<?> spec) {
        backendName(spec.backendName());
        baseUrl(spec.baseUrl());
        meterRegistry(spec.meterRegistry());
    }
}
