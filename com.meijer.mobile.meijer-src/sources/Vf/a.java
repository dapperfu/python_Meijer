package Vf;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import rc.InterfaceC16890j;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f39894a;

    /* renamed from: b, reason: collision with root package name */
    private final Lf.e f39895b;

    /* renamed from: c, reason: collision with root package name */
    private final Kf.b<com.google.firebase.remoteconfig.c> f39896c;

    /* renamed from: d, reason: collision with root package name */
    private final Kf.b<InterfaceC16890j> f39897d;

    com.google.firebase.f b() {
        return this.f39894a;
    }

    Lf.e c() {
        return this.f39895b;
    }

    Kf.b<com.google.firebase.remoteconfig.c> d() {
        return this.f39896c;
    }

    Kf.b<InterfaceC16890j> g() {
        return this.f39897d;
    }

    public a(com.google.firebase.f fVar, Lf.e eVar, Kf.b<com.google.firebase.remoteconfig.c> bVar, Kf.b<InterfaceC16890j> bVar2) {
        this.f39894a = fVar;
        this.f39895b = eVar;
        this.f39896c = bVar;
        this.f39897d = bVar2;
    }

    com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.g();
    }

    RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    SessionManager f() {
        return SessionManager.getInstance();
    }
}
