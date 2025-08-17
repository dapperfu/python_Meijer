package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13084y;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13084y implements InterfaceC13081v {

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f121487g = LazyKt.b(C13082w.f121485a);

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountBasicOverlay f121488a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeCountViewLayerManager f121489b;

    /* renamed from: c, reason: collision with root package name */
    public final S f121490c;

    /* renamed from: d, reason: collision with root package name */
    public NativeBarcodeCountNotInListStatus f121491d;

    /* renamed from: e, reason: collision with root package name */
    public TrackedBarcode f121492e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.popover.h f121493f;

    public static final void a(C13084y this$0, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.j(this$0, "this$0");
        if (view != null) {
            com.scandit.datacapture.barcode.internal.module.count.ui.popover.h hVar = this$0.f121493f;
            Size size = new Size(view.getWidth(), view.getHeight());
            hVar.getClass();
            Intrinsics.j(size, "<set-?>");
            com.scandit.datacapture.barcode.internal.module.ui.popover.K k10 = (com.scandit.datacapture.barcode.internal.module.ui.popover.K) hVar.f121768d;
            k10.getClass();
            Intrinsics.j(size, "<set-?>");
            k10.f123354e = size;
        }
    }

    public C13084y(Context context, BarcodeCountBasicOverlay overlay, com.scandit.datacapture.barcode.internal.module.count.ui.g layerManager, U trackedBarcodeHelper) {
        Intrinsics.j(context, "context");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(trackedBarcodeHelper, "trackedBarcodeHelper");
        this.f121488a = overlay;
        this.f121489b = layerManager;
        this.f121490c = trackedBarcodeHelper;
        this.f121491d = NativeBarcodeCountNotInListStatus.NONE;
        this.f121493f = new com.scandit.datacapture.barcode.internal.module.count.ui.popover.h(context, layerManager.f121593k, new C13083x(this));
        overlay.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Kt.h
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                C13084y.a(this.f17560a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        layerManager.f121593k.setBackgroundColor(((Number) f121487g.getValue()).intValue());
        layerManager.f121593k.setVisibility(8);
        layerManager.f121594l.setVisibility(8);
        layerManager.f121594l.setImportantForAccessibility(2);
        layerManager.f121594l.setOnClickListener(new View.OnClickListener() { // from class: Kt.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13084y.a(this.f17561a, view);
            }
        });
    }

    public static final void a(C13084y this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        TrackedBarcode trackedBarcode = this$0.f121492e;
        if (trackedBarcode != null) {
            this$0.f121488a.didCancelNotInListBarcode(trackedBarcode);
        }
    }
}
