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
    private final Context f71820a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f71821b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f71822c;

    /* renamed from: d, reason: collision with root package name */
    private final W80 f71823d;

    /* renamed from: e, reason: collision with root package name */
    private final C9937wN f71824e;

    /* renamed from: f, reason: collision with root package name */
    private long f71825f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f71826g = 0;

    public W10(Context context, Executor executor, Set set, W80 w80, C9937wN c9937wN) {
        this.f71820a = context;
        this.f71822c = executor;
        this.f71821b = set;
        this.f71823d = w80;
        this.f71824e = c9937wN;
    }

    public final com.google.common.util.concurrent.q a(final Object obj, final Bundle bundle, final boolean z10) {
        K80 k80A = J80.a(this.f71820a, 8);
        k80A.zzi();
        final ArrayList arrayList = new ArrayList(this.f71821b.size());
        List arrayList2 = new ArrayList();
        AbstractC7718bf abstractC7718bf = C8784lf.f76780Db;
        if (!((String) Oc.A.c().a(abstractC7718bf)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) Oc.A.c().a(abstractC7718bf)).split(","));
        }
        this.f71825f = Nc.v.c().c();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue() && bundle != null) {
            long jA = Nc.v.c().a();
            if (obj instanceof AB) {
                bundle.putLong(EnumC8014eN.CLIENT_SIGNALS_START.a(), jA);
            } else {
                bundle.putLong(EnumC8014eN.GMS_SIGNALS_START.a(), jA);
            }
        }
        for (final T10 t10 : this.f71821b) {
            if (!arrayList2.contains(String.valueOf(t10.zza()))) {
                final long jC = Nc.v.c().c();
                com.google.common.util.concurrent.q qVarZzb = t10.zzb();
                final Bundle bundle3 = bundle2;
                bundle2 = bundle3;
                qVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.U10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f71360a.b(jC, t10, bundle3);
                    }
                }, C7033Kq.f69020g);
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
                if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long jA2 = Nc.v.c().a();
                    if (obj2 instanceof AB) {
                        bundle4.putLong(EnumC8014eN.CLIENT_SIGNALS_END.a(), jA2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(EnumC8014eN.GMS_SIGNALS_END.a(), jA2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.f71822c);
        if (Z80.a()) {
            V80.a(qVarA, this.f71823d, k80A);
        }
        return qVarA;
    }

    public final void b(long j10, T10 t10, Bundle bundle) {
        long jC = Nc.v.c().c() - j10;
        if (((Boolean) C9107og.f78254a.e()).booleanValue()) {
            Rc.p0.k("Signal runtime (ms) : " + C7392Vf0.c(t10.getClass().getCanonicalName()) + " = " + jC);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77288o2)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + t10.zza(), jC);
                }
            }
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f77204i2)).booleanValue()) {
            return;
        }
        C9830vN c9830vNA = this.f71824e.a();
        c9830vNA.b("action", "lat_ms");
        c9830vNA.b("lat_grp", "sig_lat_grp");
        c9830vNA.b("lat_id", String.valueOf(t10.zza()));
        c9830vNA.b("clat_ms", String.valueOf(jC));
        if (((Boolean) Oc.A.c().a(C8784lf.f77218j2)).booleanValue()) {
            synchronized (this) {
                this.f71826g++;
            }
            c9830vNA.b("seq_num", Nc.v.s().i().d());
            synchronized (this) {
                try {
                    if (this.f71826g == this.f71821b.size() && this.f71825f != 0) {
                        this.f71826g = 0;
                        String strValueOf = String.valueOf(Nc.v.c().c() - this.f71825f);
                        if (t10.zza() > 39 && t10.zza() < 52) {
                            c9830vNA.b("lat_gmssg", strValueOf);
                        } else {
                            c9830vNA.b("lat_clsg", strValueOf);
                        }
                    }
                } finally {
                }
            }
        }
        c9830vNA.h();
    }
}
