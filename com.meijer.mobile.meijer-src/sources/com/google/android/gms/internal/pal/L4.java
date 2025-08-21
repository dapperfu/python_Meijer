package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public abstract class L4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f83579a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    protected final X3 f83580b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f83581c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f83582d;

    /* renamed from: e, reason: collision with root package name */
    protected final Ya f83583e;

    /* renamed from: f, reason: collision with root package name */
    protected Method f83584f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f83585g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f83586h;

    protected abstract void a() throws IllegalAccessException, InvocationTargetException;

    public Void b() throws Exception {
        long jNanoTime;
        Method methodJ;
        int i10;
        try {
            jNanoTime = System.nanoTime();
            methodJ = this.f83580b.j(this.f83581c, this.f83582d);
            this.f83584f = methodJ;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (methodJ == null) {
            return null;
        }
        a();
        C11040u3 c11040u3D = this.f83580b.d();
        if (c11040u3D != null && (i10 = this.f83585g) != Integer.MIN_VALUE) {
            c11040u3D.c(this.f83586h, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
        }
        return null;
    }

    public L4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        this.f83580b = x32;
        this.f83581c = str;
        this.f83582d = str2;
        this.f83583e = ya2;
        this.f83585g = i10;
        this.f83586h = i11;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        b();
        return null;
    }
}
