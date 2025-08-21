package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public abstract class B30 implements InterfaceC9840vX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f66251a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f66252b;

    /* renamed from: c, reason: collision with root package name */
    protected final AbstractC9135ou f66253c;

    /* renamed from: d, reason: collision with root package name */
    private final S30 f66254d;

    /* renamed from: e, reason: collision with root package name */
    private final N40 f66255e;

    /* renamed from: f, reason: collision with root package name */
    private final Sc.a f66256f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f66257g;

    /* renamed from: h, reason: collision with root package name */
    private final Z80 f66258h;

    /* renamed from: i, reason: collision with root package name */
    private final C9481s60 f66259i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.common.util.concurrent.q f66260j;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized DB l(L40 l40) {
        C10224z30 c10224z30 = (C10224z30) l40;
        if (((Boolean) Oc.A.c().a(C8784lf.f77112b8)).booleanValue()) {
            C8608jy c8608jy = new C8608jy(this.f66257g);
            GB gb2 = new GB();
            gb2.f(this.f66251a);
            gb2.k(c10224z30.f81186a);
            IB ibL = gb2.l();
            XE xe2 = new XE();
            xe2.f(this.f66254d, this.f66252b);
            xe2.o(this.f66254d, this.f66252b);
            return d(c8608jy, ibL, xe2.q());
        }
        S30 s30P = S30.p(this.f66254d);
        XE xe3 = new XE();
        xe3.e(s30P, this.f66252b);
        xe3.j(s30P, this.f66252b);
        xe3.k(s30P, this.f66252b);
        xe3.l(s30P, this.f66252b);
        xe3.f(s30P, this.f66252b);
        xe3.o(s30P, this.f66252b);
        xe3.p(s30P);
        C8608jy c8608jy2 = new C8608jy(this.f66257g);
        GB gb3 = new GB();
        gb3.f(this.f66251a);
        gb3.k(c10224z30.f81186a);
        return d(c8608jy2, gb3.l(), xe3.q());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(Oc.Y1 r9, java.lang.String r10, com.google.android.gms.internal.ads.C9626tX r11, com.google.android.gms.internal.ads.InterfaceC9733uX r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.B30.a(Oc.Y1, java.lang.String, com.google.android.gms.internal.ads.tX, com.google.android.gms.internal.ads.uX):boolean");
    }

    protected abstract DB d(C8608jy c8608jy, IB ib2, ZE ze2);

    final /* synthetic */ void j() {
        this.f66254d.C(V60.d(6, null, null));
    }

    public final void k(Oc.j2 j2Var) {
        this.f66259i.Q(j2Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    public final boolean zza() {
        com.google.common.util.concurrent.q qVar = this.f66260j;
        return (qVar == null || qVar.isDone()) ? false : true;
    }

    protected B30(Context context, Executor executor, AbstractC9135ou abstractC9135ou, N40 n40, S30 s30, C9481s60 c9481s60, Sc.a aVar) {
        this.f66251a = context;
        this.f66252b = executor;
        this.f66253c = abstractC9135ou;
        this.f66255e = n40;
        this.f66254d = s30;
        this.f66259i = c9481s60;
        this.f66256f = aVar;
        this.f66257g = new FrameLayout(context);
        this.f66258h = abstractC9135ou.F();
    }
}
