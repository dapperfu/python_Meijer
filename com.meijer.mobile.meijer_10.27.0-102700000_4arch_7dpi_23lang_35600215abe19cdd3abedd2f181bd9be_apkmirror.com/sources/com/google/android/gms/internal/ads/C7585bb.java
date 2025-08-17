package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.bb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7585bb {

    /* renamed from: a, reason: collision with root package name */
    private final C8863na f72829a;

    /* renamed from: b, reason: collision with root package name */
    private final String f72830b;

    /* renamed from: c, reason: collision with root package name */
    private final String f72831c;

    /* renamed from: e, reason: collision with root package name */
    private final Class[] f72833e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f72832d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f72834f = new CountDownLatch(1);

    static /* bridge */ /* synthetic */ void b(C7585bb c7585bb) {
        try {
            C8863na c8863na = c7585bb.f72829a;
            Class<?> clsLoadClass = c8863na.i().loadClass(c7585bb.c(c8863na.u(), c7585bb.f72830b));
            if (clsLoadClass != null) {
                c7585bb.f72832d = clsLoadClass.getMethod(c7585bb.c(c7585bb.f72829a.u(), c7585bb.f72831c), c7585bb.f72833e);
            }
        } catch (zzavh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th2) {
            c7585bb.f72834f.countDown();
            throw th2;
        }
        c7585bb.f72834f.countDown();
    }

    private final String c(byte[] bArr, String str) throws zzavh, UnsupportedEncodingException {
        return new String(this.f72829a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f72832d != null) {
            return this.f72832d;
        }
        try {
            if (this.f72834f.await(2L, TimeUnit.SECONDS)) {
                return this.f72832d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public C7585bb(C8863na c8863na, String str, String str2, Class... clsArr) {
        this.f72829a = c8863na;
        this.f72830b = str;
        this.f72831c = str2;
        this.f72833e = clsArr;
        c8863na.k().submit(new RunnableC7478ab(this));
    }
}
