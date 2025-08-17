package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f123724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodePickViewSettings f123725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarcodePickView barcodePickView, BarcodePickViewSettings barcodePickViewSettings) {
        super(1);
        this.f123724a = barcodePickView;
        this.f123725b = barcodePickViewSettings;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickView it = (BarcodePickView) obj;
        Intrinsics.j(it, "it");
        this.f123724a.f123655c.a(this.f123725b.getHighlightStyle());
        return Unit.f142422a;
    }
}
