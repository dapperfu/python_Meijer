package com.scandit.datacapture.barcode.ar.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArListener;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSession;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotationProvider;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotationTrigger;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArPopoverAnnotation;
import com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArHighlight;
import com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArHighlightProvider;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.ar.feedback.BarcodeArFeedbackEmitter;
import com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Annotation;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Highlight;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.v;
import com.scandit.datacapture.barcode.internal.sdk.ui.InternalPropertyManager;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B5\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R+\u0010E\u001a\u00020=2\u0006\u0010>\u001a\u00020=8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B*\u0004\bC\u0010DR+\u0010L\u001a\u00020F2\u0006\u0010>\u001a\u00020F8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J*\u0004\bK\u0010DR+\u0010P\u001a\u00020=2\u0006\u0010>\u001a\u00020=8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bM\u0010@\"\u0004\bN\u0010B*\u0004\bO\u0010DR+\u0010T\u001a\u00020F2\u0006\u0010>\u001a\u00020F8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010J*\u0004\bS\u0010DR+\u0010X\u001a\u00020=2\u0006\u0010>\u001a\u00020=8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bU\u0010@\"\u0004\bV\u0010B*\u0004\bW\u0010DR+\u0010\\\u001a\u00020F2\u0006\u0010>\u001a\u00020F8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010J*\u0004\b[\u0010D¨\u0006]"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArView;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewGroup;", "parentView", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "barcodeAr", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewSettings;", "settings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettings", "<init>", "(Landroid/view/ViewGroup;Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewSettings;Lcom/scandit/datacapture/core/source/CameraSettings;)V", "", "onResume", "()V", "onPause", "onDestroy", "start", "stop", "reset", "Lcom/scandit/datacapture/core/json/JsonValue;", "jsonValue", "_updateFromJson$scandit_barcode_capture", "(Lcom/scandit/datacapture/core/json/JsonValue;)V", "_updateFromJson", "Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewUiListener;", "k", "Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewUiListener;", "getUiListener", "()Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewUiListener;", "setUiListener", "(Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewUiListener;)V", "uiListener", "Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlightProvider;", "l", "Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlightProvider;", "getHighlightProvider", "()Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlightProvider;", "setHighlightProvider", "(Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlightProvider;)V", "highlightProvider", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationProvider;", "m", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationProvider;", "getAnnotationProvider", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationProvider;", "setAnnotationProvider", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationProvider;)V", "annotationProvider", "Lcom/scandit/datacapture/barcode/internal/sdk/ui/InternalPropertyManager;", "n", "Lcom/scandit/datacapture/barcode/internal/sdk/ui/InternalPropertyManager;", "get_internalPropertyManager", "()Lcom/scandit/datacapture/barcode/internal/sdk/ui/InternalPropertyManager;", "_internalPropertyManager", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "get_dataCaptureView$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/ui/DataCaptureView;", "_dataCaptureView", "", "<set-?>", "getShouldShowTorchControl", "()Z", "setShouldShowTorchControl", "(Z)V", "getShouldShowTorchControl$delegate", "(Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArView;)Ljava/lang/Object;", "shouldShowTorchControl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getTorchControlPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setTorchControlPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "getTorchControlPosition$delegate", "torchControlPosition", "getShouldShowZoomControl", "setShouldShowZoomControl", "getShouldShowZoomControl$delegate", "shouldShowZoomControl", "getZoomControlPosition", "setZoomControlPosition", "getZoomControlPosition$delegate", "zoomControlPosition", "getShouldShowCameraSwitchControl", "setShouldShowCameraSwitchControl", "getShouldShowCameraSwitchControl$delegate", "shouldShowCameraSwitchControl", "getCameraSwitchControlPosition", "setCameraSwitchControlPosition", "getCameraSwitchControlPosition$delegate", "cameraSwitchControlPosition", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes11.dex */
public final class BarcodeArView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeAr f120133a;

    /* renamed from: b, reason: collision with root package name */
    private final BarcodeArViewSettings f120134b;

    /* renamed from: c, reason: collision with root package name */
    private final Camera f120135c;

    /* renamed from: d, reason: collision with root package name */
    private final DataCaptureContext f120136d;

    /* renamed from: e, reason: collision with root package name */
    private final DataCaptureView f120137e;

    /* renamed from: f, reason: collision with root package name */
    private final NativeBarcodeArView f120138f;

    /* renamed from: g, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.shared.c f120139g;

    /* renamed from: h, reason: collision with root package name */
    private final v f120140h;

    /* renamed from: i, reason: collision with root package name */
    private final BarcodeArView$arListener$1 f120141i;

    /* renamed from: j, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.ar.ui.d f120142j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private BarcodeArViewUiListener uiListener;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private BarcodeArHighlightProvider highlightProvider;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private BarcodeArAnnotationProvider annotationProvider;

    /* renamed from: n, reason: collision with root package name */
    private final BarcodeArView$_internalPropertyManager$1 f120146n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BarcodeArView(ViewGroup parentView, BarcodeAr barcodeAr, DataCaptureContext dataCaptureContext, BarcodeArViewSettings settings) {
        this(parentView, barcodeAr, dataCaptureContext, settings, null, 16, null);
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(barcodeAr, "barcodeAr");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(settings, "settings");
    }

    public static final void access$_releaseScanning(BarcodeArView barcodeArView) {
        synchronized (barcodeArView) {
            try {
                BarcodeArFeedbackEmitter feedbackEmitter$scandit_barcode_capture = barcodeArView.f120133a.getFeedbackEmitter$scandit_barcode_capture();
                if (feedbackEmitter$scandit_barcode_capture != null) {
                    feedbackEmitter$scandit_barcode_capture.a();
                }
                barcodeArView.f120133a.removeListener(barcodeArView.f120141i);
                barcodeArView.f120133a.getBarcodeArInternal().h();
                barcodeArView.f120136d.removeMode(barcodeArView.f120133a.getBarcodeArInternal());
                barcodeArView.f120140h.f121261n.set(false);
                barcodeArView.f120140h.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void access$_resetScanning(BarcodeArView barcodeArView) {
        synchronized (barcodeArView) {
            barcodeArView.f120140h.a();
        }
    }

    public static final void access$_startScanning(BarcodeArView barcodeArView) {
        synchronized (barcodeArView) {
            try {
                BarcodeArFeedbackEmitter feedbackEmitter$scandit_barcode_capture = barcodeArView.f120133a.getFeedbackEmitter$scandit_barcode_capture();
                if (feedbackEmitter$scandit_barcode_capture != null) {
                    feedbackEmitter$scandit_barcode_capture.c();
                }
                barcodeArView.f120133a.addListener(barcodeArView.f120141i);
                barcodeArView.f120136d.setMode(barcodeArView.f120133a.getBarcodeArInternal());
                barcodeArView.f120133a.getBarcodeArInternal().g();
                barcodeArView.f120140h.f121261n.set(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void access$_stopScanning(BarcodeArView barcodeArView) {
        synchronized (barcodeArView) {
            try {
                BarcodeArFeedbackEmitter feedbackEmitter$scandit_barcode_capture = barcodeArView.f120133a.getFeedbackEmitter$scandit_barcode_capture();
                if (feedbackEmitter$scandit_barcode_capture != null) {
                    feedbackEmitter$scandit_barcode_capture.a();
                }
                barcodeArView.f120133a.getBarcodeArInternal().f();
                barcodeArView.f120140h.f121261n.set(false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ BarcodeArView(ViewGroup viewGroup, BarcodeAr barcodeAr, DataCaptureContext dataCaptureContext, BarcodeArViewSettings barcodeArViewSettings, CameraSettings cameraSettings, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, barcodeAr, dataCaptureContext, barcodeArViewSettings, (i10 & 16) != 0 ? null : cameraSettings);
    }

    public static final void access$onAnnotationOrElementTap(BarcodeArView barcodeArView, TrackedBarcode trackedBarcode, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation) {
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation2;
        v vVar = barcodeArView.f120140h;
        int identifier = trackedBarcode.getIdentifier();
        ReentrantReadWriteLock.ReadLock lock = vVar.f121258k.readLock();
        lock.lock();
        try {
            com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.a aVar = (com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.a) vVar.f121260m.get(Integer.valueOf(identifier));
            if (aVar != null && (barcodeArAugmentation$Annotation2 = aVar.f121199e) != null && (barcodeArAugmentation$Annotation2.a() instanceof BarcodeArPopoverAnnotation)) {
                vVar.f121257j.runOnMainThread(new com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.l(vVar, barcodeArAugmentation$Annotation2, aVar.f121198d));
            }
            BarcodeArFeedbackEmitter feedbackEmitter$scandit_barcode_capture = barcodeArView.f120133a.getFeedbackEmitter$scandit_barcode_capture();
            if (feedbackEmitter$scandit_barcode_capture != null) {
                feedbackEmitter$scandit_barcode_capture.b();
            }
        } finally {
            lock.unlock();
        }
    }

    public static final void access$onHighlightTap(BarcodeArView barcodeArView, TrackedBarcode trackedBarcode, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation;
        v vVar = barcodeArView.f120140h;
        int identifier = trackedBarcode.getIdentifier();
        ReentrantReadWriteLock.ReadLock lock = vVar.f121258k.readLock();
        lock.lock();
        try {
            com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.a aVar = (com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.a) vVar.f121260m.get(Integer.valueOf(identifier));
            if (aVar != null && (barcodeArAugmentation$Annotation = aVar.f121199e) != null) {
                BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight2 = aVar.f121198d;
                BarcodeArAnnotationTrigger annotationTrigger = barcodeArAugmentation$Annotation.a().getAnnotationTrigger();
                Intrinsics.j(annotationTrigger, "<this>");
                int i10 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.c.f121083a[annotationTrigger.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar.f121257j.runOnMainThread(new com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.s(barcodeArAugmentation$Annotation, vVar, barcodeArAugmentation$Highlight2, aVar));
            }
            BarcodeArFeedbackEmitter feedbackEmitter$scandit_barcode_capture = barcodeArView.f120133a.getFeedbackEmitter$scandit_barcode_capture();
            if (feedbackEmitter$scandit_barcode_capture != null) {
                feedbackEmitter$scandit_barcode_capture.b();
            }
            BarcodeArViewUiListener barcodeArViewUiListener = barcodeArView.uiListener;
            if (barcodeArViewUiListener != null) {
                barcodeArViewUiListener.onHighlightForBarcodeTapped(barcodeArView.f120133a, trackedBarcode.getBarcode(), barcodeArAugmentation$Highlight.a(), barcodeArAugmentation$Highlight.b());
            }
        } finally {
            lock.unlock();
        }
    }

    public static final boolean access$onOverlayTap(BarcodeArView barcodeArView) {
        v vVar = barcodeArView.f120140h;
        boolean z10 = vVar.f121262o > 0;
        Iterator it = vVar.b().iterator();
        while (it.hasNext()) {
            com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.a aVar = (com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.a) it.next();
            BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar.f121199e;
            if (barcodeArAugmentation$Annotation != null) {
                vVar.a(barcodeArAugmentation$Annotation, aVar.f121198d);
            }
        }
        return z10;
    }

    public static final void access$requestAnnotation(BarcodeArView barcodeArView, Barcode barcode, final Function1 function1) {
        BarcodeArAnnotationProvider barcodeArAnnotationProvider = barcodeArView.annotationProvider;
        if (barcodeArAnnotationProvider != null) {
            Context context = barcodeArView.getContext();
            Intrinsics.i(context, "getContext(...)");
            barcodeArAnnotationProvider.annotationForBarcode(context, barcode, new BarcodeArAnnotationProvider.Callback() { // from class: com.scandit.datacapture.barcode.ar.ui.BarcodeArView$requestAnnotation$1
                @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotationProvider.Callback
                public void onData(BarcodeArAnnotation annotation) {
                    function1.invoke(annotation);
                }
            });
        }
    }

    public static final void access$requestHighlight(BarcodeArView barcodeArView, Barcode barcode, final Function1 function1) {
        BarcodeArHighlightProvider barcodeArHighlightProvider = barcodeArView.highlightProvider;
        if (barcodeArHighlightProvider == null) {
            BarcodeArHighlightProvider.Companion companion = BarcodeArHighlightProvider.INSTANCE;
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.ar.ui.highlight.c.f121190a;
            Intrinsics.j(companion, "<this>");
            barcodeArHighlightProvider = (BarcodeArHighlightProvider) com.scandit.datacapture.barcode.internal.module.ar.ui.highlight.c.f121190a.getValue();
        }
        Context context = barcodeArView.getContext();
        Intrinsics.i(context, "getContext(...)");
        barcodeArHighlightProvider.highlightForBarcode(context, barcode, new BarcodeArHighlightProvider.Callback() { // from class: com.scandit.datacapture.barcode.ar.ui.BarcodeArView$requestHighlight$1
            @Override // com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArHighlightProvider.Callback
            public void onData(BarcodeArHighlight highlight) {
                function1.invoke(highlight);
            }
        });
    }

    public final void _updateFromJson$scandit_barcode_capture(JsonValue jsonValue) {
        Intrinsics.j(jsonValue, "jsonValue");
        this.f120138f.updateFromJson(jsonValue.getF125830a());
        com.scandit.datacapture.barcode.internal.module.ar.ui.d dVar = this.f120142j;
        dVar.b();
        dVar.c();
        dVar.a();
    }

    public final BarcodeArAnnotationProvider getAnnotationProvider() {
        return this.annotationProvider;
    }

    public final Anchor getCameraSwitchControlPosition() {
        Anchor cameraSwitchControlPosition = this.f120142j.f121184a.getCameraSwitchControlPosition();
        Intrinsics.i(cameraSwitchControlPosition, "getCameraSwitchControlPosition(...)");
        return cameraSwitchControlPosition;
    }

    public final BarcodeArHighlightProvider getHighlightProvider() {
        return this.highlightProvider;
    }

    public final boolean getShouldShowCameraSwitchControl() {
        return this.f120142j.f121184a.getShouldShowCameraSwitchControl();
    }

    public final boolean getShouldShowTorchControl() {
        return this.f120142j.f121184a.getShouldShowTorchControl();
    }

    public final boolean getShouldShowZoomControl() {
        return this.f120142j.f121184a.getShouldShowZoomControl();
    }

    public final Anchor getTorchControlPosition() {
        Anchor torchControlPosition = this.f120142j.f121184a.getTorchControlPosition();
        Intrinsics.i(torchControlPosition, "getTorchControlPosition(...)");
        return torchControlPosition;
    }

    public final BarcodeArViewUiListener getUiListener() {
        return this.uiListener;
    }

    public final Anchor getZoomControlPosition() {
        Anchor zoomControlPosition = this.f120142j.f121184a.getZoomControlPosition();
        Intrinsics.i(zoomControlPosition, "getZoomControlPosition(...)");
        return zoomControlPosition;
    }

    /* renamed from: get_dataCaptureView$scandit_barcode_capture, reason: from getter */
    public final /* synthetic */ DataCaptureView getF120137e() {
        return this.f120137e;
    }

    public final InternalPropertyManager get_internalPropertyManager() {
        return this.f120146n;
    }

    public final void onDestroy() {
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this.f120139g;
        synchronized (cVar) {
            try {
                com.scandit.datacapture.barcode.internal.module.shared.a aVarB = cVar.b();
                com.scandit.datacapture.barcode.internal.module.shared.a aVar = com.scandit.datacapture.barcode.internal.module.shared.a.f122817d;
                if (aVarB == aVar) {
                    return;
                }
                cVar.f122829f = aVar;
                com.scandit.datacapture.barcode.internal.module.shared.b bVarC = cVar.c();
                bVarC.getClass();
                if (bVarC == com.scandit.datacapture.barcode.internal.module.shared.b.f122820b) {
                    cVar.e();
                }
                cVar.f122827d.invoke();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onPause() {
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this.f120139g;
        synchronized (cVar) {
            com.scandit.datacapture.barcode.internal.module.shared.a aVarB = cVar.b();
            com.scandit.datacapture.barcode.internal.module.shared.a aVar = com.scandit.datacapture.barcode.internal.module.shared.a.f122816c;
            if (aVarB == aVar) {
                return;
            }
            cVar.f122829f = aVar;
            com.scandit.datacapture.barcode.internal.module.shared.b bVarC = cVar.c();
            bVarC.getClass();
            if (bVarC == com.scandit.datacapture.barcode.internal.module.shared.b.f122820b) {
                cVar.f122825b.invoke();
            }
        }
    }

    public final void onResume() {
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this.f120139g;
        synchronized (cVar) {
            com.scandit.datacapture.barcode.internal.module.shared.a aVarB = cVar.b();
            com.scandit.datacapture.barcode.internal.module.shared.a aVar = com.scandit.datacapture.barcode.internal.module.shared.a.f122815b;
            if (aVarB == aVar) {
                return;
            }
            cVar.f122829f = aVar;
            com.scandit.datacapture.barcode.internal.module.shared.b bVarC = cVar.c();
            bVarC.getClass();
            if (bVarC == com.scandit.datacapture.barcode.internal.module.shared.b.f122820b) {
                cVar.f122824a.invoke();
            }
        }
    }

    public final void reset() {
        com.scandit.datacapture.barcode.internal.module.shared.c cVar = this.f120139g;
        synchronized (cVar) {
            cVar.f122828e.invoke();
        }
    }

    public final void setAnnotationProvider(BarcodeArAnnotationProvider barcodeArAnnotationProvider) {
        this.annotationProvider = barcodeArAnnotationProvider;
    }

    public final void setCameraSwitchControlPosition(Anchor value) {
        Intrinsics.j(value, "<set-?>");
        com.scandit.datacapture.barcode.internal.module.ar.ui.d dVar = this.f120142j;
        dVar.getClass();
        Intrinsics.j(value, "value");
        dVar.f121184a.setCameraSwitchControlPosition(value);
        dVar.a();
    }

    public final void setHighlightProvider(BarcodeArHighlightProvider barcodeArHighlightProvider) {
        this.highlightProvider = barcodeArHighlightProvider;
    }

    public final void setShouldShowCameraSwitchControl(boolean z10) {
        com.scandit.datacapture.barcode.internal.module.ar.ui.d dVar = this.f120142j;
        dVar.f121184a.setShouldShowCameraSwitchControl(z10);
        dVar.a();
    }

    public final void setShouldShowTorchControl(boolean z10) {
        com.scandit.datacapture.barcode.internal.module.ar.ui.d dVar = this.f120142j;
        dVar.f121184a.setShouldShowTorchControl(z10);
        dVar.b();
    }

    public final void setShouldShowZoomControl(boolean z10) {
        com.scandit.datacapture.barcode.internal.module.ar.ui.d dVar = this.f120142j;
        dVar.f121184a.setShouldShowZoomControl(z10);
        dVar.c();
    }

    public final void setTorchControlPosition(Anchor value) {
        Intrinsics.j(value, "<set-?>");
        com.scandit.datacapture.barcode.internal.module.ar.ui.d dVar = this.f120142j;
        dVar.getClass();
        Intrinsics.j(value, "value");
        dVar.f121184a.setTorchControlPosition(value);
        dVar.b();
    }

    public final void setUiListener(BarcodeArViewUiListener barcodeArViewUiListener) {
        this.uiListener = barcodeArViewUiListener;
    }

    public final void setZoomControlPosition(Anchor value) {
        Intrinsics.j(value, "<set-?>");
        com.scandit.datacapture.barcode.internal.module.ar.ui.d dVar = this.f120142j;
        dVar.getClass();
        Intrinsics.j(value, "value");
        dVar.f121184a.setZoomControlPosition(value);
        dVar.c();
    }

    public final void start() {
        this.f120139g.d();
    }

    public final void stop() {
        this.f120139g.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.scandit.datacapture.barcode.ar.ui.BarcodeArView$arListener$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.scandit.datacapture.barcode.ar.ui.BarcodeArView$_internalPropertyManager$1] */
    @JvmOverloads
    public BarcodeArView(ViewGroup parentView, BarcodeAr barcodeAr, DataCaptureContext dataCaptureContext, BarcodeArViewSettings settings, CameraSettings cameraSettings) {
        super(parentView.getContext());
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(barcodeAr, "barcodeAr");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(settings, "settings");
        BarcodeArViewSettings barcodeArViewSettingsClone$scandit_barcode_capture = settings.clone$scandit_barcode_capture();
        Camera camera = Camera.INSTANCE.getCamera(settings.getDefaultCameraPosition(), cameraSettings == null ? BarcodeAr.INSTANCE.createRecommendedCameraSettings() : cameraSettings);
        DataCaptureView.Companion companion = DataCaptureView.INSTANCE;
        Context context = parentView.getContext();
        Intrinsics.i(context, "getContext(...)");
        DataCaptureView dataCaptureView = companion.newInstance(context, dataCaptureContext);
        NativeBarcodeArView impl = NativeBarcodeArView.create();
        Intrinsics.i(impl, "create(...)");
        this.f120133a = barcodeAr;
        this.f120134b = barcodeArViewSettingsClone$scandit_barcode_capture;
        this.f120135c = camera;
        this.f120136d = dataCaptureContext;
        this.f120137e = dataCaptureView;
        this.f120138f = impl;
        MainThreadHelper mainThreadHelper = new MainThreadHelper();
        e onStartScanning = new e(this);
        f onStopScanning = new f(this);
        g onFreezeScanning = g.f120377a;
        h onReleaseScanning = new h(this);
        i onResetScanning = new i(this);
        com.scandit.datacapture.barcode.internal.module.shared.b initialScanState = com.scandit.datacapture.barcode.internal.module.shared.b.f122820b;
        Intrinsics.j(onStartScanning, "onStartScanning");
        Intrinsics.j(onStopScanning, "onStopScanning");
        Intrinsics.j(onFreezeScanning, "onFreezeScanning");
        Intrinsics.j(onReleaseScanning, "onReleaseScanning");
        Intrinsics.j(onResetScanning, "onResetScanning");
        Intrinsics.j(initialScanState, "initialScanState");
        this.f120139g = new com.scandit.datacapture.barcode.internal.module.shared.c(onStartScanning, onStopScanning, onFreezeScanning, onReleaseScanning, onResetScanning, initialScanState);
        Context context2 = getContext();
        Intrinsics.i(context2, "getContext(...)");
        b onHighlightTap = new b(this);
        c onAnnotationOrElementTap = new c(this);
        d onOverlayTap = new d(this);
        Intrinsics.j(context2, "context");
        Intrinsics.j(onHighlightTap, "onHighlightTap");
        Intrinsics.j(onAnnotationOrElementTap, "onAnnotationOrElementTap");
        Intrinsics.j(onOverlayTap, "onOverlayTap");
        com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i iVar = new com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i(context2, onHighlightTap, onAnnotationOrElementTap, onOverlayTap);
        l highlightRequester = new l(this);
        m annotationRequestor = new m(this);
        n quadrilateralMapper = new n(dataCaptureView);
        Intrinsics.j(highlightRequester, "highlightRequester");
        Intrinsics.j(annotationRequestor, "annotationRequestor");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.e augmentationDataFactory = new com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.e(highlightRequester, annotationRequestor, quadrilateralMapper);
        o addHighlight = new o(iVar);
        p updateHighlight = new p(iVar);
        q removeHighlight = new q(iVar);
        r addAnnotation = new r(iVar);
        s updateAnnotation = new s(iVar);
        t removeAnnotation = new t(iVar);
        j showScrim = new j(iVar);
        k hideScrim = new k(iVar);
        Intrinsics.j(augmentationDataFactory, "augmentationDataFactory");
        Intrinsics.j(addHighlight, "addHighlight");
        Intrinsics.j(updateHighlight, "updateHighlight");
        Intrinsics.j(removeHighlight, "removeHighlight");
        Intrinsics.j(addAnnotation, "addAnnotation");
        Intrinsics.j(updateAnnotation, "updateAnnotation");
        Intrinsics.j(removeAnnotation, "removeAnnotation");
        Intrinsics.j(showScrim, "showScrim");
        Intrinsics.j(hideScrim, "hideScrim");
        Intrinsics.j(mainThreadHelper, "mainThreadHelper");
        this.f120140h = new v(augmentationDataFactory, addHighlight, updateHighlight, removeHighlight, addAnnotation, updateAnnotation, removeAnnotation, showScrim, hideScrim, mainThreadHelper);
        this.f120141i = new BarcodeArListener() { // from class: com.scandit.datacapture.barcode.ar.ui.BarcodeArView$arListener$1
            @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
            public void onSessionUpdated(BarcodeAr barcodeAr2, BarcodeArSession session, FrameData frameData) {
                Intrinsics.j(barcodeAr2, "barcodeAr");
                Intrinsics.j(session, "session");
                Intrinsics.j(frameData, "frameData");
                this.f120148a.f120140h.a(session);
            }

            @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
            @ProxyFunction
            public void onObservationStarted(BarcodeAr barcodeAr2) {
                BarcodeArListener.DefaultImpls.onObservationStarted(this, barcodeAr2);
            }

            @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
            @ProxyFunction
            public void onObservationStopped(BarcodeAr barcodeAr2) {
                BarcodeArListener.DefaultImpls.onObservationStopped(this, barcodeAr2);
            }
        };
        a cameraSwitchControlBuilder = new a(this);
        Intrinsics.j(impl, "impl");
        Intrinsics.j(dataCaptureView, "dataCaptureView");
        Intrinsics.j(cameraSwitchControlBuilder, "cameraSwitchControlBuilder");
        this.f120142j = new com.scandit.datacapture.barcode.internal.module.ar.ui.d(impl, dataCaptureView, cameraSwitchControlBuilder);
        this.f120146n = new InternalPropertyManager() { // from class: com.scandit.datacapture.barcode.ar.ui.BarcodeArView$_internalPropertyManager$1
            @Override // com.scandit.datacapture.barcode.internal.sdk.ui.InternalPropertyManager
            public void _setProperty(String key, Object value) {
                Intrinsics.j(key, "key");
                Intrinsics.j(value, "value");
                if (Intrinsics.e(key, "add_overlay") && (value instanceof DataCaptureOverlay)) {
                    this.f120147a.f120137e.addOverlay((DataCaptureOverlay) value);
                } else if (Intrinsics.e(key, "remove_overlay") && (value instanceof DataCaptureOverlay)) {
                    this.f120147a.f120137e.removeOverlay((DataCaptureOverlay) value);
                }
            }
        };
        if (camera == null) {
            FS.log_w("ScanditDataCapture", "Barcode ar view initialized with \"null\" camera");
        }
        DataCaptureContext.setFrameSource$default(dataCaptureContext, camera, null, 2, null);
        barcodeAr.setFeedbackEmitter$scandit_barcode_capture(new BarcodeArFeedbackEmitter(barcodeAr, barcodeArViewSettingsClone$scandit_barcode_capture.getSoundEnabled(), barcodeArViewSettingsClone$scandit_barcode_capture.getHapticEnabled()));
        ViewParent parent = dataCaptureView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(dataCaptureView);
        }
        parentView.addView(this, -1, -1);
        addView(dataCaptureView, -1, -1);
        dataCaptureView.addOverlay(iVar);
    }
}
