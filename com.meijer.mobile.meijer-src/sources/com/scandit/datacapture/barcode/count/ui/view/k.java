package com.scandit.datacapture.barcode.count.ui.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountView f121812a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BarcodeCountView barcodeCountView) {
        super(1);
        this.f121812a = barcodeCountView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeCountView it = (BarcodeCountView) obj;
        Intrinsics.j(it, "it");
        this.f121812a.f121789g.reset();
        return Unit.f143329a;
    }
}
