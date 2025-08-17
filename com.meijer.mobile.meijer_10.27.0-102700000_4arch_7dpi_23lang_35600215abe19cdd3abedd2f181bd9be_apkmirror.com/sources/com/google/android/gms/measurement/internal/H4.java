package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class H4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ M4 f85047a;

    @Override // java.lang.Runnable
    public final void run() {
        M4 m42 = this.f85047a;
        m42.f85114e = m42.B();
    }

    H4(M4 m42) {
        Objects.requireNonNull(m42);
        this.f85047a = m42;
    }
}
