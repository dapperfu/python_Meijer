package com.adobe.marketing.mobile.assurance.internal;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6561s implements r {

    /* renamed from: a, reason: collision with root package name */
    private C6567y f63125a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f63126b = com.adobe.marketing.mobile.B.h().getSharedPreferences("com.adobe.assurance.preferences", 0);

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void a() {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void f(int i10) {
    }

    private void h() {
        SharedPreferences.Editor editorEdit = this.f63126b.edit();
        editorEdit.remove("modifiedConfigKeys");
        editorEdit.apply();
    }

    private void i(Set<String> set) {
        if (this.f63126b == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ConfigUpdate - Configuration modified for keys");
        Set<String> stringSet = this.f63126b.getStringSet("modifiedConfigKeys", null);
        HashSet hashSet = stringSet == null ? new HashSet() : new HashSet(stringSet);
        hashSet.addAll(set);
        SharedPreferences.Editor editorEdit = this.f63126b.edit();
        editorEdit.putStringSet("modifiedConfigKeys", hashSet);
        editorEdit.apply();
        for (String str : set) {
            sb2.append("\n ");
            sb2.append(str);
        }
        C6567y c6567y = this.f63125a;
        if (c6567y != null) {
            c6567y.o(EnumC6554k.HIGH, sb2.toString());
        }
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void b() {
        SharedPreferences sharedPreferences = this.f63126b;
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
        this.f63125a = null;
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
    public void g(C6567y c6567y) {
        this.f63125a = c6567y;
    }

    C6561s() {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void e(C6555l c6555l) {
        HashMap<String, Object> mapA = c6555l.a();
        if (F.h(mapA)) {
            R5.t.f("Assurance", "AssurancePluginConfigSwitcher", "ConfigUpdate Control event details is empty, Ignoring to update config.", new Object[0]);
            return;
        }
        R5.t.a("Assurance", "AssurancePluginConfigSwitcher", "Updating the configuration.", new Object[0]);
        com.adobe.marketing.mobile.B.u(mapA);
        i(mapA.keySet());
    }
}
