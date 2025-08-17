package com.google.ads.interactivemedia.v3.internal;

import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes4.dex */
public final class zzgj {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public final void zza(byte[] bArr) {
        int i10 = this.zzb;
        int i11 = this.zzc;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.zza;
            i10 = (i10 + 1) & l3.f92484c;
            byte b10 = bArr2[i10];
            i11 = (i11 + b10) & l3.f92484c;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b10;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b10) & l3.f92484c] ^ bArr[i12]);
        }
        this.zzb = i10;
        this.zzc = i11;
    }

    public zzgj(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.zza;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & l3.f92484c;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this.zzb = 0;
        this.zzc = 0;
    }
}
