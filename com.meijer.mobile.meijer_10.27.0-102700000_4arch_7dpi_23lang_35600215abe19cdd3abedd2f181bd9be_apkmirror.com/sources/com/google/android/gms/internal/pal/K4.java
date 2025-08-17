package com.google.android.gms.internal.pal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class K4 {

    /* renamed from: a, reason: collision with root package name */
    private final X3 f82717a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82718b;

    /* renamed from: c, reason: collision with root package name */
    private final String f82719c;

    /* renamed from: e, reason: collision with root package name */
    private final Class[] f82721e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f82720d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f82722f = new CountDownLatch(1);

    static /* bridge */ /* synthetic */ void b(K4 k42) {
        CountDownLatch countDownLatch;
        Class<?> clsLoadClass;
        try {
            try {
                X3 x32 = k42.f82717a;
                clsLoadClass = x32.i().loadClass(k42.c(x32.u(), k42.f82718b));
            } catch (zzda | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (clsLoadClass == null) {
                countDownLatch = k42.f82722f;
            } else {
                k42.f82720d = clsLoadClass.getMethod(k42.c(k42.f82717a.u(), k42.f82719c), k42.f82721e);
                countDownLatch = k42.f82720d == null ? k42.f82722f : k42.f82722f;
            }
        } catch (NullPointerException unused2) {
            countDownLatch = k42.f82722f;
        } catch (Throwable th2) {
            k42.f82722f.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }

    private final String c(byte[] bArr, String str) throws zzda, UnsupportedEncodingException {
        return new String(this.f82717a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f82720d != null) {
            return this.f82720d;
        }
        try {
            if (this.f82722f.await(2L, TimeUnit.SECONDS)) {
                return this.f82720d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public K4(X3 x32, String str, String str2, Class... clsArr) {
        this.f82717a = x32;
        this.f82718b = str;
        this.f82719c = str2;
        this.f82721e = clsArr;
        x32.k().submit(new J4(this));
    }
}
