package com.google.android.gms.internal.pal;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: com.google.android.gms.internal.pal.g4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10818g4 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10834h4 f83975a;

    C10818g4(C10834h4 c10834h4) {
        this.f83975a = c10834h4;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            this.f83975a.f83989a = System.currentTimeMillis();
            this.f83975a.f83992d = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C10834h4 c10834h4 = this.f83975a;
            if (c10834h4.f83990b > 0 && jCurrentTimeMillis >= c10834h4.f83990b) {
                c10834h4.f83991c = jCurrentTimeMillis - c10834h4.f83990b;
            }
            this.f83975a.f83992d = false;
        }
    }
}
