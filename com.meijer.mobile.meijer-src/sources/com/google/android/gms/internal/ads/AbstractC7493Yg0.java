package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.ads.Yg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7493Yg0 {
    AbstractC7493Yg0() {
    }

    public abstract AbstractC7493Yg0 a(Object obj);

    static int b(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        return i12 < 0 ? a.e.API_PRIORITY_OTHER : i12;
    }
}
