package com.google.android.gms.internal.pal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes6.dex */
final class Q2 implements Runnable {
    /* synthetic */ Q2(P2 p22) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            R2.f82851b = MessageDigest.getInstance("MD5");
            countDownLatch = R2.f82854e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = R2.f82854e;
        } catch (Throwable th2) {
            R2.f82854e.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
