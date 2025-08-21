package com.launchdarkly.sdk.android;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.LDFailure;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import jh.C15034c;
import nh.C15945c;
import nh.InterfaceC15944b;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import qh.AbstractC16668b;
import qh.C16669c;

/* loaded from: classes8.dex */
class S implements M {

    /* renamed from: a, reason: collision with root package name */
    private final URI f91931a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f91932b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f91933c;

    /* renamed from: d, reason: collision with root package name */
    private final C16669c f91934d;

    /* renamed from: e, reason: collision with root package name */
    private final OkHttpClient f91935e;

    /* renamed from: f, reason: collision with root package name */
    private final C15034c f91936f;

    class a implements Mv.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15944b f91937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Request f91938b;

        a(InterfaceC15944b interfaceC15944b, Request request) {
            this.f91937a = interfaceC15944b;
            this.f91938b = request;
        }

        @Override // Mv.b
        public void onFailure(okhttp3.d dVar, IOException iOException) {
            i0.c(S.this.f91936f, iOException, "Exception when fetching flags", new Object[0]);
            this.f91937a.onError(new LDFailure("Exception while fetching flags", iOException, LDFailure.a.NETWORK_FAILURE));
        }

        @Override // Mv.b
        public void onResponse(okhttp3.d dVar, Response response) {
            try {
                try {
                    ResponseBody body = response.getBody();
                    String strString = body != null ? body.string() : "";
                    if (response.getIsSuccessful()) {
                        S.this.f91936f.a(strString);
                        S.this.f91936f.c("Cache hit count: {} Cache network Count: {}", Integer.valueOf(S.this.f91935e.getCache().g()), Integer.valueOf(S.this.f91935e.getCache().h()));
                        S.this.f91936f.b("Cache response: {}", response.getCacheResponse());
                        S.this.f91936f.b("Network response: {}", response.getNetworkResponse());
                        this.f91937a.onSuccess(strString);
                        response.close();
                        return;
                    }
                    if (response.getCode() == 400) {
                        S.this.f91936f.e("Received 400 response when fetching flag values. Please check recommended ProGuard settings");
                    }
                    this.f91937a.onError(new LDInvalidResponseCodeFailure("Unexpected response when retrieving Feature Flags: " + response + " using url: " + this.f91938b.getUrl() + " with body: " + strString, response.getCode(), true));
                    response.close();
                } catch (Exception e10) {
                    i0.c(S.this.f91936f, e10, "Exception when handling response for url: {} with body: {}", this.f91938b.getUrl(), "");
                    this.f91937a.onError(new LDFailure("Exception while handling flag fetch response", e10, LDFailure.a.INVALID_RESPONSE_BODY));
                    if (response != null) {
                        response.close();
                    }
                }
            } catch (Throwable th2) {
                if (response != null) {
                    response.close();
                }
                throw th2;
            }
        }
    }

    @Override // com.launchdarkly.sdk.android.M
    public synchronized void L3(LDContext lDContext, InterfaceC15944b<String> interfaceC15944b) {
        try {
            if (lDContext != null) {
                try {
                    Request requestD = this.f91933c ? d(lDContext) : c(lDContext);
                    this.f91936f.b("Polling for flag data: {}", requestD.getUrl());
                    FirebasePerfOkHttpClient.enqueue(this.f91935e.b(requestD), new a(interfaceC15944b, requestD));
                } catch (IOException e10) {
                    i0.c(this.f91936f, e10, "Unexpected error in constructing request", new Object[0]);
                    interfaceC15944b.onError(new LDFailure("Exception while fetching flags", e10, LDFailure.a.UNKNOWN_ERROR));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private Request c(LDContext lDContext) throws IOException {
        URI uriA = AbstractC16668b.a(AbstractC16668b.a(this.f91931a, "/msdk/evalx/contexts"), i0.h(lDContext));
        if (this.f91932b) {
            uriA = URI.create(uriA.toString() + "?withReasons=true");
        }
        this.f91936f.b("Attempting to fetch Feature flags using uri: {}", uriA);
        return new Request.a().u(uriA.toURL()).n(this.f91934d.f().f()).b();
    }

    private Request d(LDContext lDContext) throws IOException {
        URI uriA = AbstractC16668b.a(this.f91931a, "/msdk/evalx/context");
        if (this.f91932b) {
            uriA = URI.create(uriA.toString() + "?withReasons=true");
        }
        this.f91936f.b("Attempting to report user using uri: {}", uriA);
        return new Request.a().u(uriA.toURL()).n(this.f91934d.f().f()).o("REPORT", RequestBody.create(com.launchdarkly.sdk.json.d.d(lDContext), c0.f91995t)).b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C16669c.e(this.f91935e);
    }

    S(C15945c c15945c) {
        this.f91931a = c15945c.i().b();
        this.f91932b = c15945c.j();
        this.f91933c = c15945c.g().d();
        C16669c c16669cE = i0.e(c15945c);
        this.f91934d = c16669cE;
        C15034c c15034cA = c15945c.a();
        this.f91936f = c15034cA;
        File file = new File(C11682s.p(c15945c).t().G(), "com.launchdarkly.http-cache");
        c15034cA.b("Using cache at: {}", file.getAbsolutePath());
        this.f91935e = c16669cE.g().b(new okhttp3.b(file, 500000L)).f(new Mv.h(0, 1L, TimeUnit.MILLISECONDS)).X(true).a();
    }
}
