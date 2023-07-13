package io.github.primelib.perspective4j.auth;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class ApiKeyAuthSpec implements AuthMethod {
    /**
     * location of the API key
     */
    @NotNull
    private String propertyLocation = "query";

    /**
     * key of the property that holds the API key (header key or query param key)
     */
    @NotNull
    private String propertyKey = "key";

    /**
     * template for the API key property, use {apiKey} as placeholder for the value
     */
    private String propertyTemplate = "";

    /**
     * the API key
     */
    @NotNull
    private String apiKey;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.PUBLIC)
    private Map<String, String> headerMap;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.PUBLIC)
    private Map<String, String> queryMap;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.PUBLIC)
    private Map<String, String> cookieMap;

    /**
     * Constructs a validated implementation of {@link ApiKeyAuthSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ApiKeyAuthSpec(Consumer<ApiKeyAuthSpec> spec) {
        spec.accept(this);
        validate();
        update(apiKey);
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException if a required parameter is missing
     * @throws IllegalArgumentException if a parameter has an invalid value
     */
    public void validate() {
        Objects.requireNonNull(apiKey, "apiKey is a required parameter!");

        // validate propertyLocation
        if (!propertyLocation.equals("header") && !propertyLocation.equals("query"))
            throw new IllegalArgumentException("propertyLocation must be either header or query");
    }

    private void update(String value) {
        if (propertyTemplate != null && !propertyTemplate.isEmpty())
            value = propertyTemplate.replace("{apiKey}", value);

        // set params
        if (propertyLocation.equals("header")) {
            headerMap = Map.of(propertyKey, value);
            queryMap = null;
            cookieMap = null;
        } else if (propertyLocation.equals("query")) {
            headerMap = null;
            queryMap = Map.of(propertyKey, value);
            cookieMap = null;
        }
    }
}
