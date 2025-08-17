package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class W10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70980a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f70981b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f70982c;

    /* renamed from: d, reason: collision with root package name */
    private final W80 f70983d;

    /* renamed from: e, reason: collision with root package name */
    private final C9812wN f70984e;

    /* renamed from: f, reason: collision with root package name */
    private long f70985f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f70986g = 0;

    public W10(Context context, Executor executor, Set set, W80 w80, C9812wN c9812wN) {
        this.f70980a = context;
        this.f70982c = executor;
        this.f70981b = set;
        this.f70983d = w80;
        this.f70984e = c9812wN;
    }

    public final com.google.common.util.concurrent.q a(final Object obj, final Bundle bundle, final boolean z10) {
        K80 k80A = J80.a(this.f70980a, 8);
        k80A.zzi();
        final ArrayList arrayList = new ArrayList(this.f70981b.size());
        List arrayList2 = new ArrayList();
        AbstractC7593bf abstractC7593bf = C8659lf.f75940Db;
        if (!((String) Mc.A.c().a(abstractC7593bf)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) Mc.A.c().a(abstractC7593bf)).split(","));
        }
        this.f70985f = Lc.v.c().c();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue() && bundle != null) {
            long jA = Lc.v.c().a();
            if (obj instanceof AB) {
                bundle.putLong(EnumC7889eN.CLIENT_SIGNALS_START.a(), jA);
            } else {
                bundle.putLong(EnumC7889eN.GMS_SIGNALS_START.a(), jA);
            }
        }
        for (final T10 t10 : this.f70981b) {
            if (!arrayList2.contains(String.valueOf(t10.zza()))) {
                final long jC = Lc.v.c().c();
                com.google.common.util.concurrent.q qVarZzb = t10.zzb();
                final Bundle bundle3 = bundle2;
                bundle2 = bundle3;
                qVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.U10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70520a.b(jC, t10, bundle3);
                    }
                }, C6908Kq.f68180g);
                arrayList.add(qVarZzb);
            }
        }
        com.google.common.util.concurrent.q qVarA = Mj0.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.V10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    S10 s10 = (S10) ((com.google.common.util.concurrent.q) it.next()).get();
                    if (s10 != null) {
                        boolean z11 = z10;
                        s10.zzb(obj2);
                        if (z11) {
                            s10.zza(obj2);
                        }
                    }
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long jA2 = Lc.v.c().a();
                    if (obj2 instanceof AB) {
                        bundle4.putLong(EnumC7889eN.CLIENT_SIGNALS_END.a(), jA2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(EnumC7889eN.GMS_SIGNALS_END.a(), jA2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.f70982c);
        if (Z80.a()) {
            V80.a(qVarA, this.f70983d, k80A);
        }
        return qVarA;
    }

    public final void b(long j10, T10 t10, Bundle bundle) {
        long jC = Lc.v.c().c() - j10;
        if (((Boolean) C8982og.f77414a.e()).booleanValue()) {
            Pc.p0.k("Signal runtime (ms) : " + C7267Vf0.c(t10.getClass().getCanonicalName()) + " = " + jC);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76448o2)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + t10.zza(), jC);
                }
            }
        }
        if (!((Boolean) Mc.A.c().a(C8659lf.f76364i2)).booleanValue()) {
            return;
        }
        C9705vN c9705vNA = this.f70984e.a();
        c9705vNA.b("action", "lat_ms");
        c9705vNA.b("lat_grp", "sig_lat_grp");
        c9705vNA.b("lat_id", String.valueOf(t10.zza()));
        c9705vNA.b("clat_ms", String.valueOf(jC));
        if (((Boolean) Mc.A.c().a(C8659lf.f76378j2)).booleanValue()) {
            synchronized (this) {
                this.f70986g++;
            }
            c9705vNA.b("seq_num", Lc.v.s().i().d());
            synchronized (this) {
                try {
                    if (this.f70986g == this.f70981b.size() && this.f70985f != 0) {
                        this.f70986g = 0;
                        String strValueOf = String.valueOf(Lc.v.c().c() - this.f70985f);
                        if (t10.zza() > 39 && t10.zza() < 52) {
                            c9705vNA.b("lat_gmssg", strValueOf);
                        } else {
                            c9705vNA.b("lat_clsg", strValueOf);
                        }
                    }
                } finally {
                }
            }
        }
        c9705vNA.h();
    }
}
