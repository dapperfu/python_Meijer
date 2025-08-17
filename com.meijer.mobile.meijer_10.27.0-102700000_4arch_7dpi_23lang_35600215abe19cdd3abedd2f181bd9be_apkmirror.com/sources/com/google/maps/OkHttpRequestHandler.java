package com.google.maps;

import Qv.k;
import Qv.l;
import Qv.s;
import com.fullstory.FS;
import com.google.maps.GeoApiContext;
import com.google.maps.android.AndroidAuthenticationConfigProvider;
import com.google.maps.android.AndroidAuthenticationInterceptor;
import com.google.maps.internal.ApiResponse;
import com.google.maps.internal.ExceptionsAllowedToRetry;
import com.google.maps.internal.OkHttpPendingResult;
import com.google.maps.internal.RateLimitExecutorService;
import com.google.maps.metrics.RequestMetrics;
import java.net.Proxy;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.j;

/* loaded from: classes7.dex */
public class OkHttpRequestHandler implements GeoApiContext.RequestHandler {
    private static final j JSON = j.g("application/json; charset=utf-8");
    private final OkHttpClient client;
    private final ExecutorService executorService;

    public static class Builder implements GeoApiContext.RequestHandler.Builder {
        private final OkHttpClient.Builder builder;
        private final l dispatcher;
        private final RateLimitExecutorService rateLimitExecutorService;

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public GeoApiContext.RequestHandler build() {
            return new OkHttpRequestHandler(this.builder.a(), this.rateLimitExecutorService);
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder connectTimeout(long j10, TimeUnit timeUnit) {
            this.builder.d(j10, timeUnit);
            return this;
        }

        public OkHttpClient.Builder okHttpClientBuilder() {
            return this.builder;
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder proxy(Proxy proxy) {
            this.builder.T(proxy);
            return this;
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder proxyAuthentication(final String str, final String str2) {
            this.builder.U(new Qv.a() { // from class: com.google.maps.c
                @Override // Qv.a
                public final Request a(s sVar, Response response) {
                    return response.getRequest().g().m("Proxy-Authorization", k.a(str, str2)).b();
                }
            });
            return this;
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder queriesPerSecond(int i10) {
            this.dispatcher.k(i10);
            this.dispatcher.l(i10);
            this.rateLimitExecutorService.setQueriesPerSecond(i10);
            return this;
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder readTimeout(long j10, TimeUnit timeUnit) {
            this.builder.V(j10, timeUnit);
            return this;
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder writeTimeout(long j10, TimeUnit timeUnit) {
            this.builder.b0(j10, timeUnit);
            return this;
        }

        public Builder() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            FS.okhttp_addInterceptors(builder);
            this.builder = builder;
            RateLimitExecutorService rateLimitExecutorService = new RateLimitExecutorService();
            this.rateLimitExecutorService = rateLimitExecutorService;
            l lVar = new l(rateLimitExecutorService);
            this.dispatcher = lVar;
            builder.h(lVar);
            builder.addInterceptor(new AndroidAuthenticationInterceptor(new AndroidAuthenticationConfigProvider().provide()));
        }
    }

    @Override // com.google.maps.GeoApiContext.RequestHandler
    public <T, R extends ApiResponse<T>> PendingResult<T> handle(String str, String str2, Map<String, String> map, Class<R> cls, com.google.gson.c cVar, long j10, Integer num, ExceptionsAllowedToRetry exceptionsAllowedToRetry, RequestMetrics requestMetrics) {
        Request.a aVarF = new Request.a().f();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            aVarF = aVarF.m(entry.getKey(), entry.getValue());
        }
        return new OkHttpPendingResult(aVarF.t(str + str2).b(), this.client, cls, cVar, j10, num, exceptionsAllowedToRetry, requestMetrics);
    }

    @Override // com.google.maps.GeoApiContext.RequestHandler
    public <T, R extends ApiResponse<T>> PendingResult<T> handlePost(String str, String str2, String str3, Map<String, String> map, Class<R> cls, com.google.gson.c cVar, long j10, Integer num, ExceptionsAllowedToRetry exceptionsAllowedToRetry, RequestMetrics requestMetrics) {
        Request.a aVarP = new Request.a().p(RequestBody.create(JSON, str3));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            aVarP = aVarP.m(entry.getKey(), entry.getValue());
        }
        return new OkHttpPendingResult(aVarP.t(str + str2).b(), this.client, cls, cVar, j10, num, exceptionsAllowedToRetry, requestMetrics);
    }

    @Override // com.google.maps.GeoApiContext.RequestHandler
    public void shutdown() {
        this.executorService.shutdown();
        this.client.getConnectionPool().c();
    }

    OkHttpRequestHandler(OkHttpClient okHttpClient, ExecutorService executorService) {
        this.client = okHttpClient;
        this.executorService = executorService;
    }
}
