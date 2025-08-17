package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f123741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(BarcodePickView barcodePickView) {
        super(0);
        this.f123741a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodePickViewListener listener = this.f123741a.getListener();
        if (listener != null) {
            listener.onStopped(this.f123741a);
        }
        return Unit.f142422a;
    }
}
