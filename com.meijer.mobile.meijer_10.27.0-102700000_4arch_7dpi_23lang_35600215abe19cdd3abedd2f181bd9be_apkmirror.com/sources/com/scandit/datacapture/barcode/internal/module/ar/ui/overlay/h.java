package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f121207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f121208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Annotation f121209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, TrackedBarcode trackedBarcode, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation) {
        super(0);
        this.f121207a = iVar;
        this.f121208b = trackedBarcode;
        this.f121209c = barcodeArAugmentation$Annotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121207a.f121212b.invoke(this.f121208b, this.f121209c);
        return Unit.f142422a;
    }
}
