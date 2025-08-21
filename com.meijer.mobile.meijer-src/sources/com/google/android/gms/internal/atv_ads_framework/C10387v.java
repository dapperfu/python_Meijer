package com.google.android.gms.internal.atv_ads_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10387v {

    /* renamed from: a, reason: collision with root package name */
    private final C10358l f81905a;

    /* renamed from: b, reason: collision with root package name */
    private final C10381t f81906b;

    private C10387v(C10381t c10381t) {
        C10355k c10355k = C10355k.f81860b;
        this.f81906b = c10381t;
        this.f81905a = c10355k;
    }

    public static C10387v b(char c10) {
        return new C10387v(new C10381t(new C10349i(':')));
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        C10378s c10378s = new C10378s(this.f81906b, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c10378s.hasNext()) {
            arrayList.add((String) c10378s.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
