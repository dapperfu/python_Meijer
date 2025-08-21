package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C13314d extends FunctionReferenceImpl implements Function1 {
    public C13314d() {
        super(1, com.scandit.datacapture.barcode.internal.module.ui.a.f124242a, com.scandit.datacapture.barcode.internal.module.ui.a.class, "isTallFormFactor", "isTallFormFactor(Landroid/view/View;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View p02 = (View) obj;
        Intrinsics.j(p02, "p0");
        ((com.scandit.datacapture.barcode.internal.module.ui.a) this.receiver).getClass();
        return Boolean.valueOf(com.scandit.datacapture.barcode.internal.module.ui.a.a(p02));
    }
}
