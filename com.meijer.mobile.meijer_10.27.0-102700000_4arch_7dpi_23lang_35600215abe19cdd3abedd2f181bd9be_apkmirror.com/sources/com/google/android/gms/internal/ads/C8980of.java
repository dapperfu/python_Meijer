package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8980of {

    /* renamed from: a, reason: collision with root package name */
    private final String f77410a = (String) C8128gg.f74367a.e();

    /* renamed from: b, reason: collision with root package name */
    private final Map f77411b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f77412c;

    /* renamed from: d, reason: collision with root package name */
    private final String f77413d;

    final Context a() {
        return this.f77412c;
    }

    final String b() {
        return this.f77413d;
    }

    final String c() {
        return this.f77410a;
    }

    final Map d() {
        return this.f77411b;
    }

    public C8980of(Context context, String str) {
        String packageName;
        Object obj;
        this.f77412c = context;
        this.f77413d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f77411b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        Lc.v.t();
        linkedHashMap.put("device", Pc.D0.X());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        Lc.v.t();
        if (true == Pc.D0.f(context)) {
            obj = "1";
        } else {
            obj = "0";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future futureB = Lc.v.q().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C6566Ao) futureB.get()).f65183j));
            linkedHashMap.put("network_fine", Integer.toString(((C6566Ao) futureB.get()).f65184k));
        } catch (Exception e10) {
            Lc.v.s().x(e10, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76387jb)).booleanValue()) {
            Map map = this.f77411b;
            Lc.v.t();
            map.put("is_bstar", true != Pc.D0.c(context) ? "0" : "1");
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76455o9)).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76518t2)).booleanValue() && !C7267Vf0.d(Lc.v.s().o())) {
                this.f77411b.put("plugin", Lc.v.s().o());
            }
        }
    }
}
