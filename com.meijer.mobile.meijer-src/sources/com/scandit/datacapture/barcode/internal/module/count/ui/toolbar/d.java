package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountToolbarView f122803a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarcodeCountToolbarView barcodeCountToolbarView) {
        super(0);
        this.f122803a = barcodeCountToolbarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122803a.f122786j = !r0.f122786j;
        this.f122803a.c();
        b bVarB = this.f122803a.b();
        if (bVarB != null) {
            bVarB.a(this.f122803a.f122786j);
        }
        return Unit.f143329a;
    }
}
