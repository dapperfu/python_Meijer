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
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.AbstractC13141u0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13106c0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13108d0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13110e0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13115h;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13117i;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13120j0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13122k0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13124l0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13129o;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13133q;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13135r0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13137s0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13139t0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13142v;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13144w;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13146x;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.C13148y;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13112f0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13121k;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13126m0;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13147x0;
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

/* loaded from: classes11.dex */
public final class J implements BarcodeCountUiPresenter {

    /* renamed from: A, reason: collision with root package name */
    public boolean f121610A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f121611B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f121612C;

    /* renamed from: D, reason: collision with root package name */
    public final u f121613D;

    /* renamed from: E, reason: collision with root package name */
    public BarcodeCountInternalMode f121614E;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13147x0 f121615a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.A f121616b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.r f121617c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f121618d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC13112f0 f121619e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC13126m0 f121620f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC13121k f121621g;

    /* renamed from: h, reason: collision with root package name */
    public final K0 f121622h;

    /* renamed from: i, reason: collision with root package name */
    public final S0 f121623i;

    /* renamed from: j, reason: collision with root package name */
    public final i1 f121624j;

    /* renamed from: k, reason: collision with root package name */
    public final b1 f121625k;

    /* renamed from: l, reason: collision with root package name */
    public final s1 f121626l;

    /* renamed from: m, reason: collision with root package name */
    public final O f121627m;

    /* renamed from: n, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.G f121628n;

    /* renamed from: o, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f121629o;

    /* renamed from: p, reason: collision with root package name */
    public final BarcodeCountBasicOverlay f121630p;

    /* renamed from: q, reason: collision with root package name */
    public final String f121631q;

    /* renamed from: r, reason: collision with root package name */
    public final List f121632r;

    /* renamed from: s, reason: collision with root package name */
    public t f121633s;

    /* renamed from: t, reason: collision with root package name */
    public BarcodeCountViewInternalUiListener f121634t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f121635u;

    /* renamed from: v, reason: collision with root package name */
    public int f121636v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f121637w;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f121638x;

    /* renamed from: y, reason: collision with root package name */
    public BarcodeCountViewSettings f121639y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f121640z;

