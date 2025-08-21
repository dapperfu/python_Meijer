package k4;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: k4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15086b {
    private static int b() {
        return 0;
    }

    private static String c(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(c(context), b());
    }
}
