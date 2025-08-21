package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
final class B4 extends F4 {

    /* renamed from: d, reason: collision with root package name */
    private final int f82501d;

    @Override // com.google.android.gms.internal.measurement.F4, com.google.android.gms.internal.measurement.G4
    public final int f() {
        return this.f82501d;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    protected final int p() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.F4, com.google.android.gms.internal.measurement.G4
    public final byte a(int i10) {
        int i11 = this.f82501d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f82604c[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.F4, com.google.android.gms.internal.measurement.G4
    final byte e(int i10) {
        return this.f82604c[i10];
    }

    B4(byte[] bArr, int i10, int i11) {
        super(bArr);
        G4.o(0, i11, bArr.length);
        this.f82501d = i11;
    }
}
