package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class S3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85211a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85212b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f85213c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f85214d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85215e;

    S3(C11268x4 c11268x4, String str, String str2, Object obj, long j10) {
        this.f85211a = str;
        this.f85212b = str2;
        this.f85213c = obj;
        this.f85214d = j10;
        Objects.requireNonNull(c11268x4);
        this.f85215e = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85215e.z(this.f85211a, this.f85212b, this.f85213c, this.f85214d);
    }
}
