package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f121220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Annotation f121221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Highlight f121222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        super(0);
        this.f121220a = vVar;
        this.f121221b = barcodeArAugmentation$Annotation;
        this.f121222c = barcodeArAugmentation$Highlight;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121220a.a(this.f121221b, this.f121222c);
        return Unit.f142422a;
    }
}
