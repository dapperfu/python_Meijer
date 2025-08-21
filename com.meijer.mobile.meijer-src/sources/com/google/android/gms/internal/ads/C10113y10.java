package com.google.android.gms.internal.ads;

import Xc.C5569c;
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
public final class C10113y10 implements T10 {

    /* renamed from: k, reason: collision with root package name */
    private static final C10220z10 f80745k = new C10220z10(new JSONArray().toString(), new Bundle());

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f80746l = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f80747a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f80748b;

    /* renamed from: c, reason: collision with root package name */
    private final C10267zW f80749c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f80750d;

    /* renamed from: e, reason: collision with root package name */
    private final C9695u60 f80751e;

    /* renamed from: f, reason: collision with root package name */
    private final C9839vW f80752f;

    /* renamed from: g, reason: collision with root package name */
    private final C8653kM f80753g;

    /* renamed from: h, reason: collision with root package name */
    private final GO f80754h;

    /* renamed from: i, reason: collision with root package name */
    private final int f80755i;

    /* renamed from: j, reason: collision with root package name */
    final String f80756j;

    C10113y10(Xj0 xj0, ScheduledExecutorService scheduledExecutorService, String str, C10267zW c10267zW, Context context, C9695u60 c9695u60, C9839vW c9839vW, C8653kM c8653kM, GO go2, int i10) {
        this.f80747a = xj0;
        this.f80748b = scheduledExecutorService;
        this.f80756j = str;
        this.f80749c = c10267zW;
        this.f80750d = context;
        this.f80751e = c9695u60;
        this.f80752f = c9839vW;
        this.f80753g = c8653kM;
        this.f80754h = go2;
        this.f80755i = i10;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 32;
    }

