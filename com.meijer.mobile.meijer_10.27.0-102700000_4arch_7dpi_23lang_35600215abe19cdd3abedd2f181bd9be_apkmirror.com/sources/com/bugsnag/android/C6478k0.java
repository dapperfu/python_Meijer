package com.bugsnag.android;

import Q6.ImmutableConfig;
import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import com.bugsnag.android.AbstractC6468f0;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.bugsnag.android.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6478k0 implements AbstractC6468f0.a {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6495t0 f63476a;

    /* renamed from: b, reason: collision with root package name */
    final ImmutableConfig f63477b;

    /* renamed from: c, reason: collision with root package name */
    final StorageManager f63478c;

    /* renamed from: d, reason: collision with root package name */
    final C6471h f63479d;

    /* renamed from: e, reason: collision with root package name */
    final K f63480e;

    /* renamed from: f, reason: collision with root package name */
    final Context f63481f;

    /* renamed from: g, reason: collision with root package name */
    final O0 f63482g;

    /* renamed from: h, reason: collision with root package name */
    final B0 f63483h;

    /* renamed from: i, reason: collision with root package name */
    final Q6.a f63484i;

    /* renamed from: com.bugsnag.android.k0$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y f63485a;

        a(Y y10) {
            this.f63485a = y10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C6478k0.this.f63476a.d("InternalReportDelegate - sending internal event");
                D delivery = C6478k0.this.f63477b.getDelivery();
                G gM = C6478k0.this.f63477b.m(this.f63485a);
                if (delivery instanceof C) {
                    Map<String, String> mapB = gM.b();
                    mapB.put("Bugsnag-Internal-Error", "bugsnag-android");
                    mapB.remove("Bugsnag-Api-Key");
                    ((C) delivery).c(gM.getEndpoint(), Q6.k.f29894c.e(this.f63485a), mapB);
                }
            } catch (Exception e10) {
                C6478k0.this.f63476a.b("Failed to report internal event to Bugsnag", e10);
            }
        }
    }

    @Override // com.bugsnag.android.AbstractC6468f0.a
    public void a(Exception exc, File file, String str) throws IOException {
        V v10 = new V(exc, this.f63477b, P0.h("unhandledException"), this.f63476a);
        v10.n(str);
        v10.a("BugsnagDiagnostics", "canRead", Boolean.valueOf(file.canRead()));
        v10.a("BugsnagDiagnostics", "canWrite", Boolean.valueOf(file.canWrite()));
        v10.a("BugsnagDiagnostics", "exists", Boolean.valueOf(file.exists()));
        v10.a("BugsnagDiagnostics", "usableSpace", Long.valueOf(this.f63481f.getCacheDir().getUsableSpace()));
        v10.a("BugsnagDiagnostics", "filename", file.getName());
        v10.a("BugsnagDiagnostics", "fileLength", Long.valueOf(file.length()));
        b(v10);
        c(v10);
    }

    void b(V v10) throws IOException {
        if (this.f63478c == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        File file = new File(this.f63481f.getCacheDir(), "bugsnag-errors");
        try {
            boolean zIsCacheBehaviorTombstone = this.f63478c.isCacheBehaviorTombstone(file);
            boolean zIsCacheBehaviorGroup = this.f63478c.isCacheBehaviorGroup(file);
            v10.a("BugsnagDiagnostics", "cacheTombstone", Boolean.valueOf(zIsCacheBehaviorTombstone));
            v10.a("BugsnagDiagnostics", "cacheGroup", Boolean.valueOf(zIsCacheBehaviorGroup));
        } catch (IOException e10) {
            this.f63476a.b("Failed to record cache behaviour, skipping diagnostics", e10);
        }
    }

    void c(V v10) {
        v10.l(this.f63479d.e());
        v10.o(this.f63480e.h(new Date().getTime()));
        v10.a("BugsnagDiagnostics", "notifierName", this.f63483h.getName());
        v10.a("BugsnagDiagnostics", "notifierVersion", this.f63483h.getVersion());
        v10.a("BugsnagDiagnostics", "apiKey", this.f63477b.getApiKey());
        try {
            this.f63484i.c(Q6.n.INTERNAL_REPORT, new a(new Y(null, v10, this.f63483h, this.f63477b)));
        } catch (RejectedExecutionException unused) {
        }
    }

    C6478k0(Context context, InterfaceC6495t0 interfaceC6495t0, ImmutableConfig immutableConfig, StorageManager storageManager, C6471h c6471h, K k10, O0 o02, B0 b02, Q6.a aVar) {
        this.f63476a = interfaceC6495t0;
        this.f63477b = immutableConfig;
        this.f63478c = storageManager;
        this.f63479d = c6471h;
        this.f63480e = k10;
        this.f63481f = context;
        this.f63482g = o02;
        this.f63483h = b02;
        this.f63484i = aVar;
    }
}
