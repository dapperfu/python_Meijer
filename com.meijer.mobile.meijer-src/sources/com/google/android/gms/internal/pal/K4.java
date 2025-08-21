package com.google.android.gms.internal.pal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class K4 {

    /* renamed from: a, reason: collision with root package name */
    private final X3 f83557a;

    /* renamed from: b, reason: collision with root package name */
    private final String f83558b;

    /* renamed from: c, reason: collision with root package name */
    private final String f83559c;

    /* renamed from: e, reason: collision with root package name */
    private final Class[] f83561e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f83560d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f83562f = new CountDownLatch(1);

    static /* bridge */ /* synthetic */ void b(K4 k42) {
        CountDownLatch countDownLatch;
        Class<?> clsLoadClass;
        try {
            try {
                X3 x32 = k42.f83557a;
                clsLoadClass = x32.i().loadClass(k42.c(x32.u(), k42.f83558b));
            } catch (zzda | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (clsLoadClass == null) {
                countDownLatch = k42.f83562f;
            } else {
                k42.f83560d = clsLoadClass.getMethod(k42.c(k42.f83557a.u(), k42.f83559c), k42.f83561e);
                countDownLatch = k42.f83560d == null ? k42.f83562f : k42.f83562f;
            }
        } catch (NullPointerException unused2) {
            countDownLatch = k42.f83562f;
        } catch (Throwable th2) {
            k42.f83562f.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }

    private final String c(byte[] bArr, String str) throws zzda, UnsupportedEncodingException {
        return new String(this.f83557a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f83560d != null) {
            return this.f83560d;
        }
        try {
            if (this.f83562f.await(2L, TimeUnit.SECONDS)) {
                return this.f83560d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public K4(X3 x32, String str, String str2, Class... clsArr) {
        this.f83557a = x32;
        this.f83558b = str;
        this.f83559c = str2;
        this.f83561e = clsArr;
        x32.k().submit(new J4(this));
    }
}
