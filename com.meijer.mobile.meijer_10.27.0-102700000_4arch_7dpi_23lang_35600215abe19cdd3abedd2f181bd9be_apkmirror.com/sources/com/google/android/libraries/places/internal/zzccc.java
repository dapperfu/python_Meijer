package com.google.android.libraries.places.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class zzccc {
    public static final String zza(byte[] bArr) {
        Intrinsics.j(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static final byte[] zzb(String str) {
        Intrinsics.j(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        return bytes;
    }
}
