package com.airbnb.lottie;

import android.annotation.SuppressLint;
import android.os.Build;
import h6.y;
import java.util.HashSet;

/* loaded from: classes4.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<y> f63708a = new HashSet<>();

    @SuppressLint({"DefaultLocale"})
    public boolean a(y yVar, boolean z10) {
        if (!z10) {
            return this.f63708a.remove(yVar);
        }
        if (Build.VERSION.SDK_INT >= yVar.f135159a) {
            return this.f63708a.add(yVar);
        }
        v6.g.c(String.format("%s is not supported pre SDK %d", yVar.name(), Integer.valueOf(yVar.f135159a)));
        return false;
    }

    public boolean b(y yVar) {
        return this.f63708a.contains(yVar);
    }

    p() {
    }
}
