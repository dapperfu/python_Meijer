package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountToolbarView f121852a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarcodeCountToolbarView barcodeCountToolbarView) {
        super(0);
        this.f121852a = barcodeCountToolbarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121852a.f121835k = !r0.f121835k;
        this.f121852a.c();
        b bVarB = this.f121852a.b();
        if (bVarB != null) {
            bVarB.d(this.f121852a.f121835k);
        }
        return Unit.f142422a;
    }
}
