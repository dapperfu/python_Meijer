package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f124683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f124684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BarcodePickView barcodePickView, float f10) {
        super(1);
        this.f124683a = barcodePickView;
        this.f124684b = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickView it = (BarcodePickView) obj;
        Intrinsics.j(it, "it");
        this.f124683a.f124608d.a(this.f124684b);
        this.f124683a.requestLayout();
        return Unit.f143329a;
    }
}
