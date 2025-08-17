package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.Yq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7378Yq {

    /* renamed from: a, reason: collision with root package name */
    private final C7145Rq f71614a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f71615b;

    @Deprecated
    public final int a() {
        return this.f71615b.get();
    }

    @Deprecated
    public final void c() {
        this.f71614a.c(new Exception());
    }

    @Deprecated
    public final void d(Throwable th2, String str) {
        this.f71614a.c(th2);
        if (((Boolean) Mc.A.c().a(C8659lf.f75908B7)).booleanValue()) {
            Lc.v.s().w(th2, str);
        }
    }

    @Deprecated
    public final void e(Object obj) {
        this.f71614a.b(obj);
    }

    @Deprecated
    public final void f(InterfaceC7279Vq interfaceC7279Vq, InterfaceC7213Tq interfaceC7213Tq) {
        Mj0.r(this.f71614a, new C7345Xq(this, interfaceC7279Vq, interfaceC7213Tq), C6908Kq.f68180g);
    }

    public C7378Yq() {
        C7145Rq c7145Rq = new C7145Rq();
        this.f71614a = c7145Rq;
        this.f71615b = new AtomicInteger(0);
        Mj0.r(c7145Rq, new C7312Wq(this), C6908Kq.f68180g);
    }
}
