package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class I4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f85057a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M4 f85058b;

    I4(M4 m42, long j10) {
        this.f85057a = j10;
        Objects.requireNonNull(m42);
        this.f85058b = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M4 m42 = this.f85058b;
        m42.f84868a.K().i(this.f85057a);
        m42.f85114e = null;
    }
}
