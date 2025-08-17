package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9812wN {

    /* renamed from: a, reason: collision with root package name */
    private final CN f79476a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f79477b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f79478c;

    public final C9705vN a() {
        C9705vN c9705vN = new C9705vN(this);
        C9705vN.a(c9705vN);
        return c9705vN;
    }

    public final void e() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76583xb)).booleanValue()) {
            C9705vN c9705vNA = a();
            c9705vNA.b("action", "pecr");
            c9705vNA.g();
        }
    }

    public C9812wN(CN cn2, Executor executor) {
        this.f79476a = cn2;
        this.f79478c = cn2.i();
        this.f79477b = executor;
    }
}
