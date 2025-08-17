package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public abstract class L4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f82739a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    protected final X3 f82740b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f82741c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f82742d;

    /* renamed from: e, reason: collision with root package name */
    protected final Ya f82743e;

    /* renamed from: f, reason: collision with root package name */
    protected Method f82744f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f82745g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f82746h;

    protected abstract void a() throws IllegalAccessException, InvocationTargetException;

    public Void b() throws Exception {
        long jNanoTime;
        Method methodJ;
        int i10;
        try {
            jNanoTime = System.nanoTime();
            methodJ = this.f82740b.j(this.f82741c, this.f82742d);
            this.f82744f = methodJ;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (methodJ == null) {
            return null;
        }
        a();
        C10915u3 c10915u3D = this.f82740b.d();
        if (c10915u3D != null && (i10 = this.f82745g) != Integer.MIN_VALUE) {
            c10915u3D.c(this.f82746h, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
        }
        return null;
    }

    public L4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        this.f82740b = x32;
        this.f82741c = str;
        this.f82742d = str2;
        this.f82743e = ya2;
        this.f82745g = i10;
        this.f82746h = i11;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        b();
        return null;
    }
}
