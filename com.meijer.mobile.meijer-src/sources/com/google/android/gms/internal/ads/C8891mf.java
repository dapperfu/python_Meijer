package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8891mf {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, C7391Vf.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, C8572jg.f76323a);
        c(arrayList, C8572jg.f76324b);
        c(arrayList, C8572jg.f76325c);
        c(arrayList, C8572jg.f76326d);
        c(arrayList, C8572jg.f76327e);
        c(arrayList, C8572jg.f76343u);
        c(arrayList, C8572jg.f76328f);
        c(arrayList, C8572jg.f76335m);
        c(arrayList, C8572jg.f76336n);
        c(arrayList, C8572jg.f76337o);
        c(arrayList, C8572jg.f76338p);
        c(arrayList, C8572jg.f76339q);
        c(arrayList, C8572jg.f76340r);
        c(arrayList, C8572jg.f76341s);
        c(arrayList, C8572jg.f76342t);
        c(arrayList, C8572jg.f76329g);
        c(arrayList, C8572jg.f76330h);
        c(arrayList, C8572jg.f76331i);
        c(arrayList, C8572jg.f76332j);
        c(arrayList, C8572jg.f76333k);
        c(arrayList, C8572jg.f76334l);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, C10069xg.f80670a);
        return arrayList;
    }

    private static void c(List list, C7391Vf c7391Vf) {
        String str = (String) c7391Vf.e();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
