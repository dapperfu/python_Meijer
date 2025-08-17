package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountToolbarView f121853a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BarcodeCountToolbarView barcodeCountToolbarView) {
        super(0);
        this.f121853a = barcodeCountToolbarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121853a.f121836l = !r0.f121836l;
        this.f121853a.c();
        b bVarB = this.f121853a.b();
        if (bVarB != null) {
            bVarB.c(this.f121853a.f121836l);
        }
        return Unit.f142422a;
    }
}
