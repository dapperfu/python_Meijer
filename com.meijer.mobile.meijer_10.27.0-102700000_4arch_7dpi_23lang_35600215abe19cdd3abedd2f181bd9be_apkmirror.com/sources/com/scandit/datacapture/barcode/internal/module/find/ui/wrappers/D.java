package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler;
import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategoryHandler;
import com.scandit.datacapture.barcode.internal.module.find.ui.AbstractC13172q;
import com.scandit.datacapture.barcode.internal.module.find.ui.G;
import com.scandit.datacapture.barcode.internal.module.find.ui.H;
import com.scandit.datacapture.barcode.internal.module.find.ui.I;
import com.scandit.datacapture.barcode.internal.module.find.ui.J;
import com.scandit.datacapture.barcode.internal.module.find.ui.K;
import com.scandit.datacapture.barcode.internal.module.find.ui.L;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class D implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f122315j = LazyKt.b(z.f122378a);

    /* renamed from: k, reason: collision with root package name */
    public static final Lazy f122316k = LazyKt.b(A.f122313a);

    /* renamed from: l, reason: collision with root package name */
    public static final Lazy f122317l = LazyKt.b(w.f122375a);

    /* renamed from: m, reason: collision with root package name */
    public static final Lazy f122318m = LazyKt.b(y.f122377a);

    /* renamed from: n, reason: collision with root package name */
    public static final Lazy f122319n = LazyKt.b(x.f122376a);

    /* renamed from: o, reason: collision with root package name */
    public static final Lazy f122320o = LazyKt.b(v.f122374a);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122321a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f122322b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f122323c;

    /* renamed from: d, reason: collision with root package name */
    public final ScreenSizeCategoryHandler f122324d;

    /* renamed from: e, reason: collision with root package name */
    public final PreviewResolutionRatioHandler f122325e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f122326f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f122327g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f122328h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f122329i;

    public static void a(RelativeLayout.LayoutParams layoutParams, boolean z10) {
        Intrinsics.j(layoutParams, "<this>");
        layoutParams.addRule(10);
        Intrinsics.j(layoutParams, "<this>");
        layoutParams.addRule(20);
        Lazy lazy = f122319n;
        layoutParams.setMarginStart(((Number) lazy.getValue()).intValue());
        int iIntValue = ((Number) lazy.getValue()).intValue();
        layoutParams.topMargin = iIntValue;
        if (z10) {
            layoutParams.topMargin = iIntValue + ((int) ((Number) AbstractC13172q.f122269a.getValue()).floatValue());
        }
    }

    public D(G shouldShow, H dataCaptureViewGetter, I shutterButtonViewGetter, ScreenSizeCategoryHandler screenSizeHandler, PreviewResolutionRatioHandler previewResolutionHandler, L isShowingProgressBar, K isShowingTorchButton, J torchButtonPosition, Function1 isTallFormFactor) {
        Intrinsics.j(shouldShow, "shouldShow");
        Intrinsics.j(dataCaptureViewGetter, "dataCaptureViewGetter");
        Intrinsics.j(shutterButtonViewGetter, "shutterButtonViewGetter");
        Intrinsics.j(screenSizeHandler, "screenSizeHandler");
        Intrinsics.j(previewResolutionHandler, "previewResolutionHandler");
        Intrinsics.j(isShowingProgressBar, "isShowingProgressBar");
        Intrinsics.j(isShowingTorchButton, "isShowingTorchButton");
        Intrinsics.j(torchButtonPosition, "torchButtonPosition");
        Intrinsics.j(isTallFormFactor, "isTallFormFactor");
        this.f122321a = shouldShow;
        this.f122322b = dataCaptureViewGetter;
        this.f122323c = shutterButtonViewGetter;
        this.f122324d = screenSizeHandler;
        this.f122325e = previewResolutionHandler;
        this.f122326f = isShowingProgressBar;
        this.f122327g = isShowingTorchButton;
        this.f122328h = torchButtonPosition;
        this.f122329i = isTallFormFactor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023d  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.widget.LinearLayout, com.scandit.datacapture.barcode.internal.module.find.ui.camera.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r19, android.view.ViewGroup r20) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.D.a(android.view.View, android.view.ViewGroup):void");
    }
}
