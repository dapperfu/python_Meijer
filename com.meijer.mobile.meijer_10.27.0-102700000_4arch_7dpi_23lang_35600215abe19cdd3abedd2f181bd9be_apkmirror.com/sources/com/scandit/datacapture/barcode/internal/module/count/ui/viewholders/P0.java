package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class P0 {
    public static void a(Z0 z02, boolean z10) {
        Q0 onFinished = Q0.f121922a;
        Intrinsics.j(onFinished, "onFinished");
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = z02.f121954d;
        if (qVar == null || qVar.f121771b != z10) {
            z02.f121955e.a(new X0(z02, z10, onFinished));
        } else {
            onFinished.getClass();
            Unit unit = Unit.f142422a;
        }
    }

    public static void b(Z0 z02, boolean z10) {
        R0 onFinished = R0.f121923a;
        Intrinsics.j(onFinished, "onFinished");
        com.scandit.datacapture.barcode.internal.module.count.ui.q qVar = z02.f121954d;
        if (qVar == null || qVar.isEnabled() != z10) {
            z02.f121955e.a(new Y0(z02, z10, onFinished));
        } else {
            onFinished.getClass();
            Unit unit = Unit.f142422a;
        }
    }
}
