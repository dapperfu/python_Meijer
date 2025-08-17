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

/* loaded from: classes11.dex */
public final class B implements s {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCount f121512a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeCountBasicOverlay f121513b;

    /* renamed from: c, reason: collision with root package name */
    public final BarcodeCountViewLayerManager f121514c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f121515d;

    /* renamed from: e, reason: collision with root package name */
    public NativeBarcodeClusterLiveEditor f121516e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f f121517f;

    /* renamed from: g, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f f121518g;

    /* renamed from: h, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f f121519h;

    /* renamed from: i, reason: collision with root package name */
    public r f121520i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f121521j;

    public final Quadrilateral a(Quadrilateral quadrilateral, float f10) {
        Intrinsics.j(quadrilateral, "quadrilateral");
        Quadrilateral quadrilateral2 = (Quadrilateral) this.f121515d.invoke(quadrilateral);
        return QuadrilateralUtilsKt.grow(quadrilateral2, ((f10 - 1.0f) * Float.min(QuadrilateralUtilsKt.getHeight(quadrilateral2), QuadrilateralUtilsKt.getWidth(quadrilateral2))) / 2.0f);
    }

    public B(Context context, BarcodeCount mode, BarcodeCountBasicOverlay overlay, com.scandit.datacapture.barcode.internal.module.count.ui.g layerManager, com.scandit.datacapture.barcode.internal.module.count.ui.c mapper) {
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(mapper, "mapper");
        this.f121512a = mode;
        this.f121513b = overlay;
        this.f121514c = layerManager;
        this.f121515d = mapper;
        this.f121517f = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new E(), new v(context));
        this.f121518g = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new E(), new A(context, this));
        this.f121519h = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new E(), new u(context));
        this.f121521j = true;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121518g.a(this.f121514c.a());
        this.f121517f.a(this.f121514c.a());
        ((p) this.f121517f.b()).f121561g = new w(this);
        this.f121519h.a(this.f121514c.d());
        ((j) this.f121519h.b()).f121548g = new x(this);
    }

    public final boolean c() {
        int i10 = t.f121573a[this.f121512a.getClusteringMode$scandit_barcode_capture().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f121521j;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar = this.f121518g;
        fVar.f123429a.a(fVar.b(), fVar.a());
        q qVar = (q) this.f121518g.b();
        boolean zC = c();
        qVar.f121572h = zC;
        if (!zC) {
            qVar.f121568d.clear();
            qVar.f121567c = null;
        }
        qVar.invalidate();
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar2 = this.f121517f;
        fVar2.f123429a.a(fVar2.b(), fVar2.a());
        p pVar = (p) this.f121517f.b();
        pVar.f121560f = c();
        pVar.invalidate();
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar3 = this.f121519h;
        fVar3.f123429a.a(fVar3.b(), fVar3.a());
        j jVar = (j) this.f121519h.b();
        jVar.f121547f = c();
        jVar.invalidate();
    }

    public final void a(NativeBarcodeCountBasicOverlayStyle style, NativeBarcodeCountBasicOverlayColorScheme colorScheme) {
        int iA;
        Intrinsics.j(style, "style");
        Intrinsics.j(colorScheme, "colorScheme");
        q qVar = (q) this.f121518g.b();
        int i10 = AbstractC13085a.f121529a;
        BarcodeCountBasicOverlay brushDelegate = this.f121513b;
        Intrinsics.j(brushDelegate, "brushDelegate");
        Intrinsics.j(style, "style");
        Intrinsics.j(colorScheme, "colorScheme");
        if (colorScheme != NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE && style != NativeBarcodeCountBasicOverlayStyle.DOT) {
            iA = AbstractC13085a.f121529a;
        } else {
            Brush recognizedBrush = brushDelegate.getRecognizedBrush();
            iA = recognizedBrush != null ? com.scandit.datacapture.barcode.internal.module.extensions.a.a(recognizedBrush.getFillColor(), 77) : 0;
        }
        qVar.f121565a.setColor(iA);
    }
}