    public static /* synthetic */ com.google.common.util.concurrent.q a(C10113y10 c10113y10) {
        C10113y10 c10113y102;
        String lowerCase = ((Boolean) Oc.A.c().a(C8784lf.f76919Na)).booleanValue() ? c10113y10.f80751e.f79580f.toLowerCase(Locale.ROOT) : c10113y10.f80751e.f79580f;
        final Bundle bundleB = ((Boolean) Oc.A.c().a(C8784lf.f76882L1)).booleanValue() ? c10113y10.f80754h.b() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) Oc.A.c().a(C8784lf.f77008U1)).booleanValue()) {
            c10113y102 = c10113y10;
            c10113y102.g(arrayList, c10113y102.f80749c.a(c10113y102.f80756j, lowerCase));
        } else {
            for (Map.Entry entry : ((AbstractC8363hh0) c10113y10.f80749c.b(c10113y10.f80756j, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                C10113y10 c10113y103 = c10113y10;
                arrayList.add(c10113y103.e(str, (List) entry.getValue(), c10113y10.d(str), true, true));
                c10113y10 = c10113y103;
            }
            c10113y102 = c10113y10;
            c10113y102.g(arrayList, c10113y102.f80749c.c());
        }
        return Mj0.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.t10
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = C10113y10.f80746l;
                JSONArray jSONArray = new JSONArray();
                for (com.google.common.util.concurrent.q qVar : arrayList) {
                    if (((JSONObject) qVar.get()) != null) {
                        jSONArray.put(qVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new C10220z10(jSONArray.toString(), bundleB);
            }
        }, c10113y102.f80747a);
    }

    private final Bundle d(String str) {
        Bundle bundle = this.f80751e.f79578d.f23366m;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final Cj0 e(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        Cj0 cj0D = Cj0.D(Mj0.k(new InterfaceC9434rj0() { // from class: com.google.android.gms.internal.ads.v10
            @Override // com.google.android.gms.internal.ads.InterfaceC9434rj0
            public final com.google.common.util.concurrent.q zza() {
                return this.f79807a.b(str, list, bundle, z10, z11);
            }
        }, this.f80747a));
        if (!((Boolean) Oc.A.c().a(C8784lf.f76826H1)).booleanValue()) {
            cj0D = (Cj0) Mj0.o(cj0D, ((Long) Oc.A.c().a(C8784lf.f76728A1)).longValue(), TimeUnit.MILLISECONDS, this.f80748b);
        }
        return (Cj0) Mj0.e(cj0D, Throwable.class, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.w10
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                String str2 = str;
                Throwable th2 = (Throwable) obj;
                Sc.p.d("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) Oc.A.c().a(C8784lf.f76991Sc)).booleanValue()) {
                    Nc.v.s().w(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                Nc.v.s().x(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, this.f80747a);
    }

    private final void f(InterfaceC10295zm interfaceC10295zm, Bundle bundle, List list, CW cw2) throws RemoteException {
        interfaceC10295zm.d1(com.google.android.gms.dynamic.d.I2(this.f80750d), this.f80756j, bundle, (Bundle) list.get(0), this.f80751e.f79579e, cw2);
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
            com.google.android.gms.internal.ads.bf r12 = com.google.android.gms.internal.ads.C8784lf.f76896M1
            com.google.android.gms.internal.ads.jf r0 = Oc.A.c()
            java.lang.Object r12 = r0.a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L27
            com.google.android.gms.internal.ads.vW r12 = r7.f80752f
            r12.b(r8)
            com.google.android.gms.internal.ads.vW r12 = r7.f80752f
            com.google.android.gms.internal.ads.zm r12 = r12.a(r8)
        L25:
            r2 = r12
            goto L36
        L27:
            com.google.android.gms.internal.ads.kM r12 = r7.f80753g     // Catch: android.os.RemoteException -> L2e
            com.google.android.gms.internal.ads.zm r12 = r12.b(r8)     // Catch: android.os.RemoteException -> L2e
            goto L25
        L2e:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            Rc.p0.l(r0, r12)
            r2 = r1
        L36:
            if (r2 != 0) goto L51
            com.google.android.gms.internal.ads.bf r9 = com.google.android.gms.internal.ads.C8784lf.f76756C1
            com.google.android.gms.internal.ads.jf r10 = Oc.A.c()
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
            com.google.android.gms.common.util.f r12 = Nc.v.c()
            long r4 = r12.c()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.bf r8 = com.google.android.gms.internal.ads.C8784lf.f76826H1
            com.google.android.gms.internal.ads.jf r12 = Oc.A.c()
            java.lang.Object r8 = r12.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r8 = r7.f80748b
            com.google.android.gms.internal.ads.x10 r12 = new com.google.android.gms.internal.ads.x10
            r12.<init>()
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f76728A1
            com.google.android.gms.internal.ads.jf r4 = Oc.A.c()
            java.lang.Object r1 = r4.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r12, r4, r1)
        L8d:
            if (r11 == 0) goto Lb9
            com.google.android.gms.internal.ads.bf r8 = com.google.android.gms.internal.ads.C8784lf.f76924O1
            com.google.android.gms.internal.ads.jf r11 = Oc.A.c()
            java.lang.Object r8 = r11.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb2
            com.google.android.gms.internal.ads.Xj0 r8 = r7.f80747a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10113y10.b(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.q");
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (this.f80755i == 2) {
            return Mj0.h(f80745k);
        }
        C9695u60 c9695u60 = this.f80751e;
        if (c9695u60.f79592r) {
            if (!Arrays.asList(((String) Oc.A.c().a(C8784lf.f76910N1)).split(",")).contains(C5569c.b(C5569c.c(c9695u60.f79578d)))) {
                return Mj0.h(f80745k);
            }
        }
        return Mj0.k(new InterfaceC9434rj0() { // from class: com.google.android.gms.internal.ads.s10
            @Override // com.google.android.gms.internal.ads.InterfaceC9434rj0
            public final com.google.common.util.concurrent.q zza() {
                return C10113y10.a(this.f78952a);
            }
        }, this.f80747a);
    }

    private final void g(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            DW dw2 = (DW) ((Map.Entry) it.next()).getValue();
            String str = dw2.f67085a;
            list.add(e(str, Collections.singletonList(dw2.f67089e), d(str), dw2.f67086b, dw2.f67087c));
        }
    }

    final /* synthetic */ void c(InterfaceC10295zm interfaceC10295zm, Bundle bundle, List list, CW cw2, C7270Rq c7270Rq) {
        try {
            f(interfaceC10295zm, bundle, list, cw2);
        } catch (RemoteException e10) {
            c7270Rq.c(e10);
        }
    }
}
