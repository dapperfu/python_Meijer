package com.google.android.gms.internal.atv_ads_framework;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.n0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C10240n0 extends AbstractC10237m0 {

    /* renamed from: e, reason: collision with root package name */
    protected final byte[] f81025e;

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10249q0) || f() != ((AbstractC10249q0) obj).f()) {
            return false;
        }
        if (f() == 0) {
            return true;
        }
        if (!(obj instanceof C10240n0)) {
            return obj.equals(this);
        }
        C10240n0 c10240n0 = (C10240n0) obj;
        int iP = p();
        int iP2 = c10240n0.p();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        int iF = f();
        if (iF > c10240n0.f()) {
            throw new IllegalArgumentException("Length too large: " + iF + f());
        }
        if (iF > c10240n0.f()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iF + ", " + c10240n0.f());
        }
        byte[] bArr = this.f81025e;
        byte[] bArr2 = c10240n0.f81025e;
        c10240n0.r();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iF) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    public int f() {
        return this.f81025e.length;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    protected final String l(Charset charset) {
        return new String(this.f81025e, 0, f(), charset);
    }

    protected int r() {
        return 0;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    public byte a(int i10) {
        return this.f81025e[i10];
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    byte e(int i10) {
        return this.f81025e[i10];
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    protected final int h(int i10, int i11, int i12) {
        return S0.b(i10, this.f81025e, 0, i12);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    final void m(C10219g0 c10219g0) throws IOException {
        ((C10263v0) c10219g0).B(this.f81025e, 0, f());
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    public final boolean n() {
        return f2.e(this.f81025e, 0, f());
    }

    C10240n0(byte[] bArr) {
        bArr.getClass();
        this.f81025e = bArr;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10249q0
    public final AbstractC10249q0 k(int i10, int i11) {
        AbstractC10249q0.o(0, i11, f());
        if (i11 == 0) {
            return AbstractC10249q0.f81030b;
        }
        return new C10231k0(this.f81025e, 0, i11);
    }
}
