package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.cb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractCallableC7691cb implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final C8863na f73201a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f73202b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f73203c;

    /* renamed from: d, reason: collision with root package name */
    protected final C8611l8 f73204d;

    /* renamed from: e, reason: collision with root package name */
    protected Method f73205e;

    /* renamed from: f, reason: collision with root package name */
    protected final int f73206f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f73207g;

    protected abstract void a() throws IllegalAccessException, InvocationTargetException;

    public AbstractCallableC7691cb(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        this.f73201a = c8863na;
        this.f73202b = str;
        this.f73203c = str2;
        this.f73204d = c8611l8;
        this.f73206f = i10;
        this.f73207g = i11;
    }

    public Void b() throws Exception {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            Method methodJ = this.f73201a.j(this.f73202b, this.f73203c);
            this.f73205e = methodJ;
            if (methodJ != null) {
                a();
                F9 f9D = this.f73201a.d();
                if (f9D != null && (i10 = this.f73206f) != Integer.MIN_VALUE) {
                    f9D.c(this.f73207g, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
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
