package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f122198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f122199b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a aVar, v vVar) {
        super(0);
        this.f122198a = aVar;
        this.f122199b = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a aVar = this.f122198a;
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = aVar.f122150d;
        if (barcodeArAugmentation$Highlight != null) {
            this.f122199b.f122202c.invoke(aVar.b(), barcodeArAugmentation$Highlight);
        } else {
            barcodeArAugmentation$Highlight = null;
        }
        a aVar2 = this.f122198a;
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar2.f122151e;
        if (barcodeArAugmentation$Annotation != null) {
            this.f122199b.f122205f.invoke(aVar2.a(), barcodeArAugmentation$Annotation, barcodeArAugmentation$Highlight);
        }
        return Unit.f143329a;
    }
}
