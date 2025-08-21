package com.google.android.libraries.places.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pv.C16563h;
import pv.C16568m;
import pv.InterfaceC16561f;

/* loaded from: classes6.dex */
public final class zzrw {
    public static final InterfaceC16561f zza(InterfaceC16561f interfaceC16561f, int i10, Function2 f10) {
        Intrinsics.j(interfaceC16561f, "<this>");
        Intrinsics.j(f10, "f");
        if (i10 > 0) {
            return i10 == 1 ? new zzrp(interfaceC16561f, f10) : new zzrs(C16568m.b(C16563h.i(new zzrv(interfaceC16561f, f10, null)), i10 - 2, null, 2, null));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 39);
        sb2.append("concurrency must be at least 1 but was ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
