package androidx.media3.ui;

import android.graphics.Color;
import d3.P;

/* renamed from: androidx.media3.ui.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6240a {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i10) {
        return P.F("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }
}
