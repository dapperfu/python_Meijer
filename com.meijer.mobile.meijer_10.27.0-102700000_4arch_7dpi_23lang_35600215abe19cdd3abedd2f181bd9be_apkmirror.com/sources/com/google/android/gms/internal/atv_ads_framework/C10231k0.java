package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10231k0 extends C10240n0 {

    /* renamed from: f, reason: collision with root package name */
    private final int f81021f;

    @Override // com.google.android.gms.internal.atv_ads_framework.C10240n0, com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    public final int f() {
        return this.f81021f;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C10240n0
    protected final int r() {
        return 0;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C10240n0, com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    public final byte a(int i10) {
        int i11 = this.f81021f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f81025e[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C10240n0, com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    final byte e(int i10) {
        return this.f81025e[i10];
    }

    C10231k0(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC10249q0.o(0, i11, bArr.length);
        this.f81021f = i11;
    }
}
