package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;

/* loaded from: classes4.dex */
public final class zzrh {
    static int zza(int i10, int i11) {
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
