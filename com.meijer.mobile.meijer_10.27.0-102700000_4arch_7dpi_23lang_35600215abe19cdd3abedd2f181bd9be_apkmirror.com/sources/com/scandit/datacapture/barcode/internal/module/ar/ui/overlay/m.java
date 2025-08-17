package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f121223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Highlight f121224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        super(0);
        this.f121223a = vVar;
        this.f121224b = barcodeArAugmentation$Highlight;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121223a.f121251d.invoke(this.f121224b);
        return Unit.f142422a;
    }
}
