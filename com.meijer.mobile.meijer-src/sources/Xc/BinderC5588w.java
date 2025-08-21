package Xc;

import Oc.Y1;
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
import com.google.android.gms.internal.ads.AbstractBinderC8380hq;
import com.google.android.gms.internal.ads.AbstractC7718bf;
import com.google.android.gms.internal.ads.AbstractC9135ou;
import com.google.android.gms.internal.ads.C10123y60;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C7097Mn;
import com.google.android.gms.internal.ads.C7222Qf;
import com.google.android.gms.internal.ads.C7392Vf0;
import com.google.android.gms.internal.ads.C8146fg;
import com.google.android.gms.internal.ads.C8440iL;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C8913mq;
import com.google.android.gms.internal.ads.C9427rg;
import com.google.android.gms.internal.ads.CN;
import com.google.android.gms.internal.ads.Cj0;
import com.google.android.gms.internal.ads.InterfaceC6962In;
import com.google.android.gms.internal.ads.InterfaceC9434rj0;
import com.google.android.gms.internal.ads.InterfaceC9533sf0;
import com.google.android.gms.internal.ads.InterfaceC9541sj0;
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

/* renamed from: Xc.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class BinderC5588w extends AbstractBinderC8380hq {

    /* renamed from: G, reason: collision with root package name */
    protected static final List f42037G = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: H, reason: collision with root package name */
    protected static final List f42038H = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: I, reason: collision with root package name */
    protected static final List f42039I = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: J, reason: collision with root package name */
    protected static final List f42040J = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: D, reason: collision with root package name */
    private final C7222Qf f42044D;

    /* renamed from: E, reason: collision with root package name */
    private final l0 f42045E;

    /* renamed from: F, reason: collision with root package name */
    private final c0 f42046F;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9135ou f42047a;

    /* renamed from: b, reason: collision with root package name */
    private Context f42048b;

    /* renamed from: c, reason: collision with root package name */
    private final M9 f42049c;

    /* renamed from: d, reason: collision with root package name */
    private final C10123y60 f42050d;

    /* renamed from: e, reason: collision with root package name */
    private final T60 f42051e;

    /* renamed from: f, reason: collision with root package name */
    private final Xj0 f42052f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f42053g;

    /* renamed from: h, reason: collision with root package name */
    private C7097Mn f42054h;

    /* renamed from: k, reason: collision with root package name */
    private final CN f42057k;

    /* renamed from: l, reason: collision with root package name */
    private final R90 f42058l;

    /* renamed from: t, reason: collision with root package name */
    private final Sc.a f42066t;

    /* renamed from: u, reason: collision with root package name */
    private String f42067u;

    /* renamed from: w, reason: collision with root package name */
    private final List f42069w;

    /* renamed from: x, reason: collision with root package name */
    private final List f42070x;

    /* renamed from: y, reason: collision with root package name */
    private final List f42071y;

    /* renamed from: z, reason: collision with root package name */
    private final List f42072z;

    /* renamed from: i, reason: collision with root package name */
    private Point f42055i = new Point();

    /* renamed from: j, reason: collision with root package name */
    private Point f42056j = new Point();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicInteger f42065s = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    private final AtomicBoolean f42041A = new AtomicBoolean(false);

    /* renamed from: B, reason: collision with root package name */
    private final AtomicBoolean f42042B = new AtomicBoolean(false);

    /* renamed from: C, reason: collision with root package name */
    private final AtomicInteger f42043C = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    private final boolean f42059m = ((Boolean) Oc.A.c().a(C8784lf.f77097a7)).booleanValue();

    /* renamed from: n, reason: collision with root package name */
    private final boolean f42060n = ((Boolean) Oc.A.c().a(C8784lf.f77083Z6)).booleanValue();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f42061o = ((Boolean) Oc.A.c().a(C8784lf.f77125c7)).booleanValue();

    /* renamed from: p, reason: collision with root package name */
    private final boolean f42062p = ((Boolean) Oc.A.c().a(C8784lf.f77153e7)).booleanValue();

    /* renamed from: q, reason: collision with root package name */
    private final String f42063q = (String) Oc.A.c().a(C8784lf.f77139d7);

    /* renamed from: r, reason: collision with root package name */
    private final String f42064r = (String) Oc.A.c().a(C8784lf.f77167f7);

    /* renamed from: v, reason: collision with root package name */
    private final String f42068v = (String) Oc.A.c().a(C8784lf.f77181g7);

    private final com.google.common.util.concurrent.q U9(final String str) {
        final C8440iL[] c8440iLArr = new C8440iL[1];
        com.google.common.util.concurrent.q qVarN = Mj0.n(this.f42051e.a(), new InterfaceC9541sj0() { // from class: Xc.h
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f41952a.ma(c8440iLArr, str, (C8440iL) obj);
            }
        }, this.f42052f);
        qVarN.addListener(new Runnable() { // from class: Xc.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f41958a.L9(c8440iLArr);
            }
        }, this.f42052f);
        return (Cj0) Mj0.e((Cj0) Mj0.m((Cj0) Mj0.o(Cj0.D(qVarN), ((Integer) Oc.A.c().a(C8784lf.f77433y7)).intValue(), TimeUnit.MILLISECONDS, this.f42053g), new InterfaceC9533sf0() { // from class: Xc.o
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                List list = BinderC5588w.f42037G;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f42052f), Exception.class, new InterfaceC9533sf0() { // from class: Xc.p
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                List list = BinderC5588w.f42037G;
                Sc.p.e("", (Exception) obj);
                return null;
            }
        }, this.f42052f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    public final void B7(List list, com.google.android.gms.dynamic.b bVar, InterfaceC6962In interfaceC6962In) {
        Y9(list, bVar, interfaceC6962In, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    public final void L8(List list, com.google.android.gms.dynamic.b bVar, InterfaceC6962In interfaceC6962In) {
        X9(list, bVar, interfaceC6962In, false);
    }

    final /* synthetic */ void L9(C8440iL[] c8440iLArr) {
        C8440iL c8440iL = c8440iLArr[0];
        if (c8440iL != null) {
            this.f42051e.b(Mj0.h(c8440iL));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    public final void Y6(List list, com.google.android.gms.dynamic.b bVar, InterfaceC6962In interfaceC6962In) {
        X9(list, bVar, interfaceC6962In, true);
    }

    final /* synthetic */ com.google.common.util.concurrent.q ma(C8440iL[] c8440iLArr, String str, C8440iL c8440iL) throws Exception {
        c8440iLArr[0] = c8440iL;
        Context context = this.f42048b;
        C7097Mn c7097Mn = this.f42054h;
        Map map = c7097Mn.f69551b;
        JSONObject jSONObjectD = Rc.X.d(context, map, map, c7097Mn.f69550a, null);
        JSONObject jSONObjectG = Rc.X.g(this.f42048b, this.f42054h.f69550a);
        JSONObject jSONObjectF = Rc.X.f(this.f42054h.f69550a);
        JSONObject jSONObjectE = Rc.X.e(this.f42048b, this.f42054h.f69550a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectD);
        jSONObject.put("ad_view_signal", jSONObjectG);
        jSONObject.put("scroll_view_signal", jSONObjectF);
        jSONObject.put("lock_screen_signal", jSONObjectE);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", Rc.X.c(null, this.f42048b, this.f42056j, this.f42055i));
        }
        return c8440iL.g(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    public final void q9(List list, com.google.android.gms.dynamic.b bVar, InterfaceC6962In interfaceC6962In) {
        Y9(list, bVar, interfaceC6962In, false);
    }

    private final boolean G() {
        Map map;
        C7097Mn c7097Mn = this.f42054h;
        return (c7097Mn == null || (map = c7097Mn.f69551b) == null || map.isEmpty()) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final Xc.AbstractC5571e T9(android.content.Context r11, java.lang.String r12, java.lang.String r13, Oc.d2 r14, Oc.Y1 r15, int r16, java.lang.String r17, android.os.Bundle r18, com.google.android.gms.internal.ads.C8913mq r19) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xc.BinderC5588w.T9(android.content.Context, java.lang.String, java.lang.String, Oc.d2, Oc.Y1, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.mq):Xc.e");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V9() {
        BinderC5588w binderC5588w;
        com.google.common.util.concurrent.q qVarB;
        if (((Boolean) C9427rg.f78891c.e()).booleanValue()) {
            this.f42045E.b();
            return;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77045Wa)).booleanValue()) {
            qVarB = Mj0.k(new InterfaceC9434rj0() { // from class: Xc.f
                @Override // com.google.android.gms.internal.ads.InterfaceC9434rj0
                public final com.google.common.util.concurrent.q zza() {
                    return this.f41944a.la();
                }
            }, C7033Kq.f69014a);
            binderC5588w = this;
        } else {
            binderC5588w = this;
            qVarB = binderC5588w.T9(this.f42048b, null, Gc.b.BANNER.name(), null, null, 0, null, new Bundle(), null).b();
        }
        Mj0.r(qVarB, new C5587v(this), binderC5588w.f42047a.d());
    }

    private final void W9() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77393v9)).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77435y9)).booleanValue()) {
                return;
            }
            if (((Boolean) Oc.A.c().a(C8784lf.f76764C9)).booleanValue() && this.f42041A.getAndSet(true)) {
                return;
            }
            V9();
        }
    }

    private final void X9(List list, final com.google.android.gms.dynamic.b bVar, InterfaceC6962In interfaceC6962In, boolean z10) {
        com.google.common.util.concurrent.q qVarK0;
        if (!((Boolean) Oc.A.c().a(C8784lf.f77419x7)).booleanValue()) {
            Sc.p.g("The updating URL feature is not enabled.");
            try {
                interfaceC6962In.a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                Sc.p.e("", e10);
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
            Sc.p.g("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (Q9(uri)) {
                qVarK0 = this.f42052f.k0(new Callable() { // from class: Xc.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f41963a.ea(uri, bVar);
                    }
                });
                if (G()) {
                    qVarK0 = Mj0.n(qVarK0, new InterfaceC9541sj0() { // from class: Xc.k
                        @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                        public final com.google.common.util.concurrent.q zza(Object obj) {
                            BinderC5588w binderC5588w = this.f41968a;
                            return Mj0.m(binderC5588w.U9("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new InterfaceC9533sf0(binderC5588w, (Uri) obj) { // from class: Xc.l

                                /* renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ Uri f41972a;

                                @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                                public final Object apply(Object obj2) {
                                    return BinderC5588w.S9(this.f41972a, (String) obj2);
                                }

                                {
                                    this.f41972a = uri;
                                }
                            }, binderC5588w.f42052f);
                        }
                    }, this.f42052f);
                } else {
                    Sc.p.f("Asset view map is empty.");
                }
            } else {
                Sc.p.g("Not a Google URL: ".concat(String.valueOf(uri)));
                qVarK0 = Mj0.h(uri);
            }
            arrayList.add(qVarK0);
        }
        Mj0.r(Mj0.d(arrayList), new C5586u(this, interfaceC6962In, z10), this.f42047a.d());
    }

    private final void Y9(final List list, final com.google.android.gms.dynamic.b bVar, InterfaceC6962In interfaceC6962In, boolean z10) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77419x7)).booleanValue()) {
            try {
                interfaceC6962In.a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                Sc.p.e("", e10);
                return;
            }
        }
        com.google.common.util.concurrent.q qVarK0 = this.f42052f.k0(new Callable() { // from class: Xc.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f41999a.E9(list, bVar);
            }
        });
        if (G()) {
            qVarK0 = Mj0.n(qVarK0, new InterfaceC9541sj0() { // from class: Xc.r
                @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                public final com.google.common.util.concurrent.q zza(Object obj) {
                    return this.f42003a.na((ArrayList) obj);
                }
            }, this.f42052f);
        } else {
            Sc.p.f("Asset view map is empty.");
        }
        Mj0.r(qVarK0, new C5585t(this, interfaceC6962In, z10), this.f42047a.d());
    }

    private static final List ba(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!C7392Vf0.d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    public final void D5(C7097Mn c7097Mn) {
        this.f42054h = c7097Mn;
        this.f42051e.c(1);
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
        String strZzh = this.f42049c.c() != null ? this.f42049c.c().zzh(this.f42048b, (View) com.google.android.gms.dynamic.d.c2(bVar), null) : "";
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
                Sc.p.g("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    public final void O(com.google.android.gms.dynamic.b bVar) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77419x7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) com.google.android.gms.dynamic.d.c2(bVar);
            C7097Mn c7097Mn = this.f42054h;
            this.f42055i = Rc.X.a(motionEvent, c7097Mn == null ? null : c7097Mn.f69550a);
            if (motionEvent.getAction() == 0) {
                this.f42056j = this.f42055i;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f42055i;
            motionEventObtain.setLocation(point.x, point.y);
            this.f42049c.d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    @SuppressLint({"AddJavascriptInterface"})
    public final void Q(com.google.android.gms.dynamic.b bVar) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77379u9)).booleanValue()) {
            AbstractC7718bf abstractC7718bf = C8784lf.f77293o7;
            if (!((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
                W9();
            }
            WebView webView = (WebView) com.google.android.gms.dynamic.d.c2(bVar);
            if (webView == null) {
                Sc.p.d("The webView cannot be null.");
                return;
            }
            final g0 g0Var = new g0(webView, this.f42046F, C7033Kq.f69019f);
            webView.addJavascriptInterface(new C5567a(webView, this.f42049c, this.f42057k, this.f42058l, this.f42050d, this.f42045E, this.f42046F, g0Var), "gmaSdk");
            if (((Boolean) Oc.A.c().a(C8784lf.f76792E9)).booleanValue()) {
                Nc.v.s().t();
            }
            if (((Boolean) C9427rg.f78889a.e()).booleanValue()) {
                this.f42046F.b();
                if (((Boolean) C9427rg.f78890b.e()).booleanValue()) {
                    C7033Kq.f69017d.scheduleWithFixedDelay(new Runnable() { // from class: Xc.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            g0Var.c();
                        }
                    }, 0L, ((Integer) Oc.A.c().a(C8784lf.f76806F9)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
                W9();
            }
        }
    }

    final boolean Q9(Uri uri) {
        return Z9(uri, this.f42069w, this.f42070x);
    }

    final boolean R9(Uri uri) {
        return Z9(uri, this.f42071y, this.f42072z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    public final com.google.android.gms.dynamic.b Z2(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, String str, com.google.android.gms.dynamic.b bVar3) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f76848I9)).booleanValue()) {
            return com.google.android.gms.dynamic.d.I2(null);
        }
        this.f42044D.g((Context) com.google.android.gms.dynamic.d.c2(bVar), (androidx.browser.customtabs.c) com.google.android.gms.dynamic.d.c2(bVar2), str, (androidx.browser.customtabs.b) com.google.android.gms.dynamic.d.c2(bVar3));
        if (((Boolean) C9427rg.f78891c.e()).booleanValue()) {
            this.f42045E.b();
        }
        if (((Boolean) C9427rg.f78889a.e()).booleanValue()) {
            this.f42046F.b();
        }
        return com.google.android.gms.dynamic.d.I2(this.f42044D.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d5(com.google.android.gms.dynamic.b r11, final com.google.android.gms.internal.ads.C8913mq r12, com.google.android.gms.internal.ads.InterfaceC8166fq r13) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xc.BinderC5588w.d5(com.google.android.gms.dynamic.b, com.google.android.gms.internal.ads.mq, com.google.android.gms.internal.ads.fq):void");
    }

    final /* synthetic */ Uri ea(Uri uri, com.google.android.gms.dynamic.b bVar) throws Exception {
        C10123y60 c10123y60;
        try {
            uri = (!((Boolean) Oc.A.c().a(C8784lf.f76990Sb)).booleanValue() || (c10123y60 = this.f42050d) == null) ? this.f42049c.a(uri, this.f42048b, (View) com.google.android.gms.dynamic.d.c2(bVar), null) : c10123y60.a(uri, this.f42048b, (View) com.google.android.gms.dynamic.d.c2(bVar), null);
        } catch (zzavb e10) {
            Sc.p.h("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ AbstractC5571e ha(C8913mq c8913mq, int i10, Bundle bundle) throws Exception {
        return T9(this.f42048b, c8913mq.f77747a, c8913mq.f77748b, c8913mq.f77749c, c8913mq.f77750d, i10, c8913mq.f77752f, bundle, c8913mq);
    }

    final /* synthetic */ com.google.common.util.concurrent.q la() throws Exception {
        return T9(this.f42048b, null, Gc.b.BANNER.name(), null, null, 0, null, new Bundle(), null).b();
    }

    final /* synthetic */ com.google.common.util.concurrent.q na(final ArrayList arrayList) throws Exception {
        return Mj0.m(U9("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new InterfaceC9533sf0() { // from class: Xc.g
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return this.f41946a.D9(arrayList, (String) obj);
            }
        }, this.f42052f);
    }

    BinderC5588w(AbstractC9135ou abstractC9135ou, Context context, M9 m92, T60 t60, Xj0 xj0, ScheduledExecutorService scheduledExecutorService, CN cn2, R90 r90, Sc.a aVar, C7222Qf c7222Qf, C10123y60 c10123y60, l0 l0Var, c0 c0Var) {
        List listBa;
        this.f42047a = abstractC9135ou;
        this.f42048b = context;
        this.f42049c = m92;
        this.f42050d = c10123y60;
        this.f42051e = t60;
        this.f42052f = xj0;
        this.f42053g = scheduledExecutorService;
        this.f42057k = cn2;
        this.f42058l = r90;
        this.f42066t = aVar;
        this.f42044D = c7222Qf;
        this.f42045E = l0Var;
        this.f42046F = c0Var;
        if (((Boolean) Oc.A.c().a(C8784lf.f77195h7)).booleanValue()) {
            this.f42069w = ba((String) Oc.A.c().a(C8784lf.f77209i7));
            this.f42070x = ba((String) Oc.A.c().a(C8784lf.f77223j7));
            this.f42071y = ba((String) Oc.A.c().a(C8784lf.f77237k7));
            listBa = ba((String) Oc.A.c().a(C8784lf.f77251l7));
        } else {
            this.f42069w = f42037G;
            this.f42070x = f42038H;
            this.f42071y = f42039I;
            listBa = f42040J;
        }
        this.f42072z = listBa;
    }

    static /* bridge */ /* synthetic */ void J9(BinderC5588w binderC5588w, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (binderC5588w.Q9((Uri) it.next())) {
                binderC5588w.f42065s.getAndIncrement();
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

    static /* bridge */ /* synthetic */ W80 ia(com.google.common.util.concurrent.q qVar, C8913mq c8913mq) {
        String str;
        if (!Z80.a() || !((Boolean) C8146fg.f74978e.e()).booleanValue()) {
            return null;
        }
        try {
            W80 w80A = ((AbstractC5571e) Mj0.p(qVar)).a();
            w80A.d(new ArrayList(Collections.singletonList(c8913mq.f77748b)));
            Y1 y12 = c8913mq.f77750d;
            if (y12 == null) {
                str = "";
            } else {
                str = y12.f23369p;
            }
            w80A.b(str);
            w80A.f(c8913mq.f77750d.f23366m);
            return w80A;
        } catch (ExecutionException e10) {
            Nc.v.s().x(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }
}
