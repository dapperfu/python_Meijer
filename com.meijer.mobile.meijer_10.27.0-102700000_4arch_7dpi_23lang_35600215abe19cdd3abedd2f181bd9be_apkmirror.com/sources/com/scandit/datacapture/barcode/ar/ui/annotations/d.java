package com.scandit.datacapture.barcode.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationWidthPreset;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotation f120285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarcodeArInfoAnnotation barcodeArInfoAnnotation) {
        super(0);
        this.f120285a = barcodeArInfoAnnotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int backgroundColor = this.f120285a.getBackgroundColor();
        BarcodeArInfoAnnotationWidthPreset width = this.f120285a.getWidth();
        List<BarcodeArInfoAnnotationBodyComponent> body = this.f120285a.getBody();
        BarcodeArInfoAnnotation barcodeArInfoAnnotation = this.f120285a;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(body, 10));
        int i10 = 0;
        for (Object obj : body) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            BarcodeArInfoAnnotationBodyComponent barcodeArInfoAnnotationBodyComponent = (BarcodeArInfoAnnotationBodyComponent) obj;
            arrayList.add(new BarcodeArBodyElementRowDataHolder(barcodeArInfoAnnotationBodyComponent, barcodeArInfoAnnotation.isEntireAnnotationTappable(), barcodeArInfoAnnotation.getWidth(), new c(barcodeArInfoAnnotation, i10, barcodeArInfoAnnotationBodyComponent)));
            i10 = i11;
        }
        return new BarcodeArBodyElementDataHolder(backgroundColor, width, arrayList);
    }
}
