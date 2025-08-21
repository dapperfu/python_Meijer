package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8026eZ {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.q f74741a;

    /* renamed from: b, reason: collision with root package name */
    private final long f74742b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f74743c;

    public final boolean a() {
        return this.f74742b < this.f74743c.c();
    }

    public C8026eZ(com.google.common.util.concurrent.q qVar, long j10, com.google.android.gms.common.util.f fVar) {
        this.f74741a = qVar;
        this.f74743c = fVar;
        this.f74742b = fVar.c() + j10;
    }
}
