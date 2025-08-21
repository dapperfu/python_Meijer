package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzsv extends zzsy {
    final char[] zza;

    private zzsv(zzsu zzsuVar) {
        super(zzsuVar, null);
        this.zza = new char[512];
        zzqh.zzd(zzsuVar.zzf.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzsuVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzsuVar.zza(i10 & 15);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, com.google.ads.interactivemedia.v3.internal.zzsz
    final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzqh.zzh(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.zza[i13]);
            appendable.append(this.zza[i13 | 256]);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    final zzsz zzb(zzsu zzsuVar, Character ch2) {
        return new zzsv(zzsuVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, com.google.ads.interactivemedia.v3.internal.zzsz
    final int zza(byte[] bArr, CharSequence charSequence) throws zzsx {
        if (charSequence.length() % 2 != 1) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.zzb.zzb(charSequence.charAt(i10)) << 4) | this.zzb.zzb(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }
        throw new zzsx("Invalid input length " + charSequence.length());
    }

    zzsv(String str, String str2) {
        this(new zzsu("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
