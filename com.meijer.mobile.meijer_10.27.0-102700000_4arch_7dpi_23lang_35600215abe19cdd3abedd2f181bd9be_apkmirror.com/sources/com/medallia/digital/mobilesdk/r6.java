package com.medallia.digital.mobilesdk;

import android.os.Build;
import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes7.dex */
final class r6 {
    r6() {
    }

    protected static boolean a() {
        return !d7.b().a(d7.a.LAST_OS_VERSION, "").equals(Build.VERSION.RELEASE);
    }

    protected static boolean b() {
        return !d7.b().a(d7.a.LAST_SDK_VERSION, "").equals("4.8.1");
    }

    protected static void c() {
        d7.b().b(d7.a.LAST_SDK_VERSION, "4.8.1");
        d7.b().b(d7.a.LAST_OS_VERSION, Build.VERSION.RELEASE);
    }
}
