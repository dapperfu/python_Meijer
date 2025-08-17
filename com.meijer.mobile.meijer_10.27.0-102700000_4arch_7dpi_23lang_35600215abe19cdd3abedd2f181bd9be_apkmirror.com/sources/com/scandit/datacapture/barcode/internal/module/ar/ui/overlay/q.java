package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotationTrigger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f121231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Annotation f121232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f121233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f121234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation, v vVar, a aVar2) {
        super(0);
        this.f121231a = aVar;
        this.f121232b = barcodeArAugmentation$Annotation;
        this.f121233c = vVar;
        this.f121234d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a aVar = this.f121231a;
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar.f121199e;
        if (barcodeArAugmentation$Annotation != null) {
            this.f121233c.a(barcodeArAugmentation$Annotation, aVar.f121198d);
        }
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation2 = this.f121232b;
        if (barcodeArAugmentation$Annotation2 != null) {
            v vVar = this.f121233c;
            a aVar2 = this.f121234d;
            BarcodeArAnnotationTrigger annotationTrigger = barcodeArAugmentation$Annotation2.a().getAnnotationTrigger();
            Intrinsics.j(annotationTrigger, "<this>");
            int i10 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.c.f121083a[annotationTrigger.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar.a(aVar2.a(), aVar2.f121197c, barcodeArAugmentation$Annotation2, aVar2.f121198d);
            }
        }
        return Unit.f142422a;
    }
}
