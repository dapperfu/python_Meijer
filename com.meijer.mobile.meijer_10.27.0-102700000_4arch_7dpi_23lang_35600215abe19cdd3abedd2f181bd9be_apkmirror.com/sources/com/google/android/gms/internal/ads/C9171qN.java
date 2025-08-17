package com.google.android.gms.internal.ads;

import Vc.C5366c;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.qN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9171qN {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f77769a;

    /* renamed from: b, reason: collision with root package name */
    private final C6704Eq f77770b;

    /* renamed from: c, reason: collision with root package name */
    private final C9570u60 f77771c;

    /* renamed from: d, reason: collision with root package name */
    private final String f77772d;

    /* renamed from: e, reason: collision with root package name */
    private final String f77773e;

    /* renamed from: f, reason: collision with root package name */
    private final Lc.k f77774f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f77775g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private final Context f77776h;

    public final Bundle a() {
        return this.f77775g;
    }

    public final Map b() {
        return this.f77769a;
    }

    public final void d(C8608l60 c8608l60) {
        if (!c8608l60.f75749b.f75336a.isEmpty()) {
            Z50 z50 = (Z50) c8608l60.f75749b.f75336a.get(0);
            c("ad_format", Z50.a(z50.f72023b));
            if (z50.f72023b == 6) {
                this.f77769a.put("as", true != this.f77770b.m() ? "0" : "1");
            }
        }
        c("gqi", c8608l60.f75749b.f75337b.f73103b);
    }

    public final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            c("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            c("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public C9171qN(Context context, CN cn2, C6704Eq c6704Eq, C9570u60 c9570u60, String str, String str2, Lc.k kVar) {
        ActivityManager.MemoryInfo memoryInfoF;
        String str3;
        ConcurrentHashMap concurrentHashMapC = cn2.c();
        this.f77769a = concurrentHashMapC;
        this.f77770b = c6704Eq;
        this.f77771c = c9570u60;
        this.f77772d = str;
        this.f77773e = str2;
        this.f77774f = kVar;
        this.f77776h = context;
        concurrentHashMapC.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) Mc.A.c().a(C8659lf.f76525t9)).booleanValue()) {
            int iK = kVar.k();
            int i10 = iK - 1;
            if (iK != 0) {
                if (i10 == 0) {
                    str3 = "1";
                } else if (i10 != 1) {
                    str3 = "na";
                } else {
                    str3 = "2";
                }
                concurrentHashMapC.put("asv", str3);
            } else {
                throw null;
            }
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            c("rt_f", String.valueOf(runtime.freeMemory()));
            c("rt_m", String.valueOf(runtime.maxMemory()));
            c("rt_t", String.valueOf(runtime.totalMemory()));
            c("wv_c", String.valueOf(Lc.v.s().c()));
            if (((Boolean) Mc.A.c().a(C8659lf.f76462p2)).booleanValue() && (memoryInfoF = Qc.g.f(context)) != null) {
                c("mem_avl", String.valueOf(memoryInfoF.availMem));
                c("mem_tt", String.valueOf(memoryInfoF.totalMem));
                c("low_m", true != memoryInfoF.lowMemory ? "0" : "1");
            }
        }
        if (!((Boolean) Mc.A.c().a(C8659lf.f76061M6)).booleanValue()) {
            return;
        }
        int iF = C5366c.f(c9570u60) - 1;
        if (iF != 0) {
            if (iF != 1) {
                if (iF != 2) {
                    if (iF != 3) {
                        concurrentHashMapC.put("se", "r_both");
                    } else {
                        concurrentHashMapC.put("se", "r_adstring");
                    }
                } else {
                    concurrentHashMapC.put("se", "r_adinfo");
                }
            } else {
                concurrentHashMapC.put("request_id", str);
                concurrentHashMapC.put("se", "query_g");
            }
            concurrentHashMapC.put("scar", "true");
            c("ragent", c9570u60.f78738d.f19182p);
            c("rtype", C5366c.b(C5366c.c(c9570u60.f78738d)));
            return;
        }
        concurrentHashMapC.put("request_id", str);
        concurrentHashMapC.put("scar", "false");
    }

    public final void c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f77769a.put(str, str2);
        }
    }
}
