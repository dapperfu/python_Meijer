package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class L {
    public static void a(X x10, boolean z10, String str) {
        M onFinished = M.f122862a;
        Intrinsics.j(onFinished, "onFinished");
        if (x10.f122892a) {
            x10.f122895d.a(new U(x10, z10, str, onFinished));
        }
    }

    public static void b(X x10, boolean z10, String str) {
        N onFinished = N.f122864a;
        Intrinsics.j(onFinished, "onFinished");
        if (x10.f122892a) {
            x10.f122895d.a(new W(x10, z10, str, onFinished));
        }
    }
}
