package com.google.android.gms.common.util;

import android.os.Looper;

/* loaded from: classes4.dex */
public final class y {
    public static boolean a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
