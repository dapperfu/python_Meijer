package com.google.android.libraries.places.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tv.C17154h;
import tv.C17159m;
import tv.InterfaceC17152f;

/* loaded from: classes6.dex */
public final class zzrw {
    public static final InterfaceC17152f zza(InterfaceC17152f interfaceC17152f, int i10, Function2 f10) {
        Intrinsics.j(interfaceC17152f, "<this>");
        Intrinsics.j(f10, "f");
        if (i10 > 0) {
            return i10 == 1 ? new zzrp(interfaceC17152f, f10) : new zzrs(C17159m.b(C17154h.i(new zzrv(interfaceC17152f, f10, null)), i10 - 2, null, 2, null));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 39);
        sb2.append("concurrency must be at least 1 but was ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
