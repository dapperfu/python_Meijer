package com.bugsnag.android;

import R6.ImmutableConfig;
import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import com.bugsnag.android.AbstractC6613p0;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.bugsnag.android.t0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6620t0 implements AbstractC6613p0.a {

    /* renamed from: a, reason: collision with root package name */
    final D0 f64401a;

    /* renamed from: b, reason: collision with root package name */
    final ImmutableConfig f64402b;

    /* renamed from: c, reason: collision with root package name */
    final StorageManager f64403c;

    /* renamed from: d, reason: collision with root package name */
    final C6602k f64404d;

    /* renamed from: e, reason: collision with root package name */
    final S6.d<Q> f64405e;

    /* renamed from: f, reason: collision with root package name */
    final Context f64406f;

    /* renamed from: g, reason: collision with root package name */
    final Z0 f64407g;

    /* renamed from: h, reason: collision with root package name */
    final M0 f64408h;

    /* renamed from: i, reason: collision with root package name */
    final R6.b f64409i;

    /* renamed from: com.bugsnag.android.t0$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6591e0 f64410a;

        a(C6591e0 c6591e0) {
            this.f64410a = c6591e0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6620t0.this.f64401a.d("InternalReportDelegate - sending internal event");
                H delivery = C6620t0.this.f64402b.getDelivery();
                K kM = C6620t0.this.f64402b.m(this.f64410a);
                if (delivery instanceof F) {
                    Map<String, String> mapB = kM.b();
                    mapB.put("Bugsnag-Internal-Error", "bugsnag-android");
                    mapB.remove("Bugsnag-Api-Key");
                    ((F) delivery).c(kM.getEndpoint(), this.f64410a.a(), this.f64410a.e(), mapB);
                }
            } catch (Exception e10) {
                C6620t0.this.f64401a.b("Failed to report internal event to Bugsnag", e10);
            }
        }
    }

    @Override // com.bugsnag.android.AbstractC6613p0.a
    public void a(Exception exc, File file, String str) throws IOException {
        C6585b0 c6585b0 = new C6585b0(exc, this.f64402b, a1.h("unhandledException"), this.f64401a);
        c6585b0.n(str);
        c6585b0.a("BugsnagDiagnostics", "canRead", Boolean.valueOf(file.canRead()));
        c6585b0.a("BugsnagDiagnostics", "canWrite", Boolean.valueOf(file.canWrite()));
        c6585b0.a("BugsnagDiagnostics", "exists", Boolean.valueOf(file.exists()));
        c6585b0.a("BugsnagDiagnostics", "usableSpace", Long.valueOf(this.f64406f.getCacheDir().getUsableSpace()));
        c6585b0.a("BugsnagDiagnostics", "filename", file.getName());
        c6585b0.a("BugsnagDiagnostics", "fileLength", Long.valueOf(file.length()));
        b(c6585b0);
        c(c6585b0);
    }

    void b(C6585b0 c6585b0) throws IOException {
        if (this.f64403c == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        File file = new File(this.f64406f.getCacheDir(), "bugsnag/errors");
        try {
            boolean zIsCacheBehaviorTombstone = this.f64403c.isCacheBehaviorTombstone(file);
            boolean zIsCacheBehaviorGroup = this.f64403c.isCacheBehaviorGroup(file);
            c6585b0.a("BugsnagDiagnostics", "cacheTombstone", Boolean.valueOf(zIsCacheBehaviorTombstone));
            c6585b0.a("BugsnagDiagnostics", "cacheGroup", Boolean.valueOf(zIsCacheBehaviorGroup));
        } catch (IOException e10) {
            this.f64401a.b("Failed to record cache behaviour, skipping diagnostics", e10);
        }
    }

    void c(C6585b0 c6585b0) {
        c6585b0.l(this.f64404d.e());
        c6585b0.o(this.f64405e.get().i(new Date().getTime()));
        c6585b0.a("BugsnagDiagnostics", "notifierName", this.f64408h.getName());
        c6585b0.a("BugsnagDiagnostics", "notifierVersion", this.f64408h.getVersion());
        c6585b0.a("BugsnagDiagnostics", "apiKey", this.f64402b.getApiKey());
        try {
            this.f64409i.d(R6.t.INTERNAL_REPORT, new a(new C6591e0(null, c6585b0, this.f64408h, this.f64402b)));
        } catch (RejectedExecutionException unused) {
        }
    }

    C6620t0(Context context, D0 d02, ImmutableConfig immutableConfig, StorageManager storageManager, C6602k c6602k, S6.d<Q> dVar, Z0 z02, M0 m02, R6.b bVar) {
        this.f64401a = d02;
        this.f64402b = immutableConfig;
        this.f64403c = storageManager;
        this.f64404d = c6602k;
        this.f64405e = dVar;
        this.f64406f = context;
        this.f64407g = z02;
        this.f64408h = m02;
        this.f64409i = bVar;
    }
}
