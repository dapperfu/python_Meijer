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
    private final Context f66442f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f66443g;

    /* renamed from: h, reason: collision with root package name */
    private final C8528kM f66444h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f66445i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f66446j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f66447k;

    /* renamed from: l, reason: collision with root package name */
    private final IN f66448l;

    /* renamed from: m, reason: collision with root package name */
    private final Qc.a f66449m;

    /* renamed from: o, reason: collision with root package name */
    private final FF f66451o;

    /* renamed from: p, reason: collision with root package name */
    private final Z80 f66452p;

    /* renamed from: a, reason: collision with root package name */
    private boolean f66437a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f66438b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f66439c = false;

    /* renamed from: e, reason: collision with root package name */
    private final C7145Rq f66441e = new C7145Rq();

    /* renamed from: n, reason: collision with root package name */
    private final Map f66450n = new ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    private boolean f66453q = true;

    /* renamed from: d, reason: collision with root package name */
    private final long f66440d = Lc.v.c().c();

    private final synchronized com.google.common.util.concurrent.q u() {
        String strC = Lc.v.s().j().zzg().c();
        if (!TextUtils.isEmpty(strC)) {
            return Mj0.h(strC);
        }
        final C7145Rq c7145Rq = new C7145Rq();
        Lc.v.s().j().s(new Runnable() { // from class: com.google.android.gms.internal.ads.uO
            @Override // java.lang.Runnable
            public final void run() {
                this.f78837a.o(c7145Rq);
            }
        });
        return c7145Rq;
    }

    public final void l() {
        this.f66453q = false;
    }

    final /* synthetic */ void m() {
        synchronized (this) {
            try {
                if (this.f66439c) {
                    return;
                }
                v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (Lc.v.c().c() - this.f66440d));
                this.f66448l.b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f66451o.a("com.google.android.gms.ads.MobileAds", "timeout");
                this.f66441e.c(new Exception());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void q(Object obj, C7145Rq c7145Rq, String str, long j10, K80 k80) {
        synchronized (obj) {
            try {
                if (!c7145Rq.isDone()) {
                    v(str, false, "Timeout.", (int) (Lc.v.c().c() - j10));
                    this.f66448l.b(str, "timeout");
                    this.f66451o.a(str, "timeout");
                    Z80 z80 = this.f66452p;
                    k80.p("Timeout");
                    k80.r0(false);
                    z80.b(k80.zzm());
                    c7145Rq.b(Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean t() {
        return this.f66438b;
    }

    static /* bridge */ /* synthetic */ void j(EO eo2, String str) throws JSONException {
        final EO eo3 = eo2;
        int i10 = 5;
        final K80 k80A = J80.a(eo3.f66442f, 5);
        k80A.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final K80 k80A2 = J80.a(eo3.f66442f, i10);
                k80A2.zzi();
                k80A2.L(next);
                final Object obj = new Object();
                final C7145Rq c7145Rq = new C7145Rq();
                com.google.common.util.concurrent.q qVarO = Mj0.o(c7145Rq, ((Long) Mc.A.c().a(C8659lf.f76196W1)).longValue(), TimeUnit.SECONDS, eo3.f66447k);
                eo3.f66448l.c(next);
                eo3.f66451o.p(next);
                final long jC = Lc.v.c().c();
                qVarO.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.sO
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f78229a.q(obj, c7145Rq, next, jC, k80A2);
                    }
                }, eo3.f66445i);
                arrayList.add(qVarO);
                try {
                    try {
                        final BO bo2 = new BO(eo2, obj, next, jC, k80A2, c7145Rq);
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
                                    arrayList2.add(new C7172Sj(strOptString, bundle));
                                    i11++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        eo3.v(next, false, "", 0);
                        try {
                            final S60 s60C = eo3.f66444h.c(next, new JSONObject());
                            eo3.f66446j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xO
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f79774a.n(next, bo2, s60C, arrayList2);
                                }
                            });
                        } catch (zzfcq e10) {
                            try {
                                String str2 = "Failed to create Adapter.";
                                if (((Boolean) Mc.A.c().a(C8659lf.f76123Qc)).booleanValue()) {
                                    str2 = "Failed to create Adapter. " + e10.getMessage();
                                }
                                bo2.a(str2);
                            } catch (RemoteException e11) {
                                Qc.p.e("", e11);
                            }
                        }
                        i10 = 5;
                    } catch (JSONException e12) {
                        e = e12;
                        eo3 = eo2;
                        Pc.p0.l("Malformed CLD response", e);
                        eo3.f66451o.zza("MalformedJson");
                        eo3.f66448l.a("MalformedJson");
                        eo3.f66441e.c(e);
                        Lc.v.s().x(e, "AdapterInitializer.updateAdapterStatus");
                        Z80 z80 = eo3.f66452p;
                        k80A.e(e);
                        k80A.r0(false);
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
                    this.f78564a.f(k80A);
                    return null;
                }
            }, eo3.f66445i);
        } catch (JSONException e14) {
            e = e14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str, boolean z10, String str2, int i10) {
        this.f66450n.put(str, new C6833Ij(str, z10, i10, str2));
    }

    final /* synthetic */ Object f(K80 k80) throws Exception {
        this.f66441e.b(Boolean.TRUE);
        k80.r0(true);
        this.f66452p.b(k80.zzm());
        return null;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f66450n.keySet()) {
            C6833Ij c6833Ij = (C6833Ij) this.f66450n.get(str);
            arrayList.add(new C6833Ij(str, c6833Ij.f67673b, c6833Ij.f67674c, c6833Ij.f67675d));
        }
        return arrayList;
    }

    final /* synthetic */ void n(String str, InterfaceC6968Mj interfaceC6968Mj, S60 s60, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    interfaceC6968Mj.zzf();
                    return;
                }
                Context context = (Context) this.f66443g.get();
                if (context == null) {
                    context = this.f66442f;
                }
                s60.n(context, interfaceC6968Mj, list);
            } catch (RemoteException e10) {
                Qc.p.e("", e10);
            }
        } catch (RemoteException e11) {
            throw new zzfvl(e11);
        } catch (zzfcq unused) {
            interfaceC6968Mj.a("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void o(final C7145Rq c7145Rq) {
        this.f66445i.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wO
            @Override // java.lang.Runnable
            public final void run() {
                String strC = Lc.v.s().j().zzg().c();
                boolean zIsEmpty = TextUtils.isEmpty(strC);
                C7145Rq c7145Rq2 = c7145Rq;
                if (!zIsEmpty) {
                    c7145Rq2.b(strC);
                } else {
                    c7145Rq2.c(new Exception());
                }
            }
        });
    }

    final /* synthetic */ void p() {
        this.f66448l.e();
        this.f66451o.zze();
        this.f66438b = true;
    }

    public final void r() {
        if (!((Boolean) C9409sg.f78282a.e()).booleanValue()) {
            if (this.f66449m.f29931c >= ((Integer) Mc.A.c().a(C8659lf.f76182V1)).intValue() && this.f66453q) {
                if (this.f66437a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f66437a) {
                            return;
                        }
                        this.f66448l.f();
                        this.f66451o.zzf();
                        this.f66441e.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.yO
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f80216a.p();
                            }
                        }, this.f66445i);
                        this.f66437a = true;
                        com.google.common.util.concurrent.q qVarU = u();
                        this.f66447k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.rO
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f78007a.m();
                            }
                        }, ((Long) Mc.A.c().a(C8659lf.f76210X1)).longValue(), TimeUnit.SECONDS);
                        Mj0.r(qVarU, new AO(this), this.f66445i);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (this.f66437a) {
            return;
        }
        v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f66441e.b(Boolean.FALSE);
        this.f66437a = true;
        this.f66438b = true;
    }

    public final void s(final InterfaceC7070Pj interfaceC7070Pj) {
        this.f66441e.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.vO
            @Override // java.lang.Runnable
            public final void run() {
                EO eo2 = this.f79050a;
                try {
                    interfaceC7070Pj.f4(eo2.g());
                } catch (RemoteException e10) {
                    Qc.p.e("", e10);
                }
            }
        }, this.f66446j);
    }

    public EO(Executor executor, Context context, WeakReference weakReference, Executor executor2, C8528kM c8528kM, ScheduledExecutorService scheduledExecutorService, IN in2, Qc.a aVar, FF ff2, Z80 z80) {
        this.f66444h = c8528kM;
        this.f66442f = context;
        this.f66443g = weakReference;
        this.f66445i = executor2;
        this.f66447k = scheduledExecutorService;
        this.f66446j = executor;
        this.f66448l = in2;
        this.f66449m = aVar;
        this.f66451o = ff2;
        this.f66452p = z80;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }
}
