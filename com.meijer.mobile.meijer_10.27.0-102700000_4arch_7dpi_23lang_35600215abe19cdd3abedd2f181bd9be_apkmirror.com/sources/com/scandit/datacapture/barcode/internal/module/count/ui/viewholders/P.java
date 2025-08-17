package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class P extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f121920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(X x10) {
        super(1);
        this.f121920a = x10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        X x10 = this.f121920a;
        x10.getClass();
        com.scandit.datacapture.barcode.internal.module.count.ui.l lVar = new com.scandit.datacapture.barcode.internal.module.count.ui.l(it);
        lVar.setLayoutParams(new FrameLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(100, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(100, (Context) null, 1, (Object) null), 17));
        lVar.f121700c = true;
        x10.f121942c = lVar;
        return lVar;
    }
}
