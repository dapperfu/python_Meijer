package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountToolbarView f122806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BarcodeCountToolbarView barcodeCountToolbarView) {
        super(0);
        this.f122806a = barcodeCountToolbarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122806a.f122789m = !r0.f122789m;
        this.f122806a.c();
        b bVarB = this.f122806a.b();
        if (bVarB != null) {
            bVarB.b(this.f122806a.f122789m);
        }
        return Unit.f143329a;
    }
}
