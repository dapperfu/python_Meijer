package androidx.biometric;

import android.content.Context;
import com.fullstory.FS;

/* loaded from: classes.dex */
class j {
    static boolean b(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }

    static boolean c(int i10) {
        return i10 == 7 || i10 == 9;
    }

    static String a(Context context, int i10) {
        if (context == null) {
            return "";
        }
        if (i10 == 1) {
            return context.getString(r.g.f159126d);
        }
        if (i10 != 7) {
            switch (i10) {
                case 9:
                    break;
                case 10:
                    return context.getString(r.g.f159130h);
                case 11:
                    return context.getString(r.g.f159129g);
                case 12:
                    return context.getString(r.g.f159127e);
                default:
                    FS.log_e("BiometricUtils", "Unknown error code: " + i10);
                    return context.getString(r.g.f159124b);
            }
        }
        return context.getString(r.g.f159128f);
    }
}
