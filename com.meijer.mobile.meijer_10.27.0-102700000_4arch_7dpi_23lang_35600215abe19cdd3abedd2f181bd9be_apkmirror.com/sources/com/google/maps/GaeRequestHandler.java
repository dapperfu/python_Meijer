package com.google.maps;

import com.google.appengine.api.urlfetch.FetchOptions;
import com.google.appengine.api.urlfetch.HTTPHeader;
import com.google.appengine.api.urlfetch.HTTPMethod;
import com.google.appengine.api.urlfetch.HTTPRequest;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.appengine.api.urlfetch.URLFetchServiceFactory;
import com.google.maps.GeoApiContext;
import com.google.maps.internal.ApiResponse;
import com.google.maps.internal.ExceptionsAllowedToRetry;
import com.google.maps.internal.GaePendingResult;
import com.google.maps.metrics.RequestMetrics;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import qw.d;

/* loaded from: classes7.dex */
public class GaeRequestHandler implements GeoApiContext.RequestHandler {
    private static final qw.c LOG = d.j(GaeRequestHandler.class.getName());
    private final URLFetchService client = URLFetchServiceFactory.getURLFetchService();

    public static class Builder implements GeoApiContext.RequestHandler.Builder {
        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public GeoApiContext.RequestHandler build() {
            return new GaeRequestHandler();
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder connectTimeout(long j10, TimeUnit timeUnit) {
            throw new RuntimeException("connectTimeout not implemented for Google App Engine");
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder proxy(Proxy proxy) {
            throw new RuntimeException("setProxy not implemented for Google App Engine");
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder proxyAuthentication(String str, String str2) {
            throw new RuntimeException("setProxyAuthentication not implemented for Google App Engine");
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder queriesPerSecond(int i10) {
            throw new RuntimeException("queriesPerSecond not implemented for Google App Engine");
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder readTimeout(long j10, TimeUnit timeUnit) {
            throw new RuntimeException("readTimeout not implemented for Google App Engine");
        }

        @Override // com.google.maps.GeoApiContext.RequestHandler.Builder
        public Builder writeTimeout(long j10, TimeUnit timeUnit) {
            throw new RuntimeException("writeTimeout not implemented for Google App Engine");
        }
    }

    @Override // com.google.maps.GeoApiContext.RequestHandler
    public void shutdown() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handle$0(HTTPRequest hTTPRequest, String str, String str2) {
        hTTPRequest.addHeader(new HTTPHeader(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handlePost$1(HTTPRequest hTTPRequest, String str, String str2) {
        hTTPRequest.addHeader(new HTTPHeader(str, str2));
    }

    @Override // com.google.maps.GeoApiContext.RequestHandler
    public <T, R extends ApiResponse<T>> PendingResult<T> handle(String str, String str2, Map<String, String> map, Class<R> cls, com.google.gson.c cVar, long j10, Integer num, ExceptionsAllowedToRetry exceptionsAllowedToRetry, RequestMetrics requestMetrics) {
        try {
            final HTTPRequest hTTPRequest = new HTTPRequest(new URL(str + str2), HTTPMethod.POST, FetchOptions.Builder.withDeadline(10.0d));
            map.forEach(new BiConsumer() { // from class: com.google.maps.b
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    GaeRequestHandler.lambda$handle$0(hTTPRequest, (String) obj, (String) obj2);
                }
            });
            return new GaePendingResult(hTTPRequest, this.client, cls, cVar, j10, num, exceptionsAllowedToRetry, requestMetrics);
        } catch (MalformedURLException e10) {
            LOG.i("Request: {}{}", str, str2, e10);
            throw new RuntimeException(e10);
        }
    }

    @Override // com.google.maps.GeoApiContext.RequestHandler
    public <T, R extends ApiResponse<T>> PendingResult<T> handlePost(String str, String str2, String str3, Map<String, String> map, Class<R> cls, com.google.gson.c cVar, long j10, Integer num, ExceptionsAllowedToRetry exceptionsAllowedToRetry, RequestMetrics requestMetrics) {
        try {
            final HTTPRequest hTTPRequest = new HTTPRequest(new URL(str + str2), HTTPMethod.POST, FetchOptions.Builder.withDeadline(10.0d));
            hTTPRequest.setHeader(new HTTPHeader("Content-Type", "application/json; charset=utf-8"));
            map.forEach(new BiConsumer() { // from class: com.google.maps.a
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    GaeRequestHandler.lambda$handlePost$1(hTTPRequest, (String) obj, (String) obj2);
                }
            });
            hTTPRequest.setPayload(str3.getBytes(StandardCharsets.UTF_8));
            return new GaePendingResult(hTTPRequest, this.client, cls, cVar, j10, num, exceptionsAllowedToRetry, requestMetrics);
        } catch (MalformedURLException e10) {
            LOG.i("Request: {}{}", str, str2, e10);
            throw new RuntimeException(e10);
        }
    }

    GaeRequestHandler() {
    }
}
