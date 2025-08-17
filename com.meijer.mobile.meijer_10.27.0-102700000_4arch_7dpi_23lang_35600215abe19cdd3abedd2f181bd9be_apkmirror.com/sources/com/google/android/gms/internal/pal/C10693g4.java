package com.google.android.gms.internal.pal;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: com.google.android.gms.internal.pal.g4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10693g4 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10709h4 f83135a;

    C10693g4(C10709h4 c10709h4) {
        this.f83135a = c10709h4;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            this.f83135a.f83149a = System.currentTimeMillis();
            this.f83135a.f83152d = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C10709h4 c10709h4 = this.f83135a;
            if (c10709h4.f83150b > 0 && jCurrentTimeMillis >= c10709h4.f83150b) {
                c10709h4.f83151c = jCurrentTimeMillis - c10709h4.f83150b;
            }
            this.f83135a.f83152d = false;
        }
    }
}
