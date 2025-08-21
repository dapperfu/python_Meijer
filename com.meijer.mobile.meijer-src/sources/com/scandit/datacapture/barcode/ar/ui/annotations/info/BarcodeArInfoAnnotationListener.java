package com.scandit.datacapture.barcode.ar.ui.annotations.info;

import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationListener;", "", "onInfoAnnotationFooterTapped", "", "annotation", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArInfoAnnotation;", "onInfoAnnotationHeaderTapped", "onInfoAnnotationLeftIconTapped", "component", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationBodyComponent;", "componentIndex", "", "onInfoAnnotationRightIconTapped", "onInfoAnnotationTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeArInfoAnnotationListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onInfoAnnotationFooterTapped(BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener, BarcodeArInfoAnnotation annotation) {
            Intrinsics.j(annotation, "annotation");
        }

        public static void onInfoAnnotationHeaderTapped(BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener, BarcodeArInfoAnnotation annotation) {
            Intrinsics.j(annotation, "annotation");
        }

        public static void onInfoAnnotationLeftIconTapped(BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener, BarcodeArInfoAnnotation annotation, BarcodeArInfoAnnotationBodyComponent component, int i10) {
            Intrinsics.j(annotation, "annotation");
            Intrinsics.j(component, "component");
        }

        public static void onInfoAnnotationRightIconTapped(BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener, BarcodeArInfoAnnotation annotation, BarcodeArInfoAnnotationBodyComponent component, int i10) {
            Intrinsics.j(annotation, "annotation");
            Intrinsics.j(component, "component");
        }

        public static void onInfoAnnotationTapped(BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener, BarcodeArInfoAnnotation annotation) {
            Intrinsics.j(annotation, "annotation");
        }
    }

    void onInfoAnnotationFooterTapped(BarcodeArInfoAnnotation annotation);

    void onInfoAnnotationHeaderTapped(BarcodeArInfoAnnotation annotation);

    void onInfoAnnotationLeftIconTapped(BarcodeArInfoAnnotation annotation, BarcodeArInfoAnnotationBodyComponent component, int componentIndex);

    void onInfoAnnotationRightIconTapped(BarcodeArInfoAnnotation annotation, BarcodeArInfoAnnotationBodyComponent component, int componentIndex);

    void onInfoAnnotationTapped(BarcodeArInfoAnnotation annotation);
}
