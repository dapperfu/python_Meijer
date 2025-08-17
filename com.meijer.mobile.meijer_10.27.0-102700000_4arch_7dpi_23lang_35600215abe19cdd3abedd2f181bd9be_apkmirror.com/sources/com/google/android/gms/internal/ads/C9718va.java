package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: com.google.android.gms.internal.ads.va, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9718va implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9825wa f79079a;

    C9718va(C9825wa c9825wa) {
        this.f79079a = c9825wa;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            this.f79079a.f79494a = System.currentTimeMillis();
            this.f79079a.f79497d = true;
            return;
        }
        C9825wa c9825wa = this.f79079a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c9825wa.f79495b > 0) {
            C9825wa c9825wa2 = this.f79079a;
            if (jCurrentTimeMillis >= c9825wa2.f79495b) {
                c9825wa2.f79496c = jCurrentTimeMillis - c9825wa2.f79495b;
            }
        }
        this.f79079a.f79497d = false;
    }
}
