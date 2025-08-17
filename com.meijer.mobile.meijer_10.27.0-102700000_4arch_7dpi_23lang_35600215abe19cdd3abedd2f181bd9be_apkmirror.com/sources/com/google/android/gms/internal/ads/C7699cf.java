package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7699cf {

    /* renamed from: a, reason: collision with root package name */
    private final List f73218a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f73219b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f73220c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f73219b.iterator();
        while (it.hasNext()) {
            String str = (String) Mc.A.c().a((AbstractC7593bf) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(C8766mf.a());
        return arrayList;
    }

    public final void c(AbstractC7593bf abstractC7593bf) {
        this.f73219b.add(abstractC7593bf);
    }

    public final void d(AbstractC7593bf abstractC7593bf) {
        this.f73218a.add(abstractC7593bf);
    }

    public final void e(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (AbstractC7593bf abstractC7593bf : this.f73218a) {
            if (abstractC7593bf.e() == 1) {
                abstractC7593bf.d(editor, abstractC7593bf.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            Qc.p.d("Flag Json is null.");
        }
    }

    public final List b() {
        List listA = a();
        Iterator it = this.f73220c.iterator();
        while (it.hasNext()) {
            String str = (String) Mc.A.c().a((AbstractC7593bf) it.next());
            if (!TextUtils.isEmpty(str)) {
                listA.add(str);
            }
        }
        listA.addAll(C8766mf.b());
        return listA;
    }
}
