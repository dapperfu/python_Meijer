package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class G4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f85036a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f85037b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f85038c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f85039d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f85040e;

    G4(M4 m42, E4 e42, E4 e43, long j10, boolean z10) {
        this.f85036a = e42;
        this.f85037b = e43;
        this.f85038c = j10;
        this.f85039d = z10;
        Objects.requireNonNull(m42);
        this.f85040e = m42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85040e.z(this.f85036a, this.f85037b, this.f85038c, this.f85039d, null);
    }
}
