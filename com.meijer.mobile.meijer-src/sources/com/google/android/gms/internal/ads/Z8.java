package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Z8 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f72913a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f72914b;

    /* renamed from: c, reason: collision with root package name */
    private int f72915c;

    public final void a(byte[] bArr) {
        int i10 = this.f72914b;
        int i11 = this.f72915c;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f72913a;
            i10 = (i10 + 1) & com.medallia.digital.mobilesdk.l3.f93323c;
            byte b10 = bArr2[i10];
            i11 = (i11 + b10) & com.medallia.digital.mobilesdk.l3.f93323c;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b10;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b10) & com.medallia.digital.mobilesdk.l3.f93323c] ^ bArr[i12]);
        }
        this.f72914b = i10;
        this.f72915c = i11;
    }

    public Z8(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.f72913a[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f72913a;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & com.medallia.digital.mobilesdk.l3.f93323c;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this.f72914b = 0;
        this.f72915c = 0;
    }
}
