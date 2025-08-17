package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public abstract class B30 implements InterfaceC9715vX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f65411a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f65412b;

    /* renamed from: c, reason: collision with root package name */
    protected final AbstractC9010ou f65413c;

    /* renamed from: d, reason: collision with root package name */
    private final S30 f65414d;

    /* renamed from: e, reason: collision with root package name */
    private final N40 f65415e;

    /* renamed from: f, reason: collision with root package name */
    private final Qc.a f65416f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f65417g;

    /* renamed from: h, reason: collision with root package name */
    private final Z80 f65418h;

    /* renamed from: i, reason: collision with root package name */
    private final C9356s60 f65419i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.common.util.concurrent.q f65420j;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized DB l(L40 l40) {
        C10099z30 c10099z30 = (C10099z30) l40;
        if (((Boolean) Mc.A.c().a(C8659lf.f76272b8)).booleanValue()) {
            C8483jy c8483jy = new C8483jy(this.f65417g);
            GB gb2 = new GB();
            gb2.f(this.f65411a);
            gb2.k(c10099z30.f80346a);
            IB ibL = gb2.l();
            XE xe2 = new XE();
            xe2.f(this.f65414d, this.f65412b);
            xe2.o(this.f65414d, this.f65412b);
            return d(c8483jy, ibL, xe2.q());
        }
        S30 s30P = S30.p(this.f65414d);
        XE xe3 = new XE();
        xe3.e(s30P, this.f65412b);
        xe3.j(s30P, this.f65412b);
        xe3.k(s30P, this.f65412b);
        xe3.l(s30P, this.f65412b);
        xe3.f(s30P, this.f65412b);
        xe3.o(s30P, this.f65412b);
        xe3.p(s30P);
        C8483jy c8483jy2 = new C8483jy(this.f65417g);
        GB gb3 = new GB();
        gb3.f(this.f65411a);
        gb3.k(c10099z30.f80346a);
        return d(c8483jy2, gb3.l(), xe3.q());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(Mc.Y1 r9, java.lang.String r10, com.google.android.gms.internal.ads.C9501tX r11, com.google.android.gms.internal.ads.InterfaceC9608uX r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.B30.a(Mc.Y1, java.lang.String, com.google.android.gms.internal.ads.tX, com.google.android.gms.internal.ads.uX):boolean");
    }

    protected abstract DB d(C8483jy c8483jy, IB ib2, ZE ze2);

    final /* synthetic */ void j() {
        this.f65414d.g0(V60.d(6, null, null));
    }

    public final void k(Mc.j2 j2Var) {
        this.f65419i.Q(j2Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    public final boolean zza() {
        com.google.common.util.concurrent.q qVar = this.f65420j;
        return (qVar == null || qVar.isDone()) ? false : true;
    }

    protected B30(Context context, Executor executor, AbstractC9010ou abstractC9010ou, N40 n40, S30 s30, C9356s60 c9356s60, Qc.a aVar) {
        this.f65411a = context;
        this.f65412b = executor;
        this.f65413c = abstractC9010ou;
        this.f65415e = n40;
        this.f65414d = s30;
        this.f65419i = c9356s60;
        this.f65416f = aVar;
        this.f65417g = new FrameLayout(context);
        this.f65418h = abstractC9010ou.F();
    }
}
