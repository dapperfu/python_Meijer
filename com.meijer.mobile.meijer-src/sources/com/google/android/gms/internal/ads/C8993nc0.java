package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.nc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8993nc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f77944a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f77945b;

    public C8993nc0(Context context, Looper looper) {
        this.f77944a = context;
        this.f77945b = looper;
    }

    public final void a(String str) {
        C6708Bc0 c6708Bc0B0 = C6810Ec0.b0();
        c6708Bc0B0.u(this.f77944a.getPackageName());
        c6708Bc0B0.w(2);
        C10169yc0 c10169yc0B0 = C6674Ac0.b0();
        c10169yc0B0.u(str);
        c10169yc0B0.v(2);
        c6708Bc0B0.v(c10169yc0B0);
        new C9100oc0(this.f77944a, this.f77945b, (C6810Ec0) c6708Bc0B0.p()).a();
    }
}
