package com.google.android.gms.internal.ads;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.Cr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC6637Cr implements Runnable {
    RunnableC6637Cr(C6705Er c6705Er) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
