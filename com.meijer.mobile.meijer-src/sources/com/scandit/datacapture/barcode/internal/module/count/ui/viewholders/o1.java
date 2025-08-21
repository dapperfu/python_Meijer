package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class o1 {
    public static void a(y1 y1Var, boolean z10, String str) {
        q1 onFinished = q1.f123017a;
        Intrinsics.j(onFinished, "onFinished");
        if (y1Var.f123062a) {
            y1Var.f123064c.a(new w1(z10, y1Var, str, onFinished));
        }
    }

    public static void b(y1 y1Var, boolean z10, String str) {
        r1 onFinished = r1.f123019a;
        Intrinsics.j(onFinished, "onFinished");
        if (y1Var.f123062a) {
            y1Var.f123064c.a(new x1(z10, y1Var, str, onFinished));
        }
    }
}
