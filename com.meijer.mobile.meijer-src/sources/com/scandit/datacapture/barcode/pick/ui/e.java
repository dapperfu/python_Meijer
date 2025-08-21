package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f124676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewSettings f124677b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarcodePickView barcodePickView, BarcodePickViewSettings barcodePickViewSettings) {
        super(1);
        this.f124676a = barcodePickView;
        this.f124677b = barcodePickViewSettings;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickView it = (BarcodePickView) obj;
        Intrinsics.j(it, "it");
        this.f124676a.f124607c.a(this.f124677b.getHighlightStyle());
        return Unit.f143329a;
    }
}
