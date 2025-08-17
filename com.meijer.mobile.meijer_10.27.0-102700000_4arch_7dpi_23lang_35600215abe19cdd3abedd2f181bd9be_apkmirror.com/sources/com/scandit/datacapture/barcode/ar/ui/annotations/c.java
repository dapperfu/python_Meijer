package com.scandit.datacapture.barcode.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotation f120282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f120283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotationBodyComponent f120284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BarcodeArInfoAnnotation barcodeArInfoAnnotation, int i10, BarcodeArInfoAnnotationBodyComponent barcodeArInfoAnnotationBodyComponent) {
        super(1);
        this.f120282a = barcodeArInfoAnnotation;
        this.f120283b = i10;
        this.f120284c = barcodeArInfoAnnotationBodyComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeArInfoAnnotation.access$bodyElementIconTapped(this.f120282a, ((Boolean) obj).booleanValue(), this.f120283b, this.f120284c);
        return Unit.f142422a;
    }
}
