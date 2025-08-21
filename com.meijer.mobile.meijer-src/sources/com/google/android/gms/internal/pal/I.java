package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f83487a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f83488b;

    /* renamed from: c, reason: collision with root package name */
    private int f83489c;

    public final void a(byte[] bArr) {
        int i10 = this.f83488b;
        int i11 = this.f83489c;
        for (int i12 = 0; i12 < 256; i12++) {
            i10 = (i10 + 1) & com.medallia.digital.mobilesdk.l3.f93323c;
            byte[] bArr2 = this.f83487a;
            byte b10 = bArr2[i10];
            i11 = (i11 + b10) & com.medallia.digital.mobilesdk.l3.f93323c;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b10;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b10) & com.medallia.digital.mobilesdk.l3.f93323c] ^ bArr[i12]);
        }
        this.f83488b = i10;
        this.f83489c = i11;
    }

    public I(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.f83487a[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f83487a;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & com.medallia.digital.mobilesdk.l3.f93323c;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this.f83488b = 0;
        this.f83489c = 0;
    }
}
