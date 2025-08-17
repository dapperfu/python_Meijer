package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11093a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85342a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f85343b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f85344c;

    RunnableC11093a(C0 c02, String str, long j10) {
        this.f85342a = str;
        this.f85343b = j10;
        Objects.requireNonNull(c02);
        this.f85344c = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85344c.j(this.f85342a, this.f85343b);
    }
}
