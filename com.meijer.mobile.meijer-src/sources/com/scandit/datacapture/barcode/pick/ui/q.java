package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f124689a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(BarcodePickView barcodePickView) {
        super(1);
        this.f124689a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickView it = (BarcodePickView) obj;
        Intrinsics.j(it, "it");
        this.f124689a.f124609e.c();
        return Unit.f143329a;
    }
}
