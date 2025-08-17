package com.google.android.libraries.places.internal;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@JvmName
/* loaded from: classes6.dex */
public final class zzcbf {
    public static final void zza(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            int length = String.valueOf(j10).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(j11).length() + 11 + String.valueOf(j12).length());
            sb2.append("size=");
            sb2.append(j10);
            sb2.append(" offset=");
            sb2.append(j11);
            sb2.append(" byteCount=");
            sb2.append(j12);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public static final boolean zzb(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final String zzc(int i10) {
        int i11 = 0;
        char[] cArr = {zzcce.zza()[i10 >> 28], zzcce.zza()[(i10 >> 24) & 15], zzcce.zza()[(i10 >> 20) & 15], zzcce.zza()[(i10 >> 16) & 15], zzcce.zza()[(i10 >> 12) & 15], zzcce.zza()[(i10 >> 8) & 15], zzcce.zza()[(i10 >> 4) & 15], zzcce.zza()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return StringsKt.B(cArr, i11, 8);
    }
}
