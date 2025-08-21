package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
class H extends G {

    /* renamed from: d, reason: collision with root package name */
    protected final byte[] f81974d;

    H(byte[] bArr) {
        this.f81974d = bArr;
    }

    @Override // com.google.android.gms.internal.clearcut.A
    protected final int a(int i10, int i11, int i12) {
        return C10424h0.c(i10, this.f81974d, t(), i12);
    }

    @Override // com.google.android.gms.internal.clearcut.A
    public final A e(int i10, int i11) {
        int iM = A.m(0, i11, size());
        return iM == 0 ? A.f81937b : new D(this.f81974d, t(), iM);
    }

    @Override // com.google.android.gms.internal.clearcut.A
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A) || size() != ((A) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof H)) {
            return obj.equals(this);
        }
        H h10 = (H) obj;
        int iL = l();
        int iL2 = h10.l();
        if (iL == 0 || iL2 == 0 || iL == iL2) {
            return s(h10, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.A
    protected final String f(Charset charset) {
        return new String(this.f81974d, t(), size(), charset);
    }

    @Override // com.google.android.gms.internal.clearcut.A
    final void h(AbstractC10476z abstractC10476z) throws IOException {
        abstractC10476z.a(this.f81974d, t(), size());
    }

    @Override // com.google.android.gms.internal.clearcut.A
    public final boolean k() {
        int iT = t();
        return A1.i(this.f81974d, iT, size() + iT);
    }

    @Override // com.google.android.gms.internal.clearcut.A
    public byte p(int i10) {
        return this.f81974d[i10];
    }

    @Override // com.google.android.gms.internal.clearcut.G
    final boolean s(A a10, int i10, int i11) {
        if (i11 > a10.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 > a10.size()) {
            int size2 = a10.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (!(a10 instanceof H)) {
            return a10.e(0, i11).equals(e(0, i11));
        }
        H h10 = (H) a10;
        byte[] bArr = this.f81974d;
        byte[] bArr2 = h10.f81974d;
        int iT = t() + i11;
        int iT2 = t();
        int iT3 = h10.t();
        while (iT2 < iT) {
            if (bArr[iT2] != bArr2[iT3]) {
                return false;
            }
            iT2++;
            iT3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.A
    public int size() {
        return this.f81974d.length;
    }

    protected int t() {
        return 0;
    }
}
