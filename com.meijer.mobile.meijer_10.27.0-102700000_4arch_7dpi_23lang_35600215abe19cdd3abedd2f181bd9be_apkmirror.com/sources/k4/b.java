package k4;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public class b {
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
