package com.google.android.gms.internal.ads;

import Oc.AbstractBinderC4436u0;
import Rc.C5212v;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Sv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7309Sv extends AbstractBinderC4436u0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f71023a;

    /* renamed from: b, reason: collision with root package name */
    private final Sc.a f71024b;

    /* renamed from: c, reason: collision with root package name */
    private final C8653kM f71025c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8660kT f71026d;

    /* renamed from: e, reason: collision with root package name */
    private final C10267zW f71027e;

    /* renamed from: f, reason: collision with root package name */
    private final EO f71028f;

    /* renamed from: g, reason: collision with root package name */
    private final C7436Wp f71029g;

    /* renamed from: h, reason: collision with root package name */
    private final C9188pM f71030h;

    /* renamed from: i, reason: collision with root package name */
    private final ZO f71031i;

    /* renamed from: j, reason: collision with root package name */
    private final C6885Gg f71032j;

    /* renamed from: k, reason: collision with root package name */
    private final Z80 f71033k;

    /* renamed from: l, reason: collision with root package name */
    private final Q60 f71034l;

    /* renamed from: m, reason: collision with root package name */
    private final NA f71035m;

    /* renamed from: n, reason: collision with root package name */
    private final C9937wN f71036n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f71037o = false;

    /* renamed from: p, reason: collision with root package name */
    private final Long f71038p = Long.valueOf(Nc.v.c().c());

    @Override // Oc.InterfaceC4439v0
    public final synchronized void M(float f10) {
        Nc.v.v().d(f10);
    }

    @Override // Oc.InterfaceC4439v0
    public final synchronized void m0(String str) {
        C8784lf.a(this.f71023a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77108b4)).booleanValue()) {
                Nc.v.d().a(this.f71023a, this.f71024b, str, null, this.f71033k, null, null);
            }
        }
    }

    @Override // Oc.InterfaceC4439v0
    public final synchronized void w(boolean z10) {
        Nc.v.v().c(z10);
    }

    @Override // Oc.InterfaceC4439v0
    public final synchronized float zze() {
        return Nc.v.v().a();
    }

    @Override // Oc.InterfaceC4439v0
    public final synchronized void zzk() {
        if (this.f71037o) {
            Sc.p.g("Mobile ads is initialized already.");
            return;
        }
        C8784lf.a(this.f71023a);
        Nc.v.s().v(this.f71023a, this.f71024b);
        this.f71035m.c();
        Nc.v.f().i(this.f71023a);
        this.f71037o = true;
        this.f71028f.r();
        this.f71027e.e();
        if (((Boolean) Oc.A.c().a(C8784lf.f77136d4)).booleanValue()) {
            this.f71030h.d();
        }
        this.f71031i.h();
        if (((Boolean) Oc.A.c().a(C8784lf.f77141d9)).booleanValue()) {
            C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Nv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69803a.zzb();
                }
            });
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76947Pa)).booleanValue()) {
            C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Qv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70526a.zzx();
                }
            });
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77107b3)).booleanValue()) {
            C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ov
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70038a.zzd();
                }
            });
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76815G4)).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f76829H4)).booleanValue()) {
                C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Pv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70284a.zzw();
                    }
                });
            }
        }
    }

    @Override // Oc.InterfaceC4439v0
    public final synchronized boolean zzv() {
        return Nc.v.v().e();
    }

    final void B9(Runnable runnable) {
        com.google.android.gms.common.internal.r.e("Adapters must be initialized on the main thread.");
        Map mapE = Nc.v.s().j().zzg().e();
        if (mapE.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                Sc.p.h("Could not initialize rewarded ads.", th2);
                return;
            }
        }
        if (this.f71025c.d()) {
            HashMap map = new HashMap();
            Iterator it = mapE.values().iterator();
            while (it.hasNext()) {
                for (C9758ul c9758ul : ((C9865vl) it.next()).f79960a) {
                    String str = c9758ul.f79743b;
                    for (String str2 : c9758ul.f79742a) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    C8767lT c8767lTA = this.f71026d.a(str3, jSONObject);
                    if (c8767lTA != null) {
                        S60 s60 = (S60) c8767lTA.f76666b;
                        if (!s60.c() && s60.b()) {
                            s60.o(this.f71023a, (BinderC8235gU) c8767lTA.f76667c, (List) entry.getValue());
                            Sc.p.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfcq e10) {
                    Sc.p.h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e10);
                }
            }
        }
    }

    @Override // Oc.InterfaceC4439v0
    public final void J(boolean z10) throws IOException, RemoteException {
        try {
            C7185Pd0.a(this.f71023a).c(z10);
            if (z10) {
                return;
            }
            try {
                if (this.f71023a.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e10) {
                Nc.v.s().x(e10, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e11) {
            throw new RemoteException(e11.getMessage());
        }
    }

    @Override // Oc.InterfaceC4439v0
    public final void N(String str) {
        this.f71027e.g(str);
    }

    @Override // Oc.InterfaceC4439v0
    public final void N3(Oc.L1 l12) throws RemoteException {
        this.f71029g.n(this.f71023a, l12);
    }

    @Override // Oc.InterfaceC4439v0
    public final void a8(com.google.android.gms.dynamic.b bVar, String str) {
        if (bVar == null) {
            Sc.p.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) com.google.android.gms.dynamic.d.c2(bVar);
        if (context == null) {
            Sc.p.d("Context is null. Failed to open debug menu.");
            return;
        }
        C5212v c5212v = new C5212v(context);
        c5212v.n(str);
        c5212v.o(this.f71024b.f34479a);
        c5212v.r();
    }

    @Override // Oc.InterfaceC4439v0
    public final void c1(InterfaceC6756Cl interfaceC6756Cl) throws RemoteException {
        this.f71034l.f(interfaceC6756Cl);
    }

    @Override // Oc.InterfaceC4439v0
    public final void t3(String str, com.google.android.gms.dynamic.b bVar) throws JSONException {
        String strV;
        Runnable runnable;
        C8784lf.a(this.f71023a);
        if (((Boolean) Oc.A.c().a(C8784lf.f77206i4)).booleanValue()) {
            try {
                Nc.v.t();
                strV = Rc.D0.V(this.f71023a);
            } catch (RemoteException | RuntimeException e10) {
                Nc.v.s().x(e10, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            strV = "";
        }
        boolean z10 = true;
        String str2 = true == TextUtils.isEmpty(strV) ? str : strV;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) Oc.A.c().a(C8784lf.f77108b4)).booleanValue();
        AbstractC7718bf abstractC7718bf = C8784lf.f77091a1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue();
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            final Runnable runnable2 = (Runnable) com.google.android.gms.dynamic.d.c2(bVar);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.Rv
                @Override // java.lang.Runnable
                public final void run() {
                    Xj0 xj0 = C7033Kq.f69019f;
                    final BinderC7309Sv binderC7309Sv = this.f70797a;
                    final Runnable runnable3 = runnable2;
                    xj0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Mv
                        @Override // java.lang.Runnable
                        public final void run() {
                            binderC7309Sv.B9(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z10 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z10) {
            Nc.v.d().a(this.f71023a, this.f71024b, str2, runnable3, this.f71033k, this.f71036n, this.f71038p);
        }
    }

    @Override // Oc.InterfaceC4439v0
    public final void v2(InterfaceC7195Pj interfaceC7195Pj) throws RemoteException {
        this.f71028f.s(interfaceC7195Pj);
    }

    @Override // Oc.InterfaceC4439v0
    public final void w9(Oc.H0 h02) throws RemoteException {
        this.f71031i.i(h02, YO.API);
    }

    @Override // Oc.InterfaceC4439v0
    public final void x5(String str) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77295o9)).booleanValue()) {
            Nc.v.s().A(str);
        }
    }

    final /* synthetic */ void zzd() {
        Y60.b(this.f71023a, true);
    }

    @Override // Oc.InterfaceC4439v0
    public final String zzf() {
        return this.f71024b.f34479a;
    }

    @Override // Oc.InterfaceC4439v0
    public final List zzg() throws RemoteException {
        return this.f71028f.g();
    }

    @Override // Oc.InterfaceC4439v0
    public final void zzi() {
        this.f71028f.l();
    }

    final /* synthetic */ void zzx() {
        this.f71032j.a(new BinderC7434Wn());
    }

    BinderC7309Sv(Context context, Sc.a aVar, C8653kM c8653kM, InterfaceC8660kT interfaceC8660kT, C10267zW c10267zW, EO eo2, C7436Wp c7436Wp, C9188pM c9188pM, ZO zo2, C6885Gg c6885Gg, Z80 z80, Q60 q60, NA na2, C9937wN c9937wN) {
        this.f71023a = context;
        this.f71024b = aVar;
        this.f71025c = c8653kM;
        this.f71026d = interfaceC8660kT;
        this.f71027e = c10267zW;
        this.f71028f = eo2;
        this.f71029g = c7436Wp;
        this.f71030h = c9188pM;
        this.f71031i = zo2;
        this.f71032j = c6885Gg;
        this.f71033k = z80;
        this.f71034l = q60;
        this.f71035m = na2;
        this.f71036n = c9937wN;
    }

    final void zzb() {
        if (Nc.v.s().j().m()) {
            String strZzi = Nc.v.s().j().zzi();
            if (!Nc.v.w().j(this.f71023a, strZzi, this.f71024b.f34479a)) {
                Nc.v.s().j().I(false);
                Nc.v.s().j().C("");
            }
        }
    }

    final /* synthetic */ void zzw() {
        Nc.v.i().d(this.f71023a, this.f71036n);
    }
}
