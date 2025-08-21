package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class i extends FunctionReferenceImpl implements Function1 {
    public i(Object obj) {
        super(1, obj, BinsView.class, "removeView", "removeView(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((BinsView) this.receiver).removeView((View) obj);
        return Unit.f143329a;
    }
}
