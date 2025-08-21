package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f124678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BarcodePickView barcodePickView) {
        super(1);
        this.f124678a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickView it = (BarcodePickView) obj;
        Intrinsics.j(it, "it");
        BarcodePickView.access$freezeInternal(this.f124678a);
        return Unit.f143329a;
    }
}
