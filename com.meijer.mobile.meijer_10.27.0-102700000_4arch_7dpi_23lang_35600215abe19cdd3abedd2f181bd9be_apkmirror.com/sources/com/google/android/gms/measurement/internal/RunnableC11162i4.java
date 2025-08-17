package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11162i4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ E3 f85626a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f85627b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f85628c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85629d;

    RunnableC11162i4(C11268x4 c11268x4, E3 e32, long j10, boolean z10) {
        this.f85626a = e32;
        this.f85627b = j10;
        this.f85628c = z10;
        Objects.requireNonNull(c11268x4);
        this.f85629d = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11268x4 c11268x4 = this.f85629d;
        E3 e32 = this.f85626a;
        c11268x4.m(e32);
        c11268x4.V(e32, this.f85627b, true, this.f85628c);
    }
}
