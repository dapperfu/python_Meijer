package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountView f120861a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BarcodeCountView barcodeCountView) {
        super(1);
        this.f120861a = barcodeCountView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        BarcodeCountView barcodeCountView = this.f120861a;
        ViewExtensionsKt.runOnMainThread(barcodeCountView, new k(barcodeCountView));
        return Unit.f142422a;
    }
}
