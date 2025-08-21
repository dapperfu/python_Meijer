package com.google.android.gms.internal.pal;

import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.pal.r5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10994r5 {
    public static Object a(InterfaceC11107y6 interfaceC11107y6) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return interfaceC11107y6.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
