package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class I4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f85897a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M4 f85898b;

    I4(M4 m42, long j10) {
        this.f85897a = j10;
        Objects.requireNonNull(m42);
        this.f85898b = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M4 m42 = this.f85898b;
        m42.f85708a.K().i(this.f85897a);
        m42.f85954e = null;
    }
}
