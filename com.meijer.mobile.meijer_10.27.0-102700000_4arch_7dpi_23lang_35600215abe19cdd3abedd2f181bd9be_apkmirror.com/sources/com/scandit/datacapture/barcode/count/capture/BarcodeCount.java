package com.scandit.datacapture.barcode.count.capture;

import androidx.annotation.Keep;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureList;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListener;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListListenerReversedAdapter;
import com.scandit.datacapture.barcode.count.feedback.BarcodeCountFeedback;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusListener;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProvider;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.data.ClusteringMode;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u0002:\u0006\u008a\u0001\u008b\u0001\u008c\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u001fH\u0000¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020\u0010¢\u0006\u0004\b(\u0010\u001aJ\r\u0010)\u001a\u00020\u0010¢\u0006\u0004\b)\u0010\u001aJ\u0015\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b.\u0010-J\u0017\u00102\u001a\u00020\u00102\u0006\u0010+\u001a\u00020/H\u0000¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00102\u0006\u0010+\u001a\u00020/H\u0000¢\u0006\u0004\b3\u00101J\r\u00105\u001a\u00020\u0005¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0010¢\u0006\u0004\b7\u0010\u001aJ#\u00107\u001a\u00020\u00102\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001008H\u0000¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0010¢\u0006\u0004\b;\u0010\u001aJ\r\u0010<\u001a\u00020\u0010¢\u0006\u0004\b<\u0010\u001aJ\u0015\u0010=\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b=\u0010\u0012J\u000f\u0010?\u001a\u00020\u0013H\u0000¢\u0006\u0004\b>\u0010\u0015J\u000f\u0010C\u001a\u00020@H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010H\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010L\u001a\u00020\u00102\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I¢\u0006\u0004\bL\u0010MJ\u0017\u0010R\u001a\u00020\u00102\u0006\u0010O\u001a\u00020NH\u0000¢\u0006\u0004\bP\u0010QJ\u0017\u0010W\u001a\u00020\u00102\u0006\u0010T\u001a\u00020SH\u0000¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u00020\u00102\u0006\u0010T\u001a\u00020SH\u0000¢\u0006\u0004\bX\u0010VR \u0010_\u001a\b\u0012\u0004\u0012\u00020*0Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R \u0010b\u001a\b\u0012\u0004\u0012\u00020/0Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010\\\u001a\u0004\ba\u0010^R \u0010f\u001a\b\u0012\u0004\u0012\u00020c0Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010\\\u001a\u0004\be\u0010^R\u0018\u0010g\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010hR*\u0010q\u001a\u00020i2\u0006\u0010j\u001a\u00020i8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010y\u001a\u0004\u0018\u00010r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010{\u001a\u00020\u00132\u0006\u0010z\u001a\u00020\u00138W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b{\u0010\u0015\"\u0004\b|\u0010}R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0081\u0001\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0015R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "impl", "Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountSession;", "session", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountSession;)V", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "list", "", "_setBarcodeCountCaptureList", "(Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;)V", "", "_shouldDisableModeWhenCaptureListCompleted", "()Z", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditor;", "beginClusterEditing", "()Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditor;", "clearAdditionalBarcodes", "()V", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_setDataCaptureContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "settings", "Ljava/lang/Runnable;", "whenDone", "applySettings", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;Ljava/lang/Runnable;)V", "_getSettings$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "_getSettings", "startScanningPhase", "reset", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountListener;", "listener", "addListener", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountListener;)V", "removeListener", "Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountListener;", "addInternalListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountListener;)V", "addInternalListener", "removeInternalListener$scandit_barcode_capture", "removeInternalListener", "_session", "()Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountSession;", "endScanningPhase", "Lkotlin/Function1;", "endScanningPhase$scandit_barcode_capture", "(Lkotlin/jvm/functions/Function1;)V", "_stopImuDataStream", "_enableImuDataIfNeeded", "setBarcodeCountCaptureList", "isCaptureListSet$scandit_barcode_capture", "isCaptureListSet", "", "getCaptureListTargetQuantity$scandit_barcode_capture", "()I", "getCaptureListTargetQuantity", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusListener;", "viewHandler", "_setStatusListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusListener;)V", "_setStatusListener", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "additionalBarcodes", "setAdditionalBarcodes", "(Ljava/util/List;)V", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProvider;", "statusProvider", "setInternalStatusProvider$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProvider;)V", "setInternalStatusProvider", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "trackedBarcode", "didAcceptNotInListBarcode$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;)V", "didAcceptNotInListBarcode", "didRejectNotInListBarcode$scandit_barcode_capture", "didRejectNotInListBarcode", "Ljava/util/concurrent/CopyOnWriteArrayList;", "e", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$scandit_barcode_capture", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "f", "getInternalListeners$scandit_barcode_capture", "internalListeners", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListListener;", "g", "getListListeners$scandit_barcode_capture", "listListeners", "captureList", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "value", "h", "Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "getFeedback", "()Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "setFeedback", "(Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;)V", "feedback", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountFeedbackChangeListener;", "i", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountFeedbackChangeListener;", "getFeedbackChangeListener$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountFeedbackChangeListener;", "setFeedbackChangeListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountFeedbackChangeListener;)V", "feedbackChangeListener", "<set-?>", "isEnabled", "setEnabled", "(Z)V", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getTriggerAutoFocusOnShutter$scandit_barcode_capture", "triggerAutoFocusOnShutter", "", "getTriggerAutoFocusDelay$scandit_barcode_capture", "()J", "triggerAutoFocusDelay", "Lcom/scandit/datacapture/core/data/ClusteringMode;", "getClusteringMode$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/data/ClusteringMode;", "clusteringMode", "Companion", "com/scandit/datacapture/barcode/count/capture/f", "com/scandit/datacapture/barcode/count/capture/g", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeCount implements DataCaptureMode, BarcodeCountProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final InternalBarcodeCountSession f120599a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodeCountProxyAdapter f120600b;

    /* renamed from: c, reason: collision with root package name */
    private DataCaptureContext f120601c;

    @Keep
    private BarcodeCountCaptureList captureList;

    /* renamed from: d, reason: collision with root package name */
    private BarcodeCountSettings f120602d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList listeners;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList internalListeners;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList listListeners;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private BarcodeCountFeedback feedback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private BarcodeCountFeedbackChangeListener feedbackChangeListener;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount$Companion;", "", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "()Lcom/scandit/datacapture/core/source/CameraSettings;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "settings", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "forDataCaptureContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;)Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final CameraSettings createRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.NONE);
            cameraSettings.setPreferredResolution(VideoResolution.UHD4K);
            cameraSettings.setZoomGestureZoomFactor(1.0f);
            cameraSettings.setProperty("closestResolutionTo12MPForFourToThreeAspectRatio", Boolean.TRUE);
            cameraSettings.setProperty("exposureTargetBias", -1);
            cameraSettings.setProperty("api", 2);
            cameraSettings.setProperty("focusStrategy", "forceContinuous");
            return cameraSettings;
        }

        @JvmStatic
        public final BarcodeCount forDataCaptureContext(DataCaptureContext dataCaptureContext, BarcodeCountSettings settings) {
            Intrinsics.j(settings, "settings");
            BarcodeCount barcodeCount = new BarcodeCount(dataCaptureContext, settings, null);
            ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(BarcodeCount.class), null, barcodeCount, new b(barcodeCount));
            if (dataCaptureContext != null) {
                dataCaptureContext.setMode(barcodeCount);
            }
            return barcodeCount;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeCount(NativeBarcodeCount impl, InternalBarcodeCountSession session) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(session, "session");
        this.f120599a = session;
        this.f120600b = new BarcodeCountProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.f120602d = new BarcodeCountSettings();
        this.listeners = new CopyOnWriteArrayList();
        this.internalListeners = new CopyOnWriteArrayList();
        this.listListeners = new CopyOnWriteArrayList();
        impl.addListenerAsync(new com.scandit.datacapture.barcode.internal.module.count.capture.k(new f(this), this), 1);
        BarcodeCountFeedback barcodeCountFeedbackDefaultFeedback = BarcodeCountFeedback.INSTANCE.defaultFeedback();
        getF120611a().setSuccessFeedback(new BarcodeCount$setNativeFeedback$1(barcodeCountFeedbackDefaultFeedback));
        getF120611a().setUnrecognizedFeedback(new BarcodeCount$setNativeFeedback$2(barcodeCountFeedbackDefaultFeedback));
        getF120611a().setFailureFeedback(new BarcodeCount$setNativeFeedback$3(barcodeCountFeedbackDefaultFeedback));
        this.feedback = barcodeCountFeedbackDefaultFeedback;
    }

    @JvmStatic
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    @JvmStatic
    public static final BarcodeCount forDataCaptureContext(DataCaptureContext dataCaptureContext, BarcodeCountSettings barcodeCountSettings) {
        return INSTANCE.forDataCaptureContext(dataCaptureContext, barcodeCountSettings);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @NativeImpl
    /* renamed from: _dataCaptureModeImpl */
    public NativeDataCaptureMode getF120428c() {
        return this.f120600b.getF120613c();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeCount getF120611a() {
        return this.f120600b.getF120611a();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @ProxyFunction(nativeName = "setBarcodeCountCaptureList")
    public void _setBarcodeCountCaptureList(BarcodeCountCaptureList list) {
        Intrinsics.j(list, "list");
        this.f120600b._setBarcodeCountCaptureList(list);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @ProxyFunction(nativeName = "shouldDisableModeWhenCaptureListCompleted")
    public boolean _shouldDisableModeWhenCaptureListCompleted() {
        return this.f120600b._shouldDisableModeWhenCaptureListCompleted();
    }

    @JvmOverloads
    public final void applySettings(BarcodeCountSettings settings) {
        Intrinsics.j(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @ProxyFunction
    public BarcodeClusterEditor beginClusterEditing() {
        return this.f120600b.beginClusterEditing();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeCountProxy
    @ProxyFunction(nativeName = "clearAdditionalBarcodes")
    public void clearAdditionalBarcodes() {
        this.f120600b.clearAdditionalBarcodes();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.f120600b.isEnabled();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z10) {
        this.f120600b.setEnabled(z10);
    }

    public static /* synthetic */ void applySettings$default(BarcodeCount barcodeCount, BarcodeCountSettings barcodeCountSettings, Runnable runnable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            runnable = null;
        }
        barcodeCount.applySettings(barcodeCountSettings, runnable);
    }

    public final void _enableImuDataIfNeeded() {
        DataCaptureContext dataCaptureContext;
        DataCaptureContext dataCaptureContext2 = this.f120601c;
        if ((dataCaptureContext2 == null || dataCaptureContext2._isCameraTimestampsRealtime()) && (dataCaptureContext = this.f120601c) != null) {
            Object property = this.f120602d.getProperty(BarcodeCountSettings.PROPERTY_USE_IMU_DATA);
            Intrinsics.h(property, "null cannot be cast to non-null type kotlin.Boolean");
            dataCaptureContext._setShouldUseImuData(((Boolean) property).booleanValue());
        }
    }

    /* renamed from: _getSettings$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountSettings getF120602d() {
        return this.f120602d;
    }

    /* renamed from: _session, reason: from getter */
    public final InternalBarcodeCountSession getF120599a() {
        return this.f120599a;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        this.f120601c = dataCaptureContext;
        _enableImuDataIfNeeded();
    }

    public final void _setStatusListener$scandit_barcode_capture(NativeBarcodeCountStatusListener viewHandler) {
        Intrinsics.j(viewHandler, "viewHandler");
        getF120611a().setStatusListener(viewHandler);
    }

    public final void addInternalListener$scandit_barcode_capture(InternalBarcodeCountListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.internalListeners.contains(listener)) {
            return;
        }
        this.internalListeners.add(listener);
        listener.onObservationStarted(this);
    }

    public final void addListener(BarcodeCountListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
        listener.onObservationStarted(this);
    }

    @JvmOverloads
    public final void applySettings(BarcodeCountSettings settings, Runnable whenDone) {
        Intrinsics.j(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = getF120611a().applySettingsWrapped(settings._impl());
        Intrinsics.i(nativeWrappedFutureApplySettingsWrapped, "applySettingsWrapped(...)");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, whenDone);
        this.f120602d = settings;
        _enableImuDataIfNeeded();
    }

    public final void didAcceptNotInListBarcode$scandit_barcode_capture(TrackedBarcode trackedBarcode) {
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        getF120611a().didAcceptNotInListBarcode(trackedBarcode.getF120470a());
    }

    public final void didRejectNotInListBarcode$scandit_barcode_capture(TrackedBarcode trackedBarcode) {
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        getF120611a().didRejectNotInListBarcode(trackedBarcode.getF120470a());
    }

    public final void endScanningPhase() {
        endScanningPhase$scandit_barcode_capture(h.f120638a);
    }

    public final void endScanningPhase$scandit_barcode_capture(Function1<? super Boolean, Unit> whenDone) {
        FrameSource frameSource;
        Intrinsics.j(whenDone, "whenDone");
        setEnabled(false);
        DataCaptureContext f120601c = getF123746c();
        if (f120601c != null && (frameSource = f120601c.get_frameSource()) != null) {
            frameSource.switchToDesiredState(FrameSourceState.OFF, LambdaExtensionsKt.Callback(whenDone));
        }
        _stopImuDataStream();
    }

    public final int getCaptureListTargetQuantity$scandit_barcode_capture() {
        BarcodeCountCaptureList barcodeCountCaptureList = this.captureList;
        if (barcodeCountCaptureList != null) {
            return barcodeCountCaptureList.getTargetBarcodesQuantity$scandit_barcode_capture();
        }
        return 0;
    }

    public final ClusteringMode getClusteringMode$scandit_barcode_capture() {
        return this.f120602d.getClusteringMode();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext, reason: from getter */
    public DataCaptureContext getF123746c() {
        return this.f120601c;
    }

    public final BarcodeCountFeedback getFeedback() {
        return this.feedback;
    }

    /* renamed from: getFeedbackChangeListener$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountFeedbackChangeListener getFeedbackChangeListener() {
        return this.feedbackChangeListener;
    }

    public final CopyOnWriteArrayList<InternalBarcodeCountListener> getInternalListeners$scandit_barcode_capture() {
        return this.internalListeners;
    }

    public final CopyOnWriteArrayList<BarcodeCountCaptureListListener> getListListeners$scandit_barcode_capture() {
        return this.listListeners;
    }

    public final CopyOnWriteArrayList<BarcodeCountListener> getListeners$scandit_barcode_capture() {
        return this.listeners;
    }

    public final long getTriggerAutoFocusDelay$scandit_barcode_capture() {
        BarcodeCountSettings barcodeCountSettings = this.f120602d;
        Object property = barcodeCountSettings != null ? barcodeCountSettings.getProperty(BarcodeCountSettings.PROPERTY_TRIGGER_AUTO_FOCUS_DELAY) : null;
        Long l10 = property instanceof Long ? (Long) property : null;
        if (l10 != null) {
            return l10.longValue();
        }
        return 100L;
    }

    public final boolean getTriggerAutoFocusOnShutter$scandit_barcode_capture() {
        BarcodeCountSettings barcodeCountSettings = this.f120602d;
        Object property = barcodeCountSettings != null ? barcodeCountSettings.getProperty(BarcodeCountSettings.PROPERTY_TRIGGER_AUTO_FOCUS_ON_SHUTTER) : null;
        Boolean bool = property instanceof Boolean ? (Boolean) property : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean isCaptureListSet$scandit_barcode_capture() {
        return this.captureList != null;
    }

    public final void removeInternalListener$scandit_barcode_capture(InternalBarcodeCountListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.internalListeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeListener(BarcodeCountListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.listeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void setAdditionalBarcodes(List<Barcode> additionalBarcodes) {
        Intrinsics.j(additionalBarcodes, "additionalBarcodes");
        NativeBarcodeCount nativeBarcodeCount_impl = getF120611a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(additionalBarcodes, 10));
        Iterator<T> it = additionalBarcodes.iterator();
        while (it.hasNext()) {
            arrayList.add(((Barcode) it.next()).getF120890a());
        }
        nativeBarcodeCount_impl.setAdditionalBarcodes(CollectionsExtensionsKt.toArrayList(arrayList));
    }

    public final void setBarcodeCountCaptureList(BarcodeCountCaptureList list) {
        Intrinsics.j(list, "list");
        this.captureList = list;
        _setBarcodeCountCaptureList(list);
        list.getF120649a().addListenerAsync(new BarcodeCountCaptureListListenerReversedAdapter(new g(this), list, null, 4, null));
    }

    public final void setFeedback(BarcodeCountFeedback value) {
        Intrinsics.j(value, "value");
        this.feedback = value;
        getF120611a().setSuccessFeedback(new BarcodeCount$setNativeFeedback$1(value));
        getF120611a().setUnrecognizedFeedback(new BarcodeCount$setNativeFeedback$2(value));
        getF120611a().setFailureFeedback(new BarcodeCount$setNativeFeedback$3(value));
        BarcodeCountFeedbackChangeListener barcodeCountFeedbackChangeListener = this.feedbackChangeListener;
        if (barcodeCountFeedbackChangeListener != null) {
            barcodeCountFeedbackChangeListener.feedbackChanged(value);
        }
    }

    public final void setFeedbackChangeListener$scandit_barcode_capture(BarcodeCountFeedbackChangeListener barcodeCountFeedbackChangeListener) {
        this.feedbackChangeListener = barcodeCountFeedbackChangeListener;
    }

    public final void setInternalStatusProvider$scandit_barcode_capture(NativeBarcodeCountStatusProvider statusProvider) {
        Intrinsics.j(statusProvider, "statusProvider");
        getF120611a().setStatusProvider(statusProvider);
    }

    public final void _stopImuDataStream() {
        DataCaptureContext f120601c = getF123746c();
        if (f120601c != null) {
            f120601c._setShouldUseImuData(false);
        }
    }

    public final void reset() {
        getF120611a().reset();
    }

    public final void startScanningPhase() {
        getF120611a().activateState(BarcodeCountState.SCANNING);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCount(DataCaptureContext dataCaptureContext, BarcodeCountSettings barcodeCountSettings, DefaultConstructorMarker defaultConstructorMarker) {
        NativeBarcodeCount nativeBarcodeCountCreate = NativeBarcodeCount.create(dataCaptureContext != null ? dataCaptureContext.getF124053a() : null, barcodeCountSettings._impl());
        Intrinsics.i(nativeBarcodeCountCreate, "create(...)");
        this(nativeBarcodeCountCreate, new InternalBarcodeCountSession(new a(nativeBarcodeCountCreate)));
        _enableImuDataIfNeeded();
        this.f120602d = barcodeCountSettings;
        _enableImuDataIfNeeded();
    }
}
