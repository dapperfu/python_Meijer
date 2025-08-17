package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static final double f47714a = Math.cos(Math.toRadians(45.0d));

    static float a(float f10, float f11, boolean z10) {
        return z10 ? (float) (f10 + ((1.0d - f47714a) * f11)) : f10;
    }

    static float b(float f10, float f11, boolean z10) {
        return z10 ? (float) ((f10 * 1.5f) + ((1.0d - f47714a) * f11)) : f10 * 1.5f;
    }
}
