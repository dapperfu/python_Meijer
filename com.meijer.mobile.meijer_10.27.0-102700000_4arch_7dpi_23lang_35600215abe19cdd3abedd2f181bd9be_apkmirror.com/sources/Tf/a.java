package Tf;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import pc.InterfaceC16286j;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f34961a;

    /* renamed from: b, reason: collision with root package name */
    private final Jf.e f34962b;

    /* renamed from: c, reason: collision with root package name */
    private final If.b<com.google.firebase.remoteconfig.c> f34963c;

    /* renamed from: d, reason: collision with root package name */
    private final If.b<InterfaceC16286j> f34964d;

    com.google.firebase.f b() {
        return this.f34961a;
    }

    Jf.e c() {
        return this.f34962b;
    }

    If.b<com.google.firebase.remoteconfig.c> d() {
        return this.f34963c;
    }

    If.b<InterfaceC16286j> g() {
        return this.f34964d;
    }

    public a(com.google.firebase.f fVar, Jf.e eVar, If.b<com.google.firebase.remoteconfig.c> bVar, If.b<InterfaceC16286j> bVar2) {
        this.f34961a = fVar;
        this.f34962b = eVar;
        this.f34963c = bVar;
        this.f34964d = bVar2;
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
