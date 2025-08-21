package com.google.android.gms.internal.ads;

import Z.C5603a;
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
public final class C9504sI extends C6702Az {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f79035G = 0;

    /* renamed from: A, reason: collision with root package name */
    private final Sc.a f79036A;

    /* renamed from: B, reason: collision with root package name */
    private final Context f79037B;

    /* renamed from: C, reason: collision with root package name */
    private final C9718uI f79038C;

    /* renamed from: D, reason: collision with root package name */
    private final C8345hX f79039D;

    /* renamed from: E, reason: collision with root package name */
    private final Map f79040E;

    /* renamed from: F, reason: collision with root package name */
    private final List f79041F;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f79042j;

    /* renamed from: k, reason: collision with root package name */
    private final C10039xI f79043k;

    /* renamed from: l, reason: collision with root package name */
    private final FI f79044l;

    /* renamed from: m, reason: collision with root package name */
    private final YI f79045m;

    /* renamed from: n, reason: collision with root package name */
    private final CI f79046n;

    /* renamed from: o, reason: collision with root package name */
    private final II f79047o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC7863cy0 f79048p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC7863cy0 f79049q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC7863cy0 f79050r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC7863cy0 f79051s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC7863cy0 f79052t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceViewOnClickListenerC10040xJ f79053u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f79054v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f79055w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f79056x;

    /* renamed from: y, reason: collision with root package name */
    private final C7303Sp f79057y;

    /* renamed from: z, reason: collision with root package name */
    private final M9 f79058z;

    public C9504sI(C10321zz c10321zz, Executor executor, C10039xI c10039xI, FI fi2, YI yi2, CI ci2, II ii2, InterfaceC7863cy0 interfaceC7863cy0, InterfaceC7863cy0 interfaceC7863cy02, InterfaceC7863cy0 interfaceC7863cy03, InterfaceC7863cy0 interfaceC7863cy04, InterfaceC7863cy0 interfaceC7863cy05, C7303Sp c7303Sp, M9 m92, Sc.a aVar, Context context, C9718uI c9718uI, C8345hX c8345hX, C10166yb c10166yb) {
        super(c10321zz);
        this.f79042j = executor;
        this.f79043k = c10039xI;
        this.f79044l = fi2;
        this.f79045m = yi2;
        this.f79046n = ci2;
        this.f79047o = ii2;
        this.f79048p = interfaceC7863cy0;
        this.f79049q = interfaceC7863cy02;
        this.f79050r = interfaceC7863cy03;
        this.f79051s = interfaceC7863cy04;
        this.f79052t = interfaceC7863cy05;
        this.f79057y = c7303Sp;
        this.f79058z = m92;
        this.f79036A = aVar;
        this.f79037B = context;
        this.f79038C = c9718uI;
        this.f79039D = c8345hX;
        this.f79040E = new HashMap();
        this.f79041F = new ArrayList();
    }

