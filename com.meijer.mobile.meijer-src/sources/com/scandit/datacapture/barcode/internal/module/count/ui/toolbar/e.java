package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountToolbarView f122804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarcodeCountToolbarView barcodeCountToolbarView) {
        super(0);
        this.f122804a = barcodeCountToolbarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122804a.f122787k = !r0.f122787k;
        this.f122804a.c();
        b bVarB = this.f122804a.b();
        if (bVarB != null) {
            bVarB.d(this.f122804a.f122787k);
        }
        return Unit.f143329a;
    }
}
