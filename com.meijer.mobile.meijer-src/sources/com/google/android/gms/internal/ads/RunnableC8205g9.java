package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.g9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8205g9 implements Runnable {
    /* synthetic */ RunnableC8205g9(C8312h9 c8312h9) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            C8419i9.f75734b = MessageDigest.getInstance("MD5");
            countDownLatch = C8419i9.f75737e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = C8419i9.f75737e;
        } catch (Throwable th2) {
            C8419i9.f75737e.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
