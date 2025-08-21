package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class G4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f85876a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f85877b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f85878c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f85879d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f85880e;

    G4(M4 m42, E4 e42, E4 e43, long j10, boolean z10) {
        this.f85876a = e42;
        this.f85877b = e43;
        this.f85878c = j10;
        this.f85879d = z10;
        Objects.requireNonNull(m42);
        this.f85880e = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85880e.z(this.f85876a, this.f85877b, this.f85878c, this.f85879d, null);
    }
}
