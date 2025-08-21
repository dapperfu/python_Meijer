package com.scandit.datacapture.barcode.internal.module.spark.ui;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.spark.data.C13334n;
import com.scandit.datacapture.barcode.internal.module.spark.data.C13335o;
import com.scandit.datacapture.barcode.internal.module.spark.data.EnumC13321a;
import com.scandit.datacapture.barcode.internal.module.spark.data.InterfaceC13331k;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonView;
import com.scandit.datacapture.barcode.internal.module.spark.ui.feedback.SparkScanFeedbackManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter;
import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import com.scandit.datacapture.barcode.spark.capture.SparkScanListener;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewUiListener;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanFeedbackDelegate;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanToastType;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewStateHelper;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanMiniPreviewSizeDeserializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanMiniPreviewSizeSerializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeDeserializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeSerializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanMiniPreviewSize;
import com.scandit.datacapture.barcode.spark.ui.SparkScanPreviewBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningModeKt;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewStateDeserializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewStateSerializer;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumSerializer;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.source.TorchStateDeserializer;
import com.scandit.datacapture.core.source.TorchStateSerializer;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class SparkScanViewPresenter implements com.scandit.datacapture.barcode.internal.module.spark.ui.button.k, SparkScanListener, com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.x, com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.A, InterfaceC13331k {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanView f123969a;

    /* renamed from: b, reason: collision with root package name */
    private final SparkScanStateManager f123970b;

    /* renamed from: c, reason: collision with root package name */
    private final SparkScan f123971c;

    /* renamed from: d, reason: collision with root package name */
    private final SparkScanViewSettings f123972d;

    /* renamed from: e, reason: collision with root package name */
    private final SparkScanViewCameraManager f123973e;

    /* renamed from: f, reason: collision with root package name */
    private final SparkScanViewMiniPreview f123974f;

    /* renamed from: g, reason: collision with root package name */
    private final SparkScanViewScanButtonView f123975g;

    /* renamed from: h, reason: collision with root package name */
    private final SparkScanFeedbackManager f123976h;

    /* renamed from: i, reason: collision with root package name */
    private final SparkScanViewToastPresenter f123977i;

    /* renamed from: j, reason: collision with root package name */
    private final SparkScanAnalyticsManager f123978j;

    /* renamed from: k, reason: collision with root package name */
    private final NativeSparkScanStateMachine f123979k;

    /* renamed from: l, reason: collision with root package name */
    private e0 f123980l;

    /* renamed from: m, reason: collision with root package name */
    private SparkScanViewState f123981m;

    /* renamed from: n, reason: collision with root package name */
    private SparkScanViewState f123982n;

    /* renamed from: o, reason: collision with root package name */
    private SparkScanViewUiListener f123983o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f123984p;

    public final SparkScanViewState b() {
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        return viewState;
    }

    public final void g() {
        this.f123976h.a();
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        if (viewState == SparkScanViewState.ACTIVE) {
            N();
            return;
        }
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(9);
        }
    }

    public final void h() {
        if (SparkScanScanningModeKt.getScanningBehavior(this.f123970b.p()) == SparkScanScanningBehavior.SINGLE && this.f123971c.isSuppressed$scandit_barcode_capture()) {
            this.f123971c._disable$scandit_barcode_capture();
        }
    }

    public final void i() {
        this.f123976h.a();
        Callback callback = LambdaExtensionsKt.Callback(new W(this));
        Intrinsics.j(callback, "callback");
        a(this, false, false, 4);
        this.f123973e.b(callback);
    }

    public final void j() {
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        d(viewState);
        SparkScanViewState viewState2 = this.f123979k.getViewState();
        Intrinsics.i(viewState2, "getViewState(...)");
        if (viewState2 == SparkScanViewState.ERROR) {
            this.f123974f.g();
            return;
        }
        this.f123976h.a();
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(1);
        }
    }

    public final void k() {
        this.f123974f.l(false);
        this.f123971c.setSingleScanModeEnabled$scandit_barcode_capture(false);
        this.f123970b.b(true);
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).removeCallbacksAndMessages(null);
        }
        e0 e0Var2 = this.f123980l;
        if (e0Var2 != null) {
            ((f0) e0Var2).sendEmptyMessage(9);
        }
    }

    public final void l() {
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        if (NativeSparkScanViewStateHelper.isCaptureEnabledState(viewState)) {
            this.f123974f.l();
        } else {
            g();
        }
    }

    public final void m(boolean z10) {
        this.f123976h.a();
        a(this, z10, false, 6);
    }

    public final void n(boolean z10) {
        EnumC13321a enumC13321a;
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).removeCallbacksAndMessages(null);
        }
        if (!z10) {
            enumC13321a = EnumC13321a.f123841b;
        } else {
            if (!z10) {
                throw new NoWhenBranchMatchedException();
            }
            enumC13321a = EnumC13321a.f123842c;
        }
        this.f123978j.a(enumC13321a);
        e0 e0Var2 = this.f123980l;
        if (e0Var2 != null) {
            long jF = this.f123970b.f();
            f0 f0Var = (f0) e0Var2;
            Message messageObtainMessage = f0Var.obtainMessage(2, Boolean.TRUE);
            Intrinsics.i(messageObtainMessage, "obtainMessage(...)");
            if (jF >= 0) {
                f0Var.sendMessageDelayed(messageObtainMessage, jF);
            }
        }
        a(this, SparkScanViewState.INACTIVE, false, 6);
    }

    public final void o(boolean z10) {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            f0 f0Var = (f0) e0Var;
            f0Var.sendMessage(f0Var.obtainMessage(30, Boolean.valueOf(z10)));
        }
    }

    public final void p(boolean z10) {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            f0 f0Var = (f0) e0Var;
            f0Var.sendMessage(f0Var.obtainMessage(26, Boolean.valueOf(z10)));
        }
    }

    public SparkScanViewPresenter(SparkScanView sparkScanView, SparkScanStateManager stateManager, SparkScan sparkScan, SparkScanViewSettings settings, SparkScanViewCameraManager cameraManager, SparkScanViewMiniPreview miniPreview, SparkScanViewScanButtonView scanButton, SparkScanFeedbackManager feedbackManager, SparkScanViewToastPresenter toastPresenter, SparkScanAnalyticsManager analyticsManager, NativeSparkScanStateMachine nativeStateMachine) {
        Intrinsics.j(sparkScanView, "sparkScanView");
        Intrinsics.j(stateManager, "stateManager");
        Intrinsics.j(sparkScan, "sparkScan");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(cameraManager, "cameraManager");
        Intrinsics.j(miniPreview, "miniPreview");
        Intrinsics.j(scanButton, "scanButton");
        Intrinsics.j(feedbackManager, "feedbackManager");
        Intrinsics.j(toastPresenter, "toastPresenter");
        Intrinsics.j(analyticsManager, "analyticsManager");
        Intrinsics.j(nativeStateMachine, "nativeStateMachine");
        this.f123969a = sparkScanView;
        this.f123970b = stateManager;
        this.f123971c = sparkScan;
        this.f123972d = settings;
        this.f123973e = cameraManager;
        this.f123974f = miniPreview;
        this.f123975g = scanButton;
        this.f123976h = feedbackManager;
        this.f123977i = toastPresenter;
        this.f123978j = analyticsManager;
        this.f123979k = nativeStateMachine;
        this.f123980l = null;
        nativeStateMachine.setViewHandlerDelegate(new G(new L(this)));
        nativeStateMachine.setToastPresenterDelegate(new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.p(new K(this)));
        nativeStateMachine.addSparkScanViewUiListenerAsync(new J(this));
        this.f123984p = SparkScanViewDefaults.getDefaultTriggerButtonVisible();
    }

    public static final void a(SparkScanViewPresenter sparkScanViewPresenter, SparkScanViewState sparkScanViewState) {
        sparkScanViewPresenter.getClass();
        boolean z10 = (sparkScanViewState == SparkScanViewState.ACTIVE || sparkScanViewState == SparkScanViewState.ERROR || sparkScanViewState == SparkScanViewState.INACTIVE) && sparkScanViewPresenter.f123984p;
        sparkScanViewPresenter.f123969a.setClickable(z10);
        sparkScanViewPresenter.f123969a.setFocusable(z10);
    }

    public final void A() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(10);
        }
    }

    public final void B() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(37);
        }
    }

    public final void C() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(36);
        }
    }

    public final void D() {
        if (this.f123972d.getHoldToScanEnabled()) {
            this.f123970b.b(false);
            e0 e0Var = this.f123980l;
            if (e0Var != null) {
                ((f0) e0Var).sendEmptyMessage(22);
            }
        }
    }

    public final void E() {
        e0 e0Var;
        if (!this.f123972d.getHoldToScanEnabled() || (e0Var = this.f123980l) == null) {
            return;
        }
        ((f0) e0Var).sendEmptyMessage(21);
    }

    public final void F() {
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        this.f123982n = viewState;
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).removeCallbacksAndMessages(null);
        }
        this.f123980l = null;
        this.f123978j.a(EnumC13321a.f123841b);
        a(this, SparkScanViewState.IDLE, false, 4);
        this.f123973e.b(null);
        this.f123976h.b();
        this.f123971c.removeListener(this);
        this.f123974f.a((com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.x) null);
        this.f123974f.a((com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.A) null);
        this.f123974f.k();
        this.f123975g.a();
        this.f123977i.release();
        this.f123973e.release();
        this.f123970b.b(this);
    }

    public final Bundle G() {
        Bundle bundle = new Bundle();
        SparkScanViewState sparkScanViewState = this.f123982n;
        if (sparkScanViewState != null) {
            bundle.putString("current_state", SparkScanViewStateSerializer.toString(sparkScanViewState));
            bundle.putString("current_mode", SparkScanScanningModeSerializer.toJson$default(this.f123970b.p(), false, 2, null));
            bundle.putString("current_torch_state", TorchStateSerializer.toJson(this.f123970b.u()));
            bundle.putBoolean("current_zoom_state", this.f123970b.y());
            bundle.putString("current_expanded_state", SparkScanMiniPreviewSizeSerializer.toJson(this.f123970b.l()));
            bundle.putString("current_camera", NativeEnumSerializer.cameraPositionToString(this.f123970b.a()));
        }
        return bundle;
    }

    public final void H() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(12);
        }
    }

    public final void I() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(16);
        }
    }

    public final void J() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            f0 f0Var = (f0) e0Var;
            f0Var.sendMessage(f0Var.obtainMessage(34, Boolean.TRUE));
        }
    }

    public final void K() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            f0 f0Var = (f0) e0Var;
            f0Var.sendMessage(f0Var.obtainMessage(34, Boolean.FALSE));
        }
    }

    public final void L() {
        e0 e0Var;
        if (!this.f123984p || (e0Var = this.f123980l) == null) {
            return;
        }
        f0 f0Var = (f0) e0Var;
        f0Var.removeCallbacksAndMessages(null);
        f0Var.sendEmptyMessage(2);
    }

    public final void M() {
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        if (a(viewState) || viewState == SparkScanViewState.ERROR) {
            this.f123974f.h();
        } else {
            this.f123974f.B();
        }
        this.f123975g.g();
        SparkScanViewState viewState2 = this.f123979k.getViewState();
        Intrinsics.i(viewState2, "getViewState(...)");
        d(viewState2);
        this.f123974f.n();
    }

    public final void N() {
        e0 e0Var;
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        if (viewState == SparkScanViewState.INACTIVE && SparkScanScanningModeKt.getPreviewBehavior(this.f123970b.p()) == SparkScanPreviewBehavior.PERSISTENT) {
            e0 e0Var2 = this.f123980l;
            if (e0Var2 != null) {
                f0 f0Var = (f0) e0Var2;
                f0Var.removeMessages(2);
                long jF = this.f123970b.f();
                Message messageObtainMessage = f0Var.obtainMessage(2, Boolean.TRUE);
                Intrinsics.i(messageObtainMessage, "obtainMessage(...)");
                if (jF < 0) {
                    return;
                }
                f0Var.sendMessageDelayed(messageObtainMessage, jF);
                return;
            }
            return;
        }
        if (this.f123970b.h()) {
            return;
        }
        SparkScanViewState viewState2 = this.f123979k.getViewState();
        Intrinsics.i(viewState2, "getViewState(...)");
        if (viewState2 == SparkScanViewState.ERROR || (e0Var = this.f123980l) == null) {
            return;
        }
        f0 f0Var2 = (f0) e0Var;
        f0Var2.removeMessages(2);
        f0Var2.removeMessages(1);
        long jG = this.f123970b.g();
        Message messageObtainMessage2 = f0Var2.obtainMessage(1, Boolean.TRUE);
        Intrinsics.i(messageObtainMessage2, "obtainMessage(...)");
        if (jG < 0) {
            return;
        }
        f0Var2.sendMessageDelayed(messageObtainMessage2, jG);
    }

    public final void P() {
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        if (viewState == SparkScanViewState.ACTIVE) {
            N();
            return;
        }
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(9);
        }
    }

    public final void Q() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(19);
        }
    }

    public final void b(boolean z10) {
        this.f123975g.a(z10);
    }

    public final void e(boolean z10) {
        if (z10) {
            SparkScanViewState viewState = this.f123979k.getViewState();
            Intrinsics.i(viewState, "getViewState(...)");
            if (viewState != SparkScanViewState.ERROR) {
                e0 e0Var = this.f123980l;
                if (e0Var != null) {
                    ((f0) e0Var).removeMessages(1);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        N();
    }

    public final void f() {
        this.f123976h.a();
        SparkScanStateManager sparkScanStateManager = this.f123970b;
        sparkScanStateManager.a(M.f123959c[sparkScanStateManager.a().ordinal()] == 1 ? CameraPosition.USER_FACING : CameraPosition.WORLD_FACING);
        this.f123973e.a(new S(this, new U(this)));
        h(false);
        this.f123979k.onCameraSwitchButtonTapped();
        N();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanListener
    public final void onBarcodeScanned(SparkScan sparkScan, SparkScanSession session, FrameData frameData) {
        Brush defaultBrush;
        Intrinsics.j(sparkScan, "sparkScan");
        Intrinsics.j(session, "session");
        Barcode newlyRecognizedBarcode = session.getNewlyRecognizedBarcode();
        if (newlyRecognizedBarcode != null) {
            SparkScanFeedbackDelegate feedbackDelegate = this.f123969a.getFeedbackDelegate();
            SparkScanBarcodeFeedback feedbackForBarcode = feedbackDelegate != null ? feedbackDelegate.getFeedbackForBarcode(newlyRecognizedBarcode) : null;
            boolean z10 = feedbackForBarcode instanceof SparkScanBarcodeFeedback.Success;
            boolean z11 = !z10 && (feedbackForBarcode instanceof SparkScanBarcodeFeedback.Error) && ((SparkScanBarcodeFeedback.Error) feedbackForBarcode).getResumeCapturingDelay().asMillis() <= 0;
            if (SparkScanScanningModeKt.getScanningBehavior(this.f123970b.p()) != SparkScanScanningBehavior.CONTINUOUS && !z11) {
                if (this.f123970b.c()) {
                    sparkScan._setResultSuppressionEnabled$scandit_barcode_capture(true);
                } else {
                    sparkScan._disable$scandit_barcode_capture();
                }
            }
            SparkScanViewMiniPreview sparkScanViewMiniPreview = this.f123974f;
            SparkScanBarcodeFeedback.Success success = z10 ? (SparkScanBarcodeFeedback.Success) feedbackForBarcode : null;
            if (success == null || (defaultBrush = success.getBrush()) == null) {
                defaultBrush = SparkScanViewDefaults.getDefaultBrush();
            }
            sparkScanViewMiniPreview.setBrush(defaultBrush);
            e0 e0Var = this.f123980l;
            if (e0Var != null) {
                f0 f0Var = (f0) e0Var;
                if (z10) {
                    f0Var.sendMessage(f0Var.obtainMessage(7, (SparkScanBarcodeFeedback.Success) feedbackForBarcode));
                } else if (feedbackForBarcode instanceof SparkScanBarcodeFeedback.Error) {
                    SparkScanBarcodeFeedback.Error error = (SparkScanBarcodeFeedback.Error) feedbackForBarcode;
                    f0Var.removeCallbacksAndMessages(null);
                    f0Var.sendMessage(f0Var.obtainMessage(5, error));
                    long jAsMillis = error.getResumeCapturingDelay().asMillis();
                    if (jAsMillis > 0 && jAsMillis >= 0) {
                        f0Var.sendEmptyMessageDelayed(4, jAsMillis);
                    }
                }
            }
            e0 e0Var2 = this.f123980l;
            if (e0Var2 != null) {
                f0 f0Var2 = (f0) e0Var2;
                f0Var2.sendMessage(f0Var2.obtainMessage(6, Boolean.valueOf(z11)));
            }
        }
    }

    public final void q() {
        SparkScanScanningBehavior sparkScanScanningBehavior;
        this.f123976h.a();
        int i10 = M.f123957a[SparkScanScanningModeKt.getScanningBehavior(this.f123970b.p()).ordinal()];
        if (i10 == 1) {
            sparkScanScanningBehavior = SparkScanScanningBehavior.CONTINUOUS;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sparkScanScanningBehavior = SparkScanScanningBehavior.SINGLE;
        }
        SparkScanStateManager sparkScanStateManager = this.f123970b;
        sparkScanStateManager.a(SparkScanScanningModeKt.copyWith$default(sparkScanStateManager.p(), sparkScanScanningBehavior, null, 2, null));
        boolean z10 = SparkScanScanningModeKt.getScanningBehavior(this.f123970b.p()) == SparkScanScanningBehavior.SINGLE;
        this.f123974f.l(z10);
        this.f123971c.setSingleScanModeEnabled$scandit_barcode_capture(z10);
        this.f123979k.onScanningBehaviorButtonTapped();
        SparkScanViewScanButtonView sparkScanViewScanButtonView = this.f123975g;
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        sparkScanViewScanButtonView.b(viewState);
        this.f123974f.g();
        N();
    }

    public final void r() {
        this.f123976h.a();
        SparkScanStateManager sparkScanStateManager = this.f123970b;
        sparkScanStateManager.a(SparkScanScanningModeKt.changeMode(sparkScanStateManager.p()));
        SparkScanStateManager sparkScanStateManager2 = this.f123970b;
        sparkScanStateManager2.b(SparkScanScanningModeKt.changeMode(sparkScanStateManager2.q()));
        this.f123973e.b();
        if (a((SparkScanViewState) null)) {
            SparkScanViewState viewState = this.f123979k.getViewState();
            Intrinsics.i(viewState, "getViewState(...)");
            int i10 = M.f123958b[viewState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                SparkScanViewState viewState2 = this.f123979k.getViewState();
                Intrinsics.i(viewState2, "getViewState(...)");
                a(this, viewState2, true, 2);
            }
        }
        this.f123979k.onTargetModeButtonTapped();
        this.f123974f.g();
        N();
    }

    public final void s() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(23);
        }
    }

    public final void t() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(31);
        }
    }

    public final void u() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(27);
        }
    }

    public final void v() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(32);
        }
    }

    public final void w() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(25);
        }
    }

    public final void x() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(14);
        }
    }

    public final void y() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(15);
        }
    }

    public final void z() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(29);
        }
    }

    public final void O() {
        e0 e0Var;
        a();
        if (this.f123970b.i() && (e0Var = this.f123980l) != null) {
            f0 f0Var = (f0) e0Var;
            f0Var.sendMessage(f0Var.obtainMessage(33, Boolean.TRUE));
        }
    }

    public final void b(String text) {
        Intrinsics.j(text, "text");
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            f0 f0Var = (f0) e0Var;
            Intrinsics.j(text, "text");
            f0Var.sendMessage(f0Var.obtainMessage(20, text));
        }
    }

    public final boolean c() {
        return this.f123984p;
    }

    public final void d() {
        this.f123976h.a();
        Callback callback = LambdaExtensionsKt.Callback(new O(this));
        Intrinsics.j(callback, "callback");
        a(this, false, false, 4);
        this.f123973e.b(callback);
    }

    public final void m() {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).sendEmptyMessage(2);
        }
    }

    public final void o() {
        TorchState torchState;
        this.f123976h.a();
        if (M.f123960d[this.f123970b.u().ordinal()] == 1) {
            torchState = TorchState.OFF;
        } else {
            torchState = TorchState.ON;
        }
        if (a((SparkScanViewState) null)) {
            this.f123973e.a(torchState, C13334n.f123861a);
        }
        this.f123970b.a(torchState);
        N();
        this.f123979k.onTorchButtonTapped();
        this.f123974f.g();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanListener
    public final void onSessionUpdated(SparkScan sparkScan, SparkScanSession sparkScanSession, FrameData frameData) {
        SparkScanListener.DefaultImpls.onSessionUpdated(this, sparkScan, sparkScanSession, frameData);
    }

    public final void p() {
        this.f123976h.a();
        N();
        if (this.f123970b.y()) {
            h(true);
            return;
        }
        if (this.f123970b.y()) {
            return;
        }
        this.f123970b.d(true);
        this.f123974f.g();
        this.f123973e.b();
        this.f123979k.onZoomIn();
        this.f123974f.m();
    }

    public final void c(SparkScanViewState currentState) {
        Intrinsics.j(currentState, "currentState");
        if (currentState != SparkScanViewState.INACTIVE || !this.f123970b.c()) {
            if (currentState == SparkScanViewState.ACTIVE) {
                this.f123971c._enable$scandit_barcode_capture();
            } else {
                this.f123971c._disable$scandit_barcode_capture();
            }
        }
        a(new X(this, currentState));
    }

    public final void l(boolean z10) {
        this.f123984p = z10;
        boolean z11 = false;
        this.f123975g.setVisibility(!z10 ? 8 : 0);
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        if ((viewState == SparkScanViewState.ACTIVE || viewState == SparkScanViewState.ERROR || viewState == SparkScanViewState.INACTIVE) && this.f123984p) {
            z11 = true;
        }
        this.f123969a.setClickable(z11);
        this.f123969a.setFocusable(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void g(boolean z10) {
        if (z10) {
            return;
        }
        h(true);
    }

    public final void i(boolean z10) {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            f0 f0Var = (f0) e0Var;
            f0Var.sendMessage(f0Var.obtainMessage(33, Boolean.valueOf(z10)));
        }
    }

    public static final void b(SparkScanViewPresenter sparkScanViewPresenter, SparkScanViewState sparkScanViewState) {
        if (SparkScanScanningModeKt.getPreviewBehavior(sparkScanViewPresenter.f123970b.p()) == SparkScanPreviewBehavior.PERSISTENT && sparkScanViewState == SparkScanViewState.INACTIVE) {
            sparkScanViewPresenter.f123974f.c();
        }
        if (sparkScanViewState == SparkScanViewState.ACTIVE) {
            sparkScanViewPresenter.f123974f.p();
        }
    }

    public static final TorchState g(SparkScanViewPresenter sparkScanViewPresenter) {
        return sparkScanViewPresenter.f123970b.u();
    }

    private final void h(boolean z10) {
        if (this.f123970b.y()) {
            this.f123970b.d(false);
            this.f123974f.g();
            this.f123973e.b();
            if (z10) {
                this.f123979k.onZoomOut();
            }
            this.f123974f.m();
        }
    }

    public final void e() {
        this.f123976h.a();
        Callback callback = LambdaExtensionsKt.Callback(new Q(this));
        Intrinsics.j(callback, "callback");
        a(this, false, false, 4);
        this.f123973e.b(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(SparkScanViewState sparkScanViewState) {
        int i10 = M.f123958b[sparkScanViewState.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            this.f123975g.i();
        } else {
            this.f123975g.a(sparkScanViewState);
        }
    }

    public static final boolean i(SparkScanViewPresenter sparkScanViewPresenter) {
        return sparkScanViewPresenter.f123970b.h();
    }

    public final void k(boolean z10) {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            f0 f0Var = (f0) e0Var;
            f0Var.sendMessage(f0Var.obtainMessage(26, Boolean.valueOf(z10)));
        }
    }

    public static final void c(SparkScanViewPresenter sparkScanViewPresenter, SparkScanViewState sparkScanViewState) {
        if (!sparkScanViewPresenter.a(sparkScanViewState) && sparkScanViewState != SparkScanViewState.ERROR) {
            sparkScanViewPresenter.f123974f.B();
        } else {
            sparkScanViewPresenter.f123974f.h();
        }
    }

    public final void j(boolean z10) {
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        if (viewState == SparkScanViewState.ERROR) {
            return;
        }
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).removeMessages(1);
        }
        if (SparkScanScanningModeKt.getScanningBehavior(this.f123970b.p()) == SparkScanScanningBehavior.CONTINUOUS) {
            N();
            return;
        }
        SparkScanViewState viewState2 = this.f123979k.getViewState();
        Intrinsics.i(viewState2, "getViewState(...)");
        if (viewState2 != SparkScanViewState.IDLE) {
            if (z10) {
                this.f123971c.setSingleScanModeEnabled$scandit_barcode_capture(SparkScanScanningModeKt.getScanningBehavior(this.f123970b.p()) == SparkScanScanningBehavior.SINGLE);
                N();
                return;
            }
            if (SparkScanScanningModeKt.getPreviewBehavior(this.f123970b.p()) == SparkScanPreviewBehavior.PERSISTENT) {
                this.f123974f.l(false);
                this.f123971c.setSingleScanModeEnabled$scandit_barcode_capture(false);
                this.f123974f.c();
                e0 e0Var2 = this.f123980l;
                if (e0Var2 != null) {
                    ((f0) e0Var2).removeMessages(10);
                }
                e0 e0Var3 = this.f123980l;
                if (e0Var3 != null) {
                    ((f0) e0Var3).sendEmptyMessage(1);
                    return;
                }
                return;
            }
            this.f123974f.c();
            this.f123974f.b();
            e0 e0Var4 = this.f123980l;
            if (e0Var4 != null) {
                ((f0) e0Var4).removeMessages(10);
            }
            e0 e0Var5 = this.f123980l;
            if (e0Var5 != null) {
                ((f0) e0Var5).sendEmptyMessage(1);
            }
        }
    }

    private final boolean a(SparkScanViewState sparkScanViewState) {
        if (sparkScanViewState == null) {
            sparkScanViewState = this.f123979k.getViewState();
            Intrinsics.i(sparkScanViewState, "getViewState(...)");
        }
        if (NativeSparkScanViewStateHelper.isCaptureEnabledState(sparkScanViewState)) {
            return true;
        }
        return SparkScanScanningModeKt.getPreviewBehavior(this.f123970b.p()) == SparkScanPreviewBehavior.PERSISTENT && sparkScanViewState == SparkScanViewState.INACTIVE;
    }

    public static final void k(SparkScanViewPresenter sparkScanViewPresenter) {
        e0 e0Var = sparkScanViewPresenter.f123980l;
        if (e0Var != null) {
            ((f0) e0Var).removeCallbacksAndMessages(null);
        }
    }

    public final void d(boolean z10) {
        if (z10) {
            return;
        }
        this.f123970b.a(SparkScanMiniPreviewSize.REGULAR);
        this.f123974f.b(true);
        this.f123974f.g();
        this.f123974f.m();
    }

    public final void n() {
        this.f123976h.a();
        N();
        int i10 = M.f123961e[this.f123970b.l().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this.f123970b.a(SparkScanMiniPreviewSize.REGULAR);
            this.f123974f.b(true);
            this.f123974f.g();
            this.f123974f.m();
            return;
        }
        this.f123970b.a(SparkScanMiniPreviewSize.EXPANDED);
        this.f123974f.b(true);
        this.f123974f.g();
        this.f123974f.m();
        SparkScanViewState viewState = this.f123979k.getViewState();
        Intrinsics.i(viewState, "getViewState(...)");
        d(viewState);
    }

    public final void f(boolean z10) {
        if (z10) {
            return;
        }
        this.f123970b.a(this.f123972d.getDefaultTorchState());
        if (a((SparkScanViewState) null)) {
            this.f123973e.a(this.f123970b.u(), C13334n.f123861a);
        }
    }

    public static final boolean h(SparkScanViewPresenter sparkScanViewPresenter) {
        return sparkScanViewPresenter.f123970b.y();
    }

    public final void c(boolean z10) {
        this.f123970b.c(z10);
        if (z10) {
            this.f123976h.a();
            e0 e0Var = this.f123980l;
            if (e0Var != null) {
                ((f0) e0Var).removeMessages(2);
            }
            e0 e0Var2 = this.f123980l;
            if (e0Var2 != null) {
                ((f0) e0Var2).removeMessages(1);
            }
            this.f123974f.f();
            this.f123974f.a(((Number) E.f123934l.getValue()).floatValue());
            SparkScanViewState viewState = this.f123979k.getViewState();
            Intrinsics.i(viewState, "getViewState(...)");
            if (viewState == SparkScanViewState.ACTIVE) {
                this.f123971c._disable$scandit_barcode_capture();
                return;
            }
            return;
        }
        N();
        this.f123974f.m();
        this.f123974f.a(((Number) E.f123933k.getValue()).floatValue());
        SparkScanViewState viewState2 = this.f123979k.getViewState();
        Intrinsics.i(viewState2, "getViewState(...)");
        if (viewState2 == SparkScanViewState.ACTIVE) {
            this.f123971c._enable$scandit_barcode_capture();
        }
    }

    public final void b(SparkScanViewState initialState) {
        Intrinsics.j(initialState, "initialState");
        e0 f0Var = this.f123980l;
        if (f0Var == null) {
            f0Var = new f0(this);
        }
        this.f123980l = f0Var;
        this.f123971c.removeListener(this);
        this.f123971c.addListener(this);
        this.f123973e.a(C13335o.f123862a);
        this.f123974f.a((com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.x) this);
        this.f123970b.a(this);
        SparkScanViewState sparkScanViewState = this.f123981m;
        if (sparkScanViewState != null) {
            initialState = sparkScanViewState;
        }
        int i10 = M.f123958b[initialState.ordinal()];
        if (i10 == 1) {
            e0 e0Var = this.f123980l;
            if (e0Var != null) {
                ((f0) e0Var).sendEmptyMessage(9);
            }
        } else if (i10 == 2 || i10 == 3) {
            e0 e0Var2 = this.f123980l;
            if (e0Var2 != null) {
                ((f0) e0Var2).sendEmptyMessage(1);
            }
        } else if (i10 == 4) {
            a(this, false, true, 2);
        } else if (i10 == 5) {
            a(this, SparkScanViewState.INITIAL, false, 6);
        }
        this.f123981m = null;
    }

    public final void a(SparkScanViewUiListener sparkScanViewUiListener) {
        this.f123983o = sparkScanViewUiListener;
    }

    public final void a(boolean z10) {
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            f0 f0Var = (f0) e0Var;
            f0Var.sendMessage(f0Var.obtainMessage(35, Boolean.valueOf(z10)));
        }
    }

    public final void a(String text) {
        Intrinsics.j(text, "text");
        this.f123977i.a(new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.c(text));
    }

    public static void a(SparkScanViewPresenter sparkScanViewPresenter, boolean z10, boolean z11, int i10) {
        EnumC13321a enumC13321a;
        boolean z12 = (i10 & 2) != 0;
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        SparkScanViewState sparkScanViewState = SparkScanViewState.IDLE;
        if (z12) {
            sparkScanViewPresenter.getClass();
            Z z13 = new Z(sparkScanViewPresenter);
            a0 a0Var = a0.f124005a;
            if (sparkScanViewPresenter.a(sparkScanViewState)) {
                sparkScanViewPresenter.f123973e.a(LambdaExtensionsKt.Callback(new b0(sparkScanViewPresenter, a0Var)));
            } else {
                sparkScanViewPresenter.f123973e.a(new c0(z13));
            }
        }
        if (z11) {
            sparkScanViewPresenter.f123979k.forceViewState(sparkScanViewState);
        } else {
            sparkScanViewPresenter.f123979k.setViewState(sparkScanViewState);
        }
        if (z10) {
            enumC13321a = EnumC13321a.f123842c;
        } else if (!z10) {
            enumC13321a = EnumC13321a.f123841b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        sparkScanViewPresenter.f123978j.a(enumC13321a);
        sparkScanViewPresenter.f123977i.a();
    }

    public static final CameraPosition b(SparkScanViewPresenter sparkScanViewPresenter) {
        return sparkScanViewPresenter.f123970b.a();
    }

    static void a(SparkScanViewPresenter sparkScanViewPresenter, SparkScanViewState sparkScanViewState, boolean z10, int i10) {
        boolean z11 = (i10 & 2) != 0;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if (z11) {
            sparkScanViewPresenter.getClass();
            Z z12 = new Z(sparkScanViewPresenter);
            a0 a0Var = a0.f124005a;
            if (sparkScanViewPresenter.a(sparkScanViewState)) {
                sparkScanViewPresenter.f123973e.a(LambdaExtensionsKt.Callback(new b0(sparkScanViewPresenter, a0Var)));
            } else {
                sparkScanViewPresenter.f123973e.a(new c0(z12));
            }
        }
        if (z10) {
            sparkScanViewPresenter.f123979k.forceViewState(sparkScanViewState);
        } else {
            sparkScanViewPresenter.f123979k.setViewState(sparkScanViewState);
        }
    }

    public static final boolean j(SparkScanViewPresenter sparkScanViewPresenter) {
        return SparkScanScanningModeKt.getPreviewBehavior(sparkScanViewPresenter.f123970b.p()) == SparkScanPreviewBehavior.PERSISTENT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Function0 function0) {
        if (Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
            return;
        }
        e0 e0Var = this.f123980l;
        if (e0Var != null) {
            e0Var.post(new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.ui.g0
                @Override // java.lang.Runnable
                public final void run() {
                    SparkScanViewPresenter.b(function0);
                }
            });
        }
    }

    public static final void a(SparkScanViewPresenter sparkScanViewPresenter, SparkScanViewState sparkScanViewState, U u10, U u11) {
        if (sparkScanViewPresenter.a(sparkScanViewState)) {
            sparkScanViewPresenter.f123973e.a(LambdaExtensionsKt.Callback(new b0(sparkScanViewPresenter, u10)));
        } else {
            sparkScanViewPresenter.f123973e.a(new c0(u11));
        }
    }

    public final void a() {
        a(this, SparkScanViewState.ACTIVE, true, 2);
        this.f123978j.a();
        N();
        this.f123977i.a();
        boolean z10 = SparkScanScanningModeKt.getScanningBehavior(this.f123970b.p()) == SparkScanScanningBehavior.SINGLE;
        this.f123974f.l(z10);
        this.f123971c.setSingleScanModeEnabled$scandit_barcode_capture(z10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.InterfaceC13331k
    public final void a(SparkScanScanningMode previousMode, SparkScanScanningMode newMode) {
        Intrinsics.j(previousMode, "previousMode");
        Intrinsics.j(newMode, "newMode");
        if (Intrinsics.e(previousMode.getClass(), newMode.getClass())) {
            return;
        }
        this.f123971c._applyNewSettingsForScanningMode$scandit_barcode_capture(newMode);
    }

    public final void a(SparkScanBarcodeFeedback.Success success) {
        Intrinsics.j(success, "success");
        this.f123976h.a(success.getFeedback());
        this.f123976h.b(success.getVisualFeedbackColor());
    }

    public final void a(SparkScanBarcodeFeedback.Error error) {
        Intrinsics.j(error, "error");
        boolean z10 = error.getResumeCapturingDelay().asMillis() > 0;
        if (z10) {
            a(this, SparkScanViewState.ERROR, false, 6);
            this.f123977i.a(new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.d(error.getMessage()));
            this.f123975g.h();
        }
        this.f123976h.a(error.getFeedback());
        this.f123976h.a(error.getVisualFeedbackColor());
        this.f123974f.a(error.getBrush(), !z10);
    }

    public final void a(Bundle bundle) {
        Intrinsics.j(bundle, "bundle");
        String string = bundle.getString("current_state");
        if (string != null) {
            this.f123981m = SparkScanViewStateDeserializer.fromString(string);
        }
        String string2 = bundle.getString("current_mode");
        if (string2 != null) {
            SparkScanStateManager sparkScanStateManager = this.f123970b;
            Intrinsics.g(string2);
            sparkScanStateManager.a(SparkScanScanningModeDeserializer.fromJson(string2));
        }
        String string3 = bundle.getString("current_torch_state");
        if (string3 != null) {
            SparkScanStateManager sparkScanStateManager2 = this.f123970b;
            Intrinsics.g(string3);
            sparkScanStateManager2.a(TorchStateDeserializer.fromJson(string3));
        }
        this.f123970b.d(bundle.getBoolean("current_zoom_state"));
        String string4 = bundle.getString("current_expanded_state");
        if (string4 != null) {
            SparkScanStateManager sparkScanStateManager3 = this.f123970b;
            Intrinsics.g(string4);
            sparkScanStateManager3.a(SparkScanMiniPreviewSizeDeserializer.fromJson(string4));
        }
        String string5 = bundle.getString("current_camera");
        if (string5 != null) {
            SparkScanStateManager sparkScanStateManager4 = this.f123970b;
            CameraPosition cameraPositionCameraPositionFromJsonString = NativeEnumDeserializer.cameraPositionFromJsonString(string5);
            Intrinsics.i(cameraPositionCameraPositionFromJsonString, "cameraPositionFromJsonString(...)");
            sparkScanStateManager4.a(cameraPositionCameraPositionFromJsonString);
        }
    }

    public static final void a(SparkScanViewPresenter sparkScanViewPresenter, NativeSparkScanToastType nativeSparkScanToastType) {
        com.scandit.datacapture.barcode.internal.module.spark.ui.toast.n gVar;
        switch (M.f123962f[nativeSparkScanToastType.ordinal()]) {
            case 1:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.g();
                break;
            case 2:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.f();
                break;
            case 3:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.b();
                break;
            case 4:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.a();
                break;
            case 5:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.e();
                break;
            case 6:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.l();
                break;
            case 7:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.m();
                break;
            case 8:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.i();
                break;
            case 9:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.h();
                break;
            case 10:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.j();
                break;
            case 11:
                gVar = new com.scandit.datacapture.barcode.internal.module.spark.ui.toast.k();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        sparkScanViewPresenter.f123977i.a(gVar);
    }
}
