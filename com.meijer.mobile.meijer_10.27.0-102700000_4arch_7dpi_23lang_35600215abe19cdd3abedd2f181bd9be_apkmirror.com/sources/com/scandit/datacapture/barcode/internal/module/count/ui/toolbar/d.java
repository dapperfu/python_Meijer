package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountToolbarView f121851a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarcodeCountToolbarView barcodeCountToolbarView) {
        super(0);
        this.f121851a = barcodeCountToolbarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121851a.f121834j = !r0.f121834j;
        this.f121851a.c();
        b bVarB = this.f121851a.b();
        if (bVarB != null) {
            bVarB.a(this.f121851a.f121834j);
        }
        return Unit.f142422a;
    }
}
