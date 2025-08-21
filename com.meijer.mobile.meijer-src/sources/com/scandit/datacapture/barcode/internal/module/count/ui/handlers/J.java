package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.feedback.BarcodeCountFeedback;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.ui.BarcodeCountViewInternalUiListener;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountScreenRatioForUi;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountToolbarSettings;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.J;
import com.scandit.datacapture.barcode.internal.module.count.ui.mode.BarcodeCountInternalMode;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarView;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.AbstractC13274u0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13239c0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13241d0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13243e0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13248h;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13250i;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13253j0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13255k0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13257l0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13262o;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13266q;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13268r0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13270s0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13272t0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13275v;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13277w;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13279x;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13281y;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13245f0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13254k;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13259m0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13280x0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.J0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.K;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.K0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.O;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.O0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.P0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.S0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.X;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.Y;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.Z0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.a1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.b1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.h1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.i1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.n1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.o1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.s1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.y1;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class J implements BarcodeCountUiPresenter {

    /* renamed from: A, reason: collision with root package name */
    public boolean f122562A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f122563B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f122564C;

    /* renamed from: D, reason: collision with root package name */
    public final u f122565D;

    /* renamed from: E, reason: collision with root package name */
    public BarcodeCountInternalMode f122566E;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13280x0 f122567a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.A f122568b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.r f122569c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f122570d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC13245f0 f122571e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC13259m0 f122572f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC13254k f122573g;

    /* renamed from: h, reason: collision with root package name */
    public final K0 f122574h;

    /* renamed from: i, reason: collision with root package name */
    public final S0 f122575i;

    /* renamed from: j, reason: collision with root package name */
    public final i1 f122576j;

    /* renamed from: k, reason: collision with root package name */
    public final b1 f122577k;

    /* renamed from: l, reason: collision with root package name */
    public final s1 f122578l;

    /* renamed from: m, reason: collision with root package name */
    public final O f122579m;

    /* renamed from: n, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.G f122580n;

    /* renamed from: o, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122581o;

    /* renamed from: p, reason: collision with root package name */
    public final BarcodeCountBasicOverlay f122582p;

    /* renamed from: q, reason: collision with root package name */
    public final String f122583q;

    /* renamed from: r, reason: collision with root package name */
    public final List f122584r;

    /* renamed from: s, reason: collision with root package name */
    public t f122585s;

    /* renamed from: t, reason: collision with root package name */
    public BarcodeCountViewInternalUiListener f122586t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f122587u;

    /* renamed from: v, reason: collision with root package name */
    public int f122588v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f122589w;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f122590x;

    /* renamed from: y, reason: collision with root package name */
    public BarcodeCountViewSettings f122591y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f122592z;

    public J(J0 shutterButtonsViewHolder, com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F listButtonViewHolder, C13279x exitButtonViewHolder, C13243e0 nextButtonViewHolder, C13257l0 redoScanButtonViewHolder, C13272t0 restartButtonViewHolder, C13266q clearButtonViewHolder, O0 singleScanButtonViewHolder, Z0 statusButtonViewHolder, n1 torchButtonWrapper, h1 toolbarViewHolder, y1 guidanceViewHolder, X loadingViewHolder, K listProgressBarViewHolder, C13248h layoutHelper, BarcodeCountBasicOverlay overlay, com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B clusterPresenter, String loadingText) {
        Intrinsics.j(shutterButtonsViewHolder, "shutterButtonsViewHolder");
        Intrinsics.j(listButtonViewHolder, "listButtonViewHolder");
        Intrinsics.j(exitButtonViewHolder, "exitButtonViewHolder");
        Intrinsics.j(nextButtonViewHolder, "nextButtonViewHolder");
        Intrinsics.j(redoScanButtonViewHolder, "redoScanButtonViewHolder");
        Intrinsics.j(restartButtonViewHolder, "restartButtonViewHolder");
        Intrinsics.j(clearButtonViewHolder, "clearButtonViewHolder");
        Intrinsics.j(singleScanButtonViewHolder, "singleScanButtonViewHolder");
        Intrinsics.j(statusButtonViewHolder, "statusButtonViewHolder");
        Intrinsics.j(torchButtonWrapper, "torchButtonWrapper");
        Intrinsics.j(toolbarViewHolder, "toolbarViewHolder");
        Intrinsics.j(guidanceViewHolder, "guidanceViewHolder");
        Intrinsics.j(loadingViewHolder, "loadingViewHolder");
        Intrinsics.j(listProgressBarViewHolder, "listProgressBarViewHolder");
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(clusterPresenter, "clusterPresenter");
        Intrinsics.j(loadingText, "loadingText");
        this.f122567a = shutterButtonsViewHolder;
        this.f122568b = listButtonViewHolder;
        this.f122569c = exitButtonViewHolder;
        this.f122570d = nextButtonViewHolder;
        this.f122571e = redoScanButtonViewHolder;
        this.f122572f = restartButtonViewHolder;
        this.f122573g = clearButtonViewHolder;
        this.f122574h = singleScanButtonViewHolder;
        this.f122575i = statusButtonViewHolder;
        this.f122576j = torchButtonWrapper;
        this.f122577k = toolbarViewHolder;
        this.f122578l = guidanceViewHolder;
        this.f122579m = loadingViewHolder;
        this.f122580n = listProgressBarViewHolder;
        this.f122581o = layoutHelper;
        this.f122582p = overlay;
        this.f122583q = loadingText;
        this.f122584r = CollectionsKt.p(shutterButtonsViewHolder, listButtonViewHolder, exitButtonViewHolder, nextButtonViewHolder, redoScanButtonViewHolder, restartButtonViewHolder, clearButtonViewHolder, singleScanButtonViewHolder, statusButtonViewHolder, torchButtonWrapper, toolbarViewHolder, guidanceViewHolder, loadingViewHolder, listProgressBarViewHolder, clusterPresenter);
        this.f122590x = new Handler(Looper.getMainLooper());
        this.f122591y = new BarcodeCountViewSettings();
        this.f122565D = new u(this);
        v listener = new v(this);
        Intrinsics.j(listener, "listener");
        clusterPresenter.f122472i = listener;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(com.scandit.datacapture.barcode.count.ui.view.i iVar) {
        this.f122585s = iVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void b(boolean z10) {
        this.f122587u = z10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final BarcodeCountViewInternalUiListener c() {
        return this.f122586t;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void d(boolean z10) {
        ((K) this.f122580n).f122858b = z10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void e(boolean z10) {
        AbstractC13274u0.a(this.f122567a, z10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void l() {
        this.f122564C = false;
        P0.b((Z0) this.f122575i, false);
        P0.a((Z0) this.f122575i, false);
    }

    public final void m() {
        BarcodeCountCameraHandler barcodeCountCameraHandler;
        BarcodeCountView barcodeCountView;
        this.f122562A = true;
        this.f122563B = true;
        t tVar = this.f122585s;
        if (tVar != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get()) != null) {
            barcodeCountView.a(false);
        }
        if (this.f122588v != 0) {
            this.f122590x.postDelayed(new Runnable() { // from class: Lt.a
                @Override // java.lang.Runnable
                public final void run() {
                    J.a(this.f19484a);
                }
            }, this.f122588v);
            return;
        }
        t tVar2 = this.f122585s;
        if (tVar2 != null) {
            I onFocus = new I(this);
            Intrinsics.j(onFocus, "onFocus");
            BarcodeCountView barcodeCountView2 = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar2).f121810a.get();
            if (barcodeCountView2 == null || (barcodeCountCameraHandler = barcodeCountView2.f121791i) == null) {
                return;
            }
            barcodeCountCameraHandler.a(new com.scandit.datacapture.barcode.count.ui.view.h(onFocus));
        }
    }

    public static final void a(J this$0) {
        BarcodeCountCameraHandler barcodeCountCameraHandler;
        Intrinsics.j(this$0, "this$0");
        t tVar = this$0.f122585s;
        if (tVar != null) {
            I onFocus = new I(this$0);
            Intrinsics.j(onFocus, "onFocus");
            BarcodeCountView barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get();
            if (barcodeCountView == null || (barcodeCountCameraHandler = barcodeCountView.f121791i) == null) {
                return;
            }
            barcodeCountCameraHandler.a(new com.scandit.datacapture.barcode.count.ui.view.h(onFocus));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final boolean b() {
        return this.f122589w;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void c(boolean z10) {
        AbstractC13274u0.b(this.f122567a, z10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final boolean e() {
        b1 b1Var = this.f122577k;
        a1 preference = a1.f122912c;
        h1 h1Var = (h1) b1Var;
        h1Var.getClass();
        Intrinsics.j(preference, "preference");
        return h1Var.f122965a.getBoolean(h1.a(preference), false);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void f() {
        AbstractC13274u0.a(this.f122567a, false);
        AbstractC13274u0.b(this.f122567a, true);
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.A a10 = this.f122568b;
        C13281y onFinished = C13281y.f123060a;
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F f10 = (com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) a10;
        f10.getClass();
        Intrinsics.j(onFinished, "onFinished");
        f10.a(0, onFinished);
        ((K) this.f122580n).f122858b = false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final BarcodeCountToolbarView g() {
        return ((h1) this.f122577k).f122970f;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void h() {
        J0 j02 = (J0) this.f122567a;
        this.f122592z = j02.f122846d;
        j02.f122846d = false;
        ((C13266q) this.f122573g).f123010b = false;
        ((O0) this.f122574h).f122867b = false;
        ((Z0) this.f122575i).f122904b = false;
        n1 n1Var = (n1) this.f122576j;
        n1Var.f122996d.setValue(n1Var, n1.f122992h[0], Boolean.FALSE);
        ((h1) this.f122577k).f122968d = false;
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void i() {
        J0 j02 = (J0) this.f122567a;
        j02.f122853k = false;
        j02.f122847e.invoke(Boolean.FALSE);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final int j() {
        return this.f122588v;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void k() {
        ((J0) this.f122567a).f122846d = this.f122592z;
        ((C13266q) this.f122573g).f123010b = this.f122591y.n();
        ((O0) this.f122574h).f122867b = this.f122591y.v();
        ((Z0) this.f122575i).f122904b = this.f122591y.x();
        i1 i1Var = this.f122576j;
        n1 n1Var = (n1) i1Var;
        n1Var.f122996d.setValue(n1Var, n1.f122992h[0], Boolean.valueOf(this.f122591y.z()));
        ((h1) this.f122577k).f122968d = this.f122591y.y();
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void b(BarcodeCountViewSettings viewSettings) {
        Intrinsics.j(viewSettings, "viewSettings");
        b1 b1Var = this.f122577k;
        a1 preference = a1.f122912c;
        h1 h1Var = (h1) b1Var;
        h1Var.getClass();
        Intrinsics.j(preference, "preference");
        viewSettings.d(h1Var.f122965a.getBoolean(h1.a(preference), false));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void d() {
        y1 y1Var = (y1) this.f122578l;
        y1Var.getClass();
        o1.b(y1Var, false, "");
        o1.a(y1Var, false, "");
        this.f122564C = true;
        P0.b((Z0) this.f122575i, false);
        P0.a((Z0) this.f122575i, true);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener) {
        this.f122586t = barcodeCountViewInternalUiListener;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(int i10) {
        this.f122588v = i10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(boolean z10) {
        this.f122589w = z10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountViewLayerManager layerManager, BarcodeCount mode) {
        NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme;
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(mode, "mode");
        mode.getInternalListeners$scandit_barcode_capture().add(0, this.f122565D);
        mode._setStatusListener$scandit_barcode_capture(new x(this));
        this.f122582p.setGuidanceHandler$scandit_barcode_capture(new w(this));
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = this.f122582p;
        h1 h1Var = (h1) this.f122577k;
        h1Var.getClass();
        boolean z10 = h1Var.f122965a.getBoolean(h1.a(a1.f122913d), false);
        if (z10) {
            nativeBarcodeCountBasicOverlayColorScheme = NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE;
        } else if (!z10) {
            nativeBarcodeCountBasicOverlayColorScheme = NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        barcodeCountBasicOverlay.setColorScheme$scandit_barcode_capture(nativeBarcodeCountBasicOverlayColorScheme);
        InterfaceC13280x0 interfaceC13280x0 = this.f122567a;
        z zVar = new z(this);
        J0 j02 = (J0) interfaceC13280x0;
        j02.getClass();
        Intrinsics.j(zVar, "<set-?>");
        j02.f122847e = zVar;
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.A a10 = this.f122568b;
        A a11 = new A(this);
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F f10 = (com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) a10;
        f10.getClass();
        Intrinsics.j(a11, "<set-?>");
        f10.f122822c = a11;
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.r rVar = this.f122569c;
        B b10 = new B(this);
        C13279x c13279x = (C13279x) rVar;
        c13279x.getClass();
        Intrinsics.j(b10, "<set-?>");
        c13279x.f123051c = b10;
        Y y10 = this.f122570d;
        C c10 = new C(this);
        C13243e0 c13243e0 = (C13243e0) y10;
        c13243e0.getClass();
        Intrinsics.j(c10, "<set-?>");
        c13243e0.f122937c = c10;
        InterfaceC13245f0 interfaceC13245f0 = this.f122571e;
        D d10 = new D(this);
        C13257l0 c13257l0 = (C13257l0) interfaceC13245f0;
        c13257l0.getClass();
        Intrinsics.j(d10, "<set-?>");
        c13257l0.f122983c = d10;
        InterfaceC13259m0 interfaceC13259m0 = this.f122572f;
        E e10 = new E(this);
        C13272t0 c13272t0 = (C13272t0) interfaceC13259m0;
        c13272t0.getClass();
        Intrinsics.j(e10, "<set-?>");
        c13272t0.f123028d = e10;
        InterfaceC13254k interfaceC13254k = this.f122573g;
        F f11 = new F(this);
        C13266q c13266q = (C13266q) interfaceC13254k;
        c13266q.getClass();
        Intrinsics.j(f11, "<set-?>");
        c13266q.f123012d = f11;
        K0 k02 = this.f122574h;
        G g10 = new G(this);
        O0 o02 = (O0) k02;
        o02.getClass();
        Intrinsics.j(g10, "<set-?>");
        o02.f122869d = g10;
        this.f122575i.getClass();
        S0 s02 = this.f122575i;
        H h10 = new H(this);
        Z0 z02 = (Z0) s02;
        z02.getClass();
        Intrinsics.j(h10, "<set-?>");
        z02.f122905c = h10;
        ((h1) this.f122577k).f122966b = new y(this);
        this.f122581o.d();
        Iterator it = this.f122584r.iterator();
        while (it.hasNext()) {
            ((InterfaceC13238c) it.next()).b();
        }
        com.scandit.datacapture.barcode.internal.module.ui.l lVar = ((y1) this.f122578l).f123063b;
        if (lVar != null) {
            lVar.setVisibility(8);
            lVar.f124301d = null;
        }
        X x10 = (X) this.f122579m;
        com.scandit.datacapture.barcode.internal.module.count.ui.l lVar2 = x10.f122893b;
        if (lVar2 != null) {
            lVar2.setVisibility(4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.l lVar3 = x10.f122894c;
        if (lVar3 == null) {
            return;
        }
        lVar3.setVisibility(4);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountInternalMode internalMode) {
        Intrinsics.j(internalMode, "internalMode");
        this.f122566E = internalMode;
        a(this.f122591y, internalMode);
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a() {
        this.f122581o.d();
        Iterator it = this.f122584r.iterator();
        while (it.hasNext()) {
            ((InterfaceC13238c) it.next()).a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(int i10, int i11) {
        K k10 = (K) this.f122580n;
        k10.f122860d.a(new com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.J(k10, i11, i10));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountViewSettings viewSettings) {
        Intrinsics.j(viewSettings, "viewSettings");
        this.f122591y = viewSettings;
        BarcodeCountInternalMode barcodeCountInternalMode = this.f122566E;
        if (barcodeCountInternalMode != null) {
            a(viewSettings, barcodeCountInternalMode);
        }
    }

    public final void a(BarcodeCountViewSettings barcodeCountViewSettings, BarcodeCountInternalMode barcodeCountInternalMode) {
        this.f122582p.setShouldShowScanAreaGuides(barcodeCountViewSettings.t());
        this.f122582p.setShouldShowStatusIconsOnScan(barcodeCountViewSettings.w());
        this.f122582p.setRecognizedBrush(barcodeCountViewSettings.k());
        this.f122582p.setNotInListBrush(barcodeCountViewSettings.j());
        this.f122582p.setAcceptedNotInListBrush(barcodeCountViewSettings.a());
        this.f122582p.setRejectedNotInListBrush(barcodeCountViewSettings.l());
        this.f122582p.setShouldShowHints(barcodeCountViewSettings.q());
        this.f122582p.setFilterSettings(barcodeCountViewSettings.g());
        String strE = barcodeCountViewSettings.E();
        if (strE != null) {
            this.f122582p.setTextForBarcodesNotInListDetectedHint(strE);
        }
        String strK = barcodeCountViewSettings.K();
        if (strK != null) {
            this.f122582p.setTextForTapShutterToScanHint(strK);
        }
        String strI = barcodeCountViewSettings.I();
        if (strI != null) {
            this.f122582p.setTextForScanningHint(strI);
        }
        String strG = barcodeCountViewSettings.G();
        if (strG != null) {
            this.f122582p.setTextForMoveCloserAndRescanHint(strG);
        }
        String strH = barcodeCountViewSettings.H();
        if (strH != null) {
            this.f122582p.setTextForMoveFurtherAndRescanHint(strH);
        }
        String strL = barcodeCountViewSettings.L();
        if (strL != null) {
            this.f122582p.setTextForTapToUncountHint(strL);
        }
        String strF = barcodeCountViewSettings.F();
        if (strF != null) {
            this.f122582p.setTextForClusteringGestureHint(strF);
        }
        String strJ = barcodeCountViewSettings.J();
        if (strJ != null) {
            this.f122582p.setTextForScreenCleanedUpHint(strJ);
        }
        ((J0) this.f122567a).f122845c = barcodeCountViewSettings.u();
        ((J0) this.f122567a).f122846d = barcodeCountViewSettings.p();
        ((J0) this.f122567a).b(barcodeCountViewSettings.B());
        ((J0) this.f122567a).a(barcodeCountViewSettings.h());
        ((com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) this.f122568b).f122821b = barcodeCountViewSettings.r();
        ((com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) this.f122568b).a(barcodeCountViewSettings.i());
        ((C13279x) this.f122569c).f123050b = barcodeCountViewSettings.o();
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.r rVar = this.f122569c;
        String text = barcodeCountViewSettings.f();
        C13279x c13279x = (C13279x) rVar;
        c13279x.getClass();
        Intrinsics.j(text, "value");
        C13275v onFinished = C13275v.f123035a;
        Intrinsics.j(text, "text");
        Intrinsics.j(onFinished, "onFinished");
        c13279x.f123053e = text;
        c13279x.f123055g.a(new C13277w(c13279x, text, onFinished));
        ((C13279x) this.f122569c).a(barcodeCountViewSettings.e());
        ((C13279x) this.f122569c).f123054f = true;
        ((C13266q) this.f122573g).f123010b = barcodeCountViewSettings.n();
        InterfaceC13254k interfaceC13254k = this.f122573g;
        String text2 = barcodeCountViewSettings.d();
        C13266q c13266q = (C13266q) interfaceC13254k;
        c13266q.getClass();
        Intrinsics.j(text2, "value");
        C13250i onFinished2 = C13250i.f122971a;
        Intrinsics.j(text2, "text");
        Intrinsics.j(onFinished2, "onFinished");
        c13266q.f123014f = text2;
        c13266q.f123015g.a(new C13262o(c13266q, text2, onFinished2));
        ((C13266q) this.f122573g).a(barcodeCountViewSettings.c());
        ((O0) this.f122574h).f122867b = barcodeCountViewSettings.v();
        ((O0) this.f122574h).a(barcodeCountViewSettings.C());
        ((Z0) this.f122575i).f122904b = barcodeCountViewSettings.x() && !barcodeCountViewSettings.w();
        ((Z0) this.f122575i).a(barcodeCountViewSettings.D());
        i1 i1Var = this.f122576j;
        Set setB = SetsKt.b();
        if (this.f122591y.v()) {
            setB.add(Anchor.BOTTOM_LEFT);
        }
        if (this.f122591y.x()) {
            setB.add(Anchor.BOTTOM_RIGHT);
        }
        Set setA = SetsKt.a(setB);
        n1 n1Var = (n1) i1Var;
        n1Var.getClass();
        Intrinsics.j(setA, "<set-?>");
        n1Var.f122998f = setA;
        n1 n1Var2 = (n1) this.f122576j;
        n1Var2.f122996d.setValue(n1Var2, n1.f122992h[0], Boolean.valueOf(barcodeCountViewSettings.z()));
        i1 i1Var2 = this.f122576j;
        Anchor anchorN = barcodeCountViewSettings.N();
        n1 n1Var3 = (n1) i1Var2;
        n1Var3.getClass();
        Intrinsics.j(anchorN, "<set-?>");
        n1Var3.f122997e = anchorN;
        ((h1) this.f122577k).f122968d = barcodeCountViewSettings.y();
        b1 b1Var = this.f122577k;
        BarcodeCountToolbarSettings settings = barcodeCountViewSettings.M();
        h1 h1Var = (h1) b1Var;
        h1Var.getClass();
        Intrinsics.j(settings, "settings");
        h1Var.f122969e = settings.clone$scandit_barcode_capture();
        BarcodeCountToolbarView barcodeCountToolbarView = h1Var.f122970f;
        if (barcodeCountToolbarView != null) {
            barcodeCountToolbarView.a(settings);
        }
        ((y1) this.f122578l).f123062a = barcodeCountViewSettings.A();
        ((X) this.f122579m).f122892a = barcodeCountViewSettings.A();
        ((K) this.f122580n).f122857a = barcodeCountViewSettings.s();
        ((C13257l0) this.f122571e).f122982b = false;
        ((C13272t0) this.f122572f).f123026b = false;
        if (Intrinsics.e(barcodeCountInternalMode, com.scandit.datacapture.barcode.internal.module.count.ui.mode.a.f122698a) || !(barcodeCountInternalMode instanceof com.scandit.datacapture.barcode.internal.module.count.ui.mode.b)) {
            return;
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.mode.b bVar = (com.scandit.datacapture.barcode.internal.module.count.ui.mode.b) barcodeCountInternalMode;
        this.f122582p.setShouldShowScanAreaGuides(false);
        ((com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) this.f122568b).f122821b = false;
        ((O0) this.f122574h).f122867b = false;
        ((Z0) this.f122575i).f122904b = false;
        Y y10 = this.f122570d;
        String text3 = bVar.f122699a.getNextButtonText();
        C13243e0 c13243e0 = (C13243e0) y10;
        c13243e0.getClass();
        Intrinsics.j(text3, "value");
        C13239c0 onFinished3 = C13239c0.f122928a;
        Intrinsics.j(text3, "text");
        Intrinsics.j(onFinished3, "onFinished");
        c13243e0.f122939e = text3;
        c13243e0.f122940f.a(new C13241d0(c13243e0, text3, onFinished3));
        InterfaceC13245f0 interfaceC13245f0 = this.f122571e;
        String text4 = bVar.f122699a.getRedoScanButtonText();
        C13257l0 c13257l0 = (C13257l0) interfaceC13245f0;
        c13257l0.getClass();
        Intrinsics.j(text4, "value");
        C13253j0 onFinished4 = C13253j0.f122974a;
        Intrinsics.j(text4, "text");
        Intrinsics.j(onFinished4, "onFinished");
        c13257l0.f122985e = text4;
        c13257l0.f122986f.a(new C13255k0(c13257l0, text4, onFinished4));
        InterfaceC13259m0 interfaceC13259m0 = this.f122572f;
        String text5 = bVar.f122699a.getRestartButtonText();
        C13272t0 c13272t0 = (C13272t0) interfaceC13259m0;
        c13272t0.getClass();
        Intrinsics.j(text5, "value");
        C13268r0 onFinished5 = C13268r0.f123018a;
        Intrinsics.j(text5, "text");
        Intrinsics.j(onFinished5, "onFinished");
        c13272t0.f123030f = text5;
        c13272t0.f123031g.a(new C13270s0(c13272t0, text5, onFinished5));
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.r rVar2 = this.f122569c;
        String text6 = bVar.f122699a.getFinishButtonText();
        C13279x c13279x2 = (C13279x) rVar2;
        c13279x2.getClass();
        Intrinsics.j(text6, "value");
        Intrinsics.j(text6, "text");
        Intrinsics.j(onFinished, "onFinished");
        c13279x2.f123053e = text6;
        c13279x2.f123055g.a(new C13277w(c13279x2, text6, onFinished));
        ((C13279x) this.f122569c).f123054f = true;
        ((C13266q) this.f122573g).f123010b = false;
        int iOrdinal = bVar.f122700b.ordinal();
        if (iOrdinal == 0) {
            ((C13243e0) this.f122570d).f122936b = true;
            ((C13279x) this.f122569c).f123050b = false;
            ((C13257l0) this.f122571e).f122982b = false;
            ((X) this.f122579m).f122892a = false;
            this.f122582p.setShouldShowHints(false);
            ((y1) this.f122578l).f123062a = false;
            ((C13272t0) this.f122572f).f123026b = true;
            return;
        }
        if (iOrdinal == 1) {
            ((C13243e0) this.f122570d).f122936b = true;
            ((C13279x) this.f122569c).f123050b = false;
            ((C13257l0) this.f122571e).f122982b = false;
            ((C13272t0) this.f122572f).f123026b = true;
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        ((C13243e0) this.f122570d).f122936b = false;
        ((C13279x) this.f122569c).f123050b = true;
        ((C13257l0) this.f122571e).f122982b = true;
        ((C13272t0) this.f122572f).f123026b = false;
        ((X) this.f122579m).f122892a = false;
        this.f122582p.setShouldShowHints(false);
        ((y1) this.f122578l).f123062a = false;
        J0 j02 = (J0) this.f122567a;
        j02.f122845c = false;
        j02.f122846d = false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(Size screenSize, Size previewSize) {
        Intrinsics.j(screenSize, "screenSize");
        Intrinsics.j(previewSize, "previewSize");
        this.f122581o.a(previewSize);
        J0 j02 = (J0) this.f122567a;
        j02.a(ObjectOverlayUtilsKt.getSize(j02.f122844b));
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(boolean z10, boolean z11) {
        b1 b1Var = this.f122577k;
        boolean z12 = z10 && (z11 || this.f122581o.i() == BarcodeCountScreenRatioForUi.SMALL || this.f122589w);
        BarcodeCountToolbarView barcodeCountToolbarView = ((h1) b1Var).f122970f;
        if (barcodeCountToolbarView == null) {
            return;
        }
        barcodeCountToolbarView.a(z12);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountFeedback feedback) {
        Intrinsics.j(feedback, "feedback");
        h1 h1Var = (h1) this.f122577k;
        h1Var.getClass();
        Intrinsics.j(feedback, "feedback");
        h1Var.a(h1.a(a1.f122910a), feedback.getSuccess().getSound() != null);
        h1Var.a(h1.a(a1.f122911b), feedback.getSuccess().getVibration() != null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCount mode) {
        Intrinsics.j(mode, "mode");
        h1 h1Var = (h1) this.f122577k;
        h1Var.getClass();
        Intrinsics.j(mode, "mode");
        mode.setFeedback(BarcodeCountFeedback.INSTANCE.defaultFeedback$scandit_barcode_capture(h1Var.f122965a.getBoolean("barcode_count_toolbar_audio_feedback_key", false), h1Var.f122965a.getBoolean("barcode_count_toolbar_haptic_feedback_key", false)));
    }
}
