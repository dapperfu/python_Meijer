package Rf;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import kv.InterfaceC15323a;
import pc.InterfaceC16286j;

/* loaded from: classes7.dex */
public final class f implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<com.google.firebase.f> f32217a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<If.b<com.google.firebase.remoteconfig.c>> f32218b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<Jf.e> f32219c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<If.b<InterfaceC16286j>> f32220d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15323a<RemoteConfigManager> f32221e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC15323a<com.google.firebase.perf.config.a> f32222f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC15323a<SessionManager> f32223g;

    public static f a(InterfaceC15323a<com.google.firebase.f> interfaceC15323a, InterfaceC15323a<If.b<com.google.firebase.remoteconfig.c>> interfaceC15323a2, InterfaceC15323a<Jf.e> interfaceC15323a3, InterfaceC15323a<If.b<InterfaceC16286j>> interfaceC15323a4, InterfaceC15323a<RemoteConfigManager> interfaceC15323a5, InterfaceC15323a<com.google.firebase.perf.config.a> interfaceC15323a6, InterfaceC15323a<SessionManager> interfaceC15323a7) {
        return new f(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4, interfaceC15323a5, interfaceC15323a6, interfaceC15323a7);
    }

    public static d c(com.google.firebase.f fVar, If.b<com.google.firebase.remoteconfig.c> bVar, Jf.e eVar, If.b<InterfaceC16286j> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        return new d(fVar, bVar, eVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f32217a.get(), this.f32218b.get(), this.f32219c.get(), this.f32220d.get(), this.f32221e.get(), this.f32222f.get(), this.f32223g.get());
    }

    public f(InterfaceC15323a<com.google.firebase.f> interfaceC15323a, InterfaceC15323a<If.b<com.google.firebase.remoteconfig.c>> interfaceC15323a2, InterfaceC15323a<Jf.e> interfaceC15323a3, InterfaceC15323a<If.b<InterfaceC16286j>> interfaceC15323a4, InterfaceC15323a<RemoteConfigManager> interfaceC15323a5, InterfaceC15323a<com.google.firebase.perf.config.a> interfaceC15323a6, InterfaceC15323a<SessionManager> interfaceC15323a7) {
        this.f32217a = interfaceC15323a;
        this.f32218b = interfaceC15323a2;
        this.f32219c = interfaceC15323a3;
        this.f32220d = interfaceC15323a4;
        this.f32221e = interfaceC15323a5;
        this.f32222f = interfaceC15323a6;
        this.f32223g = interfaceC15323a7;
    }
}
