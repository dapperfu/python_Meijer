package com.scandit.datacapture.barcode.find.ui;

import android.util.Size;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class g extends FunctionReferenceImpl implements Function1 {
    public g() {
        super(1, com.scandit.datacapture.barcode.internal.module.ui.a.f123290a, com.scandit.datacapture.barcode.internal.module.ui.a.class, "isTallFormFactor", "isTallFormFactor(Landroid/util/Size;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Size p02 = (Size) obj;
        Intrinsics.j(p02, "p0");
        ((com.scandit.datacapture.barcode.internal.module.ui.a) this.receiver).getClass();
        return Boolean.valueOf(com.scandit.datacapture.barcode.internal.module.ui.a.a(p02));
    }
}
