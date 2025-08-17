package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.u0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13141u0 {
    public static void a(InterfaceC13147x0 interfaceC13147x0, boolean z10) {
        C13143v0 onFinished = C13143v0.f122084a;
        J0 j02 = (J0) interfaceC13147x0;
        j02.getClass();
        Intrinsics.j(onFinished, "onFinished");
        synchronized (j02) {
            try {
                j02.f121900j = Boolean.valueOf(z10);
                if (j02.f121894d) {
                    j02.f121897g.a(new F0(j02, z10, onFinished));
                } else {
                    j02.f121896f.a(new G0(j02, z10, onFinished));
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(InterfaceC13147x0 interfaceC13147x0, boolean z10) {
        C13145w0 onFinished = C13145w0.f122092a;
        J0 j02 = (J0) interfaceC13147x0;
        j02.getClass();
        Intrinsics.j(onFinished, "onFinished");
        I0 onFinished2 = new I0(j02, z10, onFinished);
        Intrinsics.j(onFinished2, "onFinished");
        j02.f121896f.a(new H0(j02, z10, onFinished2));
    }
}
