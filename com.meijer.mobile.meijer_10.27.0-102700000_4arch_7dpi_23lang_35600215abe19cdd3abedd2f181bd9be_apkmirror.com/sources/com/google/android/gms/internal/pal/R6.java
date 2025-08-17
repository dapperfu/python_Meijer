package com.google.android.gms.internal.pal;

import java.util.Set;

/* loaded from: classes6.dex */
public final class R6 {
    static int a(Set set) {
        int iHashCode;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i10 += iHashCode;
        }
        return i10;
    }
}
