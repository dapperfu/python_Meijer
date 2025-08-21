package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import de.C13661a;

/* loaded from: classes4.dex */
class a extends c {
    private static float e(float f10) {
        return (float) (1.0d - Math.cos((f10 * 3.141592653589793d) / 2.0d));
    }

    private static float f(float f10) {
        return (float) Math.sin((f10 * 3.141592653589793d) / 2.0d);
    }

    a() {
    }

    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float f11;
        float fE;
        RectF rectFA = c.a(tabLayout, view);
        RectF rectFA2 = c.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            f11 = e(f10);
            fE = f(f10);
        } else {
            f11 = f(f10);
            fE = e(f10);
        }
        drawable.setBounds(C13661a.c((int) rectFA.left, (int) rectFA2.left, f11), drawable.getBounds().top, C13661a.c((int) rectFA.right, (int) rectFA2.right, fE), drawable.getBounds().bottom);
    }
}
