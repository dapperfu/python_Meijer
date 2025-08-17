package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes4.dex */
class zzsy extends zzsz {
    private volatile zzsz zza;
    final zzsu zzb;
    final Character zzc;

    zzsy(zzsu zzsuVar, Character ch2) {
        this.zzb = zzsuVar;
        boolean z10 = true;
        if (ch2 != null && zzsuVar.zze('=')) {
            z10 = false;
        }
        zzqh.zzg(z10, "Padding character %s was already in alphabet", ch2);
        this.zzc = ch2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsz
    void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzqh.zzh(0, i11, bArr.length);
        while (i12 < i11) {
            zzh(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsz
    final int zzd(int i10) {
        return (int) (((this.zzb.zzb * i10) + 7) / 8);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzsy) {
            zzsy zzsyVar = (zzsy) obj;
            if (this.zzb.equals(zzsyVar.zzb) && Objects.equals(this.zzc, zzsyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzc;
        return Objects.hashCode(ch2) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    zzsz zzb(zzsu zzsuVar, Character ch2) {
        return new zzsy(zzsuVar, ch2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsz
    final int zze(int i10) {
        zzsu zzsuVar = this.zzb;
        return zzsuVar.zzc * zztd.zza(i10, zzsuVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsz
    public final zzsz zzf() {
        zzsz zzszVarZzb = this.zza;
        if (zzszVarZzb == null) {
            zzsu zzsuVar = this.zzb;
            zzsu zzsuVarZzc = zzsuVar.zzc();
            zzszVarZzb = zzsuVarZzc == zzsuVar ? this : zzb(zzsuVarZzc, this.zzc);
            this.zza = zzszVarZzb;
        }
        return zzszVarZzb;
    }

    final void zzh(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzqh.zzh(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzqh.zzd(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = (i11 + 1) * 8;
        zzsu zzsuVar = this.zzb;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - zzsuVar.zzb) - i12);
            zzsu zzsuVar2 = this.zzb;
            appendable.append(zzsuVar2.zza(((int) j11) & zzsuVar2.zza));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsz
    int zza(byte[] bArr, CharSequence charSequence) throws zzsx {
        zzsu zzsuVar;
        CharSequence charSequenceZzg = zzg(charSequence);
        if (this.zzb.zzd(charSequenceZzg.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceZzg.length()) {
                long jZzb = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    zzsuVar = this.zzb;
                    if (i12 >= zzsuVar.zzc) {
                        break;
                    }
                    jZzb <<= zzsuVar.zzb;
                    if (i10 + i12 < charSequenceZzg.length()) {
                        jZzb |= this.zzb.zzb(charSequenceZzg.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = zzsuVar.zzd;
                int i15 = i13 * zzsuVar.zzb;
                int i16 = (i14 - 1) * 8;
                while (i16 >= (i14 * 8) - i15) {
                    bArr[i11] = (byte) ((jZzb >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.zzb.zzc;
            }
            return i11;
        }
        throw new zzsx("Invalid input length " + charSequenceZzg.length());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsz
    final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    zzsy(String str, String str2, Character ch2) {
        this(new zzsu(str, str2.toCharArray()), ch2);
    }
}
