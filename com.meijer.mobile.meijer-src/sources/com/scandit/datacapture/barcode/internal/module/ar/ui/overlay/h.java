package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f122159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f122160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Annotation f122161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, TrackedBarcode trackedBarcode, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation) {
        super(0);
        this.f122159a = iVar;
        this.f122160b = trackedBarcode;
        this.f122161c = barcodeArAugmentation$Annotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122159a.f122164b.invoke(this.f122160b, this.f122161c);
        return Unit.f143329a;
    }
}
