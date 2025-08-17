package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.vision.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C11070s0 extends AbstractC11062p0 {

    /* renamed from: e, reason: collision with root package name */
    protected final byte[] f84646e;

    @Override // com.google.android.gms.internal.vision.AbstractC11036h0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11036h0) || e() != ((AbstractC11036h0) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof C11070s0)) {
            return obj.equals(this);
        }
        C11070s0 c11070s0 = (C11070s0) obj;
        int iU = u();
        int iU2 = c11070s0.u();
        if (iU == 0 || iU2 == 0 || iU == iU2) {
            return v(c11070s0, 0, e());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11036h0
    public final AbstractC11036h0 k(int i10, int i11) {
        int iR = AbstractC11036h0.r(0, i11, e());
        return iR == 0 ? AbstractC11036h0.f84545b : new C11047k0(this.f84646e, x(), iR);
    }

    protected int x() {
        return 0;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11036h0
    public byte a(int i10) {
        return this.f84646e[i10];
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11036h0
    public int e() {
        return this.f84646e.length;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11036h0
    protected final int h(int i10, int i11, int i12) {
        return S0.a(i10, this.f84646e, x(), i12);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11036h0
    protected final String n(Charset charset) {
        return new String(this.f84646e, x(), e(), charset);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11036h0
    final void o(AbstractC11024e0 abstractC11024e0) throws IOException {
        abstractC11024e0.a(this.f84646e, x(), e());
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11036h0
    byte p(int i10) {
        return this.f84646e[i10];
    }

    C11070s0(byte[] bArr) {
        bArr.getClass();
        this.f84646e = bArr;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11062p0
    final boolean v(AbstractC11036h0 abstractC11036h0, int i10, int i11) {
        if (i11 <= abstractC11036h0.e()) {
            if (i11 <= abstractC11036h0.e()) {
                if (abstractC11036h0 instanceof C11070s0) {
                    C11070s0 c11070s0 = (C11070s0) abstractC11036h0;
                    byte[] bArr = this.f84646e;
                    byte[] bArr2 = c11070s0.f84646e;
                    int iX = x() + i11;
                    int iX2 = x();
                    int iX3 = c11070s0.x();
                    while (iX2 < iX) {
                        if (bArr[iX2] != bArr2[iX3]) {
                            return false;
                        }
                        iX2++;
                        iX3++;
                    }
                    return true;
                }
                return abstractC11036h0.k(0, i11).equals(k(0, i11));
            }
            int iE = abstractC11036h0.e();
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

    @Override // com.google.android.gms.internal.vision.AbstractC11036h0
    public final boolean zzc() {
        int iX = x();
        return o2.g(this.f84646e, iX, e() + iX);
    }
}
