package com.launchdarkly.sdk.android;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.LDFailure;
import ih.C14724c;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import mh.C15622c;
import mh.InterfaceC15621b;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ph.AbstractC16304b;
import ph.C16305c;

/* loaded from: classes7.dex */
class S implements M {

    /* renamed from: a, reason: collision with root package name */
    private final URI f91092a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f91093b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f91094c;

    /* renamed from: d, reason: collision with root package name */
    private final C16305c f91095d;

    /* renamed from: e, reason: collision with root package name */
    private final OkHttpClient f91096e;

    /* renamed from: f, reason: collision with root package name */
    private final C14724c f91097f;

    class a implements Qv.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15621b f91098a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Request f91099b;

        a(InterfaceC15621b interfaceC15621b, Request request) {
            this.f91098a = interfaceC15621b;
            this.f91099b = request;
        }

        @Override // Qv.b
        public void onFailure(okhttp3.d dVar, IOException iOException) {
            i0.c(S.this.f91097f, iOException, "Exception when fetching flags", new Object[0]);
            this.f91098a.onError(new LDFailure("Exception while fetching flags", iOException, LDFailure.a.NETWORK_FAILURE));
        }

        @Override // Qv.b
        public void onResponse(okhttp3.d dVar, Response response) {
            try {
                try {
                    ResponseBody body = response.getBody();
                    String strString = body != null ? body.string() : "";
                    if (response.getIsSuccessful()) {
                        S.this.f91097f.a(strString);
                        S.this.f91097f.c("Cache hit count: {} Cache network Count: {}", Integer.valueOf(S.this.f91096e.getCache().g()), Integer.valueOf(S.this.f91096e.getCache().h()));
                        S.this.f91097f.b("Cache response: {}", response.getCacheResponse());
                        S.this.f91097f.b("Network response: {}", response.getNetworkResponse());
                        this.f91098a.onSuccess(strString);
                        response.close();
                        return;
                    }
                    if (response.getCode() == 400) {
                        S.this.f91097f.e("Received 400 response when fetching flag values. Please check recommended ProGuard settings");
                    }
                    this.f91098a.onError(new LDInvalidResponseCodeFailure("Unexpected response when retrieving Feature Flags: " + response + " using url: " + this.f91099b.getUrl() + " with body: " + strString, response.getCode(), true));
                    response.close();
                } catch (Exception e10) {
                    i0.c(S.this.f91097f, e10, "Exception when handling response for url: {} with body: {}", this.f91099b.getUrl(), "");
                    this.f91098a.onError(new LDFailure("Exception while handling flag fetch response", e10, LDFailure.a.INVALID_RESPONSE_BODY));
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
    public synchronized void k2(LDContext lDContext, InterfaceC15621b<String> interfaceC15621b) {
        try {
            if (lDContext != null) {
                try {
                    Request requestD = this.f91094c ? d(lDContext) : c(lDContext);
                    this.f91097f.b("Polling for flag data: {}", requestD.getUrl());
                    FirebasePerfOkHttpClient.enqueue(this.f91096e.b(requestD), new a(interfaceC15621b, requestD));
                } catch (IOException e10) {
                    i0.c(this.f91097f, e10, "Unexpected error in constructing request", new Object[0]);
                    interfaceC15621b.onError(new LDFailure("Exception while fetching flags", e10, LDFailure.a.UNKNOWN_ERROR));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private Request c(LDContext lDContext) throws IOException {
        URI uriA = AbstractC16304b.a(AbstractC16304b.a(this.f91092a, "/msdk/evalx/contexts"), i0.h(lDContext));
        if (this.f91093b) {
            uriA = URI.create(uriA.toString() + "?withReasons=true");
        }
        this.f91097f.b("Attempting to fetch Feature flags using uri: {}", uriA);
        return new Request.a().u(uriA.toURL()).n(this.f91095d.f().f()).b();
    }

    private Request d(LDContext lDContext) throws IOException {
        URI uriA = AbstractC16304b.a(this.f91092a, "/msdk/evalx/context");
        if (this.f91093b) {
            uriA = URI.create(uriA.toString() + "?withReasons=true");
        }
        this.f91097f.b("Attempting to report user using uri: {}", uriA);
        return new Request.a().u(uriA.toURL()).n(this.f91095d.f().f()).o("REPORT", RequestBody.create(com.launchdarkly.sdk.json.d.d(lDContext), c0.f91156t)).b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C16305c.e(this.f91096e);
    }

    S(C15622c c15622c) {
        this.f91092a = c15622c.i().b();
        this.f91093b = c15622c.j();
        this.f91094c = c15622c.g().d();
        C16305c c16305cE = i0.e(c15622c);
        this.f91095d = c16305cE;
        C14724c c14724cA = c15622c.a();
        this.f91097f = c14724cA;
        File file = new File(C11557s.p(c15622c).t().G(), "com.launchdarkly.http-cache");
        c14724cA.b("Using cache at: {}", file.getAbsolutePath());
        this.f91096e = c16305cE.g().b(new okhttp3.b(file, 500000L)).f(new Qv.h(0, 1L, TimeUnit.MILLISECONDS)).X(true).a();
    }
}
