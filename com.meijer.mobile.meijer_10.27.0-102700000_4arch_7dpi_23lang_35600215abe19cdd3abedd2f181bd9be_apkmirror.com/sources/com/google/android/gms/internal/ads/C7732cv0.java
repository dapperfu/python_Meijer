package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7732cv0 {
    C7732cv0() {
    }

    public static final List a(Object obj, long j10) {
        int i10;
        Su0 su0 = (Su0) C7628bw0.p(obj, j10);
        if (!su0.zzc()) {
            int size = su0.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            Su0 su0Zzf = su0.zzf(i10);
            C7628bw0.D(obj, j10, su0Zzf);
            return su0Zzf;
        }
        return su0;
    }
}
