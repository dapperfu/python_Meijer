package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.r80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9253r80 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f77948a;

    /* renamed from: b, reason: collision with root package name */
    private final String f77949b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f77950c;

    /* renamed from: d, reason: collision with root package name */
    private final List f77951d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f77952e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC9467t80 f77953f;

    private C9253r80(AbstractC9467t80 abstractC9467t80, Object obj, String str, com.google.common.util.concurrent.q qVar, List list, com.google.common.util.concurrent.q qVar2) {
        this.f77953f = abstractC9467t80;
        this.f77948a = obj;
        this.f77949b = str;
        this.f77950c = qVar;
        this.f77951d = list;
        this.f77952e = qVar2;
    }

    public final C9253r80 h(String str) {
        return new C9253r80(this.f77953f, this.f77948a, str, this.f77950c, this.f77951d, this.f77952e);
    }

    public final C8079g80 a() {
        Object obj = this.f77948a;
        String strF = this.f77949b;
        if (strF == null) {
            strF = this.f77953f.f(obj);
        }
        final C8079g80 c8079g80 = new C8079g80(obj, strF, this.f77952e);
        this.f77953f.f78494c.q0(c8079g80);
        com.google.common.util.concurrent.q qVar = this.f77950c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.p80
            @Override // java.lang.Runnable
            public final void run() {
                this.f77513a.f77953f.f78494c.p0(c8079g80);
            }
        };
        Xj0 xj0 = C6908Kq.f68180g;
        qVar.addListener(runnable, xj0);
        Mj0.r(c8079g80, new C9147q80(this, c8079g80), xj0);
        return c8079g80;
    }

    public final C9253r80 b(Object obj) {
        return this.f77953f.b(obj, a());
    }

    public final C9253r80 c(Class cls, InterfaceC9416sj0 interfaceC9416sj0) {
        return new C9253r80(this.f77953f, this.f77948a, this.f77949b, this.f77950c, this.f77951d, Mj0.f(this.f77952e, cls, interfaceC9416sj0, this.f77953f.f78492a));
    }

    public final C9253r80 d(final com.google.common.util.concurrent.q qVar) {
        return g(new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.o80
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return qVar;
            }
        }, C6908Kq.f68180g);
    }

    public final C9253r80 e(final InterfaceC7865e80 interfaceC7865e80) {
        return f(new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.m80
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(interfaceC7865e80.zza(obj));
            }
        });
    }

    public final C9253r80 f(InterfaceC9416sj0 interfaceC9416sj0) {
        return g(interfaceC9416sj0, this.f77953f.f78492a);
    }

    public final C9253r80 g(InterfaceC9416sj0 interfaceC9416sj0, Executor executor) {
        return new C9253r80(this.f77953f, this.f77948a, this.f77949b, this.f77950c, this.f77951d, Mj0.n(this.f77952e, interfaceC9416sj0, executor));
    }

    public final C9253r80 i(long j10, TimeUnit timeUnit) {
        return new C9253r80(this.f77953f, this.f77948a, this.f77949b, this.f77950c, this.f77951d, Mj0.o(this.f77952e, j10, timeUnit, this.f77953f.f78493b));
    }
}
