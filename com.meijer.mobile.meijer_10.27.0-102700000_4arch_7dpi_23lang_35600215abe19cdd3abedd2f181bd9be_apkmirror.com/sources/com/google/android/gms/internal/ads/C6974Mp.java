package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Mp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6974Mp {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f68741a;

    /* renamed from: b, reason: collision with root package name */
    private final C6907Kp f68742b;

    C6974Mp(com.google.android.gms.common.util.f fVar, C6907Kp c6907Kp) {
        this.f68741a = fVar;
        this.f68742b = c6907Kp;
    }

    public final void b(int i10, long j10) {
        this.f68742b.a(i10, j10);
    }

    public final void c(Mc.L1 l12) {
        this.f68742b.a(-1, this.f68741a.a());
    }

    public final void d() {
        this.f68742b.a(-1, this.f68741a.a());
    }

    public static C6974Mp a(Context context) {
        return AbstractC7344Xp.d(context).b();
    }
}
