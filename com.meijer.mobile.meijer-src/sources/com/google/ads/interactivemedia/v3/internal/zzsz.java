package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class zzsz {
    private static final zzsz zza;

    zzsz() {
    }

    public static zzsz zzi() {
        return zza;
    }

    abstract int zza(byte[] bArr, CharSequence charSequence) throws zzsx;

    abstract void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    abstract int zzd(int i10);

    abstract int zze(int i10);

    public abstract zzsz zzf();

    CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzj(byte[] bArr, int i10, int i11) {
        zzqh.zzh(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zze(i11));
        try {
            zzc(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    static {
        new zzsw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new zzsw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzsy("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzsy("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zza = new zzsv("base16()", "0123456789ABCDEF");
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzd = zzd(charSequenceZzg.length());
            byte[] bArr = new byte[iZzd];
            int iZza = zza(bArr, charSequenceZzg);
            if (iZza == iZzd) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzsx e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
