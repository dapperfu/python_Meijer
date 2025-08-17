package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f123731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f123732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BarcodePickView barcodePickView, float f10) {
        super(1);
        this.f123731a = barcodePickView;
        this.f123732b = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickView it = (BarcodePickView) obj;
        Intrinsics.j(it, "it");
        this.f123731a.f123656d.a(this.f123732b);
        this.f123731a.requestLayout();
        return Unit.f142422a;
    }
}
