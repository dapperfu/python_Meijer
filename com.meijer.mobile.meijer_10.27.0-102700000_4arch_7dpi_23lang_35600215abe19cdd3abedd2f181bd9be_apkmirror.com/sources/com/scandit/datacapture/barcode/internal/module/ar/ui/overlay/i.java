package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArPopoverAnnotation;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArStatusIconAnnotation;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArOverlay;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class i extends ViewBasedDataCaptureOverlay implements g, DataCaptureOverlay {

    /* renamed from: f, reason: collision with root package name */
    public static final int f121210f = com.scandit.datacapture.barcode.internal.module.extensions.a.a(-16777216, (int) (RangesKt.n(0.3f, 0.0f, 1.0f) * l3.f92484c));

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f121211a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f121212b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f121213c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f121214d;

    /* renamed from: e, reason: collision with root package name */
    public final View f121215e;

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public final void _setDataCaptureView(DataCaptureView view) {
        Intrinsics.j(view, "view");
    }

    public final void a() {
        setOnTouchListener(new View.OnTouchListener() { // from class: It.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return i.a(this.f14378a, view, motionEvent);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, com.scandit.datacapture.barcode.ar.ui.b onHighlightTap, com.scandit.datacapture.barcode.ar.ui.c onAnnotationOrElementTap, com.scandit.datacapture.barcode.ar.ui.d onOverlayTap) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(onHighlightTap, "onHighlightTap");
        Intrinsics.j(onAnnotationOrElementTap, "onAnnotationOrElementTap");
        Intrinsics.j(onOverlayTap, "onOverlayTap");
        this.f121211a = onHighlightTap;
        this.f121212b = onAnnotationOrElementTap;
        this.f121213c = onOverlayTap;
        NativeBarcodeArOverlay nativeBarcodeArOverlayCreate = NativeBarcodeArOverlay.create();
        Intrinsics.i(nativeBarcodeArOverlayCreate, "create(...)");
        this.f121214d = new j(nativeBarcodeArOverlayCreate);
        View view = new View(context);
        view.setBackgroundColor(f121210f);
        view.setVisibility(8);
        view.setZ(3.0f);
        this.f121215e = view;
        setImportantForAccessibility(2);
        addView(view, -1, -1);
        setTouchDelegate(new com.scandit.datacapture.barcode.internal.module.ui.e(this));
        a();
        setClipChildren(false);
    }

    public static final boolean a(i this$0, View view, MotionEvent motionEvent) {
        Intrinsics.j(this$0, "this$0");
        return ((Boolean) this$0.f121213c.invoke()).booleanValue();
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getF125772c() {
        return this.f121214d.f121216a;
    }

    public final void a(final TrackedBarcode track, final BarcodeArAugmentation$Highlight highlightData) {
        Intrinsics.j(track, "track");
        Intrinsics.j(highlightData, "highlightData");
        View viewB = highlightData.b();
        viewB.setOnClickListener(new View.OnClickListener() { // from class: It.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.a(this.f14379a, track, highlightData, view);
            }
        });
        viewB.setZ(1.0f);
        addView(viewB);
    }

    public static final void a(i this$0, TrackedBarcode track, BarcodeArAugmentation$Highlight highlightData, View view) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(track, "$track");
        Intrinsics.j(highlightData, "$highlightData");
        this$0.f121211a.invoke(track, highlightData);
    }

    public final void a(TrackedBarcode track, BarcodeArAugmentation$Annotation annotationData, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        Intrinsics.j(track, "track");
        Intrinsics.j(annotationData, "annotationData");
        BarcodeArAnnotation barcodeArAnnotationA = annotationData.a();
        View viewB = annotationData.b();
        h hVar = new h(this, track, annotationData);
        Intrinsics.j(barcodeArAnnotationA, "<this>");
        if (barcodeArAnnotationA instanceof BarcodeArInfoAnnotation) {
            ((BarcodeArInfoAnnotation) barcodeArAnnotationA).setOnAnnotationOrElementTap$scandit_barcode_capture(hVar);
        } else if (barcodeArAnnotationA instanceof BarcodeArPopoverAnnotation) {
            ((BarcodeArPopoverAnnotation) barcodeArAnnotationA).setOnAnnotationOrElementTap$scandit_barcode_capture(hVar);
        } else if (barcodeArAnnotationA instanceof BarcodeArStatusIconAnnotation) {
            ((BarcodeArStatusIconAnnotation) barcodeArAnnotationA).setOnAnnotationOrElementTap$scandit_barcode_capture(hVar);
        }
        if (barcodeArAnnotationA instanceof BarcodeArPopoverAnnotation) {
            viewB.setZ(12.0f);
            View viewB2 = barcodeArAugmentation$Highlight != null ? barcodeArAugmentation$Highlight.b() : null;
            if (viewB2 != null) {
                viewB2.setZ(4.0f);
            }
        } else {
            viewB.setZ(2.0f);
        }
        addView(viewB);
    }

    public final void a(BarcodeArAugmentation$Annotation annotationData, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        Intrinsics.j(annotationData, "annotationData");
        BarcodeArAnnotation barcodeArAnnotationA = annotationData.a();
        Intrinsics.j(barcodeArAnnotationA, "<this>");
        if (barcodeArAnnotationA instanceof BarcodeArInfoAnnotation) {
            ((BarcodeArInfoAnnotation) barcodeArAnnotationA).setOnAnnotationOrElementTap$scandit_barcode_capture(null);
        } else if (barcodeArAnnotationA instanceof BarcodeArPopoverAnnotation) {
            ((BarcodeArPopoverAnnotation) barcodeArAnnotationA).setOnAnnotationOrElementTap$scandit_barcode_capture(null);
        } else if (barcodeArAnnotationA instanceof BarcodeArStatusIconAnnotation) {
            ((BarcodeArStatusIconAnnotation) barcodeArAnnotationA).setOnAnnotationOrElementTap$scandit_barcode_capture(null);
        }
        removeView(annotationData.b());
        View viewB = barcodeArAugmentation$Highlight != null ? barcodeArAugmentation$Highlight.b() : null;
        if (viewB == null) {
            return;
        }
        viewB.setZ(1.0f);
    }
}
