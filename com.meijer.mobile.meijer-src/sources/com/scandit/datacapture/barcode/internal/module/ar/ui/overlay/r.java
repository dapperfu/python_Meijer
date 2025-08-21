package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f122187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f122188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Highlight f122189c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f122190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a aVar, v vVar, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight, a aVar2) {
        super(0);
        this.f122187a = aVar;
        this.f122188b = vVar;
        this.f122189c = barcodeArAugmentation$Highlight;
        this.f122190d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = this.f122187a.f122150d;
        if (barcodeArAugmentation$Highlight != null) {
            this.f122188b.f122203d.invoke(barcodeArAugmentation$Highlight);
        }
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight2 = this.f122189c;
        if (barcodeArAugmentation$Highlight2 != null) {
            v vVar = this.f122188b;
            a aVar = this.f122190d;
            Quadrilateral quadrilateralB = aVar.b();
            vVar.f122201b.invoke(aVar.f122149c, barcodeArAugmentation$Highlight2);
            vVar.f122202c.invoke(quadrilateralB, barcodeArAugmentation$Highlight2);
        }
        return Unit.f143329a;
    }
}
