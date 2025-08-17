package com.google.android.gms.internal.ads;

import Mc.AbstractBinderC4158u0;
import Pc.C4591v;
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
public final class BinderC7184Sv extends AbstractBinderC4158u0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70183a;

    /* renamed from: b, reason: collision with root package name */
    private final Qc.a f70184b;

    /* renamed from: c, reason: collision with root package name */
    private final C8528kM f70185c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8535kT f70186d;

    /* renamed from: e, reason: collision with root package name */
    private final C10142zW f70187e;

    /* renamed from: f, reason: collision with root package name */
    private final EO f70188f;

    /* renamed from: g, reason: collision with root package name */
    private final C7311Wp f70189g;

    /* renamed from: h, reason: collision with root package name */
    private final C9063pM f70190h;

    /* renamed from: i, reason: collision with root package name */
    private final ZO f70191i;

    /* renamed from: j, reason: collision with root package name */
    private final C6760Gg f70192j;

    /* renamed from: k, reason: collision with root package name */
    private final Z80 f70193k;

    /* renamed from: l, reason: collision with root package name */
    private final Q60 f70194l;

    /* renamed from: m, reason: collision with root package name */
    private final NA f70195m;

    /* renamed from: n, reason: collision with root package name */
    private final C9812wN f70196n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f70197o = false;

    /* renamed from: p, reason: collision with root package name */
    private final Long f70198p = Long.valueOf(Lc.v.c().c());

    @Override // Mc.InterfaceC4161v0
    public final synchronized void M(float f10) {
        Lc.v.v().d(f10);
    }

    @Override // Mc.InterfaceC4161v0
    public final synchronized void j0(String str) {
        C8659lf.a(this.f70183a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76268b4)).booleanValue()) {
                Lc.v.d().a(this.f70183a, this.f70184b, str, null, this.f70193k, null, null);
            }
        }
    }

    @Override // Mc.InterfaceC4161v0
    public final synchronized void w(boolean z10) {
        Lc.v.v().c(z10);
    }

    @Override // Mc.InterfaceC4161v0
    public final synchronized float zze() {
        return Lc.v.v().a();
    }

    @Override // Mc.InterfaceC4161v0
    public final synchronized void zzk() {
        if (this.f70197o) {
            Qc.p.g("Mobile ads is initialized already.");
            return;
        }
        C8659lf.a(this.f70183a);
        Lc.v.s().v(this.f70183a, this.f70184b);
        this.f70195m.c();
        Lc.v.f().i(this.f70183a);
        this.f70197o = true;
        this.f70188f.r();
        this.f70187e.e();
        if (((Boolean) Mc.A.c().a(C8659lf.f76296d4)).booleanValue()) {
            this.f70190h.d();
        }
        this.f70191i.h();
        if (((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue()) {
            C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Nv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68963a.zzb();
                }
            });
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76107Pa)).booleanValue()) {
            C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Qv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69686a.zzx();
                }
            });
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76267b3)).booleanValue()) {
            C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ov
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69198a.zzd();
                }
            });
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f75975G4)).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f75989H4)).booleanValue()) {
                C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Pv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f69444a.zzw();
                    }
                });
            }
        }
    }

    @Override // Mc.InterfaceC4161v0
    public final synchronized boolean zzv() {
        return Lc.v.v().e();
    }

    final void B9(Runnable runnable) {
        com.google.android.gms.common.internal.r.e("Adapters must be initialized on the main thread.");
        Map mapE = Lc.v.s().j().zzg().e();
        if (mapE.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                Qc.p.h("Could not initialize rewarded ads.", th2);
                return;
            }
        }
        if (this.f70185c.d()) {
            HashMap map = new HashMap();
            Iterator it = mapE.values().iterator();
            while (it.hasNext()) {
                for (C9633ul c9633ul : ((C9740vl) it.next()).f79120a) {
                    String str = c9633ul.f78903b;
                    for (String str2 : c9633ul.f78902a) {
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
                    C8642lT c8642lTA = this.f70186d.a(str3, jSONObject);
                    if (c8642lTA != null) {
                        S60 s60 = (S60) c8642lTA.f75826b;
                        if (!s60.c() && s60.b()) {
                            s60.o(this.f70183a, (BinderC8110gU) c8642lTA.f75827c, (List) entry.getValue());
                            Qc.p.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfcq e10) {
                    Qc.p.h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e10);
                }
            }
        }
    }

    @Override // Mc.InterfaceC4161v0
    public final void J(boolean z10) throws IOException, RemoteException {
        try {
            C7060Pd0.a(this.f70183a).c(z10);
            if (z10) {
                return;
            }
            try {
                if (this.f70183a.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e10) {
                Lc.v.s().x(e10, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e11) {
            throw new RemoteException(e11.getMessage());
        }
    }

    @Override // Mc.InterfaceC4161v0
    public final void L7(Mc.H0 h02) throws RemoteException {
        this.f70191i.i(h02, YO.API);
    }

    @Override // Mc.InterfaceC4161v0
    public final void N(String str) {
        this.f70187e.g(str);
    }

    @Override // Mc.InterfaceC4161v0
    public final void Z0(InterfaceC6631Cl interfaceC6631Cl) throws RemoteException {
        this.f70194l.f(interfaceC6631Cl);
    }

    @Override // Mc.InterfaceC4161v0
    public final void d8(com.google.android.gms.dynamic.b bVar, String str) {
        if (bVar == null) {
            Qc.p.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) com.google.android.gms.dynamic.d.b2(bVar);
        if (context == null) {
            Qc.p.d("Context is null. Failed to open debug menu.");
            return;
        }
        C4591v c4591v = new C4591v(context);
        c4591v.n(str);
        c4591v.o(this.f70184b.f29929a);
        c4591v.r();
    }

    @Override // Mc.InterfaceC4161v0
    public final void l3(String str, com.google.android.gms.dynamic.b bVar) throws JSONException {
        String strV;
        Runnable runnable;
        C8659lf.a(this.f70183a);
        if (((Boolean) Mc.A.c().a(C8659lf.f76366i4)).booleanValue()) {
            try {
                Lc.v.t();
                strV = Pc.D0.V(this.f70183a);
            } catch (RemoteException | RuntimeException e10) {
                Lc.v.s().x(e10, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            strV = "";
        }
        boolean z10 = true;
        String str2 = true == TextUtils.isEmpty(strV) ? str : strV;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) Mc.A.c().a(C8659lf.f76268b4)).booleanValue();
        AbstractC7593bf abstractC7593bf = C8659lf.f76251a1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue();
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            final Runnable runnable2 = (Runnable) com.google.android.gms.dynamic.d.b2(bVar);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.Rv
                @Override // java.lang.Runnable
                public final void run() {
                    Xj0 xj0 = C6908Kq.f68179f;
                    final BinderC7184Sv binderC7184Sv = this.f69957a;
                    final Runnable runnable3 = runnable2;
                    xj0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Mv
                        @Override // java.lang.Runnable
                        public final void run() {
                            binderC7184Sv.B9(runnable3);
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
            Lc.v.d().a(this.f70183a, this.f70184b, str2, runnable3, this.f70193k, this.f70196n, this.f70198p);
        }
    }

    @Override // Mc.InterfaceC4161v0
    public final void p5(String str) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76455o9)).booleanValue()) {
            Lc.v.s().A(str);
        }
    }

    @Override // Mc.InterfaceC4161v0
    public final void s2(InterfaceC7070Pj interfaceC7070Pj) throws RemoteException {
        this.f70188f.s(interfaceC7070Pj);
    }

    @Override // Mc.InterfaceC4161v0
    public final void u1(Mc.L1 l12) throws RemoteException {
        this.f70189g.n(this.f70183a, l12);
    }

    final /* synthetic */ void zzd() {
        Y60.b(this.f70183a, true);
    }

    @Override // Mc.InterfaceC4161v0
    public final String zzf() {
        return this.f70184b.f29929a;
    }

    @Override // Mc.InterfaceC4161v0
    public final List zzg() throws RemoteException {
        return this.f70188f.g();
    }

    @Override // Mc.InterfaceC4161v0
    public final void zzi() {
        this.f70188f.l();
    }

    final /* synthetic */ void zzx() {
        this.f70192j.a(new BinderC7309Wn());
    }

    BinderC7184Sv(Context context, Qc.a aVar, C8528kM c8528kM, InterfaceC8535kT interfaceC8535kT, C10142zW c10142zW, EO eo2, C7311Wp c7311Wp, C9063pM c9063pM, ZO zo2, C6760Gg c6760Gg, Z80 z80, Q60 q60, NA na2, C9812wN c9812wN) {
        this.f70183a = context;
        this.f70184b = aVar;
        this.f70185c = c8528kM;
        this.f70186d = interfaceC8535kT;
        this.f70187e = c10142zW;
        this.f70188f = eo2;
        this.f70189g = c7311Wp;
        this.f70190h = c9063pM;
        this.f70191i = zo2;
        this.f70192j = c6760Gg;
        this.f70193k = z80;
        this.f70194l = q60;
        this.f70195m = na2;
        this.f70196n = c9812wN;
    }

    final void zzb() {
        if (Lc.v.s().j().m()) {
            String strZzi = Lc.v.s().j().zzi();
            if (!Lc.v.w().j(this.f70183a, strZzi, this.f70184b.f29929a)) {
                Lc.v.s().j().I(false);
                Lc.v.s().j().C("");
            }
        }
    }

    final /* synthetic */ void zzw() {
        Lc.v.i().d(this.f70183a, this.f70196n);
    }
}
