package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Z {

    /* renamed from: d, reason: collision with root package name */
    public static final Z f71952d = new Z(-3, -9223372036854775807L, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f71953a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71954b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71955c;

    private Z(int i10, long j10, long j11) {
        this.f71953a = i10;
        this.f71954b = j10;
        this.f71955c = j11;
    }

    public static Z d(long j10, long j11) {
        return new Z(-1, j10, j11);
    }

    public static Z e(long j10) {
        return new Z(0, -9223372036854775807L, j10);
    }

    public static Z f(long j10, long j11) {
        return new Z(-2, j10, j11);
    }
}
