package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.g9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8080g9 implements Runnable {
    /* synthetic */ RunnableC8080g9(C8187h9 c8187h9) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            C8294i9.f74894b = MessageDigest.getInstance("MD5");
            countDownLatch = C8294i9.f74897e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = C8294i9.f74897e;
        } catch (Throwable th2) {
            C8294i9.f74897e.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
