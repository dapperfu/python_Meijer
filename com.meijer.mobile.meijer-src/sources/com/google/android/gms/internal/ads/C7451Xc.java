package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.Xc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7451Xc {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f72198a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f72199b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f72200c;

    /* renamed from: d, reason: collision with root package name */
    private final long f72201d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f72202e;

    private C7451Xc(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        this.f72198a = inputStream;
        this.f72199b = z10;
        this.f72200c = z11;
        this.f72201d = j10;
        this.f72202e = z12;
    }

    public static C7451Xc b(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        return new C7451Xc(inputStream, z10, z11, j10, z12);
    }

    public final long a() {
        return this.f72201d;
    }

    public final InputStream c() {
        return this.f72198a;
    }

    public final boolean d() {
        return this.f72199b;
    }

    public final boolean e() {
        return this.f72202e;
    }

    public final boolean f() {
        return this.f72200c;
    }
}
