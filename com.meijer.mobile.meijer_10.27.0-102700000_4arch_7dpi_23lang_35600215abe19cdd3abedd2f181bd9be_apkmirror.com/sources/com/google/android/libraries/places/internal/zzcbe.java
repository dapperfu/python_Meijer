package com.google.android.libraries.places.internal;

import fsimpl.C14045dq;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@JvmName
/* loaded from: classes6.dex */
public final class zzcbe {
    private static final byte[] zza;

    static {
        zzcbn zzcbnVar = zzcbn.zza;
        zza = zzcbm.zza("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").zza();
        zzcbm.zza("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    public static /* synthetic */ String zza(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        byte[] map = zza;
        Intrinsics.j(bArr, "<this>");
        Intrinsics.j(map, "map");
        int length = bArr.length;
        int i11 = length + 2;
        int i12 = length - (length % 3);
        byte[] bArr3 = new byte[(i11 / 3) * 4];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i14 + 3;
            byte b10 = bArr[i13];
            int i16 = i13 + 2;
            byte b11 = bArr[i13 + 1];
            i13 += 3;
            byte b12 = bArr[i16];
            bArr3[i14] = map[(b10 & 255) >> 2];
            bArr3[i14 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            bArr3[i14 + 2] = map[((b11 & C14045dq.MULTIPLY) << 2) | ((b12 & 255) >> 6)];
            i14 += 4;
            bArr3[i15] = map[b12 & 63];
        }
        int length2 = bArr.length - i12;
        if (length2 == 1) {
            byte b13 = bArr[i13];
            bArr3[i14] = map[(b13 & 255) >> 2];
            bArr3[i14 + 1] = map[(b13 & 3) << 4];
            bArr3[i14 + 2] = 61;
            bArr3[i14 + 3] = 61;
        } else if (length2 == 2) {
            int i17 = i13 + 1;
            byte b14 = bArr[i13];
            byte b15 = bArr[i17];
            bArr3[i14] = map[(b14 & 255) >> 2];
            bArr3[i14 + 1] = map[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr3[i14 + 2] = map[(b15 & C14045dq.MULTIPLY) << 2];
            bArr3[i14 + 3] = 61;
        }
        return zzccc.zza(bArr3);
    }
}
