package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class EO {

    /* renamed from: f, reason: collision with root package name */
    private final Context f67282f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f67283g;

    /* renamed from: h, reason: collision with root package name */
    private final C8653kM f67284h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f67285i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f67286j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f67287k;

    /* renamed from: l, reason: collision with root package name */
    private final IN f67288l;

    /* renamed from: m, reason: collision with root package name */
    private final Sc.a f67289m;

    /* renamed from: o, reason: collision with root package name */
    private final FF f67291o;

    /* renamed from: p, reason: collision with root package name */
    private final Z80 f67292p;

    /* renamed from: a, reason: collision with root package name */
    private boolean f67277a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f67278b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f67279c = false;

    /* renamed from: e, reason: collision with root package name */
    private final C7270Rq f67281e = new C7270Rq();

    /* renamed from: n, reason: collision with root package name */
    private final Map f67290n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    private boolean f67293q = true;

    /* renamed from: d, reason: collision with root package name */
    private final long f67280d = Nc.v.c().c();

    private final synchronized com.google.common.util.concurrent.q u() {
        String strC = Nc.v.s().j().zzg().c();
        if (!TextUtils.isEmpty(strC)) {
            return Mj0.h(strC);
        }
        final C7270Rq c7270Rq = new C7270Rq();
        Nc.v.s().j().s(new Runnable() { // from class: com.google.android.gms.internal.ads.uO
            @Override // java.lang.Runnable
            public final void run() {
                this.f79677a.o(c7270Rq);
            }
        });
        return c7270Rq;
    }

    public final void l() {
        this.f67293q = false;
    }

    final /* synthetic */ void m() {
        synchronized (this) {
            try {
                if (this.f67279c) {
                    return;
                }
                v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (Nc.v.c().c() - this.f67280d));
                this.f67288l.b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f67291o.a("com.google.android.gms.ads.MobileAds", "timeout");
                this.f67281e.c(new Exception());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void q(Object obj, C7270Rq c7270Rq, String str, long j10, K80 k80) {
        synchronized (obj) {
            try {
                if (!c7270Rq.isDone()) {
                    v(str, false, "Timeout.", (int) (Nc.v.c().c() - j10));
                    this.f67288l.b(str, "timeout");
                    this.f67291o.a(str, "timeout");
                    Z80 z80 = this.f67292p;
                    k80.p("Timeout");
                    k80.s0(false);
                    z80.b(k80.zzm());
                    c7270Rq.b(Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean t() {
        return this.f67278b;
    }

    static /* bridge */ /* synthetic */ void j(EO eo2, String str) throws JSONException {
        final EO eo3 = eo2;
        int i10 = 5;
        final K80 k80A = J80.a(eo3.f67282f, 5);
        k80A.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final K80 k80A2 = J80.a(eo3.f67282f, i10);
                k80A2.zzi();
                k80A2.L(next);
                final Object obj = new Object();
                final C7270Rq c7270Rq = new C7270Rq();
                com.google.common.util.concurrent.q qVarO = Mj0.o(c7270Rq, ((Long) Oc.A.c().a(C8784lf.f77036W1)).longValue(), TimeUnit.SECONDS, eo3.f67287k);
                eo3.f67288l.c(next);
                eo3.f67291o.p(next);
                final long jC = Nc.v.c().c();
                qVarO.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.sO
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f79069a.q(obj, c7270Rq, next, jC, k80A2);
                    }
                }, eo3.f67285i);
                arrayList.add(qVarO);
                try {
                    try {
                        final BO bo2 = new BO(eo2, obj, next, jC, k80A2, c7270Rq);
                        eo3 = eo2;
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (jSONObjectOptJSONObject != null) {
                            try {
                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                int i11 = 0;
                                while (i11 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                                    String strOptString = jSONObject2.optString("format", "");
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new C7297Sj(strOptString, bundle));
                                    i11++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        eo3.v(next, false, "", 0);
                        try {
                            final S60 s60C = eo3.f67284h.c(next, new JSONObject());
                            eo3.f67286j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xO
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f80614a.n(next, bo2, s60C, arrayList2);
                                }
                            });
                        } catch (zzfcq e10) {
                            try {
                                String str2 = "Failed to create Adapter.";
                                if (((Boolean) Oc.A.c().a(C8784lf.f76963Qc)).booleanValue()) {
                                    str2 = "Failed to create Adapter. " + e10.getMessage();
                                }
                                bo2.a(str2);
                            } catch (RemoteException e11) {
                                Sc.p.e("", e11);
                            }
                        }
                        i10 = 5;
                    } catch (JSONException e12) {
                        e = e12;
                        eo3 = eo2;
                        Rc.p0.l("Malformed CLD response", e);
                        eo3.f67291o.zza("MalformedJson");
                        eo3.f67288l.a("MalformedJson");
                        eo3.f67281e.c(e);
                        Nc.v.s().x(e, "AdapterInitializer.updateAdapterStatus");
                        Z80 z80 = eo3.f67292p;
                        k80A.e(e);
                        k80A.s0(false);
                        z80.b(k80A.zzm());
                        return;
                    }
                } catch (JSONException e13) {
                    e = e13;
                    eo3 = eo2;
                }
            }
            Mj0.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.tO
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.f79404a.f(k80A);
                    return null;
                }
            }, eo3.f67285i);
        } catch (JSONException e14) {
            e = e14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str, boolean z10, String str2, int i10) {
        this.f67290n.put(str, new C6958Ij(str, z10, i10, str2));
    }

    final /* synthetic */ Object f(K80 k80) throws Exception {
        this.f67281e.b(Boolean.TRUE);
        k80.s0(true);
        this.f67292p.b(k80.zzm());
        return null;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f67290n.keySet()) {
            C6958Ij c6958Ij = (C6958Ij) this.f67290n.get(str);
            arrayList.add(new C6958Ij(str, c6958Ij.f68513b, c6958Ij.f68514c, c6958Ij.f68515d));
        }
        return arrayList;
    }

    final /* synthetic */ void n(String str, InterfaceC7093Mj interfaceC7093Mj, S60 s60, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    interfaceC7093Mj.zzf();
                    return;
                }
                Context context = (Context) this.f67283g.get();
                if (context == null) {
                    context = this.f67282f;
                }
                s60.n(context, interfaceC7093Mj, list);
            } catch (RemoteException e10) {
                Sc.p.e("", e10);
            }
        } catch (RemoteException e11) {
            throw new zzfvl(e11);
        } catch (zzfcq unused) {
            interfaceC7093Mj.a("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void o(final C7270Rq c7270Rq) {
        this.f67285i.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wO
            @Override // java.lang.Runnable
            public final void run() {
                String strC = Nc.v.s().j().zzg().c();
                boolean zIsEmpty = TextUtils.isEmpty(strC);
                C7270Rq c7270Rq2 = c7270Rq;
                if (!zIsEmpty) {
                    c7270Rq2.b(strC);
                } else {
                    c7270Rq2.c(new Exception());
                }
            }
        });
    }

    final /* synthetic */ void p() {
        this.f67288l.e();
        this.f67291o.zze();
        this.f67278b = true;
    }

    public final void r() {
        if (!((Boolean) C9534sg.f79122a.e()).booleanValue()) {
            if (this.f67289m.f34481c >= ((Integer) Oc.A.c().a(C8784lf.f77022V1)).intValue() && this.f67293q) {
                if (this.f67277a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f67277a) {
                            return;
                        }
                        this.f67288l.f();
                        this.f67291o.zzf();
                        this.f67281e.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.yO
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f81056a.p();
                            }
                        }, this.f67285i);
                        this.f67277a = true;
                        com.google.common.util.concurrent.q qVarU = u();
                        this.f67287k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.rO
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f78847a.m();
                            }
                        }, ((Long) Oc.A.c().a(C8784lf.f77050X1)).longValue(), TimeUnit.SECONDS);
                        Mj0.r(qVarU, new AO(this), this.f67285i);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (this.f67277a) {
            return;
        }
        v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f67281e.b(Boolean.FALSE);
        this.f67277a = true;
        this.f67278b = true;
    }

    public final void s(final InterfaceC7195Pj interfaceC7195Pj) {
        this.f67281e.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.vO
            @Override // java.lang.Runnable
            public final void run() {
                EO eo2 = this.f79890a;
                try {
                    interfaceC7195Pj.v4(eo2.g());
                } catch (RemoteException e10) {
                    Sc.p.e("", e10);
                }
            }
        }, this.f67286j);
    }

    public EO(Executor executor, Context context, WeakReference weakReference, Executor executor2, C8653kM c8653kM, ScheduledExecutorService scheduledExecutorService, IN in2, Sc.a aVar, FF ff2, Z80 z80) {
        this.f67284h = c8653kM;
        this.f67282f = context;
        this.f67283g = weakReference;
        this.f67285i = executor2;
        this.f67287k = scheduledExecutorService;
        this.f67286j = executor;
        this.f67288l = in2;
        this.f67289m = aVar;
        this.f67291o = ff2;
        this.f67292p = z80;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }
}
