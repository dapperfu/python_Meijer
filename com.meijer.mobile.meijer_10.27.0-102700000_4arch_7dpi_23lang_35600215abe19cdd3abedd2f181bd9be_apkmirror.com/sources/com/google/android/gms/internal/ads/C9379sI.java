package com.google.android.gms.internal.ads;

import Z.C5503a;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9379sI extends C6577Az {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f78195G = 0;

    /* renamed from: A, reason: collision with root package name */
    private final Qc.a f78196A;

    /* renamed from: B, reason: collision with root package name */
    private final Context f78197B;

    /* renamed from: C, reason: collision with root package name */
    private final C9593uI f78198C;

    /* renamed from: D, reason: collision with root package name */
    private final C8220hX f78199D;

    /* renamed from: E, reason: collision with root package name */
    private final Map f78200E;

    /* renamed from: F, reason: collision with root package name */
    private final List f78201F;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f78202j;

    /* renamed from: k, reason: collision with root package name */
    private final C9914xI f78203k;

    /* renamed from: l, reason: collision with root package name */
    private final FI f78204l;

    /* renamed from: m, reason: collision with root package name */
    private final YI f78205m;

    /* renamed from: n, reason: collision with root package name */
    private final CI f78206n;

    /* renamed from: o, reason: collision with root package name */
    private final II f78207o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC7738cy0 f78208p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC7738cy0 f78209q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC7738cy0 f78210r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC7738cy0 f78211s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC7738cy0 f78212t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceViewOnClickListenerC9915xJ f78213u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f78214v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f78215w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f78216x;

    /* renamed from: y, reason: collision with root package name */
    private final C7178Sp f78217y;

    /* renamed from: z, reason: collision with root package name */
    private final M9 f78218z;

    public C9379sI(C10196zz c10196zz, Executor executor, C9914xI c9914xI, FI fi2, YI yi2, CI ci2, II ii2, InterfaceC7738cy0 interfaceC7738cy0, InterfaceC7738cy0 interfaceC7738cy02, InterfaceC7738cy0 interfaceC7738cy03, InterfaceC7738cy0 interfaceC7738cy04, InterfaceC7738cy0 interfaceC7738cy05, C7178Sp c7178Sp, M9 m92, Qc.a aVar, Context context, C9593uI c9593uI, C8220hX c8220hX, C10041yb c10041yb) {
        super(c10196zz);
        this.f78202j = executor;
        this.f78203k = c9914xI;
        this.f78204l = fi2;
        this.f78205m = yi2;
        this.f78206n = ci2;
        this.f78207o = ii2;
        this.f78208p = interfaceC7738cy0;
        this.f78209q = interfaceC7738cy02;
        this.f78210r = interfaceC7738cy03;
        this.f78211s = interfaceC7738cy04;
        this.f78212t = interfaceC7738cy05;
        this.f78217y = c7178Sp;
        this.f78218z = m92;
        this.f78196A = aVar;
        this.f78197B = context;
        this.f78198C = c9593uI;
        this.f78199D = c8220hX;
        this.f78200E = new HashMap();
        this.f78201F = new ArrayList();
    }

    private final synchronized ImageView.ScaleType J() {
        InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ = this.f78213u;
        if (interfaceViewOnClickListenerC9915xJ == null) {
            Qc.p.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        com.google.android.gms.dynamic.b bVarZzj = interfaceViewOnClickListenerC9915xJ.zzj();
        if (bVarZzj != null) {
            return (ImageView.ScaleType) com.google.android.gms.dynamic.d.b2(bVarZzj);
        }
        return YI.f71523k;
    }

    private final synchronized void L(View view, Map map, Map map2) {
        this.f78205m.d(this.f78213u);
        this.f78204l.y(view, map, map2, J());
        this.f78215w = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final synchronized void e0(InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ) {
        Iterator<String> itKeys;
        View view;
        G9 g9C;
        try {
            if (!this.f78214v) {
                this.f78213u = interfaceViewOnClickListenerC9915xJ;
                this.f78205m.e(interfaceViewOnClickListenerC9915xJ);
                this.f78204l.K(interfaceViewOnClickListenerC9915xJ.zzf(), interfaceViewOnClickListenerC9915xJ.zzm(), interfaceViewOnClickListenerC9915xJ.zzn(), interfaceViewOnClickListenerC9915xJ, interfaceViewOnClickListenerC9915xJ);
                if (((Boolean) Mc.A.c().a(C8659lf.f76029K2)).booleanValue() && (g9C = this.f78218z.c()) != null) {
                    g9C.a(interfaceViewOnClickListenerC9915xJ.zzf());
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f76140S1)).booleanValue()) {
                    Z50 z50 = this.f65378b;
                    if (z50.f72042k0 && (itKeys = z50.f72040j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ2 = this.f78213u;
                            WeakReference weakReference = interfaceViewOnClickListenerC9915xJ2 == null ? null : (WeakReference) interfaceViewOnClickListenerC9915xJ2.zzl().get(next);
                            this.f78200E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC9934xb viewOnAttachStateChangeListenerC9934xb = new ViewOnAttachStateChangeListenerC9934xb(this.f78197B, view);
                                this.f78201F.add(viewOnAttachStateChangeListenerC9934xb);
                                viewOnAttachStateChangeListenerC9934xb.c(new C8952oI(this, next));
                            }
                        }
                    }
                }
                if (interfaceViewOnClickListenerC9915xJ.zzi() != null) {
                    interfaceViewOnClickListenerC9915xJ.zzi().c(this.f78217y);
                }
            }
        } finally {
        }
    }

    public final synchronized void A(final InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76112Q1)).booleanValue()) {
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74293a.e0(interfaceViewOnClickListenerC9915xJ);
                }
            });
        } else {
            e0(interfaceViewOnClickListenerC9915xJ);
        }
    }

    public final synchronized void B(final InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76112Q1)).booleanValue()) {
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74709a.i(interfaceViewOnClickListenerC9915xJ);
                }
            });
        } else {
            i(interfaceViewOnClickListenerC9915xJ);
        }
    }

    public final synchronized boolean D() {
        return this.f78204l.r();
    }

    public final synchronized boolean E() {
        return this.f78204l.x();
    }

    public final synchronized boolean H(Bundle bundle) {
        if (this.f78215w) {
            return true;
        }
        boolean zJ = this.f78204l.J(bundle);
        this.f78215w = zJ;
        return zJ;
    }

    public final synchronized int I() {
        return this.f78204l.zza();
    }

    public final C9593uI P() {
        return this.f78198C;
    }

    public final synchronized JSONObject V(View view, Map map, Map map2) {
        return this.f78204l.M(view, map, map2, J());
    }

    public final synchronized JSONObject W(View view, Map map, Map map2) {
        return this.f78204l.N(view, map, map2, J());
    }

    @Override // com.google.android.gms.internal.ads.C6577Az
    public final synchronized void a() {
        this.f78214v = true;
        this.f78202j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mI
            @Override // java.lang.Runnable
            public final void run() {
                this.f76774a.b0();
            }
        });
        super.a();
    }

    public final synchronized void a0() {
        this.f78204l.zzi();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[Catch: all -> 0x0044, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x0048, B:22:0x005c, B:23:0x0064, B:25:0x006a, B:27:0x007e, B:29:0x0084, B:34:0x008b), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f78215w     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L7
            goto L89
        L7:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76140S1     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.jf r1 = Mc.A.c()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.Z50 r0 = r3.f65378b     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.f72042k0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            java.util.Map r0 = r3.f78200E     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L44
            java.util.Map r2 = r3.f78200E     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L29
            goto L89
        L44:
            r4 = move-exception
            goto L90
        L46:
            if (r7 != 0) goto L8b
            com.google.android.gms.internal.ads.bf r7 = com.google.android.gms.internal.ads.C8659lf.f76212X3     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.jf r0 = Mc.A.c()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = r0.a(r7)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L44
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L89
            if (r5 == 0) goto L89
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L44
        L64:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L89
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L44
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L44
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L44
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            boolean r0 = G(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L64
            r3.L(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L89:
            monitor-exit(r3)
            return
        L8b:
            r3.L(r4, r5, r6)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return
        L90:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9379sI.j(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void k(Mc.D0 d02) {
        this.f78204l.G(d02);
    }

    public final synchronized void l(View view, View view2, Map map, Map map2, boolean z10) {
        InterfaceC9008ot interfaceC9008otF0;
        this.f78205m.c(this.f78213u);
        this.f78204l.z(view, view2, map, map2, z10, J());
        if (this.f78216x) {
            C9914xI c9914xI = this.f78203k;
            if (c9914xI.f0() != null && (interfaceC9008otF0 = c9914xI.f0()) != null) {
                interfaceC9008otF0.L("onSdkAdUserInteractionClick", new C5503a());
            }
        }
    }

    public final synchronized void m(final View view, final int i10) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76527tb)).booleanValue()) {
            InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ = this.f78213u;
            if (interfaceViewOnClickListenerC9915xJ == null) {
                Qc.p.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z10 = interfaceViewOnClickListenerC9915xJ instanceof RI;
                this.f78202j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lI
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f75780a.c0(view, z10, i10);
                    }
                });
            }
        }
    }

    public final synchronized void n(String str) {
        this.f78204l.B(str);
    }

    public final synchronized void o(Bundle bundle) {
        this.f78204l.A(bundle);
    }

    public final synchronized void p() {
        InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ = this.f78213u;
        if (interfaceViewOnClickListenerC9915xJ == null) {
            Qc.p.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z10 = interfaceViewOnClickListenerC9915xJ instanceof RI;
            this.f78202j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77031a.d0(z10);
                }
            });
        }
    }

    public final synchronized void r() {
        if (this.f78215w) {
            return;
        }
        this.f78204l.zzs();
    }

    public final synchronized void t(View view, MotionEvent motionEvent, View view2) {
        this.f78204l.D(view, motionEvent, view2);
    }

    public final synchronized void u(Bundle bundle) {
        this.f78204l.L(bundle);
    }

    public final synchronized void v(View view) {
        this.f78204l.H(view);
    }

    public final synchronized void w() {
        this.f78204l.zzw();
    }

    public final synchronized void x(Mc.A0 a02) {
        this.f78204l.I(a02);
    }

    public final synchronized void y(Mc.N0 n02) {
        this.f78199D.a(n02);
    }

    public final synchronized void z(InterfaceC7101Qh interfaceC7101Qh) {
        this.f78204l.F(interfaceC7101Qh);
    }

    static {
        AbstractC7917eh0.z("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public static boolean G(View view) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76582xa)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        Lc.v.t();
        long jC0 = Pc.D0.c0(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jC0 >= ((Integer) Mc.A.c().a(C8659lf.f76596ya)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final void K(String str, boolean z10) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76409l5)).booleanValue()) {
            S("Google", true);
            return;
        }
        com.google.common.util.concurrent.q qVarJ0 = this.f78203k.j0();
        if (qVarJ0 == null) {
            return;
        }
        Mj0.r(qVarJ0, new C9059pI(this, "Google", true), this.f78202j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(View view, C7789dT c7789dT) {
        InterfaceC9008ot interfaceC9008otE0 = this.f78203k.e0();
        if (!this.f78206n.d() || c7789dT == null || interfaceC9008otE0 == null || view == null) {
            return;
        }
        Lc.v.b().h(c7789dT.a(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void i(InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ) {
        this.f78204l.C(interfaceViewOnClickListenerC9915xJ.zzf(), interfaceViewOnClickListenerC9915xJ.zzl());
        if (interfaceViewOnClickListenerC9915xJ.zzh() != null) {
            interfaceViewOnClickListenerC9915xJ.zzh().setClickable(false);
            interfaceViewOnClickListenerC9915xJ.zzh().removeAllViews();
        }
        if (interfaceViewOnClickListenerC9915xJ.zzi() != null) {
            interfaceViewOnClickListenerC9915xJ.zzi().e(this.f78217y);
        }
        this.f78213u = null;
    }

    public static /* synthetic */ void X(C9379sI c9379sI) {
        try {
            C9914xI c9914xI = c9379sI.f78203k;
            int iP = c9914xI.P();
            if (iP == 1) {
                InterfaceC9946xh interfaceC9946xhB = c9379sI.f78207o.b();
                if (interfaceC9946xhB != null) {
                    c9379sI.K("Google", true);
                    interfaceC9946xhB.L4((InterfaceC8877nh) c9379sI.f78208p.zzb());
                    return;
                }
                return;
            }
            if (iP == 2) {
                InterfaceC9625uh interfaceC9625uhA = c9379sI.f78207o.a();
                if (interfaceC9625uhA != null) {
                    c9379sI.K("Google", true);
                    interfaceC9625uhA.O5((InterfaceC8663lh) c9379sI.f78209q.zzb());
                    return;
                }
                return;
            }
            if (iP == 3) {
                InterfaceC6694Eh interfaceC6694EhD = c9379sI.f78207o.d(c9914xI.a());
                if (interfaceC6694EhD != null) {
                    if (c9379sI.f78203k.f0() != null) {
                        c9379sI.S("Google", true);
                    }
                    interfaceC6694EhD.h3((InterfaceC9198qh) c9379sI.f78212t.zzb());
                    return;
                }
                return;
            }
            if (iP == 6) {
                InterfaceC6932Lh interfaceC6932LhF = c9379sI.f78207o.f();
                if (interfaceC6932LhF != null) {
                    c9379sI.K("Google", true);
                    interfaceC6932LhF.m3((InterfaceC7203Th) c9379sI.f78210r.zzb());
                    return;
                }
                return;
            }
            if (iP != 7) {
                Qc.p.d("Wrong native template id!");
                return;
            }
            InterfaceC7922ek interfaceC7922ekG = c9379sI.f78207o.g();
            if (interfaceC7922ekG != null) {
                interfaceC7922ekG.y1((InterfaceC7371Yj) c9379sI.f78211s.zzb());
            }
        } catch (RemoteException e10) {
            Qc.p.e("RemoteException when notifyAdLoad is called", e10);
        }
    }

    public final boolean C() {
        return this.f78206n.e();
    }

    public final boolean F() {
        return this.f78206n.d();
    }

    public final C7789dT S(String str, boolean z10) {
        String str2;
        EnumC7469aT enumC7469aT;
        ZS zs2;
        if (this.f78206n.d() && !TextUtils.isEmpty(str)) {
            C9914xI c9914xI = this.f78203k;
            InterfaceC9008ot interfaceC9008otE0 = c9914xI.e0();
            InterfaceC9008ot interfaceC9008otF0 = c9914xI.f0();
            if (interfaceC9008otE0 == null && interfaceC9008otF0 == null) {
                Qc.p.g("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z11 = false;
            boolean z12 = interfaceC9008otE0 != null;
            boolean z13 = interfaceC9008otF0 != null;
            if (((Boolean) Mc.A.c().a(C8659lf.f76381j5)).booleanValue()) {
                this.f78206n.a();
                int iC = this.f78206n.a().c();
                int i10 = iC - 1;
                if (i10 != 0) {
                    if (i10 != 1) {
                        Qc.p.g("Unknown omid media type: " + (iC != 1 ? iC != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return null;
                    }
                    if (interfaceC9008otE0 == null) {
                        Qc.p.g("Omid media type was display but there was no display webview.");
                        return null;
                    }
                    z13 = false;
                    z11 = true;
                } else {
                    if (interfaceC9008otF0 == null) {
                        Qc.p.g("Omid media type was video but there was no video webview.");
                        return null;
                    }
                    z13 = true;
                }
            } else {
                z11 = z12;
            }
            if (z11) {
                str2 = null;
            } else {
                str2 = "javascript";
                interfaceC9008otE0 = interfaceC9008otF0;
            }
            if (interfaceC9008otE0 != null) {
                if (!Lc.v.b().b(this.f78197B)) {
                    Qc.p.g("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                Qc.a aVar = this.f78196A;
                String str3 = aVar.f29930b + "." + aVar.f29931c;
                if (z13) {
                    zs2 = ZS.VIDEO;
                    enumC7469aT = EnumC7469aT.DEFINED_BY_JAVASCRIPT;
                } else {
                    C9914xI c9914xI2 = this.f78203k;
                    ZS zs3 = ZS.NATIVE_DISPLAY;
                    enumC7469aT = c9914xI2.P() == 3 ? EnumC7469aT.UNSPECIFIED : EnumC7469aT.ONE_PIXEL;
                    zs2 = zs3;
                }
                C7789dT c7789dTC = Lc.v.b().c(str3, interfaceC9008otE0.zzG(), "", "javascript", str2, str, enumC7469aT, zs2, this.f65378b.f72044l0);
                if (c7789dTC == null) {
                    Qc.p.g("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                this.f78203k.w(c7789dTC);
                interfaceC9008otE0.t0(c7789dTC);
                if (z13) {
                    AbstractC6749Ga0 abstractC6749Ga0A = c7789dTC.a();
                    if (interfaceC9008otF0 != null) {
                        Lc.v.b().h(abstractC6749Ga0A, interfaceC9008otF0.zzF());
                    }
                    this.f78216x = true;
                }
                if (z10) {
                    Lc.v.b().a(c7789dTC.a());
                    interfaceC9008otE0.L("onSdkLoaded", new C5503a());
                }
                return c7789dTC;
            }
            Qc.p.g("Webview is null in InternalNativeAd");
        }
        return null;
    }

    public final String T() {
        return this.f78206n.b();
    }

    public final void Z(View view) {
        C7789dT c7789dTH0 = this.f78203k.h0();
        if (!this.f78206n.d() || c7789dTH0 == null || view == null) {
            return;
        }
        Lc.v.b().i(c7789dTH0.a(), view);
    }

    @Override // com.google.android.gms.internal.ads.C6577Az
    public final void b() {
        this.f78202j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.iI
            @Override // java.lang.Runnable
            public final void run() {
                C9379sI.X(this.f74942a);
            }
        });
        if (this.f78203k.P() != 7) {
            Executor executor = this.f78202j;
            final FI fi2 = this.f78204l;
            Objects.requireNonNull(fi2);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jI
                @Override // java.lang.Runnable
                public final void run() {
                    fi2.zzq();
                }
            });
        }
        super.b();
    }

    final /* synthetic */ void b0() {
        this.f78204l.zzj();
        this.f78203k.i();
    }

    final /* synthetic */ void c0(View view, boolean z10, int i10) {
        InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ = this.f78213u;
        if (interfaceViewOnClickListenerC9915xJ == null) {
            Qc.p.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        } else {
            this.f78204l.E(view, interfaceViewOnClickListenerC9915xJ.zzf(), this.f78213u.zzl(), this.f78213u.zzm(), z10, J(), i10);
        }
    }

    final /* synthetic */ void d0(boolean z10) {
        InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ = this.f78213u;
        if (interfaceViewOnClickListenerC9915xJ == null) {
            Qc.p.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f78204l.E(null, interfaceViewOnClickListenerC9915xJ.zzf(), this.f78213u.zzl(), this.f78213u.zzm(), z10, J(), 0);
        }
    }

    public final void q(Bundle bundle) throws JSONException {
        final InterfaceC9008ot interfaceC9008otF0 = this.f78203k.f0();
        if (interfaceC9008otF0 == null) {
            Qc.p.d("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.f78202j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kI
                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = C9379sI.f78195G;
                    interfaceC9008otF0.j("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e10) {
            Qc.p.e("Error reading event signals", e10);
        }
    }

    public final void s(View view) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76409l5)).booleanValue()) {
            C9914xI c9914xI = this.f78203k;
            if (c9914xI.P() != 3) {
                C7145Rq c7145RqC0 = c9914xI.c0();
                if (c7145RqC0 == null) {
                    return;
                }
                Mj0.r(c7145RqC0, new C9166qI(this, view), this.f78202j);
                return;
            }
        }
        M(view, this.f78203k.h0());
    }
}
