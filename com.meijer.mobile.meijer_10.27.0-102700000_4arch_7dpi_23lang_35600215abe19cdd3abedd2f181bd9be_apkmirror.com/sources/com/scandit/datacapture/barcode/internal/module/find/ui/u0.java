package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewDefaults;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings;
import com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler;
import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategoryHandler;
import com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.C13180c;
import com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.C13181d;
import com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.C13182e;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintPresenterV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.ToastHint;
import com.scandit.datacapture.core.ui.DataCaptureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes11.dex */
public final class u0 implements BarcodeFindViewLayout {

    /* renamed from: a, reason: collision with root package name */
    public final DataCaptureView f122281a;

    /* renamed from: b, reason: collision with root package name */
    public final ScreenSizeCategoryHandler f122282b;

    /* renamed from: c, reason: collision with root package name */
    public final PreviewResolutionRatioHandler f122283c;

    /* renamed from: d, reason: collision with root package name */
    public final C13152a f122284d;

    /* renamed from: e, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.l f122285e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f f122286f;

    /* renamed from: g, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c f122287g;

    /* renamed from: h, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.d f122288h;

    /* renamed from: i, reason: collision with root package name */
    public final CardsCarouselView f122289i;

    /* renamed from: j, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.find.ui.camera.e f122290j;

    /* renamed from: k, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.u f122291k;

    /* renamed from: l, reason: collision with root package name */
    public final HintHolderV2 f122292l;

    /* renamed from: m, reason: collision with root package name */
    public final HintPresenterV2 f122293m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f122294n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f122295o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f122296p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f122297q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f122298r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f122299s;

    /* renamed from: t, reason: collision with root package name */
    public String f122300t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f122301u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f122302v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f122303w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f122304x;

    /* renamed from: y, reason: collision with root package name */
    public Anchor f122305y;

