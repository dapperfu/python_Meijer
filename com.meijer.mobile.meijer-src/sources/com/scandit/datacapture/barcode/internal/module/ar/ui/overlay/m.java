package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f122175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Highlight f122176b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        super(0);
        this.f122175a = vVar;
        this.f122176b = barcodeArAugmentation$Highlight;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122175a.f122203d.invoke(this.f122176b);
        return Unit.f143329a;
    }
}
