package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import ie.C14718a;
import p2.C16218j0;

/* loaded from: classes4.dex */
public class e {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = C14718a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        C16218j0.b(window, !z10);
        int iC = c(window.getContext(), z10);
        int iB2 = b(window.getContext(), z10);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, C14718a.h(num.intValue())));
        e(window, d(iB2, C14718a.h(num2.intValue())));
    }

    @TargetApi(21)
    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return c2.c.k(C14718a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return C14718a.b(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return C14718a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        if (!C14718a.h(i10)) {
            if (i10 != 0 || !z10) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void e(Window window, boolean z10) {
        C16218j0.a(window, window.getDecorView()).b(z10);
    }

    public static void f(Window window, boolean z10) {
        C16218j0.a(window, window.getDecorView()).c(z10);
    }
}
