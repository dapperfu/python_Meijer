package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.data.InterfaceC13198k;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager;
import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.internal.module.spark.ui.C13210c;
import com.scandit.datacapture.barcode.internal.module.spark.ui.C13211d;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.F;
import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlayStyle;
import com.scandit.datacapture.barcode.spark.ui.SparkScanMiniPreviewSize;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.LogoStyle;
import com.scandit.datacapture.core.ui.gesture.FocusGesture;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class F extends RelativeLayout implements InterfaceC13198k, SparkScanViewMiniPreview {

    /* renamed from: a, reason: collision with root package name */
    public final DataCaptureContext f123144a;

    /* renamed from: b, reason: collision with root package name */
    public final SparkScanStateManager f123145b;

    /* renamed from: c, reason: collision with root package name */
    public final SparkScanViewCameraManager f123146c;

    /* renamed from: d, reason: collision with root package name */
    public ViewGroup f123147d;

    /* renamed from: e, reason: collision with root package name */
    public final C13235o f123148e;

    /* renamed from: f, reason: collision with root package name */
    public final z f123149f;

    /* renamed from: g, reason: collision with root package name */
    public final p f123150g;

    /* renamed from: h, reason: collision with root package name */
    public final C13228h f123151h;

    /* renamed from: i, reason: collision with root package name */
    public final r f123152i;

    /* renamed from: j, reason: collision with root package name */
    public final C13226f f123153j;

    /* renamed from: k, reason: collision with root package name */
    public final N f123154k;

    /* renamed from: l, reason: collision with root package name */
    public final C13221a f123155l;

    /* renamed from: m, reason: collision with root package name */
    public final t f123156m;

    /* renamed from: n, reason: collision with root package name */
    public final C13210c f123157n;

    /* renamed from: o, reason: collision with root package name */
    public final C13223c f123158o;

    /* renamed from: p, reason: collision with root package name */
    public DataCaptureView f123159p;

    /* renamed from: q, reason: collision with root package name */
    public final C13222b f123160q;

    /* renamed from: r, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.g f123161r;

    /* renamed from: s, reason: collision with root package name */
    public Brush f123162s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f123163t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f123164u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f123165v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f123166w;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(x xVar) {
        this.f123149f.f123236a = xVar;
        this.f123148e.f123207a = xVar;
        this.f123151h.f123198a = xVar;
        this.f123152i.f123214a = xVar;
        this.f123156m.f123219b = xVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void b() {
        this.f123153j.f123196b = true;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void c(boolean z10) {
        N n10 = this.f123154k;
        n10.f123177e.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void d(boolean z10) {
        N n10 = this.f123154k;
        n10.f123176d.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void e(boolean z10) {
        this.f123165v = z10;
        D();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void f(boolean z10) {
        N n10 = this.f123154k;
        n10.f123178f.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void g(boolean z10) {
        N n10 = this.f123154k;
        n10.f123175c.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void h(boolean z10) {
        this.f123164u = z10;
        E();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void i(boolean z10) {
        N n10 = this.f123154k;
        n10.f123179g.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void j(boolean z10) {
        N n10 = this.f123154k;
        n10.f123180h.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void k(boolean z10) {
        this.f123166w = z10;
        F();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void l(boolean z10) {
        this.f123157n.f123114a.f123116a.enableSingleScanMode(z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Context context, DataCaptureContext dataCaptureContext, SparkScan sparkScan, SparkScanStateManager stateManager, SparkScanViewCameraManager cameraManager) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(sparkScan, "sparkScan");
        Intrinsics.j(stateManager, "stateManager");
        Intrinsics.j(cameraManager, "cameraManager");
        this.f123144a = dataCaptureContext;
        this.f123145b = stateManager;
        this.f123146c = cameraManager;
        Intrinsics.j(this, "container");
        Intrinsics.j(this, "toolbarInfo");
        this.f123148e = new C13235o(this, this);
        this.f123149f = new z(this);
        this.f123150g = new p(this);
        this.f123151h = new C13228h(this);
        this.f123152i = new r(this);
        this.f123153j = new C13226f(this);
        this.f123154k = new N(context, stateManager);
        this.f123155l = new C13221a(context);
        this.f123156m = new t(this, stateManager);
        SparkScanInternal mode = sparkScan.get_sparkScanInternal();
        Intrinsics.j(mode, "mode");
        C13210c c13210c = new C13210c(mode, NativeSparkScanOverlayStyle.FRAME);
        this.f123157n = c13210c;
        this.f123158o = new C13223c(context);
        C13222b c13222b = new C13222b(context);
        c13222b.setVisibility(8);
        this.f123160q = c13222b;
        com.scandit.datacapture.barcode.internal.module.ui.g gVar = new com.scandit.datacapture.barcode.internal.module.ui.g(context);
        Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122983m;
        gVar.f123334d = ((Number) lazy.getValue()).floatValue();
        gVar.requestLayout();
        this.f123161r = gVar;
        this.f123162s = SparkScanViewDefaults.getDefaultBrush();
        this.f123163t = SparkScanViewDefaults.getDefaultZoomSwitchControlVisible();
        this.f123164u = SparkScanViewDefaults.getDefaultPreviewSizeControlVisible();
        this.f123165v = SparkScanViewDefaults.getDefaultPreviewCloseControlVisible();
        this.f123166w = SparkScanViewDefaults.getDefaultTorchControlVisible();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(((Number) lazy.getValue()).floatValue());
        gradientDrawable.setShape(0);
        setBackground(gradientDrawable);
        setClipChildren(false);
        setDescendantFocusability(393216);
        setVisibility(4);
        gVar.setElevation(((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122981k.getValue()).floatValue());
        c13210c.f123114a.f123116a.setShouldDrawViewFinder(stateManager.p() instanceof SparkScanScanningMode.Target);
        Brush p02 = this.f123162s;
        Intrinsics.j(p02, "<set-?>");
        C13211d c13211d = c13210c.f123114a;
        c13211d.getClass();
        Intrinsics.j(p02, "p0");
        c13211d.f123116a.setBrushForRecognizedBarcodes(CoreNativeTypeFactory.INSTANCE.convert(p02));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean A() {
        return this.f123154k.f123175c.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.F.C():void");
    }

    public final void D() {
        C13228h c13228h = this.f123151h;
        boolean z10 = this.f123165v;
        if (!z10) {
            if (z10) {
                c13228h.getClass();
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) c13228h.f123199b.get();
            if (relativeLayout != null) {
                relativeLayout.removeView(c13228h.f123200c);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) c13228h.f123199b.get();
        if (relativeLayout2 != null) {
            if (G.a(relativeLayout2, c13228h.f123200c)) {
                c13228h.f123200c.bringToFront();
                return;
            }
            C13227g c13227g = c13228h.f123200c;
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122966A;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            Unit unit = Unit.f142422a;
            relativeLayout2.addView(c13227g, layoutParams);
        }
    }

    public final void E() {
        C13235o c13235o = this.f123148e;
        boolean z10 = this.f123164u;
        if (!z10) {
            if (z10) {
                c13235o.getClass();
                return;
            }
            ViewGroup viewGroup = (ViewGroup) c13235o.f123208b.get();
            if (viewGroup != null) {
                viewGroup.removeView(c13235o.f123211e);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) c13235o.f123208b.get();
        if (viewGroup2 != null) {
            if (G.a(viewGroup2, c13235o.f123211e)) {
                c13235o.f123211e.bringToFront();
                return;
            }
            C13233m c13233m = c13235o.f123211e;
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122966A;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(9);
            layoutParams.addRule(8, com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122974d);
            Unit unit = Unit.f142422a;
            viewGroup2.addView(c13233m, layoutParams);
        }
    }

    public final void F() {
        r rVar = this.f123152i;
        boolean z10 = this.f123145b.a() != CameraPosition.USER_FACING && this.f123166w && this.f123145b.u() != TorchState.AUTO && (this.f123146c.isTorchAvailable() || this.f123146c.a() == null);
        if (!z10) {
            if (z10) {
                rVar.getClass();
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) rVar.f123215b.get();
            if (relativeLayout != null) {
                relativeLayout.removeView(rVar.f123216c);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) rVar.f123215b.get();
        if (relativeLayout2 != null) {
            if (G.a(relativeLayout2, rVar.f123216c)) {
                rVar.f123216c.bringToFront();
                return;
            }
            q qVar = rVar.f123216c;
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122966A;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            Unit unit = Unit.f142422a;
            relativeLayout2.addView(qVar, layoutParams);
        }
    }

    public final void G() {
        z zVar = this.f123149f;
        boolean z10 = this.f123163t;
        if (!z10) {
            if (z10) {
                zVar.getClass();
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) zVar.f123237b.get();
            if (relativeLayout != null) {
                relativeLayout.removeView(zVar.f123238c);
                Unit unit = Unit.f142422a;
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) zVar.f123237b.get();
        if (relativeLayout2 != null) {
            if (G.a(relativeLayout2, zVar.f123238c)) {
                zVar.f123238c.bringToFront();
                return;
            }
            y yVar = zVar.f123238c;
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122966A;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(11);
            layoutParams.addRule(8, com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122974d);
            Unit unit2 = Unit.f142422a;
            relativeLayout2.addView(yVar, layoutParams);
        }
    }

    public final void H() {
        this.f123154k.f();
        N n10 = this.f123154k;
        n10.setVisibility(!n10.c() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = this.f123155l.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.bottomMargin = this.f123154k.c() ? -((int) ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122983m.getValue()).floatValue()) : 0;
    }

    @Override // android.view.View
    public final float getElevation() {
        return this.f123161r.getElevation();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void m() {
        this.f123153j.a(new D(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void n() {
        post(new Runnable() { // from class: Ut.a
            @Override // java.lang.Runnable
            public final void run() {
                F.b(this.f36315a);
            }
        });
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean o() {
        return this.f123164u;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void p() {
        this.f123160q.setVisibility(8);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean q() {
        return this.f123154k.f123176d.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean r() {
        return this.f123166w;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void s() {
        this.f123158o.setAlpha(0.95f);
        this.f123158o.setVisibility(0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void setBrush(Brush p02) {
        Intrinsics.j(p02, "value");
        C13210c c13210c = this.f123157n;
        c13210c.getClass();
        Intrinsics.j(p02, "<set-?>");
        C13211d c13211d = c13210c.f123114a;
        c13211d.getClass();
        Intrinsics.j(p02, "p0");
        c13211d.f123116a.setBrushForRecognizedBarcodes(CoreNativeTypeFactory.INSTANCE.convert(p02));
        this.f123162s = p02;
    }

    @Override // android.view.View
    public final void setElevation(float f10) {
        this.f123161r.setElevation(f10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean t() {
        return this.f123163t;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final Integer u() {
        N n10 = this.f123154k;
        return (Integer) n10.f123187o.getValue(n10, N.f123172q[1]);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean v() {
        return this.f123154k.f123177e.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean w() {
        return this.f123165v;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.H
    public final boolean x() {
        return this.f123154k.c();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void y() {
        this.f123158o.setAlpha(0.0f);
        this.f123158o.setVisibility(8);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean z() {
        return this.f123154k.f123178f.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void B() {
        if (getVisibility() == 4) {
            return;
        }
        this.f123153j.a(new C(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void b(Integer num) {
        N n10 = this.f123154k;
        n10.f123188p.setValue(n10, N.f123172q[2], num);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean e() {
        return this.f123154k.f123179g.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void h() {
        C13226f c13226f = this.f123153j;
        c13226f.a();
        c13226f.f123197c = null;
        if (getVisibility() != 0) {
            DataCaptureView dataCaptureView = this.f123159p;
            if (dataCaptureView != null) {
                dataCaptureView.removeOverlay(this.f123157n);
                this.f123155l.removeView(dataCaptureView);
            }
            DataCaptureView.Companion companion = DataCaptureView.INSTANCE;
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            DataCaptureView dataCaptureViewNewInstance = companion.newInstance(context, this.f123144a);
            dataCaptureViewNewInstance.setZoomGesture(null);
            dataCaptureViewNewInstance.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            dataCaptureViewNewInstance.setLogoStyle(LogoStyle.MINIMAL);
            dataCaptureViewNewInstance.setLogoAnchor(Anchor.BOTTOM_CENTER);
            this.f123159p = dataCaptureViewNewInstance;
            this.f123155l.addView(dataCaptureViewNewInstance, new RelativeLayout.LayoutParams(-1, -1));
            DataCaptureView dataCaptureView2 = this.f123159p;
            if (dataCaptureView2 != null) {
                dataCaptureView2.addOverlay(this.f123157n);
            }
            setVisibility(0);
        }
        g();
        SparkScanScanningMode sparkScanScanningModeP = this.f123145b.p();
        this.f123157n.f123114a.f123116a.setShouldDrawViewFinder(sparkScanScanningModeP instanceof SparkScanScanningMode.Target);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void k() {
        this.f123149f.f123236a = null;
        this.f123148e.f123207a = null;
        this.f123152i.f123214a = null;
        this.f123151h.f123198a = null;
        this.f123145b.b(this);
        removeAllViews();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void l() {
        FocusGesture focusGesture;
        DataCaptureView dataCaptureView = this.f123159p;
        if (dataCaptureView == null || (focusGesture = dataCaptureView.getFocusGesture()) == null) {
            return;
        }
        focusGesture.triggerFocus(PointWithUnitUtilsKt.PointWithUnit(0.5f, 0.5f, MeasureUnit.FRACTION));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void b(boolean z10) {
        Pair pairA;
        Pair currentAndNextSize;
        Pair pairA2;
        if (!z10) {
            C13235o c13235o = this.f123148e;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams layoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            SparkScanMiniPreviewSize miniPreviewSize = this.f123145b.l();
            boolean z11 = this.f123145b.z();
            c13235o.getClass();
            Intrinsics.j(layoutParams2, "layoutParams");
            Intrinsics.j(miniPreviewSize, "miniPreviewSize");
            ViewGroup viewGroup = (ViewGroup) c13235o.f123210d.get();
            if (viewGroup == null) {
                return;
            }
            int i10 = AbstractC13234n.f123206a[miniPreviewSize.ordinal()];
            if (i10 == 1) {
                pairA2 = C13235o.a(viewGroup, z11);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA2 = c13235o.b(viewGroup, z11);
            }
            int iIntValue = ((Number) pairA2.a()).intValue();
            int iIntValue2 = ((Number) pairA2.b()).intValue();
            layoutParams2.width = iIntValue;
            layoutParams2.height = iIntValue2;
            return;
        }
        C13235o c13235o2 = this.f123148e;
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        Intrinsics.h(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams layoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3;
        SparkScanMiniPreviewSize miniPreviewSize2 = this.f123145b.l();
        boolean z12 = this.f123145b.z();
        c13235o2.getClass();
        Intrinsics.j(layoutParams4, "layoutParams");
        Intrinsics.j(miniPreviewSize2, "miniPreviewSize");
        ViewGroup viewGroup2 = (ViewGroup) c13235o2.f123210d.get();
        if (viewGroup2 == null) {
            currentAndNextSize = TuplesKt.a(new Size(-1, -1), new Size(-1, -1));
        } else {
            Size size = new Size(layoutParams4.width, layoutParams4.height);
            int i11 = AbstractC13234n.f123206a[miniPreviewSize2.ordinal()];
            if (i11 == 1) {
                pairA = C13235o.a(viewGroup2, z12);
            } else if (i11 == 2) {
                pairA = c13235o2.b(viewGroup2, z12);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            currentAndNextSize = TuplesKt.a(size, new Size(((Number) pairA.a()).intValue(), ((Number) pairA.b()).intValue()));
        }
        ViewGroup viewGroup3 = this.f123147d;
        if (viewGroup3 == null) {
            Intrinsics.y("container");
            viewGroup3 = null;
        }
        Size correctedViewSize = ViewExtensionsKt.getCorrectedViewSize(viewGroup3, this.f123145b.z());
        int height = correctedViewSize.getHeight();
        int width = correctedViewSize.getWidth();
        t tVar = this.f123156m;
        tVar.getClass();
        Intrinsics.j(currentAndNextSize, "currentAndNextSize");
        PointF pointFA = tVar.f123218a.a(width, height, currentAndNextSize);
        C13226f c13226f = this.f123153j;
        ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
        Intrinsics.h(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        c13226f.a((ViewGroup.MarginLayoutParams) layoutParams5, pointFA, (Size) currentAndNextSize.c(), (Size) currentAndNextSize.d(), new E(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void c(Integer num) {
        N n10 = this.f123154k;
        n10.f123187o.setValue(n10, N.f123172q[1], num);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean d() {
        return this.f123154k.f123180h.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void f() {
        this.f123153j.a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void g() {
        H();
        G();
        E();
        D();
        F();
        z zVar = this.f123149f;
        boolean zY = this.f123145b.y();
        SparkScanMiniPreviewSize miniPreviewSize = this.f123145b.l();
        zVar.getClass();
        Intrinsics.j(miniPreviewSize, "miniPreviewSize");
        y yVar = zVar.f123238c;
        StateListDrawable drawable = AbstractC13232l.a(yVar.f123235b, zY);
        Intrinsics.j(drawable, "drawable");
        yVar.f123202a.setImageDrawable(drawable);
        yVar.a(miniPreviewSize);
        C13228h c13228h = this.f123151h;
        SparkScanMiniPreviewSize miniPreviewSize2 = this.f123145b.l();
        boolean zH = this.f123145b.h();
        c13228h.getClass();
        Intrinsics.j(miniPreviewSize2, "miniPreviewSize");
        C13227g c13227g = c13228h.f123200c;
        Context context = c13227g.getContext();
        Intrinsics.i(context, "getContext(...)");
        StateListDrawable drawable2 = AbstractC13232l.a(context);
        Intrinsics.j(drawable2, "drawable");
        c13227g.f123202a.setImageDrawable(drawable2);
        c13227g.a(miniPreviewSize2);
        c13227g.setEnabled(!zH);
        r rVar = this.f123152i;
        SparkScanMiniPreviewSize miniPreviewSize3 = this.f123145b.l();
        TorchState torchState = this.f123145b.u();
        rVar.getClass();
        Intrinsics.j(miniPreviewSize3, "miniPreviewSize");
        Intrinsics.j(torchState, "torchState");
        q qVar = rVar.f123216c;
        Context context2 = qVar.getContext();
        Intrinsics.i(context2, "getContext(...)");
        StateListDrawable drawable3 = AbstractC13232l.a(context2, torchState);
        Intrinsics.j(drawable3, "drawable");
        qVar.f123202a.setImageDrawable(drawable3);
        qVar.a(miniPreviewSize3);
        C13235o c13235o = this.f123148e;
        this.f123145b.getClass();
        SparkScanMiniPreviewSize miniPreviewSize4 = this.f123145b.l();
        c13235o.getClass();
        Intrinsics.j(miniPreviewSize4, "miniPreviewSize");
        C13233m c13233m = c13235o.f123211e;
        c13233m.getClass();
        Intrinsics.j(miniPreviewSize4, "miniPreviewSize");
        StateListDrawable drawable4 = AbstractC13232l.a(c13233m.f123205b, miniPreviewSize4);
        Intrinsics.j(drawable4, "drawable");
        c13233m.f123202a.setImageDrawable(drawable4);
        c13233m.a(miniPreviewSize4);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x
    public final void i() {
        this.f123150g.i();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final Integer j() {
        N n10 = this.f123154k;
        return (Integer) n10.f123188p.getValue(n10, N.f123172q[2]);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void c() {
        this.f123160q.bringToFront();
        this.f123160q.setVisibility(0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(A a10) {
        this.f123154k.f123174b = a10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(boolean z10) {
        this.f123163t = z10;
        G();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final Integer a() {
        N n10 = this.f123154k;
        return (Integer) n10.f123186n.getValue(n10, N.f123172q[0]);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(Integer num) {
        N n10 = this.f123154k;
        n10.f123186n.setValue(n10, N.f123172q[0], num);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(ViewGroup parentContainer) {
        Intrinsics.j(parentContainer, "container");
        if (getParent() != null) {
            return;
        }
        this.f123147d = parentContainer;
        C13235o c13235o = this.f123148e;
        c13235o.getClass();
        Intrinsics.j(parentContainer, "parentContainer");
        c13235o.f123210d = new WeakReference(parentContainer);
        parentContainer.addView(this);
        this.f123145b.a(this);
        setId(com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122971a);
        View view = this.f123154k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122990t.getValue()).intValue());
        layoutParams.addRule(12);
        Unit unit = Unit.f142422a;
        addView(view, layoutParams);
        View view2 = this.f123155l;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(2, com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122972b);
        layoutParams2.bottomMargin = this.f123154k.c() ? -((int) ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122983m.getValue()).floatValue()) : 0;
        addView(view2, layoutParams2);
        View view3 = this.f123156m;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(8, com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122974d);
        addView(view3, layoutParams3);
        addView(this.f123158o, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f123160q, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f123161r, 0, new RelativeLayout.LayoutParams(-1, -1));
        post(new Runnable() { // from class: Ut.b
            @Override // java.lang.Runnable
            public final void run() {
                F.a(this.f36316a);
            }
        });
    }

    public static final void b(F this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.b(false);
        this$0.C();
    }

    public static final void a(F this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.g();
        this$0.b(false);
        this$0.C();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(float f10) {
        this.f123161r.setElevation(f10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(Brush brush, boolean z10) {
        Intrinsics.j(brush, "brush");
        C13210c c13210c = this.f123157n;
        c13210c.getClass();
        Intrinsics.j(brush, "brush");
        C13211d c13211d = c13210c.f123114a;
        c13211d.getClass();
        Intrinsics.j(brush, "brush");
        c13211d.f123116a.setBrushForErrorBarcodes(CoreNativeTypeFactory.INSTANCE.convert(brush));
        this.f123157n.f123114a.f123116a.onErrorFeedbackEmitted(z10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x
    public final void a(String text, int i10, int i11) {
        Intrinsics.j(text, "text");
        this.f123153j.a(new D(this));
        this.f123150g.a(text, i10, i11);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.InterfaceC13198k
    public final void a(SparkScanScanningMode previousMode, SparkScanScanningMode newMode) {
        Intrinsics.j(previousMode, "previousMode");
        Intrinsics.j(newMode, "newMode");
        this.f123157n.f123114a.f123116a.setShouldDrawViewFinder(newMode instanceof SparkScanScanningMode.Target);
    }
}
