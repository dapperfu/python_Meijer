package androidx.biometric;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import r.C16794a;

/* loaded from: classes.dex */
class i {
    private static boolean b(Context context, String str, int i10) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(Context context, String str, int i10) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(Context context, String str, int i10) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, C16794a.f159109a);
    }

    static boolean e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return b(context, str, C16794a.f159112d);
    }

    static boolean f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, C16794a.f159113e);
    }

    static boolean g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return d(context, str, C16794a.f159111c) || c(context, str2, C16794a.f159110b);
    }
}
