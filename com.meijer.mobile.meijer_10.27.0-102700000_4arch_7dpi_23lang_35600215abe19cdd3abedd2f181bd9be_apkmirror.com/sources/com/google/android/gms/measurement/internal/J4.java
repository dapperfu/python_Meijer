package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class J4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f85074a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f85075b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M4 f85076c;

    J4(M4 m42, E4 e42, long j10) {
        this.f85074a = e42;
        this.f85075b = j10;
        Objects.requireNonNull(m42);
        this.f85076c = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M4 m42 = this.f85076c;
        m42.A(this.f85074a, false, this.f85075b);
        m42.f85114e = null;
        m42.f84868a.H().s(null);
    }
}
