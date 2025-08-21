package com.adobe.marketing.mobile.lifecycle;

import R5.InterfaceC5123j;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.lifecycle.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final R5.v f63408a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5123j f63409b;

    /* renamed from: c, reason: collision with root package name */
    private final e f63410c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f63411d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f63412e = new HashMap();

    private boolean e() {
        R5.v vVar = this.f63408a;
        String string = vVar != null ? vVar.getString("LastVersion", "") : "";
        return (this.f63409b == null || g6.i.a(string) || string.equalsIgnoreCase(this.f63409b.g())) ? false : true;
    }

    private void g(long j10) {
        R5.v vVar = this.f63408a;
        if (vVar == null) {
            R5.t.a("Lifecycle", "LifecycleState", "Failed to update lifecycle data, %s (DataStore)", "Unexpected Null Value");
            return;
        }
        vVar.e("LifecycleData", this.f63411d);
        this.f63408a.b("LastDateUsed", j10);
        InterfaceC5123j interfaceC5123j = this.f63409b;
        if (interfaceC5123j != null) {
            this.f63408a.d("LastVersion", interfaceC5123j.g());
        }
    }

    Map<String, String> b() {
        HashMap map = new HashMap();
        Map<String, String> mapC = c();
        if (mapC != null) {
            map.putAll(mapC);
        }
        map.putAll(new d(this.f63409b, this.f63408a, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).a().c().g());
        return map;
    }

    Map<String, String> c() {
        if (!this.f63411d.isEmpty()) {
            return this.f63411d;
        }
        if (!this.f63412e.isEmpty()) {
            return this.f63412e;
        }
        this.f63412e.putAll(d());
        return this.f63412e;
    }

    Map<String, String> d() {
        R5.v vVar = this.f63408a;
        if (vVar == null) {
            R5.t.f("Lifecycle", "LifecycleState", "Failed to read lifecycle data from persistence %s (DataStore)", "Unexpected Null Value");
            return new HashMap();
        }
        Map<String, String> mapA = vVar.a("LifecycleData");
        return mapA != null ? mapA : new HashMap();
    }

    void f(C6574h c6574h) {
        this.f63410c.b(c6574h.v());
    }

    e.a h(long j10, Map<String, String> map, String str, long j11, boolean z10) {
        String string;
        R5.v vVar = this.f63408a;
        String string2 = "";
        if (vVar != null) {
            string2 = vVar.getString("OsVersion", "");
            string = this.f63408a.getString("AppId", "");
        } else {
            string = "";
        }
        d dVar = new d(this.f63409b, this.f63408a, j10);
        Map<String, String> mapG = dVar.a().c().g();
        if (!z10) {
            a(mapG.get("appid"));
        }
        e.a aVarC = this.f63410c.c(j10, j11, mapG);
        if (aVarC == null) {
            return null;
        }
        this.f63411d.clear();
        HashMap map2 = new HashMap();
        if (z10) {
            dVar.d().c().a();
            map2.putAll(dVar.g());
        } else {
            dVar.e().f(e()).b(aVarC.c()).c().a();
            map2.putAll(dVar.g());
            map2.putAll(this.f63410c.a(j10, j11, aVarC));
            if (!g6.i.a(string2)) {
                map2.put("previousosversion", string2);
            }
            if (!g6.i.a(string)) {
                map2.put("previousappid", string);
            }
        }
        if (map != null) {
            map2.putAll(map);
        }
        if (!g6.i.a(str)) {
            map2.put("advertisingidentifier", str);
        }
        this.f63411d.putAll(map2);
        g(j10);
        return aVarC;
    }

    f(R5.v vVar, InterfaceC5123j interfaceC5123j) {
        this.f63408a = vVar;
        this.f63409b = interfaceC5123j;
        this.f63410c = new e(vVar);
    }

    void a(String str) {
        Map<String, String> mapC;
        if (e() && (mapC = c()) != null && !mapC.isEmpty()) {
            mapC.put("appid", str);
            if (this.f63411d.isEmpty()) {
                this.f63412e.put("appid", str);
                R5.v vVar = this.f63408a;
                if (vVar != null) {
                    vVar.e("LifecycleData", mapC);
                    return;
                }
                return;
            }
            this.f63411d.putAll(mapC);
        }
    }
}
