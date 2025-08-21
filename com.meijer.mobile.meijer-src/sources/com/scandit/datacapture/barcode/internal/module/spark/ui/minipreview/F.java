package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.data.InterfaceC13331k;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager;
import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.internal.module.spark.ui.C13343c;
import com.scandit.datacapture.barcode.internal.module.spark.ui.C13344d;
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

/* loaded from: classes12.dex */
public final class F extends RelativeLayout implements InterfaceC13331k, SparkScanViewMiniPreview {

    /* renamed from: a, reason: collision with root package name */
    public final DataCaptureContext f124096a;

    /* renamed from: b, reason: collision with root package name */
    public final SparkScanStateManager f124097b;

    /* renamed from: c, reason: collision with root package name */
    public final SparkScanViewCameraManager f124098c;

    /* renamed from: d, reason: collision with root package name */
    public ViewGroup f124099d;

    /* renamed from: e, reason: collision with root package name */
    public final C13368o f124100e;

    /* renamed from: f, reason: collision with root package name */
    public final z f124101f;

    /* renamed from: g, reason: collision with root package name */
    public final p f124102g;

    /* renamed from: h, reason: collision with root package name */
    public final C13361h f124103h;

    /* renamed from: i, reason: collision with root package name */
    public final r f124104i;

    /* renamed from: j, reason: collision with root package name */
    public final C13359f f124105j;

    /* renamed from: k, reason: collision with root package name */
    public final N f124106k;

    /* renamed from: l, reason: collision with root package name */
    public final C13354a f124107l;

    /* renamed from: m, reason: collision with root package name */
    public final t f124108m;

    /* renamed from: n, reason: collision with root package name */
    public final C13343c f124109n;

    /* renamed from: o, reason: collision with root package name */
    public final C13356c f124110o;

    /* renamed from: p, reason: collision with root package name */
    public DataCaptureView f124111p;

    /* renamed from: q, reason: collision with root package name */
    public final C13355b f124112q;

