package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8766mf {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, C7266Vf.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, C8447jg.f75483a);
        c(arrayList, C8447jg.f75484b);
        c(arrayList, C8447jg.f75485c);
        c(arrayList, C8447jg.f75486d);
        c(arrayList, C8447jg.f75487e);
        c(arrayList, C8447jg.f75503u);
        c(arrayList, C8447jg.f75488f);
        c(arrayList, C8447jg.f75495m);
        c(arrayList, C8447jg.f75496n);
        c(arrayList, C8447jg.f75497o);
        c(arrayList, C8447jg.f75498p);
        c(arrayList, C8447jg.f75499q);
        c(arrayList, C8447jg.f75500r);
        c(arrayList, C8447jg.f75501s);
        c(arrayList, C8447jg.f75502t);
        c(arrayList, C8447jg.f75489g);
        c(arrayList, C8447jg.f75490h);
        c(arrayList, C8447jg.f75491i);
        c(arrayList, C8447jg.f75492j);
        c(arrayList, C8447jg.f75493k);
        c(arrayList, C8447jg.f75494l);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, C9944xg.f79830a);
        return arrayList;
    }

    private static void c(List list, C7266Vf c7266Vf) {
        String str = (String) c7266Vf.e();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
