package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.gN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8103gN {
    public static Bundle a(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue()) {
            for (int i10 = 0; i10 < 2; i10++) {
                Pair pair = pairArr[i10];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }
}
