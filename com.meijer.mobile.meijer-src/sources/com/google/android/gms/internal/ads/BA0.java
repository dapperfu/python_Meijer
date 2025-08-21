package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes6.dex */
public final class BA0 {

    /* renamed from: a, reason: collision with root package name */
    private final AA0 f66303a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10238zA0 f66304b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC7432Wl f66305c;

    /* renamed from: d, reason: collision with root package name */
    private int f66306d;

    /* renamed from: e, reason: collision with root package name */
    private Object f66307e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f66308f;

    /* renamed from: g, reason: collision with root package name */
    private final int f66309g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f66310h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f66311i;

    public BA0(InterfaceC10238zA0 interfaceC10238zA0, AA0 aa0, AbstractC7432Wl abstractC7432Wl, int i10, HC hc2, Looper looper) {
        this.f66304b = interfaceC10238zA0;
        this.f66303a = aa0;
        this.f66305c = abstractC7432Wl;
        this.f66308f = looper;
        this.f66309g = i10;
    }

    public final int a() {
        return this.f66306d;
    }

    public final Looper b() {
        return this.f66308f;
    }

    public final AA0 c() {
        return this.f66303a;
    }

    public final Object g() {
        return this.f66307e;
    }

    public final synchronized void h(boolean z10) {
        this.f66311i = z10 | this.f66311i;
        notifyAll();
    }

    public final synchronized boolean i() {
        return false;
    }

    public final BA0 d() {
        C8211gC.f(!this.f66310h);
        this.f66310h = true;
        this.f66304b.c(this);
        return this;
    }

    public final BA0 e(Object obj) {
        C8211gC.f(!this.f66310h);
        this.f66307e = obj;
        return this;
    }

    public final BA0 f(int i10) {
        C8211gC.f(!this.f66310h);
        this.f66306d = i10;
        return this;
    }
}
