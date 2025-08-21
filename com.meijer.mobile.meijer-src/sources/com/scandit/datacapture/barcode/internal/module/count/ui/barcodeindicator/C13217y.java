package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13217y;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13217y implements InterfaceC13214v {

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f122439g = LazyKt.b(C13215w.f122437a);

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountBasicOverlay f122440a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeCountViewLayerManager f122441b;

    /* renamed from: c, reason: collision with root package name */
    public final S f122442c;

    /* renamed from: d, reason: collision with root package name */
    public NativeBarcodeCountNotInListStatus f122443d;

    /* renamed from: e, reason: collision with root package name */
    public TrackedBarcode f122444e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.popover.h f122445f;

    public static final void a(C13217y this$0, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.j(this$0, "this$0");
        if (view != null) {
            com.scandit.datacapture.barcode.internal.module.count.ui.popover.h hVar = this$0.f122445f;
            Size size = new Size(view.getWidth(), view.getHeight());
            hVar.getClass();
            Intrinsics.j(size, "<set-?>");
            com.scandit.datacapture.barcode.internal.module.ui.popover.K k10 = (com.scandit.datacapture.barcode.internal.module.ui.popover.K) hVar.f122720d;
            k10.getClass();
            Intrinsics.j(size, "<set-?>");
            k10.f124306e = size;
        }
    }

    public C13217y(Context context, BarcodeCountBasicOverlay overlay, com.scandit.datacapture.barcode.internal.module.count.ui.g layerManager, U trackedBarcodeHelper) {
        Intrinsics.j(context, "context");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(trackedBarcodeHelper, "trackedBarcodeHelper");
        this.f122440a = overlay;
        this.f122441b = layerManager;
        this.f122442c = trackedBarcodeHelper;
        this.f122443d = NativeBarcodeCountNotInListStatus.NONE;
        this.f122445f = new com.scandit.datacapture.barcode.internal.module.count.ui.popover.h(context, layerManager.f122545k, new C13216x(this));
        overlay.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Kt.h
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                C13217y.a(this.f17721a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        layerManager.f122545k.setBackgroundColor(((Number) f122439g.getValue()).intValue());
        layerManager.f122545k.setVisibility(8);
        layerManager.f122546l.setVisibility(8);
        layerManager.f122546l.setImportantForAccessibility(2);
        layerManager.f122546l.setOnClickListener(new View.OnClickListener() { // from class: Kt.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13217y.a(this.f17722a, view);
            }
        });
    }

    public static final void a(C13217y this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        TrackedBarcode trackedBarcode = this$0.f122444e;
        if (trackedBarcode != null) {
            this$0.f122440a.didCancelNotInListBarcode(trackedBarcode);
        }
    }
}
