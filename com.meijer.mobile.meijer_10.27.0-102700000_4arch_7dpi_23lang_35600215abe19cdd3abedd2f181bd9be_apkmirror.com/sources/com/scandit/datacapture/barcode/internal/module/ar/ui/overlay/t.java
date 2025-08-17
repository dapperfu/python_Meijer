package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f121243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f121244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f121245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, k kVar, a aVar) {
        super(0);
        this.f121243a = vVar;
        this.f121244b = kVar;
        this.f121245c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation;
        v vVar = this.f121243a;
        k kVar = this.f121244b;
        a aVar = this.f121245c;
        vVar.getClass();
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = aVar.f121198d;
        if (barcodeArAugmentation$Highlight != null) {
            Quadrilateral quadrilateralB = aVar.b();
            vVar.f121249b.invoke(aVar.f121197c, barcodeArAugmentation$Highlight);
            vVar.f121250c.invoke(quadrilateralB, barcodeArAugmentation$Highlight);
        } else {
            barcodeArAugmentation$Highlight = null;
        }
        if (kVar.f121218b && (barcodeArAugmentation$Annotation = aVar.f121199e) != null) {
            vVar.a(aVar.a(), aVar.f121197c, barcodeArAugmentation$Annotation, barcodeArAugmentation$Highlight);
        }
        return Unit.f142422a;
    }
}
