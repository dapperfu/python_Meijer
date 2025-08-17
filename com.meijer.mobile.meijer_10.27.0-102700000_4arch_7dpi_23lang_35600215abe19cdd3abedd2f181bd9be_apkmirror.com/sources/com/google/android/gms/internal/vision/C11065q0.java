package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11065q0 {

    /* renamed from: a, reason: collision with root package name */
    private final zzii f84635a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f84636b;

    private C11065q0(int i10) {
        byte[] bArr = new byte[i10];
        this.f84636b = bArr;
        this.f84635a = zzii.f(bArr);
    }

    public final AbstractC11036h0 a() {
        this.f84635a.N();
        return new C11070s0(this.f84636b);
    }

    public final zzii b() {
        return this.f84635a;
    }

    /* synthetic */ C11065q0(int i10, C11032g0 c11032g0) {
        this(i10);
    }
}
