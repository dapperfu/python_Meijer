package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.view.Window;

/* loaded from: classes8.dex */
class v6 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f94016a = 24;

    v6() {
    }

    protected static int a() {
        return (i4.c().b().getResources().getDisplayMetrics().densityDpi * f94016a) / 160;
    }

    protected static int b() {
        return i4.c().b().getResources().getIdentifier("status_bar_height", "dimen", "android");
    }

    protected static boolean c() {
        return (b() > 0 ? i4.c().b().getResources().getDimensionPixelSize(i4.c().b().getResources().getIdentifier("status_bar_height", "dimen", "android")) : 0) > a();
    }

    protected static int a(Context context, int i10) {
        return context == null ? i10 : (i10 * context.getResources().getDisplayMetrics().densityDpi) / 160;
    }

    protected static boolean b(Window window) {
        return ((window.getDecorView().getSystemUiVisibility() & 1024) == 0 && (window.getAttributes().flags & 67108864) == 0) ? false : true;
    }

    protected static boolean a(Window window) {
        return (window.getDecorView().getSystemUiVisibility() & 512) != 0;
    }
}
