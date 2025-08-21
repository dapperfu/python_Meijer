package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class S3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86051a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86052b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f86053c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f86054d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86055e;

    S3(C11393x4 c11393x4, String str, String str2, Object obj, long j10) {
        this.f86051a = str;
        this.f86052b = str2;
        this.f86053c = obj;
        this.f86054d = j10;
        Objects.requireNonNull(c11393x4);
        this.f86055e = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86055e.z(this.f86051a, this.f86052b, this.f86053c, this.f86054d);
    }
}
