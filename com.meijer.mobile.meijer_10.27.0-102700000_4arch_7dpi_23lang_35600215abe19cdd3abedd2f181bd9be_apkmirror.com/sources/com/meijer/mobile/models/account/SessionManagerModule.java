package com.meijer.mobile.models.account;

import Xi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/models/account/SessionManagerModule;", "", "<init>", "()V", "Lcom/meijer/mobile/models/account/MPerksAccountManager;", "mPerksAccountManager", "LXi/b;", "provideSessionManager", "(Lcom/meijer/mobile/models/account/MPerksAccountManager;)LXi/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SessionManagerModule {
    public static final int $stable = 0;
    public static final SessionManagerModule INSTANCE = new SessionManagerModule();

    public final b provideSessionManager(MPerksAccountManager mPerksAccountManager) {
        Intrinsics.j(mPerksAccountManager, "mPerksAccountManager");
        return mPerksAccountManager;
    }

    private SessionManagerModule() {
    }
}
