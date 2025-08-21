package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.content.Context;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterLiveEditor;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class B implements s {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCount f122464a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeCountBasicOverlay f122465b;

    /* renamed from: c, reason: collision with root package name */
    public final BarcodeCountViewLayerManager f122466c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f122467d;

    /* renamed from: e, reason: collision with root package name */
    public NativeBarcodeClusterLiveEditor f122468e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f f122469f;

    /* renamed from: g, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f f122470g;

    /* renamed from: h, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f f122471h;

    /* renamed from: i, reason: collision with root package name */
    public r f122472i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f122473j;

    public final Quadrilateral a(Quadrilateral quadrilateral, float f10) {
        Intrinsics.j(quadrilateral, "quadrilateral");
        Quadrilateral quadrilateral2 = (Quadrilateral) this.f122467d.invoke(quadrilateral);
        return QuadrilateralUtilsKt.grow(quadrilateral2, ((f10 - 1.0f) * Float.min(QuadrilateralUtilsKt.getHeight(quadrilateral2), QuadrilateralUtilsKt.getWidth(quadrilateral2))) / 2.0f);
    }

    public B(Context context, BarcodeCount mode, BarcodeCountBasicOverlay overlay, com.scandit.datacapture.barcode.internal.module.count.ui.g layerManager, com.scandit.datacapture.barcode.internal.module.count.ui.c mapper) {
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(mapper, "mapper");
        this.f122464a = mode;
        this.f122465b = overlay;
        this.f122466c = layerManager;
        this.f122467d = mapper;
        this.f122469f = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new E(), new v(context));
        this.f122470g = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new E(), new A(context, this));
        this.f122471h = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new E(), new u(context));
        this.f122473j = true;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122470g.a(this.f122466c.a());
        this.f122469f.a(this.f122466c.a());
        ((p) this.f122469f.b()).f122513g = new w(this);
        this.f122471h.a(this.f122466c.d());
        ((j) this.f122471h.b()).f122500g = new x(this);
    }

    public final boolean c() {
        int i10 = t.f122525a[this.f122464a.getClusteringMode$scandit_barcode_capture().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f122473j;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar = this.f122470g;
        fVar.f124381a.a(fVar.b(), fVar.a());
        q qVar = (q) this.f122470g.b();
        boolean zC = c();
        qVar.f122524h = zC;
        if (!zC) {
            qVar.f122520d.clear();
            qVar.f122519c = null;
        }
        qVar.invalidate();
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar2 = this.f122469f;
        fVar2.f124381a.a(fVar2.b(), fVar2.a());
        p pVar = (p) this.f122469f.b();
        pVar.f122512f = c();
        pVar.invalidate();
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar3 = this.f122471h;
        fVar3.f124381a.a(fVar3.b(), fVar3.a());
        j jVar = (j) this.f122471h.b();
        jVar.f122499f = c();
        jVar.invalidate();
    }

    public final void a(NativeBarcodeCountBasicOverlayStyle style, NativeBarcodeCountBasicOverlayColorScheme colorScheme) {
        int iA;
        Intrinsics.j(style, "style");
        Intrinsics.j(colorScheme, "colorScheme");
        q qVar = (q) this.f122470g.b();
        int i10 = AbstractC13218a.f122481a;
        BarcodeCountBasicOverlay brushDelegate = this.f122465b;
        Intrinsics.j(brushDelegate, "brushDelegate");
        Intrinsics.j(style, "style");
        Intrinsics.j(colorScheme, "colorScheme");
        if (colorScheme != NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE && style != NativeBarcodeCountBasicOverlayStyle.DOT) {
            iA = AbstractC13218a.f122481a;
        } else {
            Brush recognizedBrush = brushDelegate.getRecognizedBrush();
            iA = recognizedBrush != null ? com.scandit.datacapture.barcode.internal.module.extensions.a.a(recognizedBrush.getFillColor(), 77) : 0;
        }
        qVar.f122517a.setColor(iA);
    }
}
