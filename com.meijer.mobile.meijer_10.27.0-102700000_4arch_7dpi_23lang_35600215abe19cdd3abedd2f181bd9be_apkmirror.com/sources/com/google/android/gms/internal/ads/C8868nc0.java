package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.nc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8868nc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f77104a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f77105b;

    public C8868nc0(Context context, Looper looper) {
        this.f77104a = context;
        this.f77105b = looper;
    }

    public final void a(String str) {
        C6583Bc0 c6583Bc0B0 = C6685Ec0.b0();
        c6583Bc0B0.u(this.f77104a.getPackageName());
        c6583Bc0B0.w(2);
        C10044yc0 c10044yc0B0 = C6549Ac0.b0();
        c10044yc0B0.u(str);
        c10044yc0B0.v(2);
        c6583Bc0B0.v(c10044yc0B0);
        new C8975oc0(this.f77104a, this.f77105b, (C6685Ec0) c6583Bc0B0.p()).a();
    }
}
