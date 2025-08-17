package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.su, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9437su {

    /* renamed from: a, reason: collision with root package name */
    private final Qc.a f78313a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f78314b;

    /* renamed from: c, reason: collision with root package name */
    private final long f78315c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference f78316d;

    /* synthetic */ C9437su(C9117pu c9117pu, C9224qu c9224qu) {
        this.f78313a = c9117pu.f77652a;
        this.f78314b = c9117pu.f77653b;
        this.f78316d = c9117pu.f77655d;
        this.f78315c = c9117pu.f77654c;
    }

    final long a() {
        return this.f78315c;
    }

    final Context b() {
        return this.f78314b;
    }

    final C6760Gg d() {
        return new C6760Gg(this.f78314b);
    }

    final WeakReference g() {
        return this.f78316d;
    }

    public final Lc.k c() {
        return new Lc.k(this.f78314b, this.f78313a);
    }

    final Qc.a e() {
        return this.f78313a;
    }

    final String f() {
        return Lc.v.t().H(this.f78314b, this.f78313a.f29929a);
    }
}
