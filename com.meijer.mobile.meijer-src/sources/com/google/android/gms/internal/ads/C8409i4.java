package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8409i4 {
    public static void a(InterfaceC8621k4 interfaceC8621k4, C8942n4 c8942n4, ME me2) {
        for (int i10 = 0; i10 < interfaceC8621k4.zza(); i10++) {
            long jZzb = interfaceC8621k4.zzb(i10);
            List listZzc = interfaceC8621k4.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i10 == interfaceC8621k4.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = interfaceC8621k4.zzb(i10 + 1) - interfaceC8621k4.zzb(i10);
                if (jZzb2 > 0) {
                    me2.zza(new C8195g4(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
