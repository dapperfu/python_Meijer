package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f122195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f122196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f122197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, k kVar, a aVar) {
        super(0);
        this.f122195a = vVar;
        this.f122196b = kVar;
        this.f122197c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation;
        v vVar = this.f122195a;
        k kVar = this.f122196b;
        a aVar = this.f122197c;
        vVar.getClass();
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = aVar.f122150d;
        if (barcodeArAugmentation$Highlight != null) {
            Quadrilateral quadrilateralB = aVar.b();
            vVar.f122201b.invoke(aVar.f122149c, barcodeArAugmentation$Highlight);
            vVar.f122202c.invoke(quadrilateralB, barcodeArAugmentation$Highlight);
        } else {
            barcodeArAugmentation$Highlight = null;
        }
        if (kVar.f122170b && (barcodeArAugmentation$Annotation = aVar.f122151e) != null) {
            vVar.a(aVar.a(), aVar.f122149c, barcodeArAugmentation$Annotation, barcodeArAugmentation$Highlight);
        }
        return Unit.f143329a;
    }
}
