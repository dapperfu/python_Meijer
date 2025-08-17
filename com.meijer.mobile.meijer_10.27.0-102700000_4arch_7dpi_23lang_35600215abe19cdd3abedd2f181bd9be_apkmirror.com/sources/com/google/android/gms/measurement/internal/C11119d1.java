package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11119d1 {

    /* renamed from: a, reason: collision with root package name */
    private final Od.u f85397a;

    final Od.u a() {
        return this.f85397a;
    }

    final String b() {
        return String.valueOf(E3.m(this.f85397a));
    }

    C11119d1(Od.u uVar) {
        this.f85397a = uVar;
    }

    static C11119d1 c(String str) {
        Od.u uVarJ;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            uVarJ = E3.j(str.charAt(0));
        } else {
            uVarJ = Od.u.UNINITIALIZED;
        }
        return new C11119d1(uVarJ);
    }
}
