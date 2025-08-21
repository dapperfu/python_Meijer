package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11244d1 {

    /* renamed from: a, reason: collision with root package name */
    private final Qd.u f86237a;

    final Qd.u a() {
        return this.f86237a;
    }

    final String b() {
        return String.valueOf(E3.m(this.f86237a));
    }

    C11244d1(Qd.u uVar) {
        this.f86237a = uVar;
    }

    static C11244d1 c(String str) {
        Qd.u uVarJ;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            uVarJ = E3.j(str.charAt(0));
        } else {
            uVarJ = Qd.u.UNINITIALIZED;
        }
        return new C11244d1(uVarJ);
    }
}
