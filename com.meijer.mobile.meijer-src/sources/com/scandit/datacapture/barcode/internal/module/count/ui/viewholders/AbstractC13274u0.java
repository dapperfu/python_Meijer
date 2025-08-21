package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.u0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13274u0 {
    public static void a(InterfaceC13280x0 interfaceC13280x0, boolean z10) {
        C13276v0 onFinished = C13276v0.f123036a;
        J0 j02 = (J0) interfaceC13280x0;
        j02.getClass();
        Intrinsics.j(onFinished, "onFinished");
        synchronized (j02) {
            try {
                j02.f122852j = Boolean.valueOf(z10);
                if (j02.f122846d) {
                    j02.f122849g.a(new F0(j02, z10, onFinished));
                } else {
                    j02.f122848f.a(new G0(j02, z10, onFinished));
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(InterfaceC13280x0 interfaceC13280x0, boolean z10) {
        C13278w0 onFinished = C13278w0.f123044a;
        J0 j02 = (J0) interfaceC13280x0;
        j02.getClass();
        Intrinsics.j(onFinished, "onFinished");
        I0 onFinished2 = new I0(j02, z10, onFinished);
        Intrinsics.j(onFinished2, "onFinished");
        j02.f122848f.a(new H0(j02, z10, onFinished2));
    }
}
