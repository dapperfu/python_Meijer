package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyleExtensionKt;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13212t;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13217y;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.U;
import com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.J;
import com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalMode;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13234a;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13243e0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13248h;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13257l0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13266q;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13272t0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13279x;
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

/* loaded from: classes12.dex */
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
        C13234a c13234a = new C13234a(dataCaptureView);
        C13248h c13248h = new C13248h();
        J0 j02 = new J0(c13248h, gVar.f122537c, gVar.f122540f);
        F f10 = new F(c13248h, gVar.f122537c);
        C13279x c13279x = new C13279x(c13248h, gVar.f122537c);
        C13243e0 c13243e0 = new C13243e0(c13248h, gVar.f122537c);
        C13257l0 c13257l0 = new C13257l0(c13248h, gVar.f122537c);
        C13272t0 c13272t0 = new C13272t0(c13248h, gVar.f122537c);
        C13266q c13266q = new C13266q(c13248h, gVar.f122538d);
        O0 o02 = new O0(c13248h, gVar.f122538d);
        Z0 z02 = new Z0(c13248h, gVar.f122538d);
        n1 n1Var = new n1(context, c13248h, c13234a);
        h1 h1Var = new h1(gVar.f122542h, c1.a(context, mode));
        y1 y1Var = new y1(gVar.f122539e);
        X x10 = new X(gVar.f122539e);
        K k10 = new K(gVar.f122541g);
        B b10 = new B(context, mode, barcodeCountBasicOverlayNewInstance, gVar, new c(dataCaptureView));
        String string = context.getString(R.string.sc_loading);
        Intrinsics.i(string, "getString(...)");
        J j10 = new J(j02, f10, c13279x, c13243e0, c13257l0, c13272t0, c13266q, o02, z02, n1Var, h1Var, y1Var, x10, k10, c13248h, barcodeCountBasicOverlayNewInstance, b10, string);
        U u10 = new U(dataCaptureView);
        return new BarcodeCountView(context, mode, gVar, c13234a, barcodeCountBasicOverlayNewInstance, c13248h, j10, rVar, new C13212t(gVar, u10, new C13217y(context, barcodeCountBasicOverlayNewInstance, gVar, u10), barcodeCountBasicOverlayNewInstance.getStyle(), rVar, new e(barcodeCountBasicOverlayNewInstance), b10), new com.scandit.datacapture.barcode.internal.module.count.ui.mode.d(j10, gVar, mode, c13248h), internalMode, null, null, 6144, null);
    }
}
