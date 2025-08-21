package com.google.android.libraries.places.internal;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@JvmName
/* loaded from: classes6.dex */
public final class zzccf {
    public static final int zza(zzcbw zzcbwVar, int i10) {
        int i11;
        Intrinsics.j(zzcbwVar, "<this>");
        int[] iArrZzr = zzcbwVar.zzr();
        int length = zzcbwVar.zzq().length;
        Intrinsics.j(iArrZzr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                int i14 = i10 + 1;
                i11 = (i13 + i12) >>> 1;
                int i15 = iArrZzr[i11];
                if (i15 >= i14) {
                    if (i15 <= i14) {
                        break;
                    }
                    i12 = i11 - 1;
                } else {
                    i13 = i11 + 1;
                }
            } else {
                i11 = (-i13) - 1;
                break;
            }
        }
        return i11 >= 0 ? i11 : ~i11;
    }
}
