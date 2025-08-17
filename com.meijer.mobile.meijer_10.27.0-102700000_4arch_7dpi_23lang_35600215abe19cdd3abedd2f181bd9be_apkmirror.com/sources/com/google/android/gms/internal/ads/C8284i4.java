package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8284i4 {
    public static void a(InterfaceC8496k4 interfaceC8496k4, C8817n4 c8817n4, ME me2) {
        for (int i10 = 0; i10 < interfaceC8496k4.zza(); i10++) {
            long jZzb = interfaceC8496k4.zzb(i10);
            List listZzc = interfaceC8496k4.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i10 == interfaceC8496k4.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = interfaceC8496k4.zzb(i10 + 1) - interfaceC8496k4.zzb(i10);
                if (jZzb2 > 0) {
                    me2.zza(new C8070g4(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
