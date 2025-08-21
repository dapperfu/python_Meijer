package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class P0 {
    public static void a(Z0 z02, boolean z10) {
        Q0 onFinished = Q0.f122874a;
        Intrinsics.j(onFinished, "onFinished");
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = z02.f122906d;
        if (qVar == null || qVar.f122723b != z10) {
            z02.f122907e.a(new X0(z02, z10, onFinished));
        } else {
            onFinished.getClass();
            Unit unit = Unit.f143329a;
        }
    }

    public static void b(Z0 z02, boolean z10) {
        R0 onFinished = R0.f122875a;
        Intrinsics.j(onFinished, "onFinished");
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = z02.f122906d;
        if (qVar == null || qVar.isEnabled() != z10) {
            z02.f122907e.a(new Y0(z02, z10, onFinished));
        } else {
            onFinished.getClass();
            Unit unit = Unit.f143329a;
        }
    }
}
