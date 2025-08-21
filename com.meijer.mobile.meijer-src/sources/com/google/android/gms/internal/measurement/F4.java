package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes6.dex */
class F4 extends E4 {

    /* renamed from: c, reason: collision with root package name */
    protected final byte[] f82604c;

    F4(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f82604c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G4) || f() != ((G4) obj).f()) {
            return false;
        }
        if (f() == 0) {
            return true;
        }
        if (!(obj instanceof F4)) {
            return obj.equals(this);
        }
        F4 f42 = (F4) obj;
        int iN = n();
        int iN2 = f42.n();
        if (iN != 0 && iN2 != 0 && iN != iN2) {
            return false;
        }
        int iF = f();
        if (iF > f42.f()) {
            int iF2 = f();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iF).length() + 18 + String.valueOf(iF2).length());
            sb2.append("Length too large: ");
            sb2.append(iF);
            sb2.append(iF2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iF > f42.f()) {
            int iF3 = f42.f();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iF).length() + 27 + String.valueOf(iF3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iF);
            sb3.append(", ");
            sb3.append(iF3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f82604c;
        byte[] bArr2 = f42.f82604c;
        f42.p();
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

    @Override // com.google.android.gms.internal.measurement.G4
    public int f() {
        return this.f82604c.length;
    }

    protected int p() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public byte a(int i10) {
        return this.f82604c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.G4
    byte e(int i10) {
        return this.f82604c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.G4
    protected final int l(int i10, int i11, int i12) {
        return C10611o5.c(i10, this.f82604c, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final G4 h(int i10, int i11) {
        int iO = G4.o(0, i11, f());
        if (iO == 0) {
            return G4.f82610b;
        }
        return new B4(this.f82604c, 0, iO);
    }

    @Override // com.google.android.gms.internal.measurement.G4
    final void k(C10690x4 c10690x4) throws IOException {
        ((J4) c10690x4).H(this.f82604c, 0, f());
    }
}
