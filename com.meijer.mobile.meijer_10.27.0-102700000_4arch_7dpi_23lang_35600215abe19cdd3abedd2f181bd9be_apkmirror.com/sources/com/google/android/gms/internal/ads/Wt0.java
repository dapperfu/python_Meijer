package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
class Wt0 extends Vt0 {

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f71196c;

    Wt0(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f71196c = bArr;
    }

    protected int F() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Zt0) || k() != ((Zt0) obj).k()) {
            return false;
        }
        if (k() == 0) {
            return true;
        }
        if (!(obj instanceof Wt0)) {
            return obj.equals(this);
        }
        Wt0 wt0 = (Wt0) obj;
        int iU = u();
        int iU2 = wt0.u();
        if (iU == 0 || iU2 == 0 || iU == iU2) {
            return E(wt0, 0, k());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    public int k() {
        return this.f71196c.length;
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    public byte e(int i10) {
        return this.f71196c[i10];
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    byte f(int i10) {
        return this.f71196c[i10];
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    protected void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f71196c, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    public final AbstractC7943eu0 q() {
        return AbstractC7943eu0.f(this.f71196c, F(), k(), true);
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    public final ByteBuffer r() {
        return ByteBuffer.wrap(this.f71196c, F(), k()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    final void s(Qt0 qt0) throws IOException {
        qt0.a(this.f71196c, F(), k());
    }

    @Override // com.google.android.gms.internal.ads.Vt0
    final boolean E(Zt0 zt0, int i10, int i11) {
        if (i11 <= zt0.k()) {
            int i12 = i10 + i11;
            if (i12 <= zt0.k()) {
                if (zt0 instanceof Wt0) {
                    Wt0 wt0 = (Wt0) zt0;
                    byte[] bArr = this.f71196c;
                    byte[] bArr2 = wt0.f71196c;
                    int iF = F() + i11;
                    int iF2 = F();
                    int iF3 = wt0.F() + i10;
                    while (iF2 < iF) {
                        if (bArr[iF2] != bArr2[iF3]) {
                            return false;
                        }
                        iF2++;
                        iF3++;
                    }
                    return true;
                }
                return zt0.p(i10, i12).equals(p(0, i11));
            }
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + zt0.k());
        }
        throw new IllegalArgumentException("Length too large: " + i11 + k());
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    protected final int o(int i10, int i11, int i12) {
        return Tu0.b(i10, this.f71196c, F() + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    public final Zt0 p(int i10, int i11) {
        int iT = Zt0.t(i10, i11, k());
        if (iT == 0) {
            return Zt0.f72282b;
        }
        return new Tt0(this.f71196c, F() + i10, iT);
    }
}
