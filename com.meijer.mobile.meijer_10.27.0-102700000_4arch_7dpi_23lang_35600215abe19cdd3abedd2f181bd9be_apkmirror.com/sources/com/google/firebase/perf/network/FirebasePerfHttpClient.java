package com.google.firebase.perf.network;

import Vf.g;
import Zf.k;
import ag.l;
import androidx.annotation.Keep;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes7.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return g(httpClient, httpUriRequest, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return h(httpClient, httpUriRequest, httpContext, new l(), k.k());
    }

    private FirebasePerfHttpClient() {
    }

    static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.x(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = Xf.d.a(httpRequest);
            if (lA != null) {
                gVarC.o(lA.longValue());
            }
            lVar.g();
            gVarC.q(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new Xf.c(responseHandler, lVar, gVarC));
        } catch (IOException e10) {
            gVarC.v(lVar.c());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.x(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = Xf.d.a(httpRequest);
            if (lA != null) {
                gVarC.o(lA.longValue());
            }
            lVar.g();
            gVarC.q(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new Xf.c(responseHandler, lVar, gVarC), httpContext);
        } catch (IOException e10) {
            gVarC.v(lVar.c());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.x(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = Xf.d.a(httpUriRequest);
            if (lA != null) {
                gVarC.o(lA.longValue());
            }
            lVar.g();
            gVarC.q(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new Xf.c(responseHandler, lVar, gVarC));
        } catch (IOException e10) {
            gVarC.v(lVar.c());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.x(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = Xf.d.a(httpUriRequest);
            if (lA != null) {
                gVarC.o(lA.longValue());
            }
            lVar.g();
            gVarC.q(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new Xf.c(responseHandler, lVar, gVarC), httpContext);
        } catch (IOException e10) {
            gVarC.v(lVar.c());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.x(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = Xf.d.a(httpRequest);
            if (lA != null) {
                gVarC.o(lA.longValue());
            }
            lVar.g();
            gVarC.q(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            gVarC.v(lVar.c());
            gVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = Xf.d.a(httpResponseExecute);
            if (lA2 != null) {
                gVarC.s(lA2.longValue());
            }
            String strB = Xf.d.b(httpResponseExecute);
            if (strB != null) {
                gVarC.r(strB);
            }
            gVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            gVarC.v(lVar.c());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) c(httpClient, httpUriRequest, responseHandler, new l(), k.k());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.x(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = Xf.d.a(httpRequest);
            if (lA != null) {
                gVarC.o(lA.longValue());
            }
            lVar.g();
            gVarC.q(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            gVarC.v(lVar.c());
            gVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = Xf.d.a(httpResponseExecute);
            if (lA2 != null) {
                gVarC.s(lA2.longValue());
            }
            String strB = Xf.d.b(httpResponseExecute);
            if (strB != null) {
                gVarC.r(strB);
            }
            gVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            gVarC.v(lVar.c());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.x(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = Xf.d.a(httpUriRequest);
            if (lA != null) {
                gVarC.o(lA.longValue());
            }
            lVar.g();
            gVarC.q(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            gVarC.v(lVar.c());
            gVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = Xf.d.a(httpResponseExecute);
            if (lA2 != null) {
                gVarC.s(lA2.longValue());
            }
            String strB = Xf.d.b(httpResponseExecute);
            if (strB != null) {
                gVarC.r(strB);
            }
            gVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            gVarC.v(lVar.c());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.x(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = Xf.d.a(httpUriRequest);
            if (lA != null) {
                gVarC.o(lA.longValue());
            }
            lVar.g();
            gVarC.q(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            gVarC.v(lVar.c());
            gVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = Xf.d.a(httpResponseExecute);
            if (lA2 != null) {
                gVarC.s(lA2.longValue());
            }
            String strB = Xf.d.b(httpResponseExecute);
            if (strB != null) {
                gVarC.r(strB);
            }
            gVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            gVarC.v(lVar.c());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return e(httpClient, httpHost, httpRequest, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return f(httpClient, httpHost, httpRequest, httpContext, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), k.k());
    }
}
