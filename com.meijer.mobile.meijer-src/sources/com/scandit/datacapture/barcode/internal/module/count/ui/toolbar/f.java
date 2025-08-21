package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountToolbarView f122805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BarcodeCountToolbarView barcodeCountToolbarView) {
        super(0);
        this.f122805a = barcodeCountToolbarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122805a.f122788l = !r0.f122788l;
        this.f122805a.c();
        b bVarB = this.f122805a.b();
        if (bVarB != null) {
            bVarB.c(this.f122805a.f122788l);
        }
        return Unit.f143329a;
    }
}
