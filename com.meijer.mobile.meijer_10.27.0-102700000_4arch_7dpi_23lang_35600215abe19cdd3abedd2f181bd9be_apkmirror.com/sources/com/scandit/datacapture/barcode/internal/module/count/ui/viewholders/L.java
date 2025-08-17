package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class L {
    public static void a(X x10, boolean z10, String str) {
        M onFinished = M.f121910a;
        Intrinsics.j(onFinished, "onFinished");
        if (x10.f121940a) {
            x10.f121943d.a(new U(x10, z10, str, onFinished));
        }
    }

    public static void b(X x10, boolean z10, String str) {
        N onFinished = N.f121912a;
        Intrinsics.j(onFinished, "onFinished");
        if (x10.f121940a) {
            x10.f121943d.a(new W(x10, z10, str, onFinished));
        }
    }
}
