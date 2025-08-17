package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.ads.nf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8873nf {
    public static Object a(InterfaceC7300Wf0 interfaceC7300Wf0) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return interfaceC7300Wf0.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
