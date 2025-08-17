package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.Xc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7326Xc {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f71358a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f71359b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f71360c;

    /* renamed from: d, reason: collision with root package name */
    private final long f71361d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f71362e;

    private C7326Xc(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        this.f71358a = inputStream;
        this.f71359b = z10;
        this.f71360c = z11;
        this.f71361d = j10;
        this.f71362e = z12;
    }

    public static C7326Xc b(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        return new C7326Xc(inputStream, z10, z11, j10, z12);
    }

    public final long a() {
        return this.f71361d;
    }

    public final InputStream c() {
        return this.f71358a;
    }

    public final boolean d() {
        return this.f71359b;
    }

    public final boolean e() {
        return this.f71362e;
    }

    public final boolean f() {
        return this.f71360c;
    }
}
