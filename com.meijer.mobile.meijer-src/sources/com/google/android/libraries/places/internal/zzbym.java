package com.google.android.libraries.places.internal;

import javax.security.auth.x500.X500Principal;

/* loaded from: classes6.dex */
final class zzbym {
    private final String zza;
    private final int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private char[] zzg;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        r6 = r14.zzd;
        r3 = new java.lang.String(r5, r6, r14.zze - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        r14.zze = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zza(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbym.zza(java.lang.String):java.lang.String");
    }

    private final String zzb() {
        int i10;
        int i11;
        int i12;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        while (true) {
            i10 = this.zzc;
            i11 = this.zzb;
            if (i10 >= i11 || this.zzg[i10] != ' ') {
                break;
            }
            this.zzc = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.zzd = i10;
        this.zzc = i10 + 1;
        while (true) {
            i12 = this.zzc;
            if (i12 >= i11 || (c14 = this.zzg[i12]) == '=' || c14 == ' ') {
                break;
            }
            this.zzc = i12 + 1;
        }
        if (i12 >= i11) {
            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
        }
        this.zze = i12;
        if (this.zzg[i12] == ' ') {
            while (true) {
                i12 = this.zzc;
                if (i12 >= i11 || (c13 = this.zzg[i12]) == '=' || c13 != ' ') {
                    break;
                }
                this.zzc = i12 + 1;
            }
            if (this.zzg[i12] != '=' || i12 == i11) {
                throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
            }
        }
        this.zzc = i12 + 1;
        while (true) {
            int i13 = this.zzc;
            if (i13 >= i11 || this.zzg[i13] != ' ') {
                break;
            }
            this.zzc = i13 + 1;
        }
        int i14 = this.zze;
        int i15 = this.zzd;
        if (i14 - i15 > 4) {
            char[] cArr = this.zzg;
            if (cArr[i15 + 3] == '.' && (((c10 = cArr[i15]) == 'O' || c10 == 'o') && (((c11 = cArr[i15 + 1]) == 'I' || c11 == 'i') && ((c12 = cArr[i15 + 2]) == 'D' || c12 == 'd')))) {
                i15 += 4;
                this.zzd = i15;
            }
        }
        return new String(this.zzg, i15, i14 - i15);
    }

    private final char zzc() {
        int i10;
        int i11;
        int i12 = this.zzc + 1;
        this.zzc = i12;
        int i13 = this.zzb;
        if (i12 == i13) {
            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
        }
        char c10 = this.zzg[i12];
        if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
            switch (c10) {
                default:
                    switch (c10) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iZzd = zzd(i12);
                            this.zzc++;
                            if (iZzd >= 128) {
                                if (iZzd < 192 || iZzd > 247) {
                                    iZzd = 63;
                                } else {
                                    if (iZzd <= 223) {
                                        i10 = iZzd & 31;
                                        i11 = 1;
                                    } else if (iZzd <= 239) {
                                        i10 = iZzd & 15;
                                        i11 = 2;
                                    } else {
                                        i10 = iZzd & 7;
                                        i11 = 3;
                                    }
                                    for (int i14 = 0; i14 < i11; i14++) {
                                        int i15 = this.zzc;
                                        int i16 = i15 + 1;
                                        this.zzc = i16;
                                        if (i16 != i13 && this.zzg[i16] == '\\') {
                                            int i17 = i15 + 2;
                                            this.zzc = i17;
                                            int iZzd2 = zzd(i17);
                                            this.zzc++;
                                            if ((iZzd2 & 192) == 128) {
                                                i10 = (i10 << 6) + (iZzd2 & 63);
                                            }
                                        }
                                        iZzd = 63;
                                    }
                                    iZzd = (char) i10;
                                }
                            }
                            return (char) iZzd;
                    }
                case '*':
                case '+':
                case ',':
                    return c10;
            }
        }
        return c10;
    }

    private final int zzd(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 >= this.zzb) {
            throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.zza)));
        }
        char[] cArr = this.zzg;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.zza)));
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.zza)));
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    public zzbym(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.zza = name;
        this.zzb = name.length();
    }
}
