package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f123738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(BarcodePickView barcodePickView) {
        super(0);
        this.f123738a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodePickViewListener listener = this.f123738a.getListener();
        if (listener != null) {
            listener.onPaused(this.f123738a);
        }
        return Unit.f142422a;
    }
}