    /* renamed from: r, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.g f124113r;

    /* renamed from: s, reason: collision with root package name */
    public Brush f124114s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f124115t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f124116u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f124117v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f124118w;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(x xVar) {
        this.f124101f.f124188a = xVar;
        this.f124100e.f124159a = xVar;
        this.f124103h.f124150a = xVar;
        this.f124104i.f124166a = xVar;
        this.f124108m.f124171b = xVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void b() {
        this.f124105j.f124148b = true;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void c(boolean z10) {
        N n10 = this.f124106k;
        n10.f124129e.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void d(boolean z10) {
        N n10 = this.f124106k;
        n10.f124128d.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void e(boolean z10) {
        this.f124117v = z10;
        D();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void f(boolean z10) {
        N n10 = this.f124106k;
        n10.f124130f.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void g(boolean z10) {
        N n10 = this.f124106k;
        n10.f124127c.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void h(boolean z10) {
        this.f124116u = z10;
        E();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void i(boolean z10) {
        N n10 = this.f124106k;
        n10.f124131g.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void j(boolean z10) {
        N n10 = this.f124106k;
        n10.f124132h.setVisibility(!z10 ? 8 : 0);
        n10.e();
        H();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void k(boolean z10) {
        this.f124118w = z10;
        F();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void l(boolean z10) {
        this.f124109n.f124066a.f124068a.enableSingleScanMode(z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Context context, DataCaptureContext dataCaptureContext, SparkScan sparkScan, SparkScanStateManager stateManager, SparkScanViewCameraManager cameraManager) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(sparkScan, "sparkScan");
        Intrinsics.j(stateManager, "stateManager");
        Intrinsics.j(cameraManager, "cameraManager");
        this.f124096a = dataCaptureContext;
        this.f124097b = stateManager;
        this.f124098c = cameraManager;
        Intrinsics.j(this, "container");
        Intrinsics.j(this, "toolbarInfo");
        this.f124100e = new C13368o(this, this);
        this.f124101f = new z(this);
        this.f124102g = new p(this);
        this.f124103h = new C13361h(this);
        this.f124104i = new r(this);
        this.f124105j = new C13359f(this);
        this.f124106k = new N(context, stateManager);
        this.f124107l = new C13354a(context);
        this.f124108m = new t(this, stateManager);
        SparkScanInternal mode = sparkScan.get_sparkScanInternal();
        Intrinsics.j(mode, "mode");
        C13343c c13343c = new C13343c(mode, NativeSparkScanOverlayStyle.FRAME);
        this.f124109n = c13343c;
        this.f124110o = new C13356c(context);
        C13355b c13355b = new C13355b(context);
        c13355b.setVisibility(8);
        this.f124112q = c13355b;
        com.scandit.datacapture.barcode.internal.module.ui.g gVar = new com.scandit.datacapture.barcode.internal.module.ui.g(context);
        Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123935m;
        gVar.f124286d = ((Number) lazy.getValue()).floatValue();
        gVar.requestLayout();
        this.f124113r = gVar;
        this.f124114s = SparkScanViewDefaults.getDefaultBrush();
        this.f124115t = SparkScanViewDefaults.getDefaultZoomSwitchControlVisible();
        this.f124116u = SparkScanViewDefaults.getDefaultPreviewSizeControlVisible();
        this.f124117v = SparkScanViewDefaults.getDefaultPreviewCloseControlVisible();
        this.f124118w = SparkScanViewDefaults.getDefaultTorchControlVisible();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(((Number) lazy.getValue()).floatValue());
        gradientDrawable.setShape(0);
        setBackground(gradientDrawable);
        setClipChildren(false);
        setDescendantFocusability(393216);
        setVisibility(4);
        gVar.setElevation(((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123933k.getValue()).floatValue());
        c13343c.f124066a.f124068a.setShouldDrawViewFinder(stateManager.p() instanceof SparkScanScanningMode.Target);
        Brush p02 = this.f124114s;
        Intrinsics.j(p02, "<set-?>");
        C13344d c13344d = c13343c.f124066a;
        c13344d.getClass();
        Intrinsics.j(p02, "p0");
        c13344d.f124068a.setBrushForRecognizedBarcodes(CoreNativeTypeFactory.INSTANCE.convert(p02));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean A() {
        return this.f124106k.f124127c.getVisibility() == 0;
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
        C13361h c13361h = this.f124103h;
        boolean z10 = this.f124117v;
        if (!z10) {
            if (z10) {
                c13361h.getClass();
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) c13361h.f124151b.get();
            if (relativeLayout != null) {
                relativeLayout.removeView(c13361h.f124152c);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) c13361h.f124151b.get();
        if (relativeLayout2 != null) {
            if (G.a(relativeLayout2, c13361h.f124152c)) {
                c13361h.f124152c.bringToFront();
                return;
            }
            C13360g c13360g = c13361h.f124152c;
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123918A;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            Unit unit = Unit.f143329a;
            relativeLayout2.addView(c13360g, layoutParams);
        }
    }

    public final void E() {
        C13368o c13368o = this.f124100e;
        boolean z10 = this.f124116u;
        if (!z10) {
            if (z10) {
                c13368o.getClass();
                return;
            }
            ViewGroup viewGroup = (ViewGroup) c13368o.f124160b.get();
            if (viewGroup != null) {
                viewGroup.removeView(c13368o.f124163e);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) c13368o.f124160b.get();
        if (viewGroup2 != null) {
            if (G.a(viewGroup2, c13368o.f124163e)) {
                c13368o.f124163e.bringToFront();
                return;
            }
            C13366m c13366m = c13368o.f124163e;
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123918A;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(9);
            layoutParams.addRule(8, com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123926d);
            Unit unit = Unit.f143329a;
            viewGroup2.addView(c13366m, layoutParams);
        }
    }

    public final void F() {
        r rVar = this.f124104i;
        boolean z10 = this.f124097b.a() != CameraPosition.USER_FACING && this.f124118w && this.f124097b.u() != TorchState.AUTO && (this.f124098c.isTorchAvailable() || this.f124098c.a() == null);
        if (!z10) {
            if (z10) {
                rVar.getClass();
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) rVar.f124167b.get();
            if (relativeLayout != null) {
                relativeLayout.removeView(rVar.f124168c);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) rVar.f124167b.get();
        if (relativeLayout2 != null) {
            if (G.a(relativeLayout2, rVar.f124168c)) {
                rVar.f124168c.bringToFront();
                return;
            }
            q qVar = rVar.f124168c;
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123918A;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            Unit unit = Unit.f143329a;
            relativeLayout2.addView(qVar, layoutParams);
        }
    }

    public final void G() {
        z zVar = this.f124101f;
        boolean z10 = this.f124115t;
        if (!z10) {
            if (z10) {
                zVar.getClass();
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) zVar.f124189b.get();
            if (relativeLayout != null) {
                relativeLayout.removeView(zVar.f124190c);
                Unit unit = Unit.f143329a;
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) zVar.f124189b.get();
        if (relativeLayout2 != null) {
            if (G.a(relativeLayout2, zVar.f124190c)) {
                zVar.f124190c.bringToFront();
                return;
            }
            y yVar = zVar.f124190c;
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123918A;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
            layoutParams.addRule(11);
            layoutParams.addRule(8, com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123926d);
            Unit unit2 = Unit.f143329a;
            relativeLayout2.addView(yVar, layoutParams);
        }
    }

    public final void H() {
        this.f124106k.f();
        N n10 = this.f124106k;
        n10.setVisibility(!n10.c() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = this.f124107l.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.bottomMargin = this.f124106k.c() ? -((int) ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123935m.getValue()).floatValue()) : 0;
    }

    @Override // android.view.View
    public final float getElevation() {
        return this.f124113r.getElevation();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void m() {
        this.f124105j.a(new D(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void n() {
        post(new Runnable() { // from class: Ut.a
            @Override // java.lang.Runnable
            public final void run() {
                F.b(this.f37727a);
            }
        });
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean o() {
        return this.f124116u;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void p() {
        this.f124112q.setVisibility(8);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean q() {
        return this.f124106k.f124128d.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean r() {
        return this.f124118w;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void s() {
        this.f124110o.setAlpha(0.95f);
        this.f124110o.setVisibility(0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void setBrush(Brush p02) {
        Intrinsics.j(p02, "value");
        C13343c c13343c = this.f124109n;
        c13343c.getClass();
        Intrinsics.j(p02, "<set-?>");
        C13344d c13344d = c13343c.f124066a;
        c13344d.getClass();
        Intrinsics.j(p02, "p0");
        c13344d.f124068a.setBrushForRecognizedBarcodes(CoreNativeTypeFactory.INSTANCE.convert(p02));
        this.f124114s = p02;
    }

    @Override // android.view.View
    public final void setElevation(float f10) {
        this.f124113r.setElevation(f10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean t() {
        return this.f124115t;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final Integer u() {
        N n10 = this.f124106k;
        return (Integer) n10.f124139o.getValue(n10, N.f124124q[1]);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean v() {
        return this.f124106k.f124129e.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean w() {
        return this.f124117v;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.H
    public final boolean x() {
        return this.f124106k.c();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void y() {
        this.f124110o.setAlpha(0.0f);
        this.f124110o.setVisibility(8);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean z() {
        return this.f124106k.f124130f.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void B() {
        if (getVisibility() == 4) {
            return;
        }
        this.f124105j.a(new C(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void b(Integer num) {
        N n10 = this.f124106k;
        n10.f124140p.setValue(n10, N.f124124q[2], num);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean e() {
        return this.f124106k.f124131g.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void h() {
        C13359f c13359f = this.f124105j;
        c13359f.a();
        c13359f.f124149c = null;
        if (getVisibility() != 0) {
            DataCaptureView dataCaptureView = this.f124111p;
            if (dataCaptureView != null) {
                dataCaptureView.removeOverlay(this.f124109n);
                this.f124107l.removeView(dataCaptureView);
            }
            DataCaptureView.Companion companion = DataCaptureView.INSTANCE;
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            DataCaptureView dataCaptureViewNewInstance = companion.newInstance(context, this.f124096a);
            dataCaptureViewNewInstance.setZoomGesture(null);
            dataCaptureViewNewInstance.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            dataCaptureViewNewInstance.setLogoStyle(LogoStyle.MINIMAL);
            dataCaptureViewNewInstance.setLogoAnchor(Anchor.BOTTOM_CENTER);
            this.f124111p = dataCaptureViewNewInstance;
            this.f124107l.addView(dataCaptureViewNewInstance, new RelativeLayout.LayoutParams(-1, -1));
            DataCaptureView dataCaptureView2 = this.f124111p;
            if (dataCaptureView2 != null) {
                dataCaptureView2.addOverlay(this.f124109n);
            }
            setVisibility(0);
        }
        g();
        SparkScanScanningMode sparkScanScanningModeP = this.f124097b.p();
        this.f124109n.f124066a.f124068a.setShouldDrawViewFinder(sparkScanScanningModeP instanceof SparkScanScanningMode.Target);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void k() {
        this.f124101f.f124188a = null;
        this.f124100e.f124159a = null;
        this.f124104i.f124166a = null;
        this.f124103h.f124150a = null;
        this.f124097b.b(this);
        removeAllViews();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void l() {
        FocusGesture focusGesture;
        DataCaptureView dataCaptureView = this.f124111p;
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
            C13368o c13368o = this.f124100e;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Intrinsics.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams layoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            SparkScanMiniPreviewSize miniPreviewSize = this.f124097b.l();
            boolean z11 = this.f124097b.z();
            c13368o.getClass();
            Intrinsics.j(layoutParams2, "layoutParams");
            Intrinsics.j(miniPreviewSize, "miniPreviewSize");
            ViewGroup viewGroup = (ViewGroup) c13368o.f124162d.get();
            if (viewGroup == null) {
                return;
            }
            int i10 = AbstractC13367n.f124158a[miniPreviewSize.ordinal()];
            if (i10 == 1) {
                pairA2 = C13368o.a(viewGroup, z11);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pairA2 = c13368o.b(viewGroup, z11);
            }
            int iIntValue = ((Number) pairA2.a()).intValue();
            int iIntValue2 = ((Number) pairA2.b()).intValue();
            layoutParams2.width = iIntValue;
            layoutParams2.height = iIntValue2;
            return;
        }
        C13368o c13368o2 = this.f124100e;
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        Intrinsics.h(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams layoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3;
        SparkScanMiniPreviewSize miniPreviewSize2 = this.f124097b.l();
        boolean z12 = this.f124097b.z();
        c13368o2.getClass();
        Intrinsics.j(layoutParams4, "layoutParams");
        Intrinsics.j(miniPreviewSize2, "miniPreviewSize");
        ViewGroup viewGroup2 = (ViewGroup) c13368o2.f124162d.get();
        if (viewGroup2 == null) {
            currentAndNextSize = TuplesKt.a(new Size(-1, -1), new Size(-1, -1));
        } else {
            Size size = new Size(layoutParams4.width, layoutParams4.height);
            int i11 = AbstractC13367n.f124158a[miniPreviewSize2.ordinal()];
            if (i11 == 1) {
                pairA = C13368o.a(viewGroup2, z12);
            } else if (i11 == 2) {
                pairA = c13368o2.b(viewGroup2, z12);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            currentAndNextSize = TuplesKt.a(size, new Size(((Number) pairA.a()).intValue(), ((Number) pairA.b()).intValue()));
        }
        ViewGroup viewGroup3 = this.f124099d;
        if (viewGroup3 == null) {
            Intrinsics.x("container");
            viewGroup3 = null;
        }
        Size correctedViewSize = ViewExtensionsKt.getCorrectedViewSize(viewGroup3, this.f124097b.z());
        int height = correctedViewSize.getHeight();
        int width = correctedViewSize.getWidth();
        t tVar = this.f124108m;
        tVar.getClass();
        Intrinsics.j(currentAndNextSize, "currentAndNextSize");
        PointF pointFA = tVar.f124170a.a(width, height, currentAndNextSize);
        C13359f c13359f = this.f124105j;
        ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
        Intrinsics.h(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        c13359f.a((ViewGroup.MarginLayoutParams) layoutParams5, pointFA, (Size) currentAndNextSize.c(), (Size) currentAndNextSize.d(), new E(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void c(Integer num) {
        N n10 = this.f124106k;
        n10.f124139o.setValue(n10, N.f124124q[1], num);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final boolean d() {
        return this.f124106k.f124132h.getVisibility() == 0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void f() {
        this.f124105j.a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void g() {
        H();
        G();
        E();
        D();
        F();
        z zVar = this.f124101f;
        boolean zY = this.f124097b.y();
        SparkScanMiniPreviewSize miniPreviewSize = this.f124097b.l();
        zVar.getClass();
        Intrinsics.j(miniPreviewSize, "miniPreviewSize");
        y yVar = zVar.f124190c;
        StateListDrawable drawable = AbstractC13365l.a(yVar.f124187b, zY);
        Intrinsics.j(drawable, "drawable");
        yVar.f124154a.setImageDrawable(drawable);
        yVar.a(miniPreviewSize);
        C13361h c13361h = this.f124103h;
        SparkScanMiniPreviewSize miniPreviewSize2 = this.f124097b.l();
        boolean zH = this.f124097b.h();
        c13361h.getClass();
        Intrinsics.j(miniPreviewSize2, "miniPreviewSize");
        C13360g c13360g = c13361h.f124152c;
        Context context = c13360g.getContext();
        Intrinsics.i(context, "getContext(...)");
        StateListDrawable drawable2 = AbstractC13365l.a(context);
        Intrinsics.j(drawable2, "drawable");
        c13360g.f124154a.setImageDrawable(drawable2);
        c13360g.a(miniPreviewSize2);
        c13360g.setEnabled(!zH);
        r rVar = this.f124104i;
        SparkScanMiniPreviewSize miniPreviewSize3 = this.f124097b.l();
        TorchState torchState = this.f124097b.u();
        rVar.getClass();
        Intrinsics.j(miniPreviewSize3, "miniPreviewSize");
        Intrinsics.j(torchState, "torchState");
        q qVar = rVar.f124168c;
        Context context2 = qVar.getContext();
        Intrinsics.i(context2, "getContext(...)");
        StateListDrawable drawable3 = AbstractC13365l.a(context2, torchState);
        Intrinsics.j(drawable3, "drawable");
        qVar.f124154a.setImageDrawable(drawable3);
        qVar.a(miniPreviewSize3);
        C13368o c13368o = this.f124100e;
        this.f124097b.getClass();
        SparkScanMiniPreviewSize miniPreviewSize4 = this.f124097b.l();
        c13368o.getClass();
        Intrinsics.j(miniPreviewSize4, "miniPreviewSize");
        C13366m c13366m = c13368o.f124163e;
        c13366m.getClass();
        Intrinsics.j(miniPreviewSize4, "miniPreviewSize");
        StateListDrawable drawable4 = AbstractC13365l.a(c13366m.f124157b, miniPreviewSize4);
        Intrinsics.j(drawable4, "drawable");
        c13366m.f124154a.setImageDrawable(drawable4);
        c13366m.a(miniPreviewSize4);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x
    public final void i() {
        this.f124102g.i();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final Integer j() {
        N n10 = this.f124106k;
        return (Integer) n10.f124140p.getValue(n10, N.f124124q[2]);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void c() {
        this.f124112q.bringToFront();
        this.f124112q.setVisibility(0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(A a10) {
        this.f124106k.f124126b = a10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(boolean z10) {
        this.f124115t = z10;
        G();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final Integer a() {
        N n10 = this.f124106k;
        return (Integer) n10.f124138n.getValue(n10, N.f124124q[0]);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(Integer num) {
        N n10 = this.f124106k;
        n10.f124138n.setValue(n10, N.f124124q[0], num);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(ViewGroup parentContainer) {
        Intrinsics.j(parentContainer, "container");
        if (getParent() != null) {
            return;
        }
        this.f124099d = parentContainer;
        C13368o c13368o = this.f124100e;
        c13368o.getClass();
        Intrinsics.j(parentContainer, "parentContainer");
        c13368o.f124162d = new WeakReference(parentContainer);
        parentContainer.addView(this);
        this.f124097b.a(this);
        setId(com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123923a);
        View view = this.f124106k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123942t.getValue()).intValue());
        layoutParams.addRule(12);
        Unit unit = Unit.f143329a;
        addView(view, layoutParams);
        View view2 = this.f124107l;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(2, com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123924b);
        layoutParams2.bottomMargin = this.f124106k.c() ? -((int) ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123935m.getValue()).floatValue()) : 0;
        addView(view2, layoutParams2);
        View view3 = this.f124108m;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(8, com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123926d);
        addView(view3, layoutParams3);
        addView(this.f124110o, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f124112q, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f124113r, 0, new RelativeLayout.LayoutParams(-1, -1));
        post(new Runnable() { // from class: Ut.b
            @Override // java.lang.Runnable
            public final void run() {
                F.a(this.f37728a);
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
        this.f124113r.setElevation(f10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview
    public final void a(Brush brush, boolean z10) {
        Intrinsics.j(brush, "brush");
        C13343c c13343c = this.f124109n;
        c13343c.getClass();
        Intrinsics.j(brush, "brush");
        C13344d c13344d = c13343c.f124066a;
        c13344d.getClass();
        Intrinsics.j(brush, "brush");
        c13344d.f124068a.setBrushForErrorBarcodes(CoreNativeTypeFactory.INSTANCE.convert(brush));
        this.f124109n.f124066a.f124068a.onErrorFeedbackEmitted(z10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.x
    public final void a(String text, int i10, int i11) {
        Intrinsics.j(text, "text");
        this.f124105j.a(new D(this));
        this.f124102g.a(text, i10, i11);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.InterfaceC13331k
    public final void a(SparkScanScanningMode previousMode, SparkScanScanningMode newMode) {
        Intrinsics.j(previousMode, "previousMode");
        Intrinsics.j(newMode, "newMode");
        this.f124109n.f124066a.f124068a.setShouldDrawViewFinder(newMode instanceof SparkScanScanningMode.Target);
    }
}
