package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f122172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Annotation f122173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Highlight f122174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        super(0);
        this.f122172a = vVar;
        this.f122173b = barcodeArAugmentation$Annotation;
        this.f122174c = barcodeArAugmentation$Highlight;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122172a.a(this.f122173b, this.f122174c);
        return Unit.f143329a;
    }
}
