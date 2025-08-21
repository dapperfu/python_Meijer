package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ak, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6687Ak implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f66000a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7162Ok f66001b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC8580jk f66002c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7196Pk f66003d;

    C6687Ak(C7196Pk c7196Pk, long j10, C7162Ok c7162Ok, InterfaceC8580jk interfaceC8580jk) {
        this.f66000a = j10;
        this.f66001b = c7162Ok;
        this.f66002c = interfaceC8580jk;
        this.f66003d = c7196Pk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Rc.p0.k("onGmsg /jsLoaded. JsLoaded latency is " + (Nc.v.c().a() - this.f66000a) + " ms.");
        Rc.p0.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f66003d.f70244a) {
            Rc.p0.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.f66001b.a() != -1 && this.f66001b.a() != 1) {
                this.f66003d.f70252i = 0;
                InterfaceC8580jk interfaceC8580jk = this.f66002c;
                interfaceC8580jk.G0("/log", C7160Oi.f69978g);
                interfaceC8580jk.G0("/result", C7160Oi.f69986o);
                this.f66001b.e(this.f66002c);
                this.f66003d.f70251h = this.f66001b;
                Rc.p0.k("Successfully loaded JS Engine.");
                Rc.p0.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            Rc.p0.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
