package com.google.android.gms.internal.atv_ads_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10262v {

    /* renamed from: a, reason: collision with root package name */
    private final C10233l f81065a;

    /* renamed from: b, reason: collision with root package name */
    private final C10256t f81066b;

    private C10262v(C10256t c10256t) {
        C10230k c10230k = C10230k.f81020b;
        this.f81066b = c10256t;
        this.f81065a = c10230k;
    }

    public static C10262v b(char c10) {
        return new C10262v(new C10256t(new C10224i(':')));
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        C10253s c10253s = new C10253s(this.f81066b, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c10253s.hasNext()) {
            arrayList.add((String) c10253s.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
