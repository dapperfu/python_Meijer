package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7901eZ {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.q f73901a;

    /* renamed from: b, reason: collision with root package name */
    private final long f73902b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f73903c;

    public final boolean a() {
        return this.f73902b < this.f73903c.c();
    }

    public C7901eZ(com.google.common.util.concurrent.q qVar, long j10, com.google.android.gms.common.util.f fVar) {
        this.f73901a = qVar;
        this.f73903c = fVar;
        this.f73902b = fVar.c() + j10;
    }
}
