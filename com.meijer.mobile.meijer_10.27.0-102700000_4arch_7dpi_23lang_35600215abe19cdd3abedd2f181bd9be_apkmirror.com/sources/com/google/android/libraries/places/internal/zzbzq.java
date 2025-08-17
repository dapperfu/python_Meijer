package com.google.android.libraries.places.internal;

import io.constructor.BuildConfig;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class zzbzq {
    String zza;
    String zzb;
    int zzc = -1;

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        if ((r12 - r10) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        r3[r7] = (byte) r14;
        r11 = r17;
        r7 = r7 + 1;
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d7, code lost:
    
        if (r8 == 16) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d9, code lost:
    
        if (r9 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00db, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
    
        r0 = r8 - r9;
        java.lang.System.arraycopy(r3, r9, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r9, (16 - r8) + r9, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f2, code lost:
    
        throw new java.lang.AssertionError();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress zzf(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbzq.zzf(java.lang.String, int, int):java.net.InetAddress");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zza);
        sb2.append("://");
        if (this.zzb.indexOf(58) != -1) {
            sb2.append('[');
            sb2.append(this.zzb);
            sb2.append(']');
        } else {
            sb2.append(this.zzb);
        }
        int iZzd = zzd();
        if (iZzd != zzbzr.zzc(this.zza)) {
            sb2.append(':');
            sb2.append(iZzd);
        }
        return sb2.toString();
    }

    public final zzbzq zza(String str) {
        this.zza = BuildConfig.SERVICE_SCHEME;
        return this;
    }

    public final zzbzq zzb(String str) {
        int i10;
        String strSubstring;
        if (str == null) {
            throw new IllegalArgumentException("host == null");
        }
        int i11 = 0;
        int iCharCount = 0;
        while (true) {
            int length = str.length();
            i10 = -1;
            if (iCharCount >= length) {
                strSubstring = str.substring(0, length);
                break;
            }
            if (str.charAt(iCharCount) != '%') {
                iCharCount++;
            } else {
                zzcbj zzcbjVar = new zzcbj();
                zzcbjVar.zzw(str, 0, iCharCount);
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt != 37) {
                        zzcbjVar.zzx(iCodePointAt);
                    } else {
                        int i12 = iCharCount + 2;
                        if (i12 < length) {
                            int iZzd = zzbzr.zzd(str.charAt(iCharCount + 1));
                            int iZzd2 = zzbzr.zzd(str.charAt(i12));
                            if (iZzd != -1 && iZzd2 != -1) {
                                zzcbjVar.zzA((iZzd << 4) + iZzd2);
                                iCharCount = i12;
                                iCodePointAt = 37;
                            }
                        }
                        iCodePointAt = 37;
                        zzcbjVar.zzx(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = zzcbjVar.zzo();
            }
        }
        String strZzo = null;
        if (strSubstring.startsWith("[") && strSubstring.endsWith("]")) {
            InetAddress inetAddressZzf = zzf(strSubstring, 1, strSubstring.length() - 1);
            if (inetAddressZzf != null) {
                byte[] address = inetAddressZzf.getAddress();
                if (address.length != 16) {
                    throw new AssertionError();
                }
                int i13 = 0;
                int i14 = 0;
                while (i13 < address.length) {
                    int i15 = i13;
                    while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                        i15 += 2;
                    }
                    int i16 = i15 - i13;
                    int i17 = i16 > i14 ? i16 : i14;
                    if (i16 > i14) {
                        i10 = i13;
                    }
                    i13 = i15 + 2;
                    i14 = i17;
                }
                zzcbj zzcbjVar2 = new zzcbj();
                while (i11 < address.length) {
                    if (i11 == i10) {
                        zzcbjVar2.zzA(58);
                        i11 += i14;
                        if (i11 == 16) {
                            zzcbjVar2.zzA(58);
                        }
                    } else {
                        if (i11 > 0) {
                            zzcbjVar2.zzA(58);
                        }
                        zzcbjVar2.zzD(((address[i11] & 255) << 8) | (address[i11 + 1] & 255));
                        i11 += 2;
                    }
                }
                strZzo = zzcbjVar2.zzo();
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i11 >= lowerCase.length()) {
                            strZzo = lowerCase;
                            break;
                        }
                        char cCharAt = lowerCase.charAt(i11);
                        if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                            break;
                        }
                        i11++;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (strZzo == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.zzb = strZzo;
        return this;
    }

    public final zzbzq zzc(int i10) {
        if (i10 > 0 && i10 <= 65535) {
            this.zzc = i10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 17);
        sb2.append("unexpected port: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    final int zzd() {
        int i10 = this.zzc;
        return i10 != -1 ? i10 : zzbzr.zzc(this.zza);
    }

    public final zzbzr zze() {
        if (this.zza == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.zzb != null) {
            return new zzbzr(this, null);
        }
        throw new IllegalStateException("host == null");
    }
}
