package com.scandit.datacapture.barcode.count.ui.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountView f121814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121815b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BarcodeCountView barcodeCountView, int i10) {
        super(0);
        this.f121814a = barcodeCountView;
        this.f121815b = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f121814a.f121797o) {
            this.f121814a.f121787e.a(0, this.f121815b);
        }
        return Unit.f143329a;
    }
}