    private final synchronized ImageView.ScaleType J() {
        InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ = this.f79053u;
        if (interfaceViewOnClickListenerC10040xJ == null) {
            Sc.p.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        com.google.android.gms.dynamic.b bVarZzj = interfaceViewOnClickListenerC10040xJ.zzj();
        if (bVarZzj != null) {
            return (ImageView.ScaleType) com.google.android.gms.dynamic.d.c2(bVarZzj);
        }
        return YI.f72363k;
    }

    private final synchronized void L(View view, Map map, Map map2) {
        this.f79045m.d(this.f79053u);
        this.f79044l.y(view, map, map2, J());
        this.f79055w = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final synchronized void e0(InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ) {
        Iterator<String> itKeys;
        View view;
        G9 g9C;
        try {
            if (!this.f79054v) {
                this.f79053u = interfaceViewOnClickListenerC10040xJ;
                this.f79045m.e(interfaceViewOnClickListenerC10040xJ);
                this.f79044l.J(interfaceViewOnClickListenerC10040xJ.zzf(), interfaceViewOnClickListenerC10040xJ.zzm(), interfaceViewOnClickListenerC10040xJ.zzn(), interfaceViewOnClickListenerC10040xJ, interfaceViewOnClickListenerC10040xJ);
                if (((Boolean) Oc.A.c().a(C8784lf.f76869K2)).booleanValue() && (g9C = this.f79058z.c()) != null) {
                    g9C.a(interfaceViewOnClickListenerC10040xJ.zzf());
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f76980S1)).booleanValue()) {
                    Z50 z50 = this.f66218b;
                    if (z50.f72882k0 && (itKeys = z50.f72880j0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ2 = this.f79053u;
                            WeakReference weakReference = interfaceViewOnClickListenerC10040xJ2 == null ? null : (WeakReference) interfaceViewOnClickListenerC10040xJ2.zzl().get(next);
                            this.f79040E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC10059xb viewOnAttachStateChangeListenerC10059xb = new ViewOnAttachStateChangeListenerC10059xb(this.f79037B, view);
                                this.f79041F.add(viewOnAttachStateChangeListenerC10059xb);
                                viewOnAttachStateChangeListenerC10059xb.c(new C9077oI(this, next));
                            }
                        }
                    }
                }
                if (interfaceViewOnClickListenerC10040xJ.zzi() != null) {
                    interfaceViewOnClickListenerC10040xJ.zzi().c(this.f79057y);
                }
            }
        } finally {
        }
    }

    public final synchronized void A(final InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76952Q1)).booleanValue()) {
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75133a.e0(interfaceViewOnClickListenerC10040xJ);
                }
            });
        } else {
            e0(interfaceViewOnClickListenerC10040xJ);
        }
    }

    public final synchronized void B(final InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76952Q1)).booleanValue()) {
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75549a.i(interfaceViewOnClickListenerC10040xJ);
                }
            });
        } else {
            i(interfaceViewOnClickListenerC10040xJ);
        }
    }

    public final synchronized boolean D() {
        return this.f79044l.r();
    }

    public final synchronized boolean E() {
        return this.f79044l.x();
    }

    public final synchronized boolean H(Bundle bundle) {
        if (this.f79055w) {
            return true;
        }
        boolean zI = this.f79044l.I(bundle);
        this.f79055w = zI;
        return zI;
    }

    public final synchronized int I() {
        return this.f79044l.zza();
    }

    public final C9718uI P() {
        return this.f79038C;
    }

    public final synchronized JSONObject V(View view, Map map, Map map2) {
        return this.f79044l.L(view, map, map2, J());
    }

    public final synchronized JSONObject W(View view, Map map, Map map2) {
        return this.f79044l.N(view, map, map2, J());
    }

    @Override // com.google.android.gms.internal.ads.C6702Az
    public final synchronized void a() {
        this.f79054v = true;
        this.f79042j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mI
            @Override // java.lang.Runnable
            public final void run() {
                this.f77614a.b0();
            }
        });
        super.a();
    }

    public final synchronized void a0() {
        this.f79044l.zzi();
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
            boolean r0 = r3.f79055w     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L7
            goto L89
        L7:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f76980S1     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.Z50 r0 = r3.f66218b     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.f72882k0     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            java.util.Map r0 = r3.f79040E     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L44
            java.util.Map r2 = r3.f79040E     // Catch: java.lang.Throwable -> L44
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
            com.google.android.gms.internal.ads.bf r7 = com.google.android.gms.internal.ads.C8784lf.f77052X3     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.jf r0 = Oc.A.c()     // Catch: java.lang.Throwable -> L44
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9504sI.j(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void k(Oc.D0 d02) {
        this.f79044l.G(d02);
    }

    public final synchronized void l(View view, View view2, Map map, Map map2, boolean z10) {
        InterfaceC9133ot interfaceC9133otF0;
        this.f79045m.c(this.f79053u);
        this.f79044l.z(view, view2, map, map2, z10, J());
        if (this.f79056x) {
            C10039xI c10039xI = this.f79043k;
            if (c10039xI.f0() != null && (interfaceC9133otF0 = c10039xI.f0()) != null) {
                interfaceC9133otF0.L("onSdkAdUserInteractionClick", new C5603a());
            }
        }
    }

    public final synchronized void m(final View view, final int i10) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77367tb)).booleanValue()) {
            InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ = this.f79053u;
            if (interfaceViewOnClickListenerC10040xJ == null) {
                Sc.p.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z10 = interfaceViewOnClickListenerC10040xJ instanceof RI;
                this.f79042j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.lI
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f76620a.c0(view, z10, i10);
                    }
                });
            }
        }
    }

    public final synchronized void n(String str) {
        this.f79044l.B(str);
    }

    public final synchronized void o(Bundle bundle) {
        this.f79044l.A(bundle);
    }

    public final synchronized void p() {
        InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ = this.f79053u;
        if (interfaceViewOnClickListenerC10040xJ == null) {
            Sc.p.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z10 = interfaceViewOnClickListenerC10040xJ instanceof RI;
            this.f79042j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77871a.d0(z10);
                }
            });
        }
    }

    public final synchronized void r() {
        if (this.f79055w) {
            return;
        }
        this.f79044l.zzs();
    }

    public final synchronized void t(View view, MotionEvent motionEvent, View view2) {
        this.f79044l.D(view, motionEvent, view2);
    }

    public final synchronized void u(Bundle bundle) {
        this.f79044l.K(bundle);
    }

    public final synchronized void v(View view) {
        this.f79044l.H(view);
    }

    public final synchronized void w() {
        this.f79044l.zzw();
    }

    public final synchronized void x(Oc.A0 a02) {
        this.f79044l.M(a02);
    }

    public final synchronized void y(Oc.N0 n02) {
        this.f79039D.a(n02);
    }

    public final synchronized void z(InterfaceC7226Qh interfaceC7226Qh) {
        this.f79044l.F(interfaceC7226Qh);
    }

    static {
        AbstractC8042eh0.z("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public static boolean G(View view) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77422xa)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        Nc.v.t();
        long jC0 = Rc.D0.c0(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jC0 >= ((Integer) Oc.A.c().a(C8784lf.f77436ya)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final void K(String str, boolean z10) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77249l5)).booleanValue()) {
            S("Google", true);
            return;
        }
        com.google.common.util.concurrent.q qVarJ0 = this.f79043k.j0();
        if (qVarJ0 == null) {
            return;
        }
        Mj0.r(qVarJ0, new C9184pI(this, "Google", true), this.f79042j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(View view, C7914dT c7914dT) {
        InterfaceC9133ot interfaceC9133otE0 = this.f79043k.e0();
        if (!this.f79046n.d() || c7914dT == null || interfaceC9133otE0 == null || view == null) {
            return;
        }
        Nc.v.b().h(c7914dT.a(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void i(InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ) {
        this.f79044l.C(interfaceViewOnClickListenerC10040xJ.zzf(), interfaceViewOnClickListenerC10040xJ.zzl());
        if (interfaceViewOnClickListenerC10040xJ.zzh() != null) {
            interfaceViewOnClickListenerC10040xJ.zzh().setClickable(false);
            interfaceViewOnClickListenerC10040xJ.zzh().removeAllViews();
        }
        if (interfaceViewOnClickListenerC10040xJ.zzi() != null) {
            interfaceViewOnClickListenerC10040xJ.zzi().e(this.f79057y);
        }
        this.f79053u = null;
    }

    public static /* synthetic */ void X(C9504sI c9504sI) {
        try {
            C10039xI c10039xI = c9504sI.f79043k;
            int iP = c10039xI.P();
            if (iP == 1) {
                InterfaceC10071xh interfaceC10071xhB = c9504sI.f79047o.b();
                if (interfaceC10071xhB != null) {
                    c9504sI.K("Google", true);
                    interfaceC10071xhB.a5((InterfaceC9002nh) c9504sI.f79048p.zzb());
                    return;
                }
                return;
            }
            if (iP == 2) {
                InterfaceC9750uh interfaceC9750uhA = c9504sI.f79047o.a();
                if (interfaceC9750uhA != null) {
                    c9504sI.K("Google", true);
                    interfaceC9750uhA.a6((InterfaceC8788lh) c9504sI.f79049q.zzb());
                    return;
                }
                return;
            }
            if (iP == 3) {
                InterfaceC6819Eh interfaceC6819EhD = c9504sI.f79047o.d(c10039xI.a());
                if (interfaceC6819EhD != null) {
                    if (c9504sI.f79043k.f0() != null) {
                        c9504sI.S("Google", true);
                    }
                    interfaceC6819EhD.p3((InterfaceC9323qh) c9504sI.f79052t.zzb());
                    return;
                }
                return;
            }
            if (iP == 6) {
                InterfaceC7057Lh interfaceC7057LhF = c9504sI.f79047o.f();
                if (interfaceC7057LhF != null) {
                    c9504sI.K("Google", true);
                    interfaceC7057LhF.u3((InterfaceC7328Th) c9504sI.f79050r.zzb());
                    return;
                }
                return;
            }
            if (iP != 7) {
                Sc.p.d("Wrong native template id!");
                return;
            }
            InterfaceC8047ek interfaceC8047ekG = c9504sI.f79047o.g();
            if (interfaceC8047ekG != null) {
                interfaceC8047ekG.I1((InterfaceC7496Yj) c9504sI.f79051s.zzb());
            }
        } catch (RemoteException e10) {
            Sc.p.e("RemoteException when notifyAdLoad is called", e10);
        }
    }

    public final boolean C() {
        return this.f79046n.e();
    }

    public final boolean F() {
        return this.f79046n.d();
    }

    public final C7914dT S(String str, boolean z10) {
        String str2;
        EnumC7594aT enumC7594aT;
        ZS zs2;
        if (this.f79046n.d() && !TextUtils.isEmpty(str)) {
            C10039xI c10039xI = this.f79043k;
            InterfaceC9133ot interfaceC9133otE0 = c10039xI.e0();
            InterfaceC9133ot interfaceC9133otF0 = c10039xI.f0();
            if (interfaceC9133otE0 == null && interfaceC9133otF0 == null) {
                Sc.p.g("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            boolean z11 = false;
            boolean z12 = interfaceC9133otE0 != null;
            boolean z13 = interfaceC9133otF0 != null;
            if (((Boolean) Oc.A.c().a(C8784lf.f77221j5)).booleanValue()) {
                this.f79046n.a();
                int iC = this.f79046n.a().c();
                int i10 = iC - 1;
                if (i10 != 0) {
                    if (i10 != 1) {
                        Sc.p.g("Unknown omid media type: " + (iC != 1 ? iC != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                        return null;
                    }
                    if (interfaceC9133otE0 == null) {
                        Sc.p.g("Omid media type was display but there was no display webview.");
                        return null;
                    }
                    z13 = false;
                    z11 = true;
                } else {
                    if (interfaceC9133otF0 == null) {
                        Sc.p.g("Omid media type was video but there was no video webview.");
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
                interfaceC9133otE0 = interfaceC9133otF0;
            }
            if (interfaceC9133otE0 != null) {
                if (!Nc.v.b().c(this.f79037B)) {
                    Sc.p.g("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                Sc.a aVar = this.f79036A;
                String str3 = aVar.f34480b + "." + aVar.f34481c;
                if (z13) {
                    zs2 = ZS.VIDEO;
                    enumC7594aT = EnumC7594aT.DEFINED_BY_JAVASCRIPT;
                } else {
                    C10039xI c10039xI2 = this.f79043k;
                    ZS zs3 = ZS.NATIVE_DISPLAY;
                    enumC7594aT = c10039xI2.P() == 3 ? EnumC7594aT.UNSPECIFIED : EnumC7594aT.ONE_PIXEL;
                    zs2 = zs3;
                }
                C7914dT c7914dTD = Nc.v.b().d(str3, interfaceC9133otE0.zzG(), "", "javascript", str2, str, enumC7594aT, zs2, this.f66218b.f72884l0);
                if (c7914dTD == null) {
                    Sc.p.g("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                this.f79043k.w(c7914dTD);
                interfaceC9133otE0.r0(c7914dTD);
                if (z13) {
                    AbstractC6874Ga0 abstractC6874Ga0A = c7914dTD.a();
                    if (interfaceC9133otF0 != null) {
                        Nc.v.b().h(abstractC6874Ga0A, interfaceC9133otF0.zzF());
                    }
                    this.f79056x = true;
                }
                if (z10) {
                    Nc.v.b().b(c7914dTD.a());
                    interfaceC9133otE0.L("onSdkLoaded", new C5603a());
                }
                return c7914dTD;
            }
            Sc.p.g("Webview is null in InternalNativeAd");
        }
        return null;
    }

    public final String T() {
        return this.f79046n.b();
    }

    public final void Z(View view) {
        C7914dT c7914dTH0 = this.f79043k.h0();
        if (!this.f79046n.d() || c7914dTH0 == null || view == null) {
            return;
        }
        Nc.v.b().i(c7914dTH0.a(), view);
    }

    @Override // com.google.android.gms.internal.ads.C6702Az
    public final void b() {
        this.f79042j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.iI
            @Override // java.lang.Runnable
            public final void run() {
                C9504sI.X(this.f75782a);
            }
        });
        if (this.f79043k.P() != 7) {
            Executor executor = this.f79042j;
            final FI fi2 = this.f79044l;
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
        this.f79044l.zzj();
        this.f79043k.i();
    }

    final /* synthetic */ void c0(View view, boolean z10, int i10) {
        InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ = this.f79053u;
        if (interfaceViewOnClickListenerC10040xJ == null) {
            Sc.p.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        } else {
            this.f79044l.E(view, interfaceViewOnClickListenerC10040xJ.zzf(), this.f79053u.zzl(), this.f79053u.zzm(), z10, J(), i10);
        }
    }

    final /* synthetic */ void d0(boolean z10) {
        InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ = this.f79053u;
        if (interfaceViewOnClickListenerC10040xJ == null) {
            Sc.p.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f79044l.E(null, interfaceViewOnClickListenerC10040xJ.zzf(), this.f79053u.zzl(), this.f79053u.zzm(), z10, J(), 0);
        }
    }

    public final void q(Bundle bundle) throws JSONException {
        final InterfaceC9133ot interfaceC9133otF0 = this.f79043k.f0();
        if (interfaceC9133otF0 == null) {
            Sc.p.d("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.f79042j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kI
                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = C9504sI.f79035G;
                    interfaceC9133otF0.j("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e10) {
            Sc.p.e("Error reading event signals", e10);
        }
    }

    public final void s(View view) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77249l5)).booleanValue()) {
            C10039xI c10039xI = this.f79043k;
            if (c10039xI.P() != 3) {
                C7270Rq c7270RqC0 = c10039xI.c0();
                if (c7270RqC0 == null) {
                    return;
                }
                Mj0.r(c7270RqC0, new C9291qI(this, view), this.f79042j);
                return;
            }
        }
        M(view, this.f79043k.h0());
    }
}
