package com.scandit.datacapture.barcode.count.ui.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountView f120862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f120863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BarcodeCountView barcodeCountView, int i10) {
        super(0);
        this.f120862a = barcodeCountView;
        this.f120863b = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f120862a.f120845o) {
            this.f120862a.f120835e.a(0, this.f120863b);
        }
        return Unit.f142422a;
    }
}