    /* renamed from: z, reason: collision with root package name */
    public final int f122306z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.scandit.datacapture.barcode.internal.module.find.ui.I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.scandit.datacapture.barcode.internal.module.find.ui.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.scandit.datacapture.barcode.internal.module.find.ui.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.scandit.datacapture.barcode.internal.module.find.ui.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.scandit.datacapture.barcode.internal.module.find.ui.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.scandit.datacapture.barcode.internal.module.find.ui.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.scandit.datacapture.barcode.internal.module.find.ui.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.scandit.datacapture.barcode.internal.module.find.ui.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.scandit.datacapture.barcode.internal.module.find.ui.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.scandit.datacapture.barcode.internal.module.find.ui.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.scandit.datacapture.barcode.internal.module.find.ui.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.scandit.datacapture.barcode.internal.module.find.ui.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.scandit.datacapture.barcode.internal.module.find.ui.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.scandit.datacapture.barcode.internal.module.find.ui.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.scandit.datacapture.barcode.internal.module.find.ui.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.scandit.datacapture.barcode.internal.module.find.ui.F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.scandit.datacapture.barcode.internal.module.find.ui.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.scandit.datacapture.barcode.internal.module.find.ui.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.scandit.datacapture.barcode.internal.module.find.ui.J, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.scandit.datacapture.barcode.internal.module.find.ui.t, java.lang.Object] */
    public u0(Context context, BarcodeFindViewSettings settings, DataCaptureView dataCaptureView, ScreenSizeCategoryHandler screenSizeHandler, PreviewResolutionRatioHandler resolutionRatioHandler) {
        RelativeLayout.LayoutParams layoutParams;
        Intrinsics.j(context, "context");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(dataCaptureView, "dataCaptureView");
        Intrinsics.j(screenSizeHandler, "screenSizeCategoryHandler");
        Intrinsics.j(resolutionRatioHandler, "cameraPreviewRatioHandler");
        this.f122281a = dataCaptureView;
        this.f122282b = screenSizeHandler;
        this.f122283c = resolutionRatioHandler;
        C13152a c13152a = new C13152a(context);
        c13152a.setId(R.id.sc_find_dots_view);
        c13152a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c13152a.f122178e = settings.getInListItemColor();
        c13152a.f122179f = settings.getNotInListItemColor();
        this.f122284d = c13152a;
        com.scandit.datacapture.barcode.internal.module.ui.l lVar = new com.scandit.datacapture.barcode.internal.module.ui.l(context);
        lVar.setId(R.id.sc_find_guidance_view);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        lVar.setLayoutParams(layoutParams2);
        lVar.setVisibility(8);
        this.f122285e = lVar;
        com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f view = new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f(context);
        view.setId(R.id.sc_find_shutter_button_view);
        this.f122286f = view;
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c view2 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c(context);
        view2.setId(R.id.sc_find_exit_button_view);
        view2.f123318b.setVisibility(8);
        view2.f123317a.getBackground().setLevel(1);
        this.f122287g = view2;
        com.scandit.datacapture.barcode.internal.module.ui.d view3 = new com.scandit.datacapture.barcode.internal.module.ui.d(context);
        view3.setId(R.id.sc_find_progress_bar);
        view3.f123306b = 0;
        view3.b();
        view3.f123305a = 0;
        view3.b();
        view3.setVisibility(4);
        view3.f123307c = settings.getProgressBarStartColor();
        view3.b();
        view3.f123308d = settings.getProgressBarFinishColor();
        view3.b();
        this.f122288h = view3;
        CardsCarouselView view4 = new CardsCarouselView(context, null, 0, 6, null);
        view4.setId(R.id.sc_find_carousel_view);
        view4.setUiListener(new r(this));
        this.f122289i = view4;
        com.scandit.datacapture.barcode.internal.module.find.ui.camera.e view5 = new com.scandit.datacapture.barcode.internal.module.find.ui.camera.e(context);
        view5.setId(R.id.sc_find_zoom_control);
        view5.setVisibility(4);
        this.f122290j = view5;
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.e eVar = com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f.f123428e;
        ?? shouldShow = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.E
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((u0) this.receiver).f122295o);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                ((u0) this.receiver).a(((Boolean) obj).booleanValue());
            }
        };
        ?? dataCaptureViewGetter = new PropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.F
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((u0) this.receiver).f122281a;
            }
        };
        com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.r isTallFormFactor = new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.r();
        Intrinsics.j(eVar, "<this>");
        Intrinsics.j(view, "view");
        Intrinsics.j(shouldShow, "shouldShow");
        Intrinsics.j(screenSizeHandler, "sizeCategoryHandler");
        Intrinsics.j(resolutionRatioHandler, "previewResolutionHandler");
        Intrinsics.j(dataCaptureViewGetter, "dataCaptureViewGetter");
        Intrinsics.j(isTallFormFactor, "isTallFormFactor");
        final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.q(shouldShow, screenSizeHandler, resolutionRatioHandler, isTallFormFactor, dataCaptureViewGetter), new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.s(view));
        ?? shouldShow2 = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.z
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((u0) this.receiver).f122296p);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                ((u0) this.receiver).e(((Boolean) obj).booleanValue());
            }
        };
        ?? isShowingProgressBar = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.A
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((u0) this.receiver).f122297q);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                ((u0) this.receiver).b(((Boolean) obj).booleanValue());
            }
        };
        ?? shutterButtonViewGetter = new MutablePropertyReference0Impl(fVar) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.B
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f) this.receiver).b();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar2 = (com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f) this.receiver;
                View view6 = (View) obj;
                fVar2.getClass();
                Intrinsics.j(view6, "<set-?>");
                fVar2.f123431c = view6;
            }
        };
        com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.k isTallFormFactor2 = new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.k();
        Intrinsics.j(eVar, "<this>");
        Intrinsics.j(view2, "view");
        Intrinsics.j(shouldShow2, "shouldShow");
        Intrinsics.j(screenSizeHandler, "screenSizeHandler");
        Intrinsics.j(shutterButtonViewGetter, "shutterButtonViewGetter");
        Intrinsics.j(isShowingProgressBar, "isShowingProgressBar");
        Intrinsics.j(isTallFormFactor2, "isTallFormFactor");
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar2 = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.j(shouldShow2, isTallFormFactor2, screenSizeHandler, isShowingProgressBar, shutterButtonViewGetter), new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.l(view2));
        ?? shouldShow3 = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.C
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((u0) this.receiver).f122297q);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                ((u0) this.receiver).b(((Boolean) obj).booleanValue());
            }
        };
        ?? dataCaptureViewGetter2 = new PropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.D
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((u0) this.receiver).f122281a;
            }
        };
        Intrinsics.j(eVar, "<this>");
        Intrinsics.j(view3, "view");
        Intrinsics.j(shouldShow3, "shouldShow");
        Intrinsics.j(dataCaptureViewGetter2, "dataCaptureViewGetter");
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar3 = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.m(shouldShow3, dataCaptureViewGetter2), new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.n(view3));
        ?? shouldShow4 = new PropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.w
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                u0 u0Var = (u0) this.receiver;
                return Boolean.valueOf(u0Var.f122299s && u0Var.f122298r);
            }
        };
        ?? shutterButtonReferenceViewGetter = new MutablePropertyReference0Impl(fVar) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.x
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f) this.receiver).b();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar4 = (com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f) this.receiver;
                View view6 = (View) obj;
                fVar4.getClass();
                Intrinsics.j(view6, "<set-?>");
                fVar4.f123431c = view6;
            }
        };
        ?? progressBarReferenceViewGetter = new PropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.y
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((u0) this.receiver).f122288h;
            }
        };
        C13181d isTallFormFactor3 = new C13181d();
        Intrinsics.j(eVar, "<this>");
        Intrinsics.j(view4, "view");
        Intrinsics.j(shouldShow4, "shouldShow");
        Intrinsics.j(shutterButtonReferenceViewGetter, "shutterButtonReferenceViewGetter");
        Intrinsics.j(progressBarReferenceViewGetter, "progressBarReferenceViewGetter");
        Intrinsics.j(isTallFormFactor3, "isTallFormFactor");
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar4 = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new C13180c(shouldShow4, shutterButtonReferenceViewGetter, progressBarReferenceViewGetter, isTallFormFactor3), new C13182e(view4));
        ?? shouldShow5 = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.G
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((u0) this.receiver).f122294n);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                u0 u0Var = (u0) this.receiver;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (u0Var.f122294n == zBooleanValue) {
                    return;
                }
                u0Var.f122294n = zBooleanValue;
                ViewExtensionsKt.runOnMainThread(u0Var.f122290j, new i0(u0Var));
            }
        };
        ?? dataCaptureViewGetter3 = new PropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.H
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((u0) this.receiver).f122281a;
            }
        };
        ?? shutterButtonViewGetter2 = new MutablePropertyReference0Impl(fVar) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.I
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f) this.receiver).b();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar5 = (com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f) this.receiver;
                View view6 = (View) obj;
                fVar5.getClass();
                Intrinsics.j(view6, "<set-?>");
                fVar5.f123431c = view6;
            }
        };
        ?? torchButtonPosition = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.J
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((u0) this.receiver).f122305y;
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                ((u0) this.receiver).a((Anchor) obj);
            }
        };
        ?? isShowingTorchButton = new PropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.K
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                u0 u0Var = (u0) this.receiver;
                return Boolean.valueOf(u0Var.f122304x && u0Var.f122303w);
            }
        };
        ?? isShowingProgressBar2 = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.L
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((u0) this.receiver).f122297q);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                ((u0) this.receiver).b(((Boolean) obj).booleanValue());
            }
        };
        com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.E isTallFormFactor4 = new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.E();
        Intrinsics.j(eVar, "<this>");
        Intrinsics.j(view5, "view");
        Intrinsics.j(shouldShow5, "shouldShow");
        Intrinsics.j(dataCaptureViewGetter3, "dataCaptureViewGetter");
        Intrinsics.j(shutterButtonViewGetter2, "shutterButtonViewGetter");
        Intrinsics.j(screenSizeHandler, "screenSizeHandler");
        Intrinsics.j(resolutionRatioHandler, "previewResolutionHandler");
        Intrinsics.j(isShowingProgressBar2, "isShowingProgressBar");
        Intrinsics.j(isShowingTorchButton, "isShowingTorchButton");
        Intrinsics.j(torchButtonPosition, "torchButtonPosition");
        Intrinsics.j(isTallFormFactor4, "isTallFormFactor");
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f fVar5 = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.D(shouldShow5, dataCaptureViewGetter3, shutterButtonViewGetter2, screenSizeHandler, resolutionRatioHandler, isShowingProgressBar2, isShowingTorchButton, torchButtonPosition, isTallFormFactor4), new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.F(view5));
        ?? isShowingProgressBar3 = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.s
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((u0) this.receiver).f122297q);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                ((u0) this.receiver).b(((Boolean) obj).booleanValue());
            }
        };
        ?? isShowingTorchButton2 = new PropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.t
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                u0 u0Var = (u0) this.receiver;
                return Boolean.valueOf(u0Var.f122304x && u0Var.f122303w);
            }
        };
        ?? torchButtonPosition2 = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.u
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((u0) this.receiver).f122305y;
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                ((u0) this.receiver).a((Anchor) obj);
            }
        };
        ?? isShowingFinishButton = new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.v
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((u0) this.receiver).f122296p);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj) {
                ((u0) this.receiver).e(((Boolean) obj).booleanValue());
            }
        };
        com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.h isTallFormFactor5 = new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.h();
        Intrinsics.j(eVar, "<this>");
        Intrinsics.j(dataCaptureView, "dataCaptureView");
        Intrinsics.j(screenSizeHandler, "screenSizeHandler");
        Intrinsics.j(resolutionRatioHandler, "previewResolutionHandler");
        Intrinsics.j(isShowingProgressBar3, "isShowingProgressBar");
        Intrinsics.j(isShowingTorchButton2, "isShowingTorchButton");
        Intrinsics.j(isShowingFinishButton, "isShowingFinishButton");
        Intrinsics.j(torchButtonPosition2, "torchButtonPosition");
        Intrinsics.j(isTallFormFactor5, "isTallFormFactor");
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f dataCaptureViewWrapper = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f(new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.g(screenSizeHandler, resolutionRatioHandler, isShowingProgressBar3, isShowingTorchButton2, isShowingFinishButton, torchButtonPosition2, isTallFormFactor5), new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.i(dataCaptureView));
        List dependantViewWrappers = CollectionsKt.p(fVar, fVar2, fVar3, fVar4, fVar5);
        Intrinsics.j(resolutionRatioHandler, "resolutionRatioHandler");
        Intrinsics.j(dataCaptureViewWrapper, "dataCaptureViewWrapper");
        Intrinsics.j(dependantViewWrappers, "dependantViewWrappers");
        this.f122291k = new com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.u(resolutionRatioHandler, dataCaptureViewWrapper, dependantViewWrappers);
        HintHolderV2 hintHolderV2Implementation = HintHolderV2.INSTANCE.implementation(context);
        Intrinsics.h(hintHolderV2Implementation, "null cannot be cast to non-null type android.view.View");
        View view6 = (View) hintHolderV2Implementation;
        if (ViewExtensionsKt.getOrientation(view6) == 1) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, R.id.sc_find_progress_bar);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        view6.setLayoutParams(layoutParams);
        this.f122292l = hintHolderV2Implementation;
        this.f122293m = new HintPresenterV2(hintHolderV2Implementation);
        this.f122295o = true;
        this.f122296p = true;
        this.f122299s = true;
        this.f122300t = BarcodeFindViewDefaults.getDefaultTextForCollapseCardsButton();
        this.f122301u = true;
        this.f122302v = true;
        this.f122305y = BarcodeFindViewDefaults.getDefaultTorchControlPosition();
        this.f122306z = context.getResources().getColor(R.color.sc_barcode_find_card_background_color, context.getTheme());
        dataCaptureView.setVisibility(4);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(boolean z10) {
        if (this.f122295o == z10) {
            return;
        }
        this.f122295o = z10;
        ViewExtensionsKt.runOnMainThread(this.f122286f, new e0(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean b() {
        return this.f122295o;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean c() {
        return this.f122304x;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void d(boolean z10) {
        if (this.f122299s == z10) {
            return;
        }
        this.f122299s = z10;
        ViewExtensionsKt.runOnMainThread(this.f122289i, new C13157c0(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean e() {
        return this.f122296p;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void f() {
        if (this.f122303w) {
            this.f122303w = false;
            ViewExtensionsKt.runOnMainThread(this.f122281a, new p0(this));
        }
        ViewExtensionsKt.runOnMainThread(this.f122281a, new O(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void g() {
        if (!this.f122303w) {
            this.f122303w = true;
            ViewExtensionsKt.runOnMainThread(this.f122281a, new p0(this));
        }
        ViewExtensionsKt.runOnMainThread(this.f122281a, new m0(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean h() {
        return this.f122299s;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void b(boolean z10) {
        if (this.f122297q == z10) {
            return;
        }
        this.f122297q = z10;
        ViewExtensionsKt.runOnMainThread(this.f122288h, new f0(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void c(boolean z10) {
        if (this.f122304x == z10) {
            return;
        }
        this.f122304x = z10;
        ViewExtensionsKt.runOnMainThread(this.f122281a, new g0(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void e(boolean z10) {
        if (this.f122296p == z10) {
            return;
        }
        this.f122296p = z10;
        ViewExtensionsKt.runOnMainThread(this.f122287g, new C13159d0(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean getShouldShowHints() {
        return this.f122301u;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void h(boolean z10) {
        if (this.f122302v == z10) {
            return;
        }
        this.f122302v = z10;
        ViewExtensionsKt.runOnMainThread(this.f122285e, new h0(this, z10));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final Anchor i() {
        return this.f122305y;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean j() {
        return this.f122302v;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void k() {
        this.f122291k.b();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void l() {
        ViewExtensionsKt.runOnMainThread(this.f122285e, new N(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void m() {
        this.f122281a.post(new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.D0
            @Override // java.lang.Runnable
            public final void run() {
                u0.a(this.f122154a);
            }
        });
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final PointF mapFramePointToView(Point point) {
        Intrinsics.j(point, "point");
        Point pointMapFramePointToView = this.f122281a.mapFramePointToView(point);
        return new PointF(pointMapFramePointToView.getX(), pointMapFramePointToView.getY());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void n() {
        ViewExtensionsKt.runOnMainThread(this.f122286f, X.f122171a);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void o() {
        P block = new P(this);
        Intrinsics.j(block, "block");
        ViewExtensionsKt.runOnMainThread(this.f122281a, new T(block));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean p() {
        return this.f122297q;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final String q() {
        return this.f122300t;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void setShouldShowHints(boolean z10) {
        if (this.f122301u == z10) {
            return;
        }
        this.f122301u = z10;
        if (z10) {
            return;
        }
        this.f122293m.hideAllToasts();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a() {
        if (this.f122298r) {
            this.f122298r = false;
            ViewExtensionsKt.runOnMainThread(this.f122289i, new o0(this));
        }
        ViewExtensionsKt.runOnMainThread(this.f122289i, new M(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void d(String str) {
        if (Intrinsics.e(this.f122300t, str)) {
            return;
        }
        this.f122300t = str;
        ViewExtensionsKt.runOnMainThread(this.f122289i, new q0(this, str));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void b(String text) {
        Intrinsics.j(text, "text");
        if (this.f122302v) {
            ViewExtensionsKt.runOnMainThread(this.f122285e, new k0(this, text));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void c(String tag) {
        Intrinsics.j(tag, "tag");
        this.f122293m.hideToast(tag);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void f(boolean z10) {
        ViewExtensionsKt.runOnMainThread(this.f122284d, new U(this, z10));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void g(boolean z10) {
        ViewExtensionsKt.runOnMainThread(this.f122286f, new W(z10));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void b(BarcodeFindItem item) {
        Intrinsics.j(item, "item");
        ViewExtensionsKt.runOnMainThread(this.f122289i, new Q(this, item));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void d() {
        ViewExtensionsKt.runOnMainThread(this.f122286f, Y.f122172a);
    }

    public static final void b(BarcodeFindViewPresenter presenter, View view) {
        Intrinsics.j(presenter, "$presenter");
        presenter.i();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(Map foundItems) {
        Intrinsics.j(foundItems, "foundItems");
        if (!this.f122298r) {
            this.f122298r = true;
            ViewExtensionsKt.runOnMainThread(this.f122289i, new o0(this));
        }
        ViewExtensionsKt.runOnMainThread(this.f122289i, new j0(this, foundItems));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(String text) {
        Intrinsics.j(text, "text");
        if (this.f122302v) {
            ViewExtensionsKt.runOnMainThread(this.f122285e, new l0(this, text));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(Anchor value) {
        Intrinsics.j(value, "value");
        if (this.f122305y == value) {
            return;
        }
        this.f122305y = value;
        ViewExtensionsKt.runOnMainThread(this.f122281a, new r0(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(RelativeLayout parent, com.scandit.datacapture.barcode.internal.module.find.ui.overlay.a overlay) {
        Intrinsics.j(parent, "parent");
        Intrinsics.j(overlay, "overlay");
        overlay.a(this.f122284d);
        overlay.a(this.f122285e);
        com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.u uVar = this.f122291k;
        uVar.getClass();
        Intrinsics.j(parent, "parent");
        if (!uVar.f122371e) {
            uVar.f122371e = true;
            uVar.f122368b.a(parent);
            if (uVar.f122370d && uVar.f122371e && uVar.f122372f) {
                uVar.f122368b.b().setVisibility(0);
                Iterator it = uVar.f122369c.iterator();
                while (it.hasNext()) {
                    ((com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.f) it.next()).a(uVar.f122368b.a());
                }
            }
        }
        Object obj = this.f122292l;
        Intrinsics.h(obj, "null cannot be cast to non-null type android.view.View");
        parent.addView((View) obj);
        this.f122281a.addListener(new Z(this));
    }

    public static final void a(u0 this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122291k.b();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(ArrayList dotsInfo) {
        Intrinsics.j(dotsInfo, "dotsInfo");
        ViewExtensionsKt.runOnMainThread(this.f122284d, new s0(this, dotsInfo));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(BarcodeFindItem item) {
        Intrinsics.j(item, "item");
        ViewExtensionsKt.runOnMainThread(this.f122284d, new S(this, item));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(LinkedHashMap searchedItems, Map foundItems) {
        Intrinsics.j(searchedItems, "searchedItems");
        Intrinsics.j(foundItems, "foundItems");
        ViewExtensionsKt.runOnMainThread(this.f122289i, new t0(this, searchedItems, foundItems));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(int i10, int i11) {
        ViewExtensionsKt.runOnMainThread(this.f122288h, new V(this, i10, i11));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(final BarcodeFindViewPresenter presenter) {
        Intrinsics.j(presenter, "presenter");
        this.f122286f.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.B0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u0.a(presenter, view);
            }
        });
        this.f122287g.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.internal.module.find.ui.C0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u0.b(presenter, view);
            }
        });
        this.f122284d.f122174a = new C13153a0(presenter);
        this.f122290j.f122197c = new C13155b0(presenter);
    }

    public static final void a(BarcodeFindViewPresenter presenter, View view) {
        Intrinsics.j(presenter, "$presenter");
        presenter.b();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(String hint, NativeToastHintStyle style, String tag) {
        Intrinsics.j(hint, "hint");
        Intrinsics.j(style, "style");
        Intrinsics.j(tag, "tag");
        this.f122293m.showToast(new ToastHint(style, hint, tag, false, 8, null));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(w0 block) {
        Intrinsics.j(block, "block");
        ViewExtensionsKt.runOnMainThread(this.f122281a, new T(block));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(List zoomLevels, float f10) {
        Intrinsics.j(zoomLevels, "zoomLevels");
        ViewExtensionsKt.runOnMainThread(this.f122290j, new n0(this, zoomLevels, f10));
    }
}
