package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Annotation f122191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f122192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Highlight f122193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f122194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation, v vVar, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight, a aVar) {
        super(0);
        this.f122191a = barcodeArAugmentation$Annotation;
        this.f122192b = vVar;
        this.f122193c = barcodeArAugmentation$Highlight;
        this.f122194d = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f122191a.b().getParent() != null) {
            this.f122192b.a(this.f122191a, this.f122193c);
        } else if (this.f122192b.b().isEmpty()) {
            v vVar = this.f122192b;
            Quadrilateral quadrilateralA = this.f122194d.a();
            a aVar = this.f122194d;
            vVar.a(quadrilateralA, aVar.f122149c, this.f122191a, aVar.f122150d);
        } else {
            ArrayList arrayListB = this.f122192b.b();
            v vVar2 = this.f122192b;
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar2.f122151e;
                if (barcodeArAugmentation$Annotation != null) {
                    vVar2.a(barcodeArAugmentation$Annotation, aVar2.f122150d);
                }
            }
        }
        return Unit.f143329a;
    }
}
