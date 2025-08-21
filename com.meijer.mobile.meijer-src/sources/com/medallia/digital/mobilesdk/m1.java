package com.medallia.digital.mobilesdk;

import android.os.Environment;
import java.text.DecimalFormat;
import java.util.Locale;

/* loaded from: classes8.dex */
final class m1 {
    m1() {
    }

    protected static double a(long j10) {
        return j10 / 1048576.0d;
    }

    protected static String b(double d10) {
        return d10 > 0.0d ? String.format(Locale.US, "%s MB", new DecimalFormat("#0.00").format(a(d10))) : String.format(Locale.US, "%d MB", 0);
    }

    protected static long a(double d10) {
        if (d10 == 0.0d) {
            return 0L;
        }
        return (long) (d10 / 1048576.0d);
    }

    protected static boolean a() {
        return Environment.isExternalStorageRemovable() && Environment.getExternalStorageState().equals("mounted");
    }
}
