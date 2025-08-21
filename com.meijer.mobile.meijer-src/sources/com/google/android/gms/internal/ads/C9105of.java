package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9105of {

    /* renamed from: a, reason: collision with root package name */
    private final String f78250a = (String) C8253gg.f75207a.e();

    /* renamed from: b, reason: collision with root package name */
    private final Map f78251b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f78252c;

    /* renamed from: d, reason: collision with root package name */
    private final String f78253d;

    final Context a() {
        return this.f78252c;
    }

    final String b() {
        return this.f78253d;
    }

    final String c() {
        return this.f78250a;
    }

    final Map d() {
        return this.f78251b;
    }

    public C9105of(Context context, String str) {
        String packageName;
        Object obj;
        this.f78252c = context;
        this.f78253d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f78251b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        Nc.v.t();
        linkedHashMap.put("device", Rc.D0.X());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        Nc.v.t();
        if (true == Rc.D0.f(context)) {
            obj = "1";
        } else {
            obj = "0";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future futureB = Nc.v.q().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C6691Ao) futureB.get()).f66023j));
            linkedHashMap.put("network_fine", Integer.toString(((C6691Ao) futureB.get()).f66024k));
        } catch (Exception e10) {
            Nc.v.s().x(e10, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77227jb)).booleanValue()) {
            Map map = this.f78251b;
            Nc.v.t();
            map.put("is_bstar", true != Rc.D0.c(context) ? "0" : "1");
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77295o9)).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77358t2)).booleanValue() && !C7392Vf0.d(Nc.v.s().o())) {
                this.f78251b.put("plugin", Nc.v.s().o());
            }
        }
    }
}
