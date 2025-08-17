package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f121235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f121236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Highlight f121237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f121238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a aVar, v vVar, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight, a aVar2) {
        super(0);
        this.f121235a = aVar;
        this.f121236b = vVar;
        this.f121237c = barcodeArAugmentation$Highlight;
        this.f121238d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = this.f121235a.f121198d;
        if (barcodeArAugmentation$Highlight != null) {
            this.f121236b.f121251d.invoke(barcodeArAugmentation$Highlight);
        }
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight2 = this.f121237c;
        if (barcodeArAugmentation$Highlight2 != null) {
            v vVar = this.f121236b;
            a aVar = this.f121238d;
            Quadrilateral quadrilateralB = aVar.b();
            vVar.f121249b.invoke(aVar.f121197c, barcodeArAugmentation$Highlight2);
            vVar.f121250c.invoke(quadrilateralB, barcodeArAugmentation$Highlight2);
        }
        return Unit.f142422a;
    }
}
