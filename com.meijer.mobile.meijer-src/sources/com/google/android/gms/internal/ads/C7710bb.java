package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.bb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7710bb {

    /* renamed from: a, reason: collision with root package name */
    private final C8988na f73669a;

    /* renamed from: b, reason: collision with root package name */
    private final String f73670b;

    /* renamed from: c, reason: collision with root package name */
    private final String f73671c;

    /* renamed from: e, reason: collision with root package name */
    private final Class[] f73673e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f73672d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f73674f = new CountDownLatch(1);

    static /* bridge */ /* synthetic */ void b(C7710bb c7710bb) {
        try {
            C8988na c8988na = c7710bb.f73669a;
            Class<?> clsLoadClass = c8988na.i().loadClass(c7710bb.c(c8988na.u(), c7710bb.f73670b));
            if (clsLoadClass != null) {
                c7710bb.f73672d = clsLoadClass.getMethod(c7710bb.c(c7710bb.f73669a.u(), c7710bb.f73671c), c7710bb.f73673e);
            }
        } catch (zzavh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th2) {
            c7710bb.f73674f.countDown();
            throw th2;
        }
        c7710bb.f73674f.countDown();
    }

    private final String c(byte[] bArr, String str) throws zzavh, UnsupportedEncodingException {
        return new String(this.f73669a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f73672d != null) {
            return this.f73672d;
        }
        try {
            if (this.f73674f.await(2L, TimeUnit.SECONDS)) {
                return this.f73672d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public C7710bb(C8988na c8988na, String str, String str2, Class... clsArr) {
        this.f73669a = c8988na;
        this.f73670b = str;
        this.f73671c = str2;
        this.f73673e = clsArr;
        c8988na.k().submit(new RunnableC7603ab(this));
    }
}
