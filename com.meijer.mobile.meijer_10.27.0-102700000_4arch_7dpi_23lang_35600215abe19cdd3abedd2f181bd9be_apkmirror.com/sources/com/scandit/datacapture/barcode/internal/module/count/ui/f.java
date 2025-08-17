package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyleExtensionKt;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13079t;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13084y;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.U;
import com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.J;
import com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalMode;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13101a;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13110e0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13115h;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13124l0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13133q;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13139t0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13146x;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.J0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.K;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.O0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.X;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.Z0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.c1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.h1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.n1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.y1;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class f {
    public static final BarcodeCountView a(Context context, DataCaptureView dataCaptureView, BarcodeCount mode, BarcodeCountViewStyle style, BarcodeCountInternalMode internalMode) {
        Intrinsics.j(context, "context");
        Intrinsics.j(dataCaptureView, "dataCaptureView");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(style, "style");
        Intrinsics.j(internalMode, "internalMode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlayNewInstance = BarcodeCountBasicOverlay.INSTANCE.newInstance(dataCaptureView, mode, BarcodeCountViewStyleExtensionKt.toOverlayStyle(style));
        com.scandit.datacapture.barcode.internal.module.count.ui.handlers.r rVar = new com.scandit.datacapture.barcode.internal.module.count.ui.handlers.r(barcodeCountBasicOverlayNewInstance);
        g gVar = new g(context);
        C13101a c13101a = new C13101a(dataCaptureView);
        C13115h c13115h = new C13115h();
        J0 j02 = new J0(c13115h, gVar.f121585c, gVar.f121588f);
        F f10 = new F(c13115h, gVar.f121585c);
        C13146x c13146x = new C13146x(c13115h, gVar.f121585c);
        C13110e0 c13110e0 = new C13110e0(c13115h, gVar.f121585c);
        C13124l0 c13124l0 = new C13124l0(c13115h, gVar.f121585c);
        C13139t0 c13139t0 = new C13139t0(c13115h, gVar.f121585c);
        C13133q c13133q = new C13133q(c13115h, gVar.f121586d);
        O0 o02 = new O0(c13115h, gVar.f121586d);
        Z0 z02 = new Z0(c13115h, gVar.f121586d);
        n1 n1Var = new n1(context, c13115h, c13101a);
        h1 h1Var = new h1(gVar.f121590h, c1.a(context, mode));
        y1 y1Var = new y1(gVar.f121587e);
        X x10 = new X(gVar.f121587e);
        K k10 = new K(gVar.f121589g);
        B b10 = new B(context, mode, barcodeCountBasicOverlayNewInstance, gVar, new c(dataCaptureView));
        String string = context.getString(R.string.sc_loading);
        Intrinsics.i(string, "getString(...)");
        J j10 = new J(j02, f10, c13146x, c13110e0, c13124l0, c13139t0, c13133q, o02, z02, n1Var, h1Var, y1Var, x10, k10, c13115h, barcodeCountBasicOverlayNewInstance, b10, string);
        U u10 = new U(dataCaptureView);
        return new BarcodeCountView(context, mode, gVar, c13101a, barcodeCountBasicOverlayNewInstance, c13115h, j10, rVar, new C13079t(gVar, u10, new C13084y(context, barcodeCountBasicOverlayNewInstance, gVar, u10), barcodeCountBasicOverlayNewInstance.getStyle(), rVar, new e(barcodeCountBasicOverlayNewInstance), b10), new com.scandit.datacapture.barcode.internal.module.count.ui.mode.d(j10, gVar, mode, c13115h), internalMode, null, null, 6144, null);
    }
}
