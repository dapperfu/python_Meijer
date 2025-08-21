package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11218a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86182a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f86183b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f86184c;

    RunnableC11218a(C0 c02, String str, long j10) {
        this.f86182a = str;
        this.f86183b = j10;
        Objects.requireNonNull(c02);
        this.f86184c = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86184c.j(this.f86182a, this.f86183b);
    }
}
