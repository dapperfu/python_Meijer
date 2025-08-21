package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Mp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7099Mp {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f69581a;

    /* renamed from: b, reason: collision with root package name */
    private final C7032Kp f69582b;

    C7099Mp(com.google.android.gms.common.util.f fVar, C7032Kp c7032Kp) {
        this.f69581a = fVar;
        this.f69582b = c7032Kp;
    }

    public final void b(int i10, long j10) {
        this.f69582b.a(i10, j10);
    }

    public final void c(Oc.L1 l12) {
        this.f69582b.a(-1, this.f69581a.a());
    }

    public final void d() {
        this.f69582b.a(-1, this.f69581a.a());
    }

    public static C7099Mp a(Context context) {
        return AbstractC7469Xp.d(context).b();
    }
}
