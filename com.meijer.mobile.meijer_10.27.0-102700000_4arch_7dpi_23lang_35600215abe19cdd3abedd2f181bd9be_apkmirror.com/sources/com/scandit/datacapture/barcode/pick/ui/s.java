package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f123739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(BarcodePickView barcodePickView) {
        super(0);
        this.f123739a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodePickViewListener listener = this.f123739a.getListener();
        if (listener != null) {
            listener.onStarted(this.f123739a);
        }
        return Unit.f142422a;
    }
}
