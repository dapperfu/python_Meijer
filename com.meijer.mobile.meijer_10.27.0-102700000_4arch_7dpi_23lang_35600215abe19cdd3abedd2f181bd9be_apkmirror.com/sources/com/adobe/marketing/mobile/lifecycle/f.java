package com.adobe.marketing.mobile.lifecycle;

import Q5.InterfaceC5078j;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.lifecycle.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final Q5.v f62569a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5078j f62570b;

    /* renamed from: c, reason: collision with root package name */
    private final e f62571c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f62572d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f62573e = new HashMap();

    private boolean e() {
        Q5.v vVar = this.f62569a;
        String string = vVar != null ? vVar.getString("LastVersion", "") : "";
        return (this.f62570b == null || f6.i.a(string) || string.equalsIgnoreCase(this.f62570b.g())) ? false : true;
    }

    private void g(long j10) {
        Q5.v vVar = this.f62569a;
        if (vVar == null) {
            Q5.t.a("Lifecycle", "LifecycleState", "Failed to update lifecycle data, %s (DataStore)", "Unexpected Null Value");
            return;
        }
        vVar.e("LifecycleData", this.f62572d);
        this.f62569a.b("LastDateUsed", j10);
        InterfaceC5078j interfaceC5078j = this.f62570b;
        if (interfaceC5078j != null) {
            this.f62569a.d("LastVersion", interfaceC5078j.g());
        }
    }

    Map<String, String> b() {
        HashMap map = new HashMap();
        Map<String, String> mapC = c();
        if (mapC != null) {
            map.putAll(mapC);
        }
        map.putAll(new d(this.f62570b, this.f62569a, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).a().c().g());
        return map;
    }

    Map<String, String> c() {
        if (!this.f62572d.isEmpty()) {
            return this.f62572d;
        }
        if (!this.f62573e.isEmpty()) {
            return this.f62573e;
        }
        this.f62573e.putAll(d());
        return this.f62573e;
    }

    Map<String, String> d() {
        Q5.v vVar = this.f62569a;
        if (vVar == null) {
            Q5.t.f("Lifecycle", "LifecycleState", "Failed to read lifecycle data from persistence %s (DataStore)", "Unexpected Null Value");
            return new HashMap();
        }
        Map<String, String> mapA = vVar.a("LifecycleData");
        return mapA != null ? mapA : new HashMap();
    }

    void f(C6449h c6449h) {
        this.f62571c.b(c6449h.v());
    }

    e.a h(long j10, Map<String, String> map, String str, long j11, boolean z10) {
        String string;
        Q5.v vVar = this.f62569a;
        String string2 = "";
        if (vVar != null) {
            string2 = vVar.getString("OsVersion", "");
            string = this.f62569a.getString("AppId", "");
        } else {
            string = "";
        }
        d dVar = new d(this.f62570b, this.f62569a, j10);
        Map<String, String> mapG = dVar.a().c().g();
        if (!z10) {
            a(mapG.get("appid"));
        }
        e.a aVarC = this.f62571c.c(j10, j11, mapG);
        if (aVarC == null) {
            return null;
        }
        this.f62572d.clear();
        HashMap map2 = new HashMap();
        if (z10) {
            dVar.d().c().a();
            map2.putAll(dVar.g());
        } else {
            dVar.e().f(e()).b(aVarC.c()).c().a();
            map2.putAll(dVar.g());
            map2.putAll(this.f62571c.a(j10, j11, aVarC));
            if (!f6.i.a(string2)) {
                map2.put("previousosversion", string2);
            }
            if (!f6.i.a(string)) {
                map2.put("previousappid", string);
            }
        }
        if (map != null) {
            map2.putAll(map);
        }
        if (!f6.i.a(str)) {
            map2.put("advertisingidentifier", str);
        }
        this.f62572d.putAll(map2);
        g(j10);
        return aVarC;
    }

    f(Q5.v vVar, InterfaceC5078j interfaceC5078j) {
        this.f62569a = vVar;
        this.f62570b = interfaceC5078j;
        this.f62571c = new e(vVar);
    }

    void a(String str) {
        Map<String, String> mapC;
        if (e() && (mapC = c()) != null && !mapC.isEmpty()) {
            mapC.put("appid", str);
            if (this.f62572d.isEmpty()) {
                this.f62573e.put("appid", str);
                Q5.v vVar = this.f62569a;
                if (vVar != null) {
                    vVar.e("LifecycleData", mapC);
                    return;
                }
                return;
            }
            this.f62572d.putAll(mapC);
        }
    }
}
