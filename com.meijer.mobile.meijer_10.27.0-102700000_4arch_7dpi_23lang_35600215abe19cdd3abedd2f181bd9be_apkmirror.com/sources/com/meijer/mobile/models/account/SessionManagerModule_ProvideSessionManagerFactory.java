package com.meijer.mobile.models.account;

import Bu.c;
import Bu.d;
import Xi.b;

/* loaded from: classes9.dex */
public final class SessionManagerModule_ProvideSessionManagerFactory implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d<MPerksAccountManager> f113543a;

    public static SessionManagerModule_ProvideSessionManagerFactory create(d<MPerksAccountManager> dVar) {
        return new SessionManagerModule_ProvideSessionManagerFactory(dVar);
    }

    public static b provideSessionManager(MPerksAccountManager mPerksAccountManager) {
        return (b) c.d(SessionManagerModule.INSTANCE.provideSessionManager(mPerksAccountManager));
    }

    @Override // kv.InterfaceC15323a
    public b get() {
        return provideSessionManager(this.f113543a.get());
    }

    private SessionManagerModule_ProvideSessionManagerFactory(d<MPerksAccountManager> dVar) {
        this.f113543a = dVar;
    }
}