    public J(J0 shutterButtonsViewHolder, com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F listButtonViewHolder, C13146x exitButtonViewHolder, C13110e0 nextButtonViewHolder, C13124l0 redoScanButtonViewHolder, C13139t0 restartButtonViewHolder, C13133q clearButtonViewHolder, O0 singleScanButtonViewHolder, Z0 statusButtonViewHolder, n1 torchButtonWrapper, h1 toolbarViewHolder, y1 guidanceViewHolder, X loadingViewHolder, K listProgressBarViewHolder, C13115h layoutHelper, BarcodeCountBasicOverlay overlay, com.scandit.datacapture.barcode.internal.module.count.ui.cluster.B clusterPresenter, String loadingText) {
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
        this.f121615a = shutterButtonsViewHolder;
        this.f121616b = listButtonViewHolder;
        this.f121617c = exitButtonViewHolder;
        this.f121618d = nextButtonViewHolder;
        this.f121619e = redoScanButtonViewHolder;
        this.f121620f = restartButtonViewHolder;
        this.f121621g = clearButtonViewHolder;
        this.f121622h = singleScanButtonViewHolder;
        this.f121623i = statusButtonViewHolder;
        this.f121624j = torchButtonWrapper;
        this.f121625k = toolbarViewHolder;
        this.f121626l = guidanceViewHolder;
        this.f121627m = loadingViewHolder;
        this.f121628n = listProgressBarViewHolder;
        this.f121629o = layoutHelper;
        this.f121630p = overlay;
        this.f121631q = loadingText;
        this.f121632r = CollectionsKt.p(shutterButtonsViewHolder, listButtonViewHolder, exitButtonViewHolder, nextButtonViewHolder, redoScanButtonViewHolder, restartButtonViewHolder, clearButtonViewHolder, singleScanButtonViewHolder, statusButtonViewHolder, torchButtonWrapper, toolbarViewHolder, guidanceViewHolder, loadingViewHolder, listProgressBarViewHolder, clusterPresenter);
        this.f121638x = new Handler(Looper.getMainLooper());
        this.f121639y = new BarcodeCountViewSettings();
        this.f121613D = new u(this);
        v listener = new v(this);
        Intrinsics.j(listener, "listener");
        clusterPresenter.f121520i = listener;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(com.scandit.datacapture.barcode.count.ui.view.i iVar) {
        this.f121633s = iVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void b(boolean z10) {
        this.f121635u = z10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final BarcodeCountViewInternalUiListener c() {
        return this.f121634t;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void d(boolean z10) {
        ((K) this.f121628n).f121906b = z10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void e(boolean z10) {
        AbstractC13141u0.a(this.f121615a, z10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void l() {
        this.f121612C = false;
        P0.b((Z0) this.f121623i, false);
        P0.a((Z0) this.f121623i, false);
    }

    public final void m() {
        BarcodeCountCameraHandler barcodeCountCameraHandler;
        BarcodeCountView barcodeCountView;
        this.f121610A = true;
        this.f121611B = true;
        t tVar = this.f121633s;
        if (tVar != null && (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get()) != null) {
            barcodeCountView.a(false);
        }
        if (this.f121636v != 0) {
            this.f121638x.postDelayed(new Runnable() { // from class: Lt.a
                @Override // java.lang.Runnable
                public final void run() {
                    J.a(this.f18740a);
                }
            }, this.f121636v);
            return;
        }
        t tVar2 = this.f121633s;
        if (tVar2 != null) {
            I onFocus = new I(this);
            Intrinsics.j(onFocus, "onFocus");
            BarcodeCountView barcodeCountView2 = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar2).f120858a.get();
            if (barcodeCountView2 == null || (barcodeCountCameraHandler = barcodeCountView2.f120839i) == null) {
                return;
            }
            barcodeCountCameraHandler.a(new com.scandit.datacapture.barcode.count.ui.view.h(onFocus));
        }
    }

    public static final void a(J this$0) {
        BarcodeCountCameraHandler barcodeCountCameraHandler;
        Intrinsics.j(this$0, "this$0");
        t tVar = this$0.f121633s;
        if (tVar != null) {
            I onFocus = new I(this$0);
            Intrinsics.j(onFocus, "onFocus");
            BarcodeCountView barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get();
            if (barcodeCountView == null || (barcodeCountCameraHandler = barcodeCountView.f120839i) == null) {
                return;
            }
            barcodeCountCameraHandler.a(new com.scandit.datacapture.barcode.count.ui.view.h(onFocus));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final boolean b() {
        return this.f121637w;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void c(boolean z10) {
        AbstractC13141u0.b(this.f121615a, z10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final boolean e() {
        b1 b1Var = this.f121625k;
        a1 preference = a1.f121960c;
        h1 h1Var = (h1) b1Var;
        h1Var.getClass();
        Intrinsics.j(preference, "preference");
        return h1Var.f122013a.getBoolean(h1.a(preference), false);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void f() {
        AbstractC13141u0.a(this.f121615a, false);
        AbstractC13141u0.b(this.f121615a, true);
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.A a10 = this.f121616b;
        C13148y onFinished = C13148y.f122108a;
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F f10 = (com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) a10;
        f10.getClass();
        Intrinsics.j(onFinished, "onFinished");
        f10.a(0, onFinished);
        ((K) this.f121628n).f121906b = false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final BarcodeCountToolbarView g() {
        return ((h1) this.f121625k).f122018f;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void h() {
        J0 j02 = (J0) this.f121615a;
        this.f121640z = j02.f121894d;
        j02.f121894d = false;
        ((C13133q) this.f121621g).f122058b = false;
        ((O0) this.f121622h).f121915b = false;
        ((Z0) this.f121623i).f121952b = false;
        n1 n1Var = (n1) this.f121624j;
        n1Var.f122044d.setValue(n1Var, n1.f122040h[0], Boolean.FALSE);
        ((h1) this.f121625k).f122016d = false;
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void i() {
        J0 j02 = (J0) this.f121615a;
        j02.f121901k = false;
        j02.f121895e.invoke(Boolean.FALSE);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final int j() {
        return this.f121636v;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void k() {
        ((J0) this.f121615a).f121894d = this.f121640z;
        ((C13133q) this.f121621g).f122058b = this.f121639y.n();
        ((O0) this.f121622h).f121915b = this.f121639y.v();
        ((Z0) this.f121623i).f121952b = this.f121639y.x();
        i1 i1Var = this.f121624j;
        n1 n1Var = (n1) i1Var;
        n1Var.f122044d.setValue(n1Var, n1.f122040h[0], Boolean.valueOf(this.f121639y.z()));
        ((h1) this.f121625k).f122016d = this.f121639y.y();
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void b(BarcodeCountViewSettings viewSettings) {
        Intrinsics.j(viewSettings, "viewSettings");
        b1 b1Var = this.f121625k;
        a1 preference = a1.f121960c;
        h1 h1Var = (h1) b1Var;
        h1Var.getClass();
        Intrinsics.j(preference, "preference");
        viewSettings.d(h1Var.f122013a.getBoolean(h1.a(preference), false));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void d() {
        y1 y1Var = (y1) this.f121626l;
        y1Var.getClass();
        o1.b(y1Var, false, "");
        o1.a(y1Var, false, "");
        this.f121612C = true;
        P0.b((Z0) this.f121623i, false);
        P0.a((Z0) this.f121623i, true);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener) {
        this.f121634t = barcodeCountViewInternalUiListener;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(int i10) {
        this.f121636v = i10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(boolean z10) {
        this.f121637w = z10;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountViewLayerManager layerManager, BarcodeCount mode) {
        NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme;
        Intrinsics.j(layerManager, "layerManager");
        Intrinsics.j(mode, "mode");
        mode.getInternalListeners$scandit_barcode_capture().add(0, this.f121613D);
        mode._setStatusListener$scandit_barcode_capture(new x(this));
        this.f121630p.setGuidanceHandler$scandit_barcode_capture(new w(this));
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = this.f121630p;
        h1 h1Var = (h1) this.f121625k;
        h1Var.getClass();
        boolean z10 = h1Var.f122013a.getBoolean(h1.a(a1.f121961d), false);
        if (z10) {
            nativeBarcodeCountBasicOverlayColorScheme = NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE;
        } else if (!z10) {
            nativeBarcodeCountBasicOverlayColorScheme = NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        barcodeCountBasicOverlay.setColorScheme$scandit_barcode_capture(nativeBarcodeCountBasicOverlayColorScheme);
        InterfaceC13147x0 interfaceC13147x0 = this.f121615a;
        z zVar = new z(this);
        J0 j02 = (J0) interfaceC13147x0;
        j02.getClass();
        Intrinsics.j(zVar, "<set-?>");
        j02.f121895e = zVar;
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.A a10 = this.f121616b;
        A a11 = new A(this);
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F f10 = (com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) a10;
        f10.getClass();
        Intrinsics.j(a11, "<set-?>");
        f10.f121870c = a11;
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.r rVar = this.f121617c;
        B b10 = new B(this);
        C13146x c13146x = (C13146x) rVar;
        c13146x.getClass();
        Intrinsics.j(b10, "<set-?>");
        c13146x.f122099c = b10;
        Y y10 = this.f121618d;
        C c10 = new C(this);
        C13110e0 c13110e0 = (C13110e0) y10;
        c13110e0.getClass();
        Intrinsics.j(c10, "<set-?>");
        c13110e0.f121985c = c10;
        InterfaceC13112f0 interfaceC13112f0 = this.f121619e;
        D d10 = new D(this);
        C13124l0 c13124l0 = (C13124l0) interfaceC13112f0;
        c13124l0.getClass();
        Intrinsics.j(d10, "<set-?>");
        c13124l0.f122031c = d10;
        InterfaceC13126m0 interfaceC13126m0 = this.f121620f;
        E e10 = new E(this);
        C13139t0 c13139t0 = (C13139t0) interfaceC13126m0;
        c13139t0.getClass();
        Intrinsics.j(e10, "<set-?>");
        c13139t0.f122076d = e10;
        InterfaceC13121k interfaceC13121k = this.f121621g;
        F f11 = new F(this);
        C13133q c13133q = (C13133q) interfaceC13121k;
        c13133q.getClass();
        Intrinsics.j(f11, "<set-?>");
        c13133q.f122060d = f11;
        K0 k02 = this.f121622h;
        G g10 = new G(this);
        O0 o02 = (O0) k02;
        o02.getClass();
        Intrinsics.j(g10, "<set-?>");
        o02.f121917d = g10;
        this.f121623i.getClass();
        S0 s02 = this.f121623i;
        H h10 = new H(this);
        Z0 z02 = (Z0) s02;
        z02.getClass();
        Intrinsics.j(h10, "<set-?>");
        z02.f121953c = h10;
        ((h1) this.f121625k).f122014b = new y(this);
        this.f121629o.d();
        Iterator it = this.f121632r.iterator();
        while (it.hasNext()) {
            ((InterfaceC13105c) it.next()).b();
        }
        com.scandit.datacapture.barcode.internal.module.ui.l lVar = ((y1) this.f121626l).f122111b;
        if (lVar != null) {
            lVar.setVisibility(8);
            lVar.f123349d = null;
        }
        X x10 = (X) this.f121627m;
        com.scandit.datacapture.barcode.internal.module.count.ui.l lVar2 = x10.f121941b;
        if (lVar2 != null) {
            lVar2.setVisibility(4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.l lVar3 = x10.f121942c;
        if (lVar3 == null) {
            return;
        }
        lVar3.setVisibility(4);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountInternalMode internalMode) {
        Intrinsics.j(internalMode, "internalMode");
        this.f121614E = internalMode;
        a(this.f121639y, internalMode);
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a() {
        this.f121629o.d();
        Iterator it = this.f121632r.iterator();
        while (it.hasNext()) {
            ((InterfaceC13105c) it.next()).a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(int i10, int i11) {
        K k10 = (K) this.f121628n;
        k10.f121908d.a(new com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.J(k10, i11, i10));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountViewSettings viewSettings) {
        Intrinsics.j(viewSettings, "viewSettings");
        this.f121639y = viewSettings;
        BarcodeCountInternalMode barcodeCountInternalMode = this.f121614E;
        if (barcodeCountInternalMode != null) {
            a(viewSettings, barcodeCountInternalMode);
        }
    }

    public final void a(BarcodeCountViewSettings barcodeCountViewSettings, BarcodeCountInternalMode barcodeCountInternalMode) {
        this.f121630p.setShouldShowScanAreaGuides(barcodeCountViewSettings.t());
        this.f121630p.setShouldShowStatusIconsOnScan(barcodeCountViewSettings.w());
        this.f121630p.setRecognizedBrush(barcodeCountViewSettings.k());
        this.f121630p.setNotInListBrush(barcodeCountViewSettings.j());
        this.f121630p.setAcceptedNotInListBrush(barcodeCountViewSettings.a());
        this.f121630p.setRejectedNotInListBrush(barcodeCountViewSettings.l());
        this.f121630p.setShouldShowHints(barcodeCountViewSettings.q());
        this.f121630p.setFilterSettings(barcodeCountViewSettings.g());
        String strE = barcodeCountViewSettings.E();
        if (strE != null) {
            this.f121630p.setTextForBarcodesNotInListDetectedHint(strE);
        }
        String strK = barcodeCountViewSettings.K();
        if (strK != null) {
            this.f121630p.setTextForTapShutterToScanHint(strK);
        }
        String strI = barcodeCountViewSettings.I();
        if (strI != null) {
            this.f121630p.setTextForScanningHint(strI);
        }
        String strG = barcodeCountViewSettings.G();
        if (strG != null) {
            this.f121630p.setTextForMoveCloserAndRescanHint(strG);
        }
        String strH = barcodeCountViewSettings.H();
        if (strH != null) {
            this.f121630p.setTextForMoveFurtherAndRescanHint(strH);
        }
        String strL = barcodeCountViewSettings.L();
        if (strL != null) {
            this.f121630p.setTextForTapToUncountHint(strL);
        }
        String strF = barcodeCountViewSettings.F();
        if (strF != null) {
            this.f121630p.setTextForClusteringGestureHint(strF);
        }
        String strJ = barcodeCountViewSettings.J();
        if (strJ != null) {
            this.f121630p.setTextForScreenCleanedUpHint(strJ);
        }
        ((J0) this.f121615a).f121893c = barcodeCountViewSettings.u();
        ((J0) this.f121615a).f121894d = barcodeCountViewSettings.p();
        ((J0) this.f121615a).b(barcodeCountViewSettings.B());
        ((J0) this.f121615a).a(barcodeCountViewSettings.h());
        ((com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) this.f121616b).f121869b = barcodeCountViewSettings.r();
        ((com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) this.f121616b).a(barcodeCountViewSettings.i());
        ((C13146x) this.f121617c).f122098b = barcodeCountViewSettings.o();
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.r rVar = this.f121617c;
        String text = barcodeCountViewSettings.f();
        C13146x c13146x = (C13146x) rVar;
        c13146x.getClass();
        Intrinsics.j(text, "value");
        C13142v onFinished = C13142v.f122083a;
        Intrinsics.j(text, "text");
        Intrinsics.j(onFinished, "onFinished");
        c13146x.f122101e = text;
        c13146x.f122103g.a(new C13144w(c13146x, text, onFinished));
        ((C13146x) this.f121617c).a(barcodeCountViewSettings.e());
        ((C13146x) this.f121617c).f122102f = true;
        ((C13133q) this.f121621g).f122058b = barcodeCountViewSettings.n();
        InterfaceC13121k interfaceC13121k = this.f121621g;
        String text2 = barcodeCountViewSettings.d();
        C13133q c13133q = (C13133q) interfaceC13121k;
        c13133q.getClass();
        Intrinsics.j(text2, "value");
        C13117i onFinished2 = C13117i.f122019a;
        Intrinsics.j(text2, "text");
        Intrinsics.j(onFinished2, "onFinished");
        c13133q.f122062f = text2;
        c13133q.f122063g.a(new C13129o(c13133q, text2, onFinished2));
        ((C13133q) this.f121621g).a(barcodeCountViewSettings.c());
        ((O0) this.f121622h).f121915b = barcodeCountViewSettings.v();
        ((O0) this.f121622h).a(barcodeCountViewSettings.C());
        ((Z0) this.f121623i).f121952b = barcodeCountViewSettings.x() && !barcodeCountViewSettings.w();
        ((Z0) this.f121623i).a(barcodeCountViewSettings.D());
        i1 i1Var = this.f121624j;
        Set setB = SetsKt.b();
        if (this.f121639y.v()) {
            setB.add(Anchor.BOTTOM_LEFT);
        }
        if (this.f121639y.x()) {
            setB.add(Anchor.BOTTOM_RIGHT);
        }
        Set setA = SetsKt.a(setB);
        n1 n1Var = (n1) i1Var;
        n1Var.getClass();
        Intrinsics.j(setA, "<set-?>");
        n1Var.f122046f = setA;
        n1 n1Var2 = (n1) this.f121624j;
        n1Var2.f122044d.setValue(n1Var2, n1.f122040h[0], Boolean.valueOf(barcodeCountViewSettings.z()));
        i1 i1Var2 = this.f121624j;
        Anchor anchorN = barcodeCountViewSettings.N();
        n1 n1Var3 = (n1) i1Var2;
        n1Var3.getClass();
        Intrinsics.j(anchorN, "<set-?>");
        n1Var3.f122045e = anchorN;
        ((h1) this.f121625k).f122016d = barcodeCountViewSettings.y();
        b1 b1Var = this.f121625k;
        BarcodeCountToolbarSettings settings = barcodeCountViewSettings.M();
        h1 h1Var = (h1) b1Var;
        h1Var.getClass();
        Intrinsics.j(settings, "settings");
        h1Var.f122017e = settings.clone$scandit_barcode_capture();
        BarcodeCountToolbarView barcodeCountToolbarView = h1Var.f122018f;
        if (barcodeCountToolbarView != null) {
            barcodeCountToolbarView.a(settings);
        }
        ((y1) this.f121626l).f122110a = barcodeCountViewSettings.A();
        ((X) this.f121627m).f121940a = barcodeCountViewSettings.A();
        ((K) this.f121628n).f121905a = barcodeCountViewSettings.s();
        ((C13124l0) this.f121619e).f122030b = false;
        ((C13139t0) this.f121620f).f122074b = false;
        if (Intrinsics.e(barcodeCountInternalMode, com.scandit.datacapture.barcode.internal.module.count.ui.mode.a.f121746a) || !(barcodeCountInternalMode instanceof com.scandit.datacapture.barcode.internal.module.count.ui.mode.b)) {
            return;
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.mode.b bVar = (com.scandit.datacapture.barcode.internal.module.count.ui.mode.b) barcodeCountInternalMode;
        this.f121630p.setShouldShowScanAreaGuides(false);
        ((com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.F) this.f121616b).f121869b = false;
        ((O0) this.f121622h).f121915b = false;
        ((Z0) this.f121623i).f121952b = false;
        Y y10 = this.f121618d;
        String text3 = bVar.f121747a.getNextButtonText();
        C13110e0 c13110e0 = (C13110e0) y10;
        c13110e0.getClass();
        Intrinsics.j(text3, "value");
        C13106c0 onFinished3 = C13106c0.f121976a;
        Intrinsics.j(text3, "text");
        Intrinsics.j(onFinished3, "onFinished");
        c13110e0.f121987e = text3;
        c13110e0.f121988f.a(new C13108d0(c13110e0, text3, onFinished3));
        InterfaceC13112f0 interfaceC13112f0 = this.f121619e;
        String text4 = bVar.f121747a.getRedoScanButtonText();
        C13124l0 c13124l0 = (C13124l0) interfaceC13112f0;
        c13124l0.getClass();
        Intrinsics.j(text4, "value");
        C13120j0 onFinished4 = C13120j0.f122022a;
        Intrinsics.j(text4, "text");
        Intrinsics.j(onFinished4, "onFinished");
        c13124l0.f122033e = text4;
        c13124l0.f122034f.a(new C13122k0(c13124l0, text4, onFinished4));
        InterfaceC13126m0 interfaceC13126m0 = this.f121620f;
        String text5 = bVar.f121747a.getRestartButtonText();
        C13139t0 c13139t0 = (C13139t0) interfaceC13126m0;
        c13139t0.getClass();
        Intrinsics.j(text5, "value");
        C13135r0 onFinished5 = C13135r0.f122066a;
        Intrinsics.j(text5, "text");
        Intrinsics.j(onFinished5, "onFinished");
        c13139t0.f122078f = text5;
        c13139t0.f122079g.a(new C13137s0(c13139t0, text5, onFinished5));
        com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.r rVar2 = this.f121617c;
        String text6 = bVar.f121747a.getFinishButtonText();
        C13146x c13146x2 = (C13146x) rVar2;
        c13146x2.getClass();
        Intrinsics.j(text6, "value");
        Intrinsics.j(text6, "text");
        Intrinsics.j(onFinished, "onFinished");
        c13146x2.f122101e = text6;
        c13146x2.f122103g.a(new C13144w(c13146x2, text6, onFinished));
        ((C13146x) this.f121617c).f122102f = true;
        ((C13133q) this.f121621g).f122058b = false;
        int iOrdinal = bVar.f121748b.ordinal();
        if (iOrdinal == 0) {
            ((C13110e0) this.f121618d).f121984b = true;
            ((C13146x) this.f121617c).f122098b = false;
            ((C13124l0) this.f121619e).f122030b = false;
            ((X) this.f121627m).f121940a = false;
            this.f121630p.setShouldShowHints(false);
            ((y1) this.f121626l).f122110a = false;
            ((C13139t0) this.f121620f).f122074b = true;
            return;
        }
        if (iOrdinal == 1) {
            ((C13110e0) this.f121618d).f121984b = true;
            ((C13146x) this.f121617c).f122098b = false;
            ((C13124l0) this.f121619e).f122030b = false;
            ((C13139t0) this.f121620f).f122074b = true;
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        ((C13110e0) this.f121618d).f121984b = false;
        ((C13146x) this.f121617c).f122098b = true;
        ((C13124l0) this.f121619e).f122030b = true;
        ((C13139t0) this.f121620f).f122074b = false;
        ((X) this.f121627m).f121940a = false;
        this.f121630p.setShouldShowHints(false);
        ((y1) this.f121626l).f122110a = false;
        J0 j02 = (J0) this.f121615a;
        j02.f121893c = false;
        j02.f121894d = false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(Size screenSize, Size previewSize) {
        Intrinsics.j(screenSize, "screenSize");
        Intrinsics.j(previewSize, "previewSize");
        this.f121629o.a(previewSize);
        J0 j02 = (J0) this.f121615a;
        j02.a(ObjectOverlayUtilsKt.getSize(j02.f121892b));
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(boolean z10, boolean z11) {
        b1 b1Var = this.f121625k;
        boolean z12 = z10 && (z11 || this.f121629o.i() == BarcodeCountScreenRatioForUi.SMALL || this.f121637w);
        BarcodeCountToolbarView barcodeCountToolbarView = ((h1) b1Var).f122018f;
        if (barcodeCountToolbarView == null) {
            return;
        }
        barcodeCountToolbarView.a(z12);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCountFeedback feedback) {
        Intrinsics.j(feedback, "feedback");
        h1 h1Var = (h1) this.f121625k;
        h1Var.getClass();
        Intrinsics.j(feedback, "feedback");
        h1Var.a(h1.a(a1.f121958a), feedback.getSuccess().getSound() != null);
        h1Var.a(h1.a(a1.f121959b), feedback.getSuccess().getVibration() != null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiPresenter
    public final void a(BarcodeCount mode) {
        Intrinsics.j(mode, "mode");
        h1 h1Var = (h1) this.f121625k;
        h1Var.getClass();
        Intrinsics.j(mode, "mode");
        mode.setFeedback(BarcodeCountFeedback.INSTANCE.defaultFeedback$scandit_barcode_capture(h1Var.f122013a.getBoolean("barcode_count_toolbar_audio_feedback_key", false), h1Var.f122013a.getBoolean("barcode_count_toolbar_haptic_feedback_key", false)));
    }
}
