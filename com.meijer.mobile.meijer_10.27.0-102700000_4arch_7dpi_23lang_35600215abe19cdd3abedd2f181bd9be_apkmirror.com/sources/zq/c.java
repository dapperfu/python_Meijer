package zq;

import Xp.a;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import com.meijer.mobile.shopandscan.BuildConfig;
import com.scandit.datacapture.barcode.capture.BarcodeCapture;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureListener;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureSession;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureSettings;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.LogoStyle;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.F0;
import qv.InterfaceC16622O;
import zq.AbstractC18567a;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0013*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0005J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010*J\u0017\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010*J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001303H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J'\u0010?\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@R\u001a\u0010E\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010JR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010LR$\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010MR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010PR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010RR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010TR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\\R\u0014\u0010`\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010_R\u0014\u0010c\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082D¢\u0006\u0006\n\u0004\be\u0010f¨\u0006h"}, d2 = {"Lzq/c;", "Lzq/d;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureListener;", "Lqv/O;", "<init>", "()V", "Lcom/scandit/datacapture/core/source/CameraPosition;", "cameraPosition", "", "k", "(Lcom/scandit/datacapture/core/source/CameraPosition;)V", "Lcom/scandit/datacapture/core/source/Camera;", "camera", "Lkotlin/Function0;", "onReleased", "o", "(Lcom/scandit/datacapture/core/source/Camera;Lkotlin/jvm/functions/Function0;)V", "m", "(Lcom/scandit/datacapture/core/source/Camera;)V", "LXp/a;", "Lcom/scandit/datacapture/barcode/data/Symbology;", "q", "(LXp/a;)Lcom/scandit/datacapture/barcode/data/Symbology;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "barcodeCapture", "l", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/scandit/datacapture/barcode/data/Barcode;", "r", "(Lcom/scandit/datacapture/barcode/data/Barcode;)LXp/a;", "Lkotlin/Function1;", "onBarcodeScan", "d", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Landroid/view/View;", "a", "(Landroid/content/Context;)Landroid/view/View;", "", "isScanningEnabled", "h", "(Z)V", "destroy", "isOn", "f", "e", "Lzq/a;", "cameraLens", "b", "(Lzq/a;)V", "", "symbologies", "g", "(Ljava/util/List;)V", "Landroidx/compose/ui/geometry/Rect;", "scanningArea", "c", "(Landroidx/compose/ui/geometry/Rect;)V", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;", "session", "Lcom/scandit/datacapture/core/data/FrameData;", "data", "onBarcodeScanned", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;Lcom/scandit/datacapture/core/data/FrameData;)V", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "Lkotlin/jvm/functions/Function1;", "barcodeListener", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "barcodeCaptureSettings", "Lcom/scandit/datacapture/core/source/CameraPosition;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettings", "i", "Lcom/scandit/datacapture/core/source/Camera;", "Lcom/scandit/datacapture/core/source/TorchState;", "j", "Lcom/scandit/datacapture/core/source/TorchState;", "torchState", "Z", "captureFeedback", "Lcom/scandit/datacapture/core/common/feedback/ResourceSound;", "Lcom/scandit/datacapture/core/common/feedback/ResourceSound;", "captureSound", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "captureVibration", "", "n", "J", "captureInterval", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c implements zq.d, BarcodeCaptureListener, InterfaceC16622O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext = C16639f0.a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private DataCaptureContext dataCaptureContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private DataCaptureView dataCaptureView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private BarcodeCapture barcodeCapture;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Xp.a, Unit> barcodeListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private BarcodeCaptureSettings barcodeCaptureSettings;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private CameraPosition cameraPosition;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CameraSettings cameraSettings;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Camera camera;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private TorchState torchState;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean captureFeedback;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ResourceSound captureSound;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Vibration captureVibration;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long captureInterval;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.utils.scandit.ScanditController", f = "ScanditController.kt", l = {219}, m = "delayNextScan")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f173222a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f173223b;

        /* renamed from: d, reason: collision with root package name */
        int f173225d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f173223b = obj;
            this.f173225d |= Integer.MIN_VALUE;
            return c.this.l(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.utils.scandit.ScanditController$onBarcodeScanned$2", f = "ScanditController.kt", l = {213}, m = "invokeSuspend")
    /* renamed from: zq.c$c, reason: collision with other inner class name */
    static final class C2802c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f173226a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BarcodeCapture f173228c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2802c(BarcodeCapture barcodeCapture, Continuation<? super C2802c> continuation) {
            super(2, continuation);
            this.f173228c = barcodeCapture;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new C2802c(this.f173228c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C2802c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f173226a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                c cVar = c.this;
                BarcodeCapture barcodeCapture = this.f173228c;
                this.f173226a = 1;
                if (cVar.l(barcodeCapture, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"zq/c$d", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "result", "", "a", "(Z)V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Callback<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f173229a;

        d(Function0<Unit> function0) {
            this.f173229a = function0;
        }

        public void a(boolean result) {
            Function0<Unit> function0 = this.f173229a;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // com.scandit.datacapture.core.common.async.Callback
        public /* bridge */ /* synthetic */ void run(Boolean bool) {
            a(bool.booleanValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Symbology.values().length];
            try {
                iArr[Symbology.EAN13_UPCA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Symbology.UPCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Symbology.EAN8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Symbology.CODE128.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Symbology.QR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void k(CameraPosition cameraPosition) {
        Camera camera = null;
        Camera camera$default = Camera.Companion.getCamera$default(Camera.INSTANCE, cameraPosition, null, 2, null);
        if (camera$default != null) {
            Camera.applySettings$default(camera$default, this.cameraSettings, null, 2, null);
            DataCaptureContext dataCaptureContext = this.dataCaptureContext;
            if (dataCaptureContext != null) {
                DataCaptureContext.setFrameSource$default(dataCaptureContext, camera$default, null, 2, null);
            }
            camera$default.setDesiredTorchState(this.torchState);
            camera = camera$default;
        }
        this.camera = camera;
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.ON);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.scandit.datacapture.barcode.capture.BarcodeCapture r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zq.c.b
            if (r0 == 0) goto L13
            r0 = r8
            zq.c$b r0 = (zq.c.b) r0
            int r1 = r0.f173225d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173225d = r1
            goto L18
        L13:
            zq.c$b r0 = new zq.c$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f173223b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f173225d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f173222a
            com.scandit.datacapture.barcode.capture.BarcodeCapture r7 = (com.scandit.datacapture.barcode.capture.BarcodeCapture) r7
            kotlin.ResultKt.b(r8)
            goto L49
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r8)
            r8 = 0
            r7.setEnabled(r8)
            long r4 = r6.captureInterval
            r0.f173222a = r7
            r0.f173225d = r3
            java.lang.Object r8 = qv.Z.b(r4, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            r7.setEnabled(r3)
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.c.l(com.scandit.datacapture.barcode.capture.BarcodeCapture, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void m(Camera camera) {
        o(camera, new Function0() { // from class: zq.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.n(this.f173207a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(c cVar) {
        cVar.k(cVar.cameraPosition);
        return Unit.f142422a;
    }

    private final void o(Camera camera, Function0<Unit> onReleased) {
        camera.switchToDesiredState(FrameSourceState.OFF, new d(onReleased));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void p(c cVar, Camera camera, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        cVar.o(camera, function0);
    }

    private final Symbology q(Xp.a aVar) {
        if ((aVar instanceof a.EAN13) || (aVar instanceof a.UPCA) || (aVar instanceof a.NSC2)) {
            return Symbology.EAN13_UPCA;
        }
        if (aVar instanceof a.EAN8) {
            return Symbology.EAN8;
        }
        if (aVar instanceof a.UPCE) {
            return Symbology.UPCE;
        }
        if (aVar instanceof a.CODE128) {
            return Symbology.CODE128;
        }
        if (aVar instanceof a.QR) {
            return Symbology.QR;
        }
        return null;
    }

    @Override // zq.d
    public View a(Context context) {
        Intrinsics.j(context, "context");
        DataCaptureView dataCaptureView = this.dataCaptureView;
        if (dataCaptureView != null) {
            return dataCaptureView;
        }
        k(this.cameraPosition);
        DataCaptureView dataCaptureViewNewInstance = DataCaptureView.INSTANCE.newInstance(context, this.dataCaptureContext);
        this.dataCaptureView = dataCaptureViewNewInstance;
        return dataCaptureViewNewInstance;
    }

    @Override // zq.d
    public void b(AbstractC18567a cameraLens) {
        CameraPosition cameraPosition;
        Intrinsics.j(cameraLens, "cameraLens");
        if (cameraLens instanceof AbstractC18567a.b) {
            cameraPosition = CameraPosition.WORLD_FACING;
        } else {
            if (!(cameraLens instanceof AbstractC18567a.C2801a)) {
                throw new NoWhenBranchMatchedException();
            }
            cameraPosition = CameraPosition.USER_FACING;
        }
        this.cameraPosition = cameraPosition;
        Camera camera = this.camera;
        if (camera == null || camera.getPosition() == this.cameraPosition) {
            return;
        }
        m(camera);
    }

    @Override // zq.d
    public void c(Rect scanningArea) {
        Intrinsics.j(scanningArea, "scanningArea");
        DataCaptureView dataCaptureView = this.dataCaptureView;
        if (dataCaptureView != null) {
            float left = scanningArea.getLeft();
            MeasureUnit measureUnit = MeasureUnit.PIXEL;
            dataCaptureView.setScanAreaMargins(new MarginsWithUnit(new FloatWithUnit(left, measureUnit), new FloatWithUnit(scanningArea.getTop(), measureUnit), new FloatWithUnit((this.dataCaptureView != null ? r6.getRight() : 0.0f) - scanningArea.l(), measureUnit), new FloatWithUnit((this.dataCaptureView != null ? r8.getBottom() : 0.0f) - scanningArea.i(), measureUnit)));
        }
        DataCaptureView dataCaptureView2 = this.dataCaptureView;
        if (dataCaptureView2 != null) {
            dataCaptureView2.setLogoStyle(LogoStyle.MINIMAL);
        }
    }

    @Override // zq.d
    public void d(Function1<? super Xp.a, Unit> onBarcodeScan) {
        DataCaptureContext dataCaptureContextForLicenseKey = DataCaptureContext.INSTANCE.forLicenseKey(BuildConfig.SCANDIT_KEY);
        this.dataCaptureContext = dataCaptureContextForLicenseKey;
        BarcodeCapture barcodeCaptureForDataCaptureContext = BarcodeCapture.INSTANCE.forDataCaptureContext(dataCaptureContextForLicenseKey, this.barcodeCaptureSettings);
        barcodeCaptureForDataCaptureContext.addListener(this);
        this.barcodeListener = onBarcodeScan;
        barcodeCaptureForDataCaptureContext.setEnabled(false);
        this.barcodeCapture = barcodeCaptureForDataCaptureContext;
    }

    @Override // zq.d
    public void destroy() {
        BarcodeCapture barcodeCapture = this.barcodeCapture;
        if (barcodeCapture != null) {
            barcodeCapture.setEnabled(false);
        }
        Camera camera = this.camera;
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.OFF);
        }
        DataCaptureContext dataCaptureContext = this.dataCaptureContext;
        if (dataCaptureContext != null) {
            dataCaptureContext.release();
        }
        Camera camera2 = this.camera;
        if (camera2 != null) {
            p(this, camera2, null, 2, null);
        }
        this.dataCaptureView = null;
        this.camera = null;
        this.dataCaptureContext = null;
        F0.e(getCoroutineContext(), null, 1, null);
    }

    @Override // zq.d
    public void e(boolean isOn) {
        this.captureFeedback = isOn;
    }

    @Override // zq.d
    public void f(boolean isOn) {
        TorchState torchState = isOn ? TorchState.ON : TorchState.OFF;
        this.torchState = torchState;
        Camera camera = this.camera;
        if (camera != null) {
            camera.setDesiredTorchState(torchState);
        }
    }

    @Override // zq.d
    public void g(List<? extends Xp.a> symbologies) {
        Intrinsics.j(symbologies, "symbologies");
        BarcodeCaptureSettings barcodeCaptureSettings = this.barcodeCaptureSettings;
        Iterator<T> it = barcodeCaptureSettings.getEnabledSymbologies().iterator();
        while (it.hasNext()) {
            barcodeCaptureSettings.enableSymbology((Symbology) it.next(), false);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = symbologies.iterator();
        while (it2.hasNext()) {
            Symbology symbologyQ = q((Xp.a) it2.next());
            if (symbologyQ != null) {
                arrayList.add(symbologyQ);
            }
        }
        barcodeCaptureSettings.enableSymbologies(CollectionsKt.o1(arrayList));
        Symbology symbology = Symbology.EAN13_UPCA;
        barcodeCaptureSettings.getSymbologySettings(symbology).setExtensionEnabled("remove_leading_upca_zero", true);
        barcodeCaptureSettings.getSymbologySettings(symbology).setExtensionEnabled("strict", true);
        BarcodeCapture barcodeCapture = this.barcodeCapture;
        if (barcodeCapture != null) {
            BarcodeCapture.applySettings$default(barcodeCapture, this.barcodeCaptureSettings, null, 2, null);
        }
    }

    @Override // qv.InterfaceC16622O
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // zq.d
    public void h(boolean isScanningEnabled) {
        BarcodeCapture barcodeCapture = this.barcodeCapture;
        if (barcodeCapture != null) {
            barcodeCapture.setEnabled(isScanningEnabled);
        }
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    public void onBarcodeScanned(BarcodeCapture barcodeCapture, BarcodeCaptureSession session, FrameData data) {
        Function1<? super Xp.a, Unit> function1;
        Intrinsics.j(barcodeCapture, "barcodeCapture");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeCaptureListener.DefaultImpls.onBarcodeScanned(this, barcodeCapture, session, data);
        Barcode newlyRecognizedBarcode = session.getNewlyRecognizedBarcode();
        if (newlyRecognizedBarcode != null && (function1 = this.barcodeListener) != null) {
            function1.invoke(r(newlyRecognizedBarcode));
        }
        barcodeCapture.getFeedback().setSuccess(new Feedback(this.captureVibration, this.captureFeedback ? this.captureSound : null));
        C16648k.d(C16623P.a(getCoroutineContext()), null, null, new C2802c(barcodeCapture, null), 3, null);
    }

    public c() {
        BarcodeCaptureSettings barcodeCaptureSettings = new BarcodeCaptureSettings();
        barcodeCaptureSettings.setCodeDuplicateFilter(TimeInterval.INSTANCE.seconds(3.0f));
        this.barcodeCaptureSettings = barcodeCaptureSettings;
        this.cameraPosition = CameraPosition.WORLD_FACING;
        this.cameraSettings = BarcodeCapture.INSTANCE.createRecommendedCameraSettings();
        this.torchState = TorchState.OFF;
        this.captureSound = new ResourceSound(com.meijer.mobile.shopandscan.d.f116780e);
        this.captureVibration = Vibration.INSTANCE.defaultVibration();
        this.captureInterval = 3000L;
    }

    private final Xp.a r(Barcode barcode) {
        String data = barcode.getData();
        if (data == null) {
            data = "";
        }
        int i10 = a.$EnumSwitchMapping$0[barcode.getSymbology().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return new a.UNKNOWN(data);
                        }
                        return new a.QR(data);
                    }
                    return new a.CODE128(data);
                }
                return new a.EAN8(data);
            }
            return new a.UPCE(data);
        }
        if (StringsKt.d1(data, '2', false, 2, null)) {
            return new a.NSC2(data);
        }
        if (data.length() == 12) {
            return new a.UPCA(data);
        }
        return new a.EAN13(data);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    @ProxyFunction
    public void onObservationStarted(BarcodeCapture barcodeCapture) {
        BarcodeCaptureListener.DefaultImpls.onObservationStarted(this, barcodeCapture);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    @ProxyFunction
    public void onObservationStopped(BarcodeCapture barcodeCapture) {
        BarcodeCaptureListener.DefaultImpls.onObservationStopped(this, barcodeCapture);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    @ProxyFunction(nativeName = "onSessionUpdated")
    public void onSessionUpdated(BarcodeCapture barcodeCapture, BarcodeCaptureSession barcodeCaptureSession, FrameData frameData) {
        BarcodeCaptureListener.DefaultImpls.onSessionUpdated(this, barcodeCapture, barcodeCaptureSession, frameData);
    }
}
