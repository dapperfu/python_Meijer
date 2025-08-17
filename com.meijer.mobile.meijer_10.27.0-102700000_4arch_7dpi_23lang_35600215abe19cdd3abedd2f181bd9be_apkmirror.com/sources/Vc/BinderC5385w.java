package Vc;

import Mc.Y1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractBinderC8255hq;
import com.google.android.gms.internal.ads.AbstractC7593bf;
import com.google.android.gms.internal.ads.AbstractC9010ou;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C6972Mn;
import com.google.android.gms.internal.ads.C7097Qf;
import com.google.android.gms.internal.ads.C7267Vf0;
import com.google.android.gms.internal.ads.C8021fg;
import com.google.android.gms.internal.ads.C8315iL;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C8788mq;
import com.google.android.gms.internal.ads.C9302rg;
import com.google.android.gms.internal.ads.C9998y60;
import com.google.android.gms.internal.ads.CN;
import com.google.android.gms.internal.ads.Cj0;
import com.google.android.gms.internal.ads.InterfaceC6837In;
import com.google.android.gms.internal.ads.InterfaceC9309rj0;
import com.google.android.gms.internal.ads.InterfaceC9408sf0;
import com.google.android.gms.internal.ads.InterfaceC9416sj0;
import com.google.android.gms.internal.ads.M9;
import com.google.android.gms.internal.ads.Mj0;
import com.google.android.gms.internal.ads.R90;
import com.google.android.gms.internal.ads.T60;
import com.google.android.gms.internal.ads.W80;
import com.google.android.gms.internal.ads.Xj0;
import com.google.android.gms.internal.ads.Z80;
import com.google.android.gms.internal.ads.zzavb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: Vc.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class BinderC5385w extends AbstractBinderC8255hq {

    /* renamed from: G, reason: collision with root package name */
    protected static final List f37325G = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: H, reason: collision with root package name */
    protected static final List f37326H = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: I, reason: collision with root package name */
    protected static final List f37327I = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: J, reason: collision with root package name */
    protected static final List f37328J = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: D, reason: collision with root package name */
    private final C7097Qf f37332D;

    /* renamed from: E, reason: collision with root package name */
    private final l0 f37333E;

    /* renamed from: F, reason: collision with root package name */
    private final c0 f37334F;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9010ou f37335a;

    /* renamed from: b, reason: collision with root package name */
    private Context f37336b;

    /* renamed from: c, reason: collision with root package name */
    private final M9 f37337c;

    /* renamed from: d, reason: collision with root package name */
    private final C9998y60 f37338d;

    /* renamed from: e, reason: collision with root package name */
    private final T60 f37339e;

    /* renamed from: f, reason: collision with root package name */
    private final Xj0 f37340f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f37341g;

    /* renamed from: h, reason: collision with root package name */
    private C6972Mn f37342h;

    /* renamed from: k, reason: collision with root package name */
    private final CN f37345k;

    /* renamed from: l, reason: collision with root package name */
    private final R90 f37346l;

    /* renamed from: t, reason: collision with root package name */
    private final Qc.a f37354t;

    /* renamed from: u, reason: collision with root package name */
    private String f37355u;

    /* renamed from: w, reason: collision with root package name */
    private final List f37357w;

    /* renamed from: x, reason: collision with root package name */
    private final List f37358x;

    /* renamed from: y, reason: collision with root package name */
    private final List f37359y;

    /* renamed from: z, reason: collision with root package name */
    private final List f37360z;

    /* renamed from: i, reason: collision with root package name */
    private Point f37343i = new Point();

    /* renamed from: j, reason: collision with root package name */
    private Point f37344j = new Point();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicInteger f37353s = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    private final AtomicBoolean f37329A = new AtomicBoolean(false);

    /* renamed from: B, reason: collision with root package name */
    private final AtomicBoolean f37330B = new AtomicBoolean(false);

    /* renamed from: C, reason: collision with root package name */
    private final AtomicInteger f37331C = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    private final boolean f37347m = ((Boolean) Mc.A.c().a(C8659lf.f76257a7)).booleanValue();

    /* renamed from: n, reason: collision with root package name */
    private final boolean f37348n = ((Boolean) Mc.A.c().a(C8659lf.f76243Z6)).booleanValue();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f37349o = ((Boolean) Mc.A.c().a(C8659lf.f76285c7)).booleanValue();

    /* renamed from: p, reason: collision with root package name */
    private final boolean f37350p = ((Boolean) Mc.A.c().a(C8659lf.f76313e7)).booleanValue();

    /* renamed from: q, reason: collision with root package name */
    private final String f37351q = (String) Mc.A.c().a(C8659lf.f76299d7);

    /* renamed from: r, reason: collision with root package name */
    private final String f37352r = (String) Mc.A.c().a(C8659lf.f76327f7);

    /* renamed from: v, reason: collision with root package name */
    private final String f37356v = (String) Mc.A.c().a(C8659lf.f76341g7);

    private final com.google.common.util.concurrent.q U9(final String str) {
        final C8315iL[] c8315iLArr = new C8315iL[1];
        com.google.common.util.concurrent.q qVarN = Mj0.n(this.f37339e.a(), new InterfaceC9416sj0() { // from class: Vc.h
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f37240a.ma(c8315iLArr, str, (C8315iL) obj);
            }
        }, this.f37340f);
        qVarN.addListener(new Runnable() { // from class: Vc.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f37246a.L9(c8315iLArr);
            }
        }, this.f37340f);
        return (Cj0) Mj0.e((Cj0) Mj0.m((Cj0) Mj0.o(Cj0.D(qVarN), ((Integer) Mc.A.c().a(C8659lf.f76593y7)).intValue(), TimeUnit.MILLISECONDS, this.f37341g), new InterfaceC9408sf0() { // from class: Vc.o
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                List list = BinderC5385w.f37325G;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f37340f), Exception.class, new InterfaceC9408sf0() { // from class: Vc.p
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                List list = BinderC5385w.f37325G;
                Qc.p.e("", (Exception) obj);
                return null;
            }
        }, this.f37340f);
    }

    final /* synthetic */ void L9(C8315iL[] c8315iLArr) {
        C8315iL c8315iL = c8315iLArr[0];
        if (c8315iL != null) {
            this.f37339e.b(Mj0.h(c8315iL));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    public final void M6(List list, com.google.android.gms.dynamic.b bVar, InterfaceC6837In interfaceC6837In) {
        X9(list, bVar, interfaceC6837In, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    public final void Q8(List list, com.google.android.gms.dynamic.b bVar, InterfaceC6837In interfaceC6837In) {
        X9(list, bVar, interfaceC6837In, false);
    }

    final /* synthetic */ com.google.common.util.concurrent.q ma(C8315iL[] c8315iLArr, String str, C8315iL c8315iL) throws Exception {
        c8315iLArr[0] = c8315iL;
        Context context = this.f37336b;
        C6972Mn c6972Mn = this.f37342h;
        Map map = c6972Mn.f68711b;
        JSONObject jSONObjectD = Pc.X.d(context, map, map, c6972Mn.f68710a, null);
        JSONObject jSONObjectG = Pc.X.g(this.f37336b, this.f37342h.f68710a);
        JSONObject jSONObjectF = Pc.X.f(this.f37342h.f68710a);
        JSONObject jSONObjectE = Pc.X.e(this.f37336b, this.f37342h.f68710a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectD);
        jSONObject.put("ad_view_signal", jSONObjectG);
        jSONObject.put("scroll_view_signal", jSONObjectF);
        jSONObject.put("lock_screen_signal", jSONObjectE);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", Pc.X.c(null, this.f37336b, this.f37344j, this.f37343i));
        }
        return c8315iL.g(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    public final void q9(List list, com.google.android.gms.dynamic.b bVar, InterfaceC6837In interfaceC6837In) {
        Y9(list, bVar, interfaceC6837In, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    public final void v7(List list, com.google.android.gms.dynamic.b bVar, InterfaceC6837In interfaceC6837In) {
        Y9(list, bVar, interfaceC6837In, true);
    }

    private final boolean G() {
        Map map;
        C6972Mn c6972Mn = this.f37342h;
        return (c6972Mn == null || (map = c6972Mn.f68711b) == null || map.isEmpty()) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final Vc.AbstractC5368e T9(android.content.Context r11, java.lang.String r12, java.lang.String r13, Mc.d2 r14, Mc.Y1 r15, int r16, java.lang.String r17, android.os.Bundle r18, com.google.android.gms.internal.ads.C8788mq r19) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Vc.BinderC5385w.T9(android.content.Context, java.lang.String, java.lang.String, Mc.d2, Mc.Y1, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.mq):Vc.e");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V9() {
        BinderC5385w binderC5385w;
        com.google.common.util.concurrent.q qVarB;
        if (((Boolean) C9302rg.f78051c.e()).booleanValue()) {
            this.f37333E.b();
            return;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76205Wa)).booleanValue()) {
            qVarB = Mj0.k(new InterfaceC9309rj0() { // from class: Vc.f
                @Override // com.google.android.gms.internal.ads.InterfaceC9309rj0
                public final com.google.common.util.concurrent.q zza() {
                    return this.f37232a.la();
                }
            }, C6908Kq.f68174a);
            binderC5385w = this;
        } else {
            binderC5385w = this;
            qVarB = binderC5385w.T9(this.f37336b, null, Ec.b.BANNER.name(), null, null, 0, null, new Bundle(), null).b();
        }
        Mj0.r(qVarB, new C5384v(this), binderC5385w.f37335a.d());
    }

    private final void W9() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76553v9)).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76595y9)).booleanValue()) {
                return;
            }
            if (((Boolean) Mc.A.c().a(C8659lf.f75924C9)).booleanValue() && this.f37329A.getAndSet(true)) {
                return;
            }
            V9();
        }
    }

    private final void X9(List list, final com.google.android.gms.dynamic.b bVar, InterfaceC6837In interfaceC6837In, boolean z10) {
        com.google.common.util.concurrent.q qVarI0;
        if (!((Boolean) Mc.A.c().a(C8659lf.f76579x7)).booleanValue()) {
            Qc.p.g("The updating URL feature is not enabled.");
            try {
                interfaceC6837In.a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                Qc.p.e("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (Q9((Uri) it.next())) {
                i10++;
            }
        }
        if (i10 > 1) {
            Qc.p.g("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (Q9(uri)) {
                qVarI0 = this.f37340f.i0(new Callable() { // from class: Vc.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f37251a.ea(uri, bVar);
                    }
                });
                if (G()) {
                    qVarI0 = Mj0.n(qVarI0, new InterfaceC9416sj0() { // from class: Vc.k
                        @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                        public final com.google.common.util.concurrent.q zza(Object obj) {
                            BinderC5385w binderC5385w = this.f37256a;
                            return Mj0.m(binderC5385w.U9("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new InterfaceC9408sf0(binderC5385w, (Uri) obj) { // from class: Vc.l

                                /* renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ Uri f37260a;

                                @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                                public final Object apply(Object obj2) {
                                    return BinderC5385w.S9(this.f37260a, (String) obj2);
                                }

                                {
                                    this.f37260a = uri;
                                }
                            }, binderC5385w.f37340f);
                        }
                    }, this.f37340f);
                } else {
                    Qc.p.f("Asset view map is empty.");
                }
            } else {
                Qc.p.g("Not a Google URL: ".concat(String.valueOf(uri)));
                qVarI0 = Mj0.h(uri);
            }
            arrayList.add(qVarI0);
        }
        Mj0.r(Mj0.d(arrayList), new C5383u(this, interfaceC6837In, z10), this.f37335a.d());
    }

    private final void Y9(final List list, final com.google.android.gms.dynamic.b bVar, InterfaceC6837In interfaceC6837In, boolean z10) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76579x7)).booleanValue()) {
            try {
                interfaceC6837In.a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                Qc.p.e("", e10);
                return;
            }
        }
        com.google.common.util.concurrent.q qVarI0 = this.f37340f.i0(new Callable() { // from class: Vc.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37287a.E9(list, bVar);
            }
        });
        if (G()) {
            qVarI0 = Mj0.n(qVarI0, new InterfaceC9416sj0() { // from class: Vc.r
                @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return this.f37291a.na((ArrayList) obj);
                }
            }, this.f37340f);
        } else {
            Qc.p.f("Asset view map is empty.");
        }
        Mj0.r(qVarI0, new C5382t(this, interfaceC6837In, z10), this.f37335a.d());
    }

    private static final List ba(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!C7267Vf0.d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList D9(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!R9(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(aa(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList E9(List list, com.google.android.gms.dynamic.b bVar) throws Exception {
        String strZzh = this.f37337c.c() != null ? this.f37337c.c().zzh(this.f37336b, (View) com.google.android.gms.dynamic.d.b2(bVar), null) : "";
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (R9(uri)) {
                arrayList.add(aa(uri, "ms", strZzh));
            } else {
                Qc.p.g("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N4(com.google.android.gms.dynamic.b r11, final com.google.android.gms.internal.ads.C8788mq r12, com.google.android.gms.internal.ads.InterfaceC8041fq r13) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Vc.BinderC5385w.N4(com.google.android.gms.dynamic.b, com.google.android.gms.internal.ads.mq, com.google.android.gms.internal.ads.fq):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    public final void O(com.google.android.gms.dynamic.b bVar) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76579x7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) com.google.android.gms.dynamic.d.b2(bVar);
            C6972Mn c6972Mn = this.f37342h;
            this.f37343i = Pc.X.a(motionEvent, c6972Mn == null ? null : c6972Mn.f68710a);
            if (motionEvent.getAction() == 0) {
                this.f37344j = this.f37343i;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f37343i;
            motionEventObtain.setLocation(point.x, point.y);
            this.f37337c.d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    @SuppressLint({"AddJavascriptInterface"})
    public final void Q(com.google.android.gms.dynamic.b bVar) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76539u9)).booleanValue()) {
            AbstractC7593bf abstractC7593bf = C8659lf.f76453o7;
            if (!((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
                W9();
            }
            WebView webView = (WebView) com.google.android.gms.dynamic.d.b2(bVar);
            if (webView == null) {
                Qc.p.d("The webView cannot be null.");
                return;
            }
            final g0 g0Var = new g0(webView, this.f37334F, C6908Kq.f68179f);
            webView.addJavascriptInterface(new C5364a(webView, this.f37337c, this.f37345k, this.f37346l, this.f37338d, this.f37333E, this.f37334F, g0Var), "gmaSdk");
            if (((Boolean) Mc.A.c().a(C8659lf.f75952E9)).booleanValue()) {
                Lc.v.s().t();
            }
            if (((Boolean) C9302rg.f78049a.e()).booleanValue()) {
                this.f37334F.b();
                if (((Boolean) C9302rg.f78050b.e()).booleanValue()) {
                    C6908Kq.f68177d.scheduleWithFixedDelay(new Runnable() { // from class: Vc.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            g0Var.c();
                        }
                    }, 0L, ((Integer) Mc.A.c().a(C8659lf.f75966F9)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
                W9();
            }
        }
    }

    final boolean Q9(Uri uri) {
        return Z9(uri, this.f37357w, this.f37358x);
    }

    final boolean R9(Uri uri) {
        return Z9(uri, this.f37359y, this.f37360z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    public final com.google.android.gms.dynamic.b T2(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, String str, com.google.android.gms.dynamic.b bVar3) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76008I9)).booleanValue()) {
            return com.google.android.gms.dynamic.d.F2(null);
        }
        this.f37332D.g((Context) com.google.android.gms.dynamic.d.b2(bVar), (androidx.browser.customtabs.c) com.google.android.gms.dynamic.d.b2(bVar2), str, (androidx.browser.customtabs.b) com.google.android.gms.dynamic.d.b2(bVar3));
        if (((Boolean) C9302rg.f78051c.e()).booleanValue()) {
            this.f37333E.b();
        }
        if (((Boolean) C9302rg.f78049a.e()).booleanValue()) {
            this.f37334F.b();
        }
        return com.google.android.gms.dynamic.d.F2(this.f37332D.b());
    }

    final /* synthetic */ Uri ea(Uri uri, com.google.android.gms.dynamic.b bVar) throws Exception {
        C9998y60 c9998y60;
        try {
            uri = (!((Boolean) Mc.A.c().a(C8659lf.f76150Sb)).booleanValue() || (c9998y60 = this.f37338d) == null) ? this.f37337c.a(uri, this.f37336b, (View) com.google.android.gms.dynamic.d.b2(bVar), null) : c9998y60.a(uri, this.f37336b, (View) com.google.android.gms.dynamic.d.b2(bVar), null);
        } catch (zzavb e10) {
            Qc.p.h("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ AbstractC5368e ha(C8788mq c8788mq, int i10, Bundle bundle) throws Exception {
        return T9(this.f37336b, c8788mq.f76907a, c8788mq.f76908b, c8788mq.f76909c, c8788mq.f76910d, i10, c8788mq.f76912f, bundle, c8788mq);
    }

    final /* synthetic */ com.google.common.util.concurrent.q la() throws Exception {
        return T9(this.f37336b, null, Ec.b.BANNER.name(), null, null, 0, null, new Bundle(), null).b();
    }

    final /* synthetic */ com.google.common.util.concurrent.q na(final ArrayList arrayList) throws Exception {
        return Mj0.m(U9("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new InterfaceC9408sf0() { // from class: Vc.g
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return this.f37234a.D9(arrayList, (String) obj);
            }
        }, this.f37340f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    public final void w5(C6972Mn c6972Mn) {
        this.f37342h = c6972Mn;
        this.f37339e.c(1);
    }

    BinderC5385w(AbstractC9010ou abstractC9010ou, Context context, M9 m92, T60 t60, Xj0 xj0, ScheduledExecutorService scheduledExecutorService, CN cn2, R90 r90, Qc.a aVar, C7097Qf c7097Qf, C9998y60 c9998y60, l0 l0Var, c0 c0Var) {
        List listBa;
        this.f37335a = abstractC9010ou;
        this.f37336b = context;
        this.f37337c = m92;
        this.f37338d = c9998y60;
        this.f37339e = t60;
        this.f37340f = xj0;
        this.f37341g = scheduledExecutorService;
        this.f37345k = cn2;
        this.f37346l = r90;
        this.f37354t = aVar;
        this.f37332D = c7097Qf;
        this.f37333E = l0Var;
        this.f37334F = c0Var;
        if (((Boolean) Mc.A.c().a(C8659lf.f76355h7)).booleanValue()) {
            this.f37357w = ba((String) Mc.A.c().a(C8659lf.f76369i7));
            this.f37358x = ba((String) Mc.A.c().a(C8659lf.f76383j7));
            this.f37359y = ba((String) Mc.A.c().a(C8659lf.f76397k7));
            listBa = ba((String) Mc.A.c().a(C8659lf.f76411l7));
        } else {
            this.f37357w = f37325G;
            this.f37358x = f37326H;
            this.f37359y = f37327I;
            listBa = f37328J;
        }
        this.f37360z = listBa;
    }

    static /* bridge */ /* synthetic */ void J9(BinderC5385w binderC5385w, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (binderC5385w.Q9((Uri) it.next())) {
                binderC5385w.f37353s.getAndIncrement();
                return;
            }
        }
    }

    static final /* synthetic */ Uri S9(Uri uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            return aa(uri, "nas", str);
        }
        return uri;
    }

    private static boolean Z9(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri aa(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            return Uri.parse(string.substring(0, i10) + str + "=" + str2 + "&" + string.substring(i10));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    static /* bridge */ /* synthetic */ W80 ia(com.google.common.util.concurrent.q qVar, C8788mq c8788mq) {
        String str;
        if (!Z80.a() || !((Boolean) C8021fg.f74138e.e()).booleanValue()) {
            return null;
        }
        try {
            W80 w80A = ((AbstractC5368e) Mj0.p(qVar)).a();
            w80A.d(new ArrayList(Collections.singletonList(c8788mq.f76908b)));
            Y1 y12 = c8788mq.f76910d;
            if (y12 == null) {
                str = "";
            } else {
                str = y12.f19182p;
            }
            w80A.b(str);
            w80A.f(c8788mq.f76910d.f19179m);
            return w80A;
        } catch (ExecutionException e10) {
            Lc.v.s().x(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }
}
