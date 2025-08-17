package com.airbnb.lottie;

import android.annotation.SuppressLint;
import android.os.Build;
import g6.y;
import java.util.HashSet;

/* loaded from: classes4.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<y> f62869a = new HashSet<>();

    @SuppressLint({"DefaultLocale"})
    public boolean a(y yVar, boolean z10) {
        if (!z10) {
            return this.f62869a.remove(yVar);
        }
        if (Build.VERSION.SDK_INT >= yVar.f132983a) {
            return this.f62869a.add(yVar);
        }
        u6.g.c(String.format("%s is not supported pre SDK %d", yVar.name(), Integer.valueOf(yVar.f132983a)));
        return false;
    }

    public boolean b(y yVar) {
        return this.f62869a.contains(yVar);
    }

    p() {
    }
}
