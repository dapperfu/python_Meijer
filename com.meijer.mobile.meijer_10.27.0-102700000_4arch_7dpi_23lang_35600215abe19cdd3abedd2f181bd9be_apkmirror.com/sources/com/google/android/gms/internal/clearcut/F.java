package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    private final zzbn f81109a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f81110b;

    private F(int i10) {
        byte[] bArr = new byte[i10];
        this.f81110b = bArr;
        this.f81109a = zzbn.S(bArr);
    }

    public final A a() {
        if (this.f81109a.u() == 0) {
            return new H(this.f81110b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final zzbn b() {
        return this.f81109a;
    }

    /* synthetic */ F(int i10, B b10) {
        this(i10);
    }
}
