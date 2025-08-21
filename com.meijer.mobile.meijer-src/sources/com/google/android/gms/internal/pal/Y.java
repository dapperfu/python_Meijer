package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
class Y extends X {

    /* renamed from: e, reason: collision with root package name */
    protected final byte[] f83807e;

    protected int B() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10730b0) || f() != ((AbstractC10730b0) obj).f()) {
            return false;
        }
        if (f() == 0) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return obj.equals(this);
        }
        Y y10 = (Y) obj;
        int iR = r();
        int iR2 = y10.r();
        if (iR != 0 && iR2 != 0 && iR != iR2) {
            return false;
        }
        int iF = f();
        if (iF > y10.f()) {
            throw new IllegalArgumentException("Length too large: " + iF + f());
        }
        if (iF > y10.f()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iF + ", " + y10.f());
        }
        byte[] bArr = this.f83807e;
        byte[] bArr2 = y10.f83807e;
        y10.B();
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

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    public int f() {
        return this.f83807e.length;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    protected final String n(Charset charset) {
        return new String(this.f83807e, 0, f(), charset);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    public byte a(int i10) {
        return this.f83807e[i10];
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    byte e(int i10) {
        return this.f83807e[i10];
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    protected void h(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f83807e, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    protected final int k(int i10, int i11, int i12) {
        return J0.d(i10, this.f83807e, 0, i12);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    public final AbstractC10814g0 m() {
        return AbstractC10814g0.n(this.f83807e, 0, f(), true);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    final void o(Q q10) throws IOException {
        ((C10846i0) q10).E(this.f83807e, 0, f());
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    public final boolean p() {
        return Y1.f(this.f83807e, 0, f());
    }

    Y(byte[] bArr) {
        bArr.getClass();
        this.f83807e = bArr;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10730b0
    public final AbstractC10730b0 l(int i10, int i11) {
        int iQ = AbstractC10730b0.q(0, i11, f());
        if (iQ == 0) {
            return AbstractC10730b0.f83895b;
        }
        return new V(this.f83807e, 0, iQ);
    }
}
