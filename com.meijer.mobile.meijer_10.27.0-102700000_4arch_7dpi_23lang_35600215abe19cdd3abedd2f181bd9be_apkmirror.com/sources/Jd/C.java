package Jd;

/* loaded from: classes6.dex */
public final class C {
    public static int a(int i10) {
        boolean z10 = true;
        if (i10 != 100 && i10 != 102 && i10 != 104) {
            if (i10 == 105) {
                i10 = 105;
            } else {
                z10 = false;
            }
        }
        com.google.android.gms.common.internal.r.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    public static String b(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
