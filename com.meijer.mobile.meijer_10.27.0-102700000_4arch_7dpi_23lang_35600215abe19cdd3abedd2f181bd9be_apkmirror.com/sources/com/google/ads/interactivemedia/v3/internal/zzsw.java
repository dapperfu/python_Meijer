package com.google.ads.interactivemedia.v3.internal;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;

/* loaded from: classes4.dex */
final class zzsw extends zzsy {
    private zzsw(zzsu zzsuVar, Character ch2) {
        super(zzsuVar, ch2);
        zzqh.zzd(zzsuVar.zzf.length == 64);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, com.google.ads.interactivemedia.v3.internal.zzsz
    final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzqh.zzh(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = ((bArr[i12 + 1] & 255) << 8) | (i14 << 16) | (bArr[i12 + 2] & 255);
            appendable.append(this.zzb.zza(i15 >>> 18));
            appendable.append(this.zzb.zza((i15 >>> 12) & 63));
            appendable.append(this.zzb.zza((i15 >>> 6) & 63));
            appendable.append(this.zzb.zza(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zzh(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    final zzsz zzb(zzsu zzsuVar, Character ch2) {
        return new zzsw(zzsuVar, ch2);
    }

    zzsw(String str, String str2, Character ch2) {
        this(new zzsu(str, str2.toCharArray()), ch2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, com.google.ads.interactivemedia.v3.internal.zzsz
    final int zza(byte[] bArr, CharSequence charSequence) throws zzsx {
        CharSequence charSequenceZzg = zzg(charSequence);
        if (this.zzb.zzd(charSequenceZzg.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceZzg.length()) {
                int i12 = i11 + 1;
                int iZzb = (this.zzb.zzb(charSequenceZzg.charAt(i10)) << 18) | (this.zzb.zzb(charSequenceZzg.charAt(i10 + 1)) << 12);
                bArr[i11] = (byte) (iZzb >>> 16);
                int i13 = i10 + 2;
                if (i13 < charSequenceZzg.length()) {
                    int i14 = i10 + 3;
                    int iZzb2 = iZzb | (this.zzb.zzb(charSequenceZzg.charAt(i13)) << 6);
                    int i15 = i11 + 2;
                    bArr[i12] = (byte) ((iZzb2 >>> 8) & l3.f92484c);
                    if (i14 < charSequenceZzg.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((iZzb2 | this.zzb.zzb(charSequenceZzg.charAt(i14))) & l3.f92484c);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i10 = i13;
                    i11 = i12;
                }
            }
            return i11;
        }
        throw new zzsx("Invalid input length " + charSequenceZzg.length());
    }
}
