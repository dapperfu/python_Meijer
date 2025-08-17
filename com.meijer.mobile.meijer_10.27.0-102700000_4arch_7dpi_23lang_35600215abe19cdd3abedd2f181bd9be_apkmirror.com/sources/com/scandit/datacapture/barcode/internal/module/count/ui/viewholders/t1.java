package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class t1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f122080a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(y1 y1Var) {
        super(1);
        this.f122080a = y1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        y1 y1Var = this.f122080a;
        y1Var.getClass();
        com.scandit.datacapture.barcode.internal.module.ui.l lVar = new com.scandit.datacapture.barcode.internal.module.ui.l(it);
        lVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        y1Var.f122111b = lVar;
        return lVar;
    }
}
