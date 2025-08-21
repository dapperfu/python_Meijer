package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.vision.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C11195s0 extends AbstractC11187p0 {

    /* renamed from: e, reason: collision with root package name */
    protected final byte[] f85486e;

    @Override // com.google.android.gms.internal.vision.AbstractC11161h0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11161h0) || e() != ((AbstractC11161h0) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof C11195s0)) {
            return obj.equals(this);
        }
        C11195s0 c11195s0 = (C11195s0) obj;
        int iU = u();
        int iU2 = c11195s0.u();
        if (iU == 0 || iU2 == 0 || iU == iU2) {
            return v(c11195s0, 0, e());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11161h0
    public final AbstractC11161h0 k(int i10, int i11) {
        int iR = AbstractC11161h0.r(0, i11, e());
        return iR == 0 ? AbstractC11161h0.f85385b : new C11172k0(this.f85486e, x(), iR);
    }

    protected int x() {
        return 0;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11161h0
    public byte a(int i10) {
        return this.f85486e[i10];
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11161h0
    public int e() {
        return this.f85486e.length;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11161h0
    protected final int h(int i10, int i11, int i12) {
        return S0.a(i10, this.f85486e, x(), i12);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11161h0
    protected final String n(Charset charset) {
        return new String(this.f85486e, x(), e(), charset);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11161h0
    final void o(AbstractC11149e0 abstractC11149e0) throws IOException {
        abstractC11149e0.a(this.f85486e, x(), e());
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11161h0
    byte p(int i10) {
        return this.f85486e[i10];
    }

    C11195s0(byte[] bArr) {
        bArr.getClass();
        this.f85486e = bArr;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11187p0
    final boolean v(AbstractC11161h0 abstractC11161h0, int i10, int i11) {
        if (i11 <= abstractC11161h0.e()) {
            if (i11 <= abstractC11161h0.e()) {
                if (abstractC11161h0 instanceof C11195s0) {
                    C11195s0 c11195s0 = (C11195s0) abstractC11161h0;
                    byte[] bArr = this.f85486e;
                    byte[] bArr2 = c11195s0.f85486e;
                    int iX = x() + i11;
                    int iX2 = x();
                    int iX3 = c11195s0.x();
                    while (iX2 < iX) {
                        if (bArr[iX2] != bArr2[iX3]) {
                            return false;
                        }
                        iX2++;
                        iX3++;
                    }
                    return true;
                }
                return abstractC11161h0.k(0, i11).equals(k(0, i11));
            }
            int iE = abstractC11161h0.e();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(iE);
            throw new IllegalArgumentException(sb2.toString());
        }
        int iE2 = e();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i11);
        sb3.append(iE2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11161h0
    public final boolean zzc() {
        int iX = x();
        return o2.g(this.f85486e, iX, e() + iX);
    }
}
