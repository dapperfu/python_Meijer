package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: com.google.android.gms.internal.ads.va, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9843va implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9950wa f79919a;

    C9843va(C9950wa c9950wa) {
        this.f79919a = c9950wa;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            this.f79919a.f80334a = System.currentTimeMillis();
            this.f79919a.f80337d = true;
            return;
        }
        C9950wa c9950wa = this.f79919a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c9950wa.f80335b > 0) {
            C9950wa c9950wa2 = this.f79919a;
            if (jCurrentTimeMillis >= c9950wa2.f80335b) {
                c9950wa2.f80336c = jCurrentTimeMillis - c9950wa2.f80335b;
            }
        }
        this.f79919a.f80337d = false;
    }
}
