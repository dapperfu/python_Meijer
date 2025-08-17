package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f82647a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f82648b;

    /* renamed from: c, reason: collision with root package name */
    private int f82649c;

    public final void a(byte[] bArr) {
        int i10 = this.f82648b;
        int i11 = this.f82649c;
        for (int i12 = 0; i12 < 256; i12++) {
            i10 = (i10 + 1) & com.medallia.digital.mobilesdk.l3.f92484c;
            byte[] bArr2 = this.f82647a;
            byte b10 = bArr2[i10];
            i11 = (i11 + b10) & com.medallia.digital.mobilesdk.l3.f92484c;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b10;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b10) & com.medallia.digital.mobilesdk.l3.f92484c] ^ bArr[i12]);
        }
        this.f82648b = i10;
        this.f82649c = i11;
    }

    public I(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.f82647a[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f82647a;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & com.medallia.digital.mobilesdk.l3.f92484c;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this.f82648b = 0;
        this.f82649c = 0;
    }
}
