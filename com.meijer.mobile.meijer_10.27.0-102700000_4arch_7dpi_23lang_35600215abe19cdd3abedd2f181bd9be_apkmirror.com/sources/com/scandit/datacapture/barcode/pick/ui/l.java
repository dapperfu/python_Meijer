package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickView f123733a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BarcodePickView barcodePickView) {
        super(1);
        this.f123733a = barcodePickView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        BarcodePickView barcodePickView = this.f123733a;
        ViewExtensionsKt.runOnMainThread(barcodePickView, new k(barcodePickView, fFloatValue));
        return Unit.f142422a;
    }
}
