package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9937wN {

    /* renamed from: a, reason: collision with root package name */
    private final CN f80316a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f80317b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f80318c;

    public final C9830vN a() {
        C9830vN c9830vN = new C9830vN(this);
        C9830vN.a(c9830vN);
        return c9830vN;
    }

    public final void e() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77423xb)).booleanValue()) {
            C9830vN c9830vNA = a();
            c9830vNA.b("action", "pecr");
            c9830vNA.g();
        }
    }

    public C9937wN(CN cn2, Executor executor) {
        this.f80316a = cn2;
        this.f80318c = cn2.i();
        this.f80317b = executor;
    }
}
