package com.scandit.datacapture.barcode.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotation f121234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotationBodyComponent f121236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BarcodeArInfoAnnotation barcodeArInfoAnnotation, int i10, BarcodeArInfoAnnotationBodyComponent barcodeArInfoAnnotationBodyComponent) {
        super(1);
        this.f121234a = barcodeArInfoAnnotation;
        this.f121235b = i10;
        this.f121236c = barcodeArInfoAnnotationBodyComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeArInfoAnnotation.access$bodyElementIconTapped(this.f121234a, ((Boolean) obj).booleanValue(), this.f121235b, this.f121236c);
        return Unit.f143329a;
    }
}
