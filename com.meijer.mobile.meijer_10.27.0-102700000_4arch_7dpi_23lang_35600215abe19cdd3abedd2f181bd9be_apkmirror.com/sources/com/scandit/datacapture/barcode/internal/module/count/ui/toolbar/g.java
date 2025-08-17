package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountToolbarView f121854a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BarcodeCountToolbarView barcodeCountToolbarView) {
        super(0);
        this.f121854a = barcodeCountToolbarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121854a.f121837m = !r0.f121837m;
        this.f121854a.c();
        b bVarB = this.f121854a.b();
        if (bVarB != null) {
            bVarB.b(this.f121854a.f121837m);
        }
        return Unit.f142422a;
    }
}
