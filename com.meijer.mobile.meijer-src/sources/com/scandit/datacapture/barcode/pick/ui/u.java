package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f124693a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(BarcodePickView barcodePickView) {
        super(0);
        this.f124693a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodePickViewListener listener = this.f124693a.getListener();
        if (listener != null) {
            listener.onStopped(this.f124693a);
        }
        return Unit.f143329a;
    }
}
