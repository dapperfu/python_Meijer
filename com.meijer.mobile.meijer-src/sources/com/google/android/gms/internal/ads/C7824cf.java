package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7824cf {

    /* renamed from: a, reason: collision with root package name */
    private final List f74058a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f74059b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f74060c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f74059b.iterator();
        while (it.hasNext()) {
            String str = (String) Oc.A.c().a((AbstractC7718bf) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(C8891mf.a());
        return arrayList;
    }

    public final void c(AbstractC7718bf abstractC7718bf) {
        this.f74059b.add(abstractC7718bf);
    }

    public final void d(AbstractC7718bf abstractC7718bf) {
        this.f74058a.add(abstractC7718bf);
    }

    public final void e(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (AbstractC7718bf abstractC7718bf : this.f74058a) {
            if (abstractC7718bf.e() == 1) {
                abstractC7718bf.d(editor, abstractC7718bf.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            Sc.p.d("Flag Json is null.");
        }
    }

    public final List b() {
        List listA = a();
        Iterator it = this.f74060c.iterator();
        while (it.hasNext()) {
            String str = (String) Oc.A.c().a((AbstractC7718bf) it.next());
            if (!TextUtils.isEmpty(str)) {
                listA.add(str);
            }
        }
        listA.addAll(C8891mf.b());
        return listA;
    }
}
