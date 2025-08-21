package Tf;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import gv.InterfaceC14411a;
import rc.InterfaceC16890j;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class f implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<com.google.firebase.f> f36217a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<Kf.b<com.google.firebase.remoteconfig.c>> f36218b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<Lf.e> f36219c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<Kf.b<InterfaceC16890j>> f36220d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14411a<RemoteConfigManager> f36221e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC14411a<com.google.firebase.perf.config.a> f36222f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC14411a<SessionManager> f36223g;

    public static f a(InterfaceC14411a<com.google.firebase.f> interfaceC14411a, InterfaceC14411a<Kf.b<com.google.firebase.remoteconfig.c>> interfaceC14411a2, InterfaceC14411a<Lf.e> interfaceC14411a3, InterfaceC14411a<Kf.b<InterfaceC16890j>> interfaceC14411a4, InterfaceC14411a<RemoteConfigManager> interfaceC14411a5, InterfaceC14411a<com.google.firebase.perf.config.a> interfaceC14411a6, InterfaceC14411a<SessionManager> interfaceC14411a7) {
        return new f(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4, interfaceC14411a5, interfaceC14411a6, interfaceC14411a7);
    }

    public static d c(com.google.firebase.f fVar, Kf.b<com.google.firebase.remoteconfig.c> bVar, Lf.e eVar, Kf.b<InterfaceC16890j> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        return new d(fVar, bVar, eVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f36217a.get(), this.f36218b.get(), this.f36219c.get(), this.f36220d.get(), this.f36221e.get(), this.f36222f.get(), this.f36223g.get());
    }

    public f(InterfaceC14411a<com.google.firebase.f> interfaceC14411a, InterfaceC14411a<Kf.b<com.google.firebase.remoteconfig.c>> interfaceC14411a2, InterfaceC14411a<Lf.e> interfaceC14411a3, InterfaceC14411a<Kf.b<InterfaceC16890j>> interfaceC14411a4, InterfaceC14411a<RemoteConfigManager> interfaceC14411a5, InterfaceC14411a<com.google.firebase.perf.config.a> interfaceC14411a6, InterfaceC14411a<SessionManager> interfaceC14411a7) {
        this.f36217a = interfaceC14411a;
        this.f36218b = interfaceC14411a2;
        this.f36219c = interfaceC14411a3;
        this.f36220d = interfaceC14411a4;
        this.f36221e = interfaceC14411a5;
        this.f36222f = interfaceC14411a6;
        this.f36223g = interfaceC14411a7;
    }
}
