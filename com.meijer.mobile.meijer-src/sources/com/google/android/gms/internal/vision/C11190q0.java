package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11190q0 {

    /* renamed from: a, reason: collision with root package name */
    private final zzii f85475a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f85476b;

    private C11190q0(int i10) {
        byte[] bArr = new byte[i10];
        this.f85476b = bArr;
        this.f85475a = zzii.f(bArr);
    }

    public final AbstractC11161h0 a() {
        this.f85475a.N();
        return new C11195s0(this.f85476b);
    }

    public final zzii b() {
        return this.f85475a;
    }

    /* synthetic */ C11190q0(int i10, C11157g0 c11157g0) {
        this(i10);
    }
}
