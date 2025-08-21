package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotationTrigger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f122183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Annotation f122184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f122185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f122186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation, v vVar, a aVar2) {
        super(0);
        this.f122183a = aVar;
        this.f122184b = barcodeArAugmentation$Annotation;
        this.f122185c = vVar;
        this.f122186d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a aVar = this.f122183a;
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar.f122151e;
        if (barcodeArAugmentation$Annotation != null) {
            this.f122185c.a(barcodeArAugmentation$Annotation, aVar.f122150d);
        }
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation2 = this.f122184b;
        if (barcodeArAugmentation$Annotation2 != null) {
            v vVar = this.f122185c;
            a aVar2 = this.f122186d;
            BarcodeArAnnotationTrigger annotationTrigger = barcodeArAugmentation$Annotation2.a().getAnnotationTrigger();
            Intrinsics.j(annotationTrigger, "<this>");
            int i10 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.c.f122035a[annotationTrigger.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar.a(aVar2.a(), aVar2.f122149c, barcodeArAugmentation$Annotation2, aVar2.f122150d);
            }
        }
        return Unit.f143329a;
    }
}
