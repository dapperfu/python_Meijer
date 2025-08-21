package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class J4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f85914a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f85915b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M4 f85916c;

    J4(M4 m42, E4 e42, long j10) {
        this.f85914a = e42;
        this.f85915b = j10;
        Objects.requireNonNull(m42);
        this.f85916c = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M4 m42 = this.f85916c;
        m42.A(this.f85914a, false, this.f85915b);
        m42.f85954e = null;
        m42.f85708a.H().s(null);
    }
}
