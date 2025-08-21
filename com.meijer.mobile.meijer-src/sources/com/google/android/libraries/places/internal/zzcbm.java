package com.google.android.libraries.places.internal;

import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcbm {
    @JvmStatic
    public static final zzcbn zza(String str) {
        Intrinsics.j(str, "<this>");
        zzcbn zzcbnVar = new zzcbn(zzccc.zzb(str));
        zzcbnVar.zzd(str);
        return zzcbnVar;
    }

    @JvmStatic
    public static final zzcbn zzb(byte... data) {
        Intrinsics.j(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.i(bArrCopyOf, "copyOf(...)");
        return new zzcbn(bArrCopyOf);
    }
}
