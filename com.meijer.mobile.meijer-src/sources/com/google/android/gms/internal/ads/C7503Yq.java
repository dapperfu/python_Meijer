package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.Yq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7503Yq {

    /* renamed from: a, reason: collision with root package name */
    private final C7270Rq f72454a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f72455b;

    @Deprecated
    public final int a() {
        return this.f72455b.get();
    }

    @Deprecated
    public final void c() {
        this.f72454a.c(new Exception());
    }

    @Deprecated
    public final void d(Throwable th2, String str) {
        this.f72454a.c(th2);
        if (((Boolean) Oc.A.c().a(C8784lf.f76748B7)).booleanValue()) {
            Nc.v.s().w(th2, str);
        }
    }

    @Deprecated
    public final void e(Object obj) {
        this.f72454a.b(obj);
    }

    @Deprecated
    public final void f(InterfaceC7404Vq interfaceC7404Vq, InterfaceC7338Tq interfaceC7338Tq) {
        Mj0.r(this.f72454a, new C7470Xq(this, interfaceC7404Vq, interfaceC7338Tq), C7033Kq.f69020g);
    }

    public C7503Yq() {
        C7270Rq c7270Rq = new C7270Rq();
        this.f72454a = c7270Rq;
        this.f72455b = new AtomicInteger(0);
        Mj0.r(c7270Rq, new C7437Wq(this), C7033Kq.f69020g);
    }
}
