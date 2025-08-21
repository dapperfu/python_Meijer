package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.cb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractCallableC7816cb implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final C8988na f74041a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f74042b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f74043c;

    /* renamed from: d, reason: collision with root package name */
    protected final C8736l8 f74044d;

    /* renamed from: e, reason: collision with root package name */
    protected Method f74045e;

    /* renamed from: f, reason: collision with root package name */
    protected final int f74046f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f74047g;

    protected abstract void a() throws IllegalAccessException, InvocationTargetException;

    public AbstractCallableC7816cb(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        this.f74041a = c8988na;
        this.f74042b = str;
        this.f74043c = str2;
        this.f74044d = c8736l8;
        this.f74046f = i10;
        this.f74047g = i11;
    }

    public Void b() throws Exception {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            Method methodJ = this.f74041a.j(this.f74042b, this.f74043c);
            this.f74045e = methodJ;
            if (methodJ != null) {
                a();
                F9 f9D = this.f74041a.d();
                if (f9D != null && (i10 = this.f74046f) != Integer.MIN_VALUE) {
                    f9D.c(this.f74047g, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        b();
        return null;
    }
}
