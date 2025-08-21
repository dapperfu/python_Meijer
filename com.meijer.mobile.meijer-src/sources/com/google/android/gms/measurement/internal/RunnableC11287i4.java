package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11287i4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E3 f86466a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f86467b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f86468c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86469d;

    RunnableC11287i4(C11393x4 c11393x4, E3 e32, long j10, boolean z10) {
        this.f86466a = e32;
        this.f86467b = j10;
        this.f86468c = z10;
        Objects.requireNonNull(c11393x4);
        this.f86469d = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11393x4 c11393x4 = this.f86469d;
        E3 e32 = this.f86466a;
        c11393x4.m(e32);
        c11393x4.V(e32, this.f86467b, true, this.f86468c);
    }
}
