package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ak, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6562Ak implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f65160a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7037Ok f65161b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC8455jk f65162c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7071Pk f65163d;

    C6562Ak(C7071Pk c7071Pk, long j10, C7037Ok c7037Ok, InterfaceC8455jk interfaceC8455jk) {
        this.f65160a = j10;
        this.f65161b = c7037Ok;
        this.f65162c = interfaceC8455jk;
        this.f65163d = c7071Pk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Pc.p0.k("onGmsg /jsLoaded. JsLoaded latency is " + (Lc.v.c().a() - this.f65160a) + " ms.");
        Pc.p0.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f65163d.f69404a) {
            Pc.p0.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.f65161b.a() != -1 && this.f65161b.a() != 1) {
                this.f65163d.f69412i = 0;
                InterfaceC8455jk interfaceC8455jk = this.f65162c;
                interfaceC8455jk.H0("/log", C7035Oi.f69138g);
                interfaceC8455jk.H0("/result", C7035Oi.f69146o);
                this.f65161b.e(this.f65162c);
                this.f65163d.f69411h = this.f65161b;
                Pc.p0.k("Successfully loaded JS Engine.");
                Pc.p0.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            Pc.p0.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
