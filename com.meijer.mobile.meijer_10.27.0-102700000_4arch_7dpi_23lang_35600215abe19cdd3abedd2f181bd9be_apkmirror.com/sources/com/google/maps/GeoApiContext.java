package com.google.maps;

import com.google.maps.OkHttpRequestHandler;
import com.google.maps.errors.ApiException;
import com.google.maps.errors.OverQueryLimitException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.internal.ExceptionsAllowedToRetry;
import com.google.maps.internal.HttpHeaders;
import com.google.maps.internal.UrlSigner;
import com.google.maps.metrics.NoOpRequestMetricsReporter;
import com.google.maps.metrics.RequestMetrics;
import com.google.maps.metrics.RequestMetricsReporter;
import com.medallia.digital.mobilesdk.l8;
import j$.net.URLEncoder;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Proxy;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class GeoApiContext implements Closeable {
    private static final int DEFAULT_BACKOFF_TIMEOUT_MILLIS = 60000;
    private static final String USER_AGENT = "GoogleGeoApiClientJava/2.1.2";
    private static final String VERSION = "2.1.2";
    private final String apiKey;
    private final String baseUrlOverride;
    private final String channel;
    private final String clientId;
    private final Map<String, String> defaultHeaders;
    private final long errorTimeout;
    private final ExceptionsAllowedToRetry exceptionsAllowedToRetry;
    private final Integer maxRetries;
    private final RequestHandler requestHandler;
    private final RequestMetricsReporter requestMetricsReporter;
    private final UrlSigner urlSigner;

    public static class Builder {
        private String apiKey;
        private String baseUrlOverride;
        private RequestHandler.Builder builder;
        private String channel;
        private String clientId;
        private Integer maxRetries;
        private UrlSigner urlSigner;
        private long errorTimeout = l8.b.f92525b;
        private ExceptionsAllowedToRetry exceptionsAllowedToRetry = new ExceptionsAllowedToRetry();
        private RequestMetricsReporter requestMetricsReporter = new NoOpRequestMetricsReporter();

        public Builder() {
            requestHandlerBuilder(new OkHttpRequestHandler.Builder());
        }

        public Builder disableRetries() {
            maxRetries(0);
            retryTimeout(0L, TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder apiKey(String str) {
            this.apiKey = str;
            return this;
        }

        public Builder baseUrlOverride(String str) {
            this.baseUrlOverride = str;
            return this;
        }

        public GeoApiContext build() {
            return new GeoApiContext(this.builder.build(), this.apiKey, this.baseUrlOverride, this.channel, this.clientId, this.errorTimeout, this.exceptionsAllowedToRetry, this.maxRetries, this.urlSigner, this.requestMetricsReporter);
        }

        public Builder channel(String str) {
            this.channel = str;
            return this;
        }

        public Builder connectTimeout(long j10, TimeUnit timeUnit) {
            this.builder.connectTimeout(j10, timeUnit);
            return this;
        }

        public Builder enterpriseCredentials(String str, String str2) {
            this.clientId = str;
            try {
                this.urlSigner = new UrlSigner(str2);
                return this;
            } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public Builder maxRetries(Integer num) {
            this.maxRetries = num;
            return this;
        }

        public Builder proxy(Proxy proxy) {
            RequestHandler.Builder builder = this.builder;
            if (proxy == null) {
                proxy = Proxy.NO_PROXY;
            }
            builder.proxy(proxy);
            return this;
        }

        public Builder proxyAuthentication(String str, String str2) {
            this.builder.proxyAuthentication(str, str2);
            return this;
        }

        public Builder queryRateLimit(int i10) {
            this.builder.queriesPerSecond(i10);
            return this;
        }

        public Builder readTimeout(long j10, TimeUnit timeUnit) {
            this.builder.readTimeout(j10, timeUnit);
            return this;
        }

        public Builder requestHandlerBuilder(RequestHandler.Builder builder) {
            this.builder = builder;
            this.exceptionsAllowedToRetry.add(OverQueryLimitException.class);
            return this;
        }

        public Builder requestMetricsReporter(RequestMetricsReporter requestMetricsReporter) {
            this.requestMetricsReporter = requestMetricsReporter;
            return this;
        }

        public Builder setIfExceptionIsAllowedToRetry(Class<? extends ApiException> cls, boolean z10) {
            if (z10) {
                this.exceptionsAllowedToRetry.add(cls);
                return this;
            }
            this.exceptionsAllowedToRetry.remove(cls);
            return this;
        }

        public Builder writeTimeout(long j10, TimeUnit timeUnit) {
            this.builder.writeTimeout(j10, timeUnit);
            return this;
        }

        @Deprecated
        Builder baseUrlForTesting(String str) {
            return baseUrlOverride(str);
        }

        public Builder retryTimeout(long j10, TimeUnit timeUnit) {
            this.errorTimeout = timeUnit.toMillis(j10);
            return this;
        }

        public Builder(RequestHandler.Builder builder) {
            requestHandlerBuilder(builder);
        }
    }

    public interface RequestHandler {

        public interface Builder {
            RequestHandler build();

            Builder connectTimeout(long j10, TimeUnit timeUnit);

            Builder proxy(Proxy proxy);

            Builder proxyAuthentication(String str, String str2);

            Builder queriesPerSecond(int i10);

            Builder readTimeout(long j10, TimeUnit timeUnit);

            Builder writeTimeout(long j10, TimeUnit timeUnit);
        }

        <T, R extends ApiResponse<T>> PendingResult<T> handle(String str, String str2, Map<String, String> map, Class<R> cls, com.google.gson.c cVar, long j10, Integer num, ExceptionsAllowedToRetry exceptionsAllowedToRetry, RequestMetrics requestMetrics);

        <T, R extends ApiResponse<T>> PendingResult<T> handlePost(String str, String str2, String str3, Map<String, String> map, Class<R> cls, com.google.gson.c cVar, long j10, Integer num, ExceptionsAllowedToRetry exceptionsAllowedToRetry, RequestMetrics requestMetrics);

        void shutdown();
    }

    <T, R extends ApiResponse<T>> PendingResult<T> get(ApiConfig apiConfig, Class<? extends R> cls, Map<String, String> map, Map<String, List<String>> map2) {
        String str = this.channel;
        if (str != null && !str.isEmpty() && !map2.containsKey("channel")) {
            map2.put("channel", Collections.singletonList(this.channel));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : map2.entrySet()) {
            for (String str2 : entry.getValue()) {
                sb2.append('&');
                sb2.append(entry.getKey());
                sb2.append("=");
                try {
                    sb2.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e10) {
                    throw new IllegalStateException(e10);
                }
            }
        }
        return getWithPath(cls, apiConfig.fieldNamingPolicy, apiConfig.hostName, apiConfig.path, apiConfig.supportsClientId, sb2.toString(), this.requestMetricsReporter.newRequest(apiConfig.path), map);
    }

    <T, R extends ApiResponse<T>> PendingResult<T> post(ApiConfig apiConfig, Class<? extends R> cls, Map<String, String> map, Map<String, List<String>> map2) {
        UrlSigner urlSigner;
        checkContext(apiConfig.supportsClientId);
        StringBuilder sb2 = new StringBuilder(apiConfig.path);
        if (!apiConfig.supportsClientId || this.clientId == null) {
            sb2.append("?key=");
            sb2.append(this.apiKey);
        } else {
            sb2.append("?client=");
            sb2.append(this.clientId);
        }
        if (apiConfig.supportsClientId && (urlSigner = this.urlSigner) != null) {
            String signature = urlSigner.getSignature(sb2.toString());
            sb2.append("&signature=");
            sb2.append(signature);
        }
        String str = apiConfig.hostName;
        String str2 = this.baseUrlOverride;
        return this.requestHandler.handlePost(str2 != null ? str2 : str, sb2.toString(), map2.get("_payload").get(0), addDefaultHeaders(map), cls, apiConfig.fieldNamingPolicy, this.errorTimeout, this.maxRetries, this.exceptionsAllowedToRetry, this.requestMetricsReporter.newRequest(apiConfig.path));
    }

    private Map<String, String> addDefaultHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(map);
        for (Map.Entry<String, String> entry : this.defaultHeaders.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    private void checkContext(boolean z10) {
        UrlSigner urlSigner = this.urlSigner;
        if (urlSigner == null && this.apiKey == null) {
            throw new IllegalStateException("Must provide either API key or Maps for Work credentials.");
        }
        if (!z10 && this.apiKey == null) {
            throw new IllegalStateException("API does not support client ID & secret - you must provide a key");
        }
        if (urlSigner == null && !this.apiKey.startsWith("AIza")) {
            throw new IllegalStateException("Invalid API key.");
        }
    }

    private <T, R extends ApiResponse<T>> PendingResult<T> getWithPath(Class<R> cls, com.google.gson.c cVar, String str, String str2, boolean z10, String str3, RequestMetrics requestMetrics, Map<String, String> map) {
        UrlSigner urlSigner;
        checkContext(z10);
        if (!str3.startsWith("&")) {
            throw new IllegalArgumentException("encodedPath must start with &");
        }
        StringBuilder sb2 = new StringBuilder(str2);
        if (!z10 || this.clientId == null) {
            sb2.append("?key=");
            sb2.append(this.apiKey);
        } else {
            sb2.append("?client=");
            sb2.append(this.clientId);
        }
        sb2.append(str3);
        if (z10 && (urlSigner = this.urlSigner) != null) {
            String signature = urlSigner.getSignature(sb2.toString());
            sb2.append("&signature=");
            sb2.append(signature);
        }
        String str4 = this.baseUrlOverride;
        return this.requestHandler.handle(str4 != null ? str4 : str, sb2.toString(), addDefaultHeaders(map), cls, cVar, this.errorTimeout, this.maxRetries, this.exceptionsAllowedToRetry, requestMetrics);
    }

    public void shutdown() {
        this.requestHandler.shutdown();
    }

    GeoApiContext(RequestHandler requestHandler, String str, String str2, String str3, String str4, long j10, ExceptionsAllowedToRetry exceptionsAllowedToRetry, Integer num, UrlSigner urlSigner, RequestMetricsReporter requestMetricsReporter) {
        HashMap map = new HashMap();
        this.defaultHeaders = map;
        this.requestHandler = requestHandler;
        this.apiKey = str;
        this.baseUrlOverride = str2;
        this.channel = str3;
        this.clientId = str4;
        this.errorTimeout = j10;
        this.exceptionsAllowedToRetry = exceptionsAllowedToRetry;
        this.maxRetries = num;
        this.urlSigner = urlSigner;
        this.requestMetricsReporter = requestMetricsReporter;
        map.put(HttpHeaders.USER_AGENT, USER_AGENT);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        shutdown();
    }

    <T, R extends ApiResponse<T>> PendingResult<T> get(ApiConfig apiConfig, Class<? extends R> cls, Map<String, List<String>> map) {
        return get(apiConfig, cls, Collections.EMPTY_MAP, map);
    }

    <T, R extends ApiResponse<T>> PendingResult<T> get(ApiConfig apiConfig, Class<? extends R> cls, Map<String, String> map, String... strArr) {
        String str;
        if (strArr.length % 2 == 0) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                if (strArr[i10].equals("channel")) {
                    z10 = true;
                }
                sb2.append('&');
                sb2.append(strArr[i10]);
                sb2.append('=');
                try {
                    sb2.append(URLEncoder.encode(strArr[i10 + 1], "UTF-8"));
                } catch (UnsupportedEncodingException e10) {
                    throw new IllegalStateException(e10);
                }
            }
            if (!z10 && (str = this.channel) != null && !str.isEmpty()) {
                sb2.append("&channel=");
                sb2.append(this.channel);
            }
            return getWithPath(cls, apiConfig.fieldNamingPolicy, apiConfig.hostName, apiConfig.path, apiConfig.supportsClientId, sb2.toString(), this.requestMetricsReporter.newRequest(apiConfig.path), addDefaultHeaders(map));
        }
        throw new IllegalArgumentException("Params must be matching key/value pairs.");
    }

    <T, R extends ApiResponse<T>> PendingResult<T> post(ApiConfig apiConfig, Class<? extends R> cls, Map<String, List<String>> map) {
        return post(apiConfig, cls, Collections.EMPTY_MAP, map);
    }

    <T, R extends ApiResponse<T>> PendingResult<T> get(ApiConfig apiConfig, Class<? extends R> cls, String... strArr) {
        return get(apiConfig, cls, Collections.EMPTY_MAP, strArr);
    }
}
