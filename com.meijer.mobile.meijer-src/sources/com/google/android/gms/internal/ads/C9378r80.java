package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.r80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9378r80 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f78788a;

    /* renamed from: b, reason: collision with root package name */
    private final String f78789b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f78790c;

    /* renamed from: d, reason: collision with root package name */
    private final List f78791d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f78792e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC9592t80 f78793f;

    private C9378r80(AbstractC9592t80 abstractC9592t80, Object obj, String str, com.google.common.util.concurrent.q qVar, List list, com.google.common.util.concurrent.q qVar2) {
        this.f78793f = abstractC9592t80;
        this.f78788a = obj;
        this.f78789b = str;
        this.f78790c = qVar;
        this.f78791d = list;
        this.f78792e = qVar2;
    }

    public final C9378r80 h(String str) {
        return new C9378r80(this.f78793f, this.f78788a, str, this.f78790c, this.f78791d, this.f78792e);
    }

    public final C8204g80 a() {
        Object obj = this.f78788a;
        String strF = this.f78789b;
        if (strF == null) {
            strF = this.f78793f.f(obj);
        }
        final C8204g80 c8204g80 = new C8204g80(obj, strF, this.f78792e);
        this.f78793f.f79334c.q0(c8204g80);
        com.google.common.util.concurrent.q qVar = this.f78790c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.p80
            @Override // java.lang.Runnable
            public final void run() {
                this.f78353a.f78793f.f79334c.p0(c8204g80);
            }
        };
        Xj0 xj0 = C7033Kq.f69020g;
        qVar.addListener(runnable, xj0);
        Mj0.r(c8204g80, new C9272q80(this, c8204g80), xj0);
        return c8204g80;
    }

    public final C9378r80 b(Object obj) {
        return this.f78793f.b(obj, a());
    }

    public final C9378r80 c(Class cls, InterfaceC9541sj0 interfaceC9541sj0) {
        return new C9378r80(this.f78793f, this.f78788a, this.f78789b, this.f78790c, this.f78791d, Mj0.f(this.f78792e, cls, interfaceC9541sj0, this.f78793f.f79332a));
    }

    public final C9378r80 d(final com.google.common.util.concurrent.q qVar) {
        return g(new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.o80
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return qVar;
            }
        }, C7033Kq.f69020g);
    }

    public final C9378r80 e(final InterfaceC7990e80 interfaceC7990e80) {
        return f(new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.m80
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(interfaceC7990e80.zza(obj));
            }
        });
    }

    public final C9378r80 f(InterfaceC9541sj0 interfaceC9541sj0) {
        return g(interfaceC9541sj0, this.f78793f.f79332a);
    }

    public final C9378r80 g(InterfaceC9541sj0 interfaceC9541sj0, Executor executor) {
        return new C9378r80(this.f78793f, this.f78788a, this.f78789b, this.f78790c, this.f78791d, Mj0.n(this.f78792e, interfaceC9541sj0, executor));
    }

    public final C9378r80 i(long j10, TimeUnit timeUnit) {
        return new C9378r80(this.f78793f, this.f78788a, this.f78789b, this.f78790c, this.f78791d, Mj0.o(this.f78792e, j10, timeUnit, this.f78793f.f79333b));
    }
}
