package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.sq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9554sq {

    /* renamed from: a, reason: collision with root package name */
    private long f79143a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f79144b = -1;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9661tq f79145c;

    public C9554sq(C9661tq c9661tq) {
        this.f79145c = c9661tq;
    }

    public final long a() {
        return this.f79144b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f79143a);
        bundle.putLong("tclose", this.f79144b);
        return bundle;
    }

    public final void c() {
        this.f79144b = this.f79145c.f79475a.c();
    }

    public final void d() {
        this.f79143a = this.f79145c.f79475a.c();
    }
}
