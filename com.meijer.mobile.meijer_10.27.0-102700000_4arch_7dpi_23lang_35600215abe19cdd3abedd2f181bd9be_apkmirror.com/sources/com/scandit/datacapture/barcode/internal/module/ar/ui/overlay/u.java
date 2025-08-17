package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f121246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f121247b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a aVar, v vVar) {
        super(0);
        this.f121246a = aVar;
        this.f121247b = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a aVar = this.f121246a;
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = aVar.f121198d;
        if (barcodeArAugmentation$Highlight != null) {
            this.f121247b.f121250c.invoke(aVar.b(), barcodeArAugmentation$Highlight);
        } else {
            barcodeArAugmentation$Highlight = null;
        }
        a aVar2 = this.f121246a;
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar2.f121199e;
        if (barcodeArAugmentation$Annotation != null) {
            this.f121247b.f121253f.invoke(aVar2.a(), barcodeArAugmentation$Annotation, barcodeArAugmentation$Highlight);
        }
        return Unit.f142422a;
    }
}
