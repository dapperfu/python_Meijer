package com.adobe.marketing.mobile.assurance.internal;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6436s implements r {

    /* renamed from: a, reason: collision with root package name */
    private C6442y f62286a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f62287b = com.adobe.marketing.mobile.B.h().getSharedPreferences("com.adobe.assurance.preferences", 0);

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void a() {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void f(int i10) {
    }

    private void h() {
        SharedPreferences.Editor editorEdit = this.f62287b.edit();
        editorEdit.remove("modifiedConfigKeys");
        editorEdit.apply();
    }

    private void i(Set<String> set) {
        if (this.f62287b == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ConfigUpdate - Configuration modified for keys");
        Set<String> stringSet = this.f62287b.getStringSet("modifiedConfigKeys", null);
        HashSet hashSet = stringSet == null ? new HashSet() : new HashSet(stringSet);
        hashSet.addAll(set);
        SharedPreferences.Editor editorEdit = this.f62287b.edit();
        editorEdit.putStringSet("modifiedConfigKeys", hashSet);
        editorEdit.apply();
        for (String str : set) {
            sb2.append("\n ");
            sb2.append(str);
        }
        C6442y c6442y = this.f62286a;
        if (c6442y != null) {
            c6442y.o(EnumC6429k.HIGH, sb2.toString());
        }
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void b() {
        SharedPreferences sharedPreferences = this.f62287b;
        if (sharedPreferences == null) {
            return;
        }
        Set<String> stringSet = sharedPreferences.getStringSet("modifiedConfigKeys", null);
        if (stringSet != null) {
            HashMap map = new HashMap();
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                map.put(it.next(), null);
            }
            com.adobe.marketing.mobile.B.u(map);
        }
        h();
        this.f62286a = null;
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public String c() {
        return "com.adobe.griffon.mobile";
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public String d() {
        return "configUpdate";
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void g(C6442y c6442y) {
        this.f62286a = c6442y;
    }

    C6436s() {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void e(C6430l c6430l) {
        HashMap<String, Object> mapA = c6430l.a();
        if (F.h(mapA)) {
            Q5.t.f("Assurance", "AssurancePluginConfigSwitcher", "ConfigUpdate Control event details is empty, Ignoring to update config.", new Object[0]);
            return;
        }
        Q5.t.a("Assurance", "AssurancePluginConfigSwitcher", "Updating the configuration.", new Object[0]);
        com.adobe.marketing.mobile.B.u(mapA);
        i(mapA.keySet());
    }
}
