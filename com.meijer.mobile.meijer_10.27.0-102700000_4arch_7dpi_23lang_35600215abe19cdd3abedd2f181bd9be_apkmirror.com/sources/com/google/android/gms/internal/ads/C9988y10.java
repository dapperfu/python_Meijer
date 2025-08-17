package com.google.android.gms.internal.ads;

import Vc.C5366c;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.y10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9988y10 implements T10 {

    /* renamed from: k, reason: collision with root package name */
    private static final C10095z10 f79905k = new C10095z10(new JSONArray().toString(), new Bundle());

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f79906l = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f79907a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f79908b;

    /* renamed from: c, reason: collision with root package name */
    private final C10142zW f79909c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f79910d;

    /* renamed from: e, reason: collision with root package name */
    private final C9570u60 f79911e;

    /* renamed from: f, reason: collision with root package name */
    private final C9714vW f79912f;

    /* renamed from: g, reason: collision with root package name */
    private final C8528kM f79913g;

    /* renamed from: h, reason: collision with root package name */
    private final GO f79914h;

    /* renamed from: i, reason: collision with root package name */
    private final int f79915i;

    /* renamed from: j, reason: collision with root package name */
    final String f79916j;

    C9988y10(Xj0 xj0, ScheduledExecutorService scheduledExecutorService, String str, C10142zW c10142zW, Context context, C9570u60 c9570u60, C9714vW c9714vW, C8528kM c8528kM, GO go2, int i10) {
        this.f79907a = xj0;
        this.f79908b = scheduledExecutorService;
        this.f79916j = str;
        this.f79909c = c10142zW;
        this.f79910d = context;
        this.f79911e = c9570u60;
        this.f79912f = c9714vW;
        this.f79913g = c8528kM;
        this.f79914h = go2;
        this.f79915i = i10;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 32;
    }

    public static /* synthetic */ com.google.common.util.concurrent.q a(C9988y10 c9988y10) {
        C9988y10 c9988y102;
        String lowerCase = ((Boolean) Mc.A.c().a(C8659lf.f76079Na)).booleanValue() ? c9988y10.f79911e.f78740f.toLowerCase(Locale.ROOT) : c9988y10.f79911e.f78740f;
        final Bundle bundleB = ((Boolean) Mc.A.c().a(C8659lf.f76042L1)).booleanValue() ? c9988y10.f79914h.b() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) Mc.A.c().a(C8659lf.f76168U1)).booleanValue()) {
            c9988y102 = c9988y10;
            c9988y102.g(arrayList, c9988y102.f79909c.a(c9988y102.f79916j, lowerCase));
        } else {
            for (Map.Entry entry : ((AbstractC8238hh0) c9988y10.f79909c.b(c9988y10.f79916j, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                C9988y10 c9988y103 = c9988y10;
                arrayList.add(c9988y103.e(str, (List) entry.getValue(), c9988y10.d(str), true, true));
                c9988y10 = c9988y103;
            }
            c9988y102 = c9988y10;
            c9988y102.g(arrayList, c9988y102.f79909c.c());
        }
        return Mj0.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.t10
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = C9988y10.f79906l;
                JSONArray jSONArray = new JSONArray();
                for (com.google.common.util.concurrent.q qVar : arrayList) {
                    if (((JSONObject) qVar.get()) != null) {
                        jSONArray.put(qVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new C10095z10(jSONArray.toString(), bundleB);
            }
        }, c9988y102.f79907a);
    }

    private final Bundle d(String str) {
        Bundle bundle = this.f79911e.f78738d.f19179m;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final Cj0 e(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        Cj0 cj0D = Cj0.D(Mj0.k(new InterfaceC9309rj0() { // from class: com.google.android.gms.internal.ads.v10
            @Override // com.google.android.gms.internal.ads.InterfaceC9309rj0
            public final com.google.common.util.concurrent.q zza() {
                return this.f78967a.b(str, list, bundle, z10, z11);
            }
        }, this.f79907a));
        if (!((Boolean) Mc.A.c().a(C8659lf.f75986H1)).booleanValue()) {
            cj0D = (Cj0) Mj0.o(cj0D, ((Long) Mc.A.c().a(C8659lf.f75888A1)).longValue(), TimeUnit.MILLISECONDS, this.f79908b);
        }
        return (Cj0) Mj0.e(cj0D, Throwable.class, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.w10
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                String str2 = str;
                Throwable th2 = (Throwable) obj;
                Qc.p.d("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) Mc.A.c().a(C8659lf.f76151Sc)).booleanValue()) {
                    Lc.v.s().w(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                Lc.v.s().x(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, this.f79907a);
    }

    private final void f(InterfaceC10170zm interfaceC10170zm, Bundle bundle, List list, CW cw2) throws RemoteException {
        interfaceC10170zm.u2(com.google.android.gms.dynamic.d.F2(this.f79910d), this.f79916j, bundle, (Bundle) list.get(0), this.f79911e.f78739e, cw2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.common.util.concurrent.q b(java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) throws java.lang.Exception {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.Rq r3 = new com.google.android.gms.internal.ads.Rq
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L27
            com.google.android.gms.internal.ads.bf r12 = com.google.android.gms.internal.ads.C8659lf.f76056M1
            com.google.android.gms.internal.ads.jf r0 = Mc.A.c()
            java.lang.Object r12 = r0.a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L27
            com.google.android.gms.internal.ads.vW r12 = r7.f79912f
            r12.b(r8)
            com.google.android.gms.internal.ads.vW r12 = r7.f79912f
            com.google.android.gms.internal.ads.zm r12 = r12.a(r8)
        L25:
            r2 = r12
            goto L36
        L27:
            com.google.android.gms.internal.ads.kM r12 = r7.f79913g     // Catch: android.os.RemoteException -> L2e
            com.google.android.gms.internal.ads.zm r12 = r12.b(r8)     // Catch: android.os.RemoteException -> L2e
            goto L25
        L2e:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            Pc.p0.l(r0, r12)
            r2 = r1
        L36:
            if (r2 != 0) goto L51
            com.google.android.gms.internal.ads.bf r9 = com.google.android.gms.internal.ads.C8659lf.f75916C1
            com.google.android.gms.internal.ads.jf r10 = Mc.A.c()
            java.lang.Object r9 = r10.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L50
            com.google.android.gms.internal.ads.CW.B9(r8, r3)
            r1 = r7
            goto Lbd
        L50:
            throw r1
        L51:
            com.google.android.gms.internal.ads.CW r0 = new com.google.android.gms.internal.ads.CW
            com.google.android.gms.common.util.f r12 = Lc.v.c()
            long r4 = r12.c()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.bf r8 = com.google.android.gms.internal.ads.C8659lf.f75986H1
            com.google.android.gms.internal.ads.jf r12 = Mc.A.c()
            java.lang.Object r8 = r12.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r8 = r7.f79908b
            com.google.android.gms.internal.ads.x10 r12 = new com.google.android.gms.internal.ads.x10
            r12.<init>()
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f75888A1
            com.google.android.gms.internal.ads.jf r4 = Mc.A.c()
            java.lang.Object r1 = r4.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r12, r4, r1)
        L8d:
            if (r11 == 0) goto Lb9
            com.google.android.gms.internal.ads.bf r8 = com.google.android.gms.internal.ads.C8659lf.f76084O1
            com.google.android.gms.internal.ads.jf r11 = Mc.A.c()
            java.lang.Object r8 = r11.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb2
            com.google.android.gms.internal.ads.Xj0 r8 = r7.f79907a
            r5 = r0
            com.google.android.gms.internal.ads.u10 r0 = new com.google.android.gms.internal.ads.u10
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.zza(r0)
            goto Lbd
        Lb2:
            r1 = r7
            r4 = r9
            r8 = r10
            r7.f(r2, r8, r4, r0)
            goto Lbd
        Lb9:
            r1 = r7
            r0.zzd()
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9988y10.b(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.q");
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (this.f79915i == 2) {
            return Mj0.h(f79905k);
        }
        C9570u60 c9570u60 = this.f79911e;
        if (c9570u60.f78752r) {
            if (!Arrays.asList(((String) Mc.A.c().a(C8659lf.f76070N1)).split(",")).contains(C5366c.b(C5366c.c(c9570u60.f78738d)))) {
                return Mj0.h(f79905k);
            }
        }
        return Mj0.k(new InterfaceC9309rj0() { // from class: com.google.android.gms.internal.ads.s10
            @Override // com.google.android.gms.internal.ads.InterfaceC9309rj0
            public final com.google.common.util.concurrent.q zza() {
                return C9988y10.a(this.f78112a);
            }
        }, this.f79907a);
    }

    private final void g(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            DW dw2 = (DW) ((Map.Entry) it.next()).getValue();
            String str = dw2.f66245a;
            list.add(e(str, Collections.singletonList(dw2.f66249e), d(str), dw2.f66246b, dw2.f66247c));
        }
    }

    final /* synthetic */ void c(InterfaceC10170zm interfaceC10170zm, Bundle bundle, List list, CW cw2, C7145Rq c7145Rq) {
        try {
            f(interfaceC10170zm, bundle, list, cw2);
        } catch (RemoteException e10) {
            c7145Rq.c(e10);
        }
    }
}
