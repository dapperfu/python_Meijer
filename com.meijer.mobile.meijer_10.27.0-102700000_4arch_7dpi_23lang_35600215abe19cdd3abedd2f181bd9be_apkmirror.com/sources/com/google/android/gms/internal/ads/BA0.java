package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes6.dex */
public final class BA0 {

    /* renamed from: a, reason: collision with root package name */
    private final AA0 f65463a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10113zA0 f65464b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC7307Wl f65465c;

    /* renamed from: d, reason: collision with root package name */
    private int f65466d;

    /* renamed from: e, reason: collision with root package name */
    private Object f65467e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f65468f;

    /* renamed from: g, reason: collision with root package name */
    private final int f65469g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f65470h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f65471i;

    public BA0(InterfaceC10113zA0 interfaceC10113zA0, AA0 aa0, AbstractC7307Wl abstractC7307Wl, int i10, HC hc2, Looper looper) {
        this.f65464b = interfaceC10113zA0;
        this.f65463a = aa0;
        this.f65465c = abstractC7307Wl;
        this.f65468f = looper;
        this.f65469g = i10;
    }

    public final int a() {
        return this.f65466d;
    }

    public final Looper b() {
        return this.f65468f;
    }

    public final AA0 c() {
        return this.f65463a;
    }

    public final Object g() {
        return this.f65467e;
    }

    public final synchronized void h(boolean z10) {
        this.f65471i = z10 | this.f65471i;
        notifyAll();
    }

    public final synchronized boolean i() {
        return false;
    }

    public final BA0 d() {
        C8086gC.f(!this.f65470h);
        this.f65470h = true;
        this.f65464b.c(this);
        return this;
    }

    public final BA0 e(Object obj) {
        C8086gC.f(!this.f65470h);
        this.f65467e = obj;
        return this;
    }

    public final BA0 f(int i10) {
        C8086gC.f(!this.f65470h);
        this.f65466d = i10;
        return this;
    }
}
