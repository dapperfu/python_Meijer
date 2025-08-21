package com.meijer.mobile.models.account;

import Yi.b;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes10.dex */
public final class SessionManagerModule_ProvideSessionManagerFactory implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC18226d<MPerksAccountManager> f114396a;

    public static SessionManagerModule_ProvideSessionManagerFactory create(InterfaceC18226d<MPerksAccountManager> interfaceC18226d) {
        return new SessionManagerModule_ProvideSessionManagerFactory(interfaceC18226d);
    }

    public static b provideSessionManager(MPerksAccountManager mPerksAccountManager) {
        return (b) C18225c.d(SessionManagerModule.INSTANCE.provideSessionManager(mPerksAccountManager));
    }

    @Override // gv.InterfaceC14411a
    public b get() {
        return provideSessionManager(this.f114396a.get());
    }

    private SessionManagerModule_ProvideSessionManagerFactory(InterfaceC18226d<MPerksAccountManager> interfaceC18226d) {
        this.f114396a = interfaceC18226d;
    }
}
