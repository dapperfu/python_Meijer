package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info;

import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j implements BarcodeArInfoAnnotationListener {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f121098a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f121099b;

    public j(com.scandit.datacapture.barcode.ar.ui.annotations.n getListener, com.scandit.datacapture.barcode.ar.ui.annotations.o onAnnotationOrElementTap) {
        Intrinsics.j(getListener, "getListener");
        Intrinsics.j(onAnnotationOrElementTap, "onAnnotationOrElementTap");
        this.f121098a = getListener;
        this.f121099b = onAnnotationOrElementTap;
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationListener
    public final void onInfoAnnotationFooterTapped(BarcodeArInfoAnnotation annotation) {
        Intrinsics.j(annotation, "annotation");
        BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener = (BarcodeArInfoAnnotationListener) this.f121098a.invoke();
        if (barcodeArInfoAnnotationListener != null) {
            barcodeArInfoAnnotationListener.onInfoAnnotationFooterTapped(annotation);
        }
        this.f121099b.invoke();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationListener
    public final void onInfoAnnotationHeaderTapped(BarcodeArInfoAnnotation annotation) {
        Intrinsics.j(annotation, "annotation");
        BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener = (BarcodeArInfoAnnotationListener) this.f121098a.invoke();
        if (barcodeArInfoAnnotationListener != null) {
            barcodeArInfoAnnotationListener.onInfoAnnotationHeaderTapped(annotation);
        }
        this.f121099b.invoke();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationListener
    public final void onInfoAnnotationLeftIconTapped(BarcodeArInfoAnnotation annotation, BarcodeArInfoAnnotationBodyComponent component, int i10) {
        Intrinsics.j(annotation, "annotation");
        Intrinsics.j(component, "component");
        BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener = (BarcodeArInfoAnnotationListener) this.f121098a.invoke();
        if (barcodeArInfoAnnotationListener != null) {
            barcodeArInfoAnnotationListener.onInfoAnnotationLeftIconTapped(annotation, component, i10);
        }
        this.f121099b.invoke();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationListener
    public final void onInfoAnnotationRightIconTapped(BarcodeArInfoAnnotation annotation, BarcodeArInfoAnnotationBodyComponent component, int i10) {
        Intrinsics.j(annotation, "annotation");
        Intrinsics.j(component, "component");
        BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener = (BarcodeArInfoAnnotationListener) this.f121098a.invoke();
        if (barcodeArInfoAnnotationListener != null) {
            barcodeArInfoAnnotationListener.onInfoAnnotationRightIconTapped(annotation, component, i10);
        }
        this.f121099b.invoke();
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationListener
    public final void onInfoAnnotationTapped(BarcodeArInfoAnnotation annotation) {
        Intrinsics.j(annotation, "annotation");
        BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener = (BarcodeArInfoAnnotationListener) this.f121098a.invoke();
        if (barcodeArInfoAnnotationListener != null) {
            barcodeArInfoAnnotationListener.onInfoAnnotationTapped(annotation);
        }
        this.f121099b.invoke();
    }
}
