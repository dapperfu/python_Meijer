package com.google.android.gms.internal.ads;

import Xc.C5569c;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.qN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9296qN {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f78609a;

    /* renamed from: b, reason: collision with root package name */
    private final C6829Eq f78610b;

    /* renamed from: c, reason: collision with root package name */
    private final C9695u60 f78611c;

    /* renamed from: d, reason: collision with root package name */
    private final String f78612d;

    /* renamed from: e, reason: collision with root package name */
    private final String f78613e;

    /* renamed from: f, reason: collision with root package name */
    private final Nc.k f78614f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f78615g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private final Context f78616h;

    public final Bundle a() {
        return this.f78615g;
    }

    public final Map b() {
        return this.f78609a;
    }

    public final void d(C8733l60 c8733l60) {
        if (!c8733l60.f76589b.f76176a.isEmpty()) {
            Z50 z50 = (Z50) c8733l60.f76589b.f76176a.get(0);
            c("ad_format", Z50.a(z50.f72863b));
            if (z50.f72863b == 6) {
                this.f78609a.put("as", true != this.f78610b.m() ? "0" : "1");
            }
        }
        c("gqi", c8733l60.f76589b.f76177b.f73943b);
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

    public C9296qN(Context context, CN cn2, C6829Eq c6829Eq, C9695u60 c9695u60, String str, String str2, Nc.k kVar) {
        ActivityManager.MemoryInfo memoryInfoF;
        String str3;
        ConcurrentHashMap concurrentHashMapC = cn2.c();
        this.f78609a = concurrentHashMapC;
        this.f78610b = c6829Eq;
        this.f78611c = c9695u60;
        this.f78612d = str;
        this.f78613e = str2;
        this.f78614f = kVar;
        this.f78616h = context;
        concurrentHashMapC.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) Oc.A.c().a(C8784lf.f77365t9)).booleanValue()) {
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
        if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            c("rt_f", String.valueOf(runtime.freeMemory()));
            c("rt_m", String.valueOf(runtime.maxMemory()));
            c("rt_t", String.valueOf(runtime.totalMemory()));
            c("wv_c", String.valueOf(Nc.v.s().c()));
            if (((Boolean) Oc.A.c().a(C8784lf.f77302p2)).booleanValue() && (memoryInfoF = Sc.g.f(context)) != null) {
                c("mem_avl", String.valueOf(memoryInfoF.availMem));
                c("mem_tt", String.valueOf(memoryInfoF.totalMem));
                c("low_m", true != memoryInfoF.lowMemory ? "0" : "1");
            }
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f76901M6)).booleanValue()) {
            return;
        }
        int iF = C5569c.f(c9695u60) - 1;
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
            c("ragent", c9695u60.f79578d.f23369p);
            c("rtype", C5569c.b(C5569c.c(c9695u60.f79578d)));
            return;
        }
        concurrentHashMapC.put("request_id", str);
        concurrentHashMapC.put("scar", "false");
    }

    public final void c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f78609a.put(str, str2);
        }
    }
}
