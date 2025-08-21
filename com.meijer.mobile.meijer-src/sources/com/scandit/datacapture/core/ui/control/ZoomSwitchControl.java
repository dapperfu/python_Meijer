package com.scandit.datacapture.core.ui.control;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton;
import com.scandit.datacapture.core.internal.module.ui.control.zoom.ZoomControlIconsHandler;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.zoom.ZoomSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import com.scandit.datacapture.core.ui.gesture.ZoomGestureListener;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002EFB\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\r2\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\r2\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\r2\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010!R*\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010\u001d\u001a\u0004\b)\u0010*R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R$\u00106\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b \u00105R$\u00108\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00104\"\u0004\b\"\u00105R$\u0010:\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00104\"\u0004\b#\u00105R$\u0010<\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00104\"\u0004\b$\u00105R\u0011\u0010>\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b=\u00104R\u0011\u0010@\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b?\u00104R\u0011\u0010B\u001a\u0002018F¢\u0006\u0006\u001a\u0004\bA\u00104R\u0011\u0010D\u001a\u0002018F¢\u0006\u0006\u001a\u0004\bC\u00104¨\u0006G"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl;", "Lcom/scandit/datacapture/core/ui/control/Control;", "Lcom/scandit/datacapture/core/internal/module/ui/control/zoom/ZoomControlIconsHandler;", "iconsHandler", "Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;", "view", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/control/zoom/ZoomControlIconsHandler;Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "", "json", "", "updateFromJson", "(Ljava/lang/String;)V", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "zoomGesture", "_onZoomGestureChanged", "(Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;)V", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "_onDataCaptureViewChanged", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_onFrameSourceChanged", "(Lcom/scandit/datacapture/core/source/FrameSource;)V", "_onRemoveControl", "()V", "", "resId", "setZoomedOutImage", "(I)V", "setZoomedOutPressedImage", "setZoomedInImage", "setZoomedInPressedImage", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "<set-?>", "e", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "getCurrentZoomState$scandit_capture_core", "()Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "getCurrentZoomState$scandit_capture_core$annotations", "currentZoomState", "Landroid/view/View;", "get_view", "()Landroid/view/View;", "_view", "Landroid/graphics/Bitmap;", "value", "getZoomedOutImage", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "zoomedOutImage", "getZoomedOutPressedImage", "zoomedOutPressedImage", "getZoomedInImage", "zoomedInImage", "getZoomedInPressedImage", "zoomedInPressedImage", "getDefaultZoomedOutImage", "defaultZoomedOutImage", "getDefaultZoomedOutPressedImage", "defaultZoomedOutPressedImage", "getDefaultZoomedInImage", "defaultZoomedInImage", "getDefaultZoomedInPressedImage", "defaultZoomedInPressedImage", "Companion", "ZoomState", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ZoomSwitchControl implements Control {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final ZoomControlIconsHandler f127004a;

    /* renamed from: b, reason: collision with root package name */
    private final ToggleImageButton f127005b;

    /* renamed from: c, reason: collision with root package name */
    private final String f127006c;

    /* renamed from: d, reason: collision with root package name */
    private final String f127007d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile ZoomState currentZoomState;

    /* renamed from: f, reason: collision with root package name */
    private volatile ZoomGesture f127009f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference f127010g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference f127011h;

    /* renamed from: i, reason: collision with root package name */
    private AnonymousClass2 f127012i;

    /* renamed from: j, reason: collision with root package name */
    private final ZoomSwitchControl$zoomGestureListener$1 f127013j;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$Companion;", "", "Landroid/content/Context;", "context", "", "json", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl;", "fromJson", "(Landroid/content/Context;Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final ZoomSwitchControl fromJson(Context context, String json) {
            Intrinsics.j(context, "context");
            Intrinsics.j(json, "json");
            return ZoomSwitchControlDeserializer.fromJson(context, new JsonValue(json));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.scandit.datacapture.core.ui.control.ZoomSwitchControl$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.scandit.datacapture.core.ui.control.ZoomSwitchControl$zoomGestureListener$1] */
    public ZoomSwitchControl(ZoomControlIconsHandler iconsHandler, ToggleImageButton view) {
        Intrinsics.j(iconsHandler, "iconsHandler");
        Intrinsics.j(view, "view");
        this.f127004a = iconsHandler;
        this.f127005b = view;
        String string = view.getContext().getString(R.string.sc_cd_zoom_off);
        Intrinsics.i(string, "getString(...)");
        this.f127006c = string;
        String string2 = view.getContext().getString(R.string.sc_cd_zoom_on);
        Intrinsics.i(string2, "getString(...)");
        this.f127007d = string2;
        this.currentZoomState = ZoomState.ZoomedOut.INSTANCE;
        this.f127010g = new WeakReference(null);
        this.f127011h = new WeakReference(null);
        this.f127013j = new ZoomGestureListener() { // from class: com.scandit.datacapture.core.ui.control.ZoomSwitchControl$zoomGestureListener$1
            @Override // com.scandit.datacapture.core.ui.gesture.ZoomGestureListener
            public void onZoomInGesture(ZoomGesture zoomGesture) {
                Intrinsics.j(zoomGesture, "zoomGesture");
                this.f127016a.currentZoomState = ZoomSwitchControl.ZoomState.ZoomedIn.INSTANCE;
                this.f127016a.a();
            }

            @Override // com.scandit.datacapture.core.ui.gesture.ZoomGestureListener
            public void onZoomOutGesture(ZoomGesture zoomGesture) {
                Intrinsics.j(zoomGesture, "zoomGesture");
                this.f127016a.currentZoomState = ZoomSwitchControl.ZoomState.ZoomedOut.INSTANCE;
                this.f127016a.a();
            }
        };
        iconsHandler.a((AnonymousClass1) new com.scandit.datacapture.core.internal.module.ui.control.zoom.b() { // from class: com.scandit.datacapture.core.ui.control.ZoomSwitchControl.1
            @Override // com.scandit.datacapture.core.internal.module.ui.control.zoom.b
            public void onIconsChanged(ZoomState state, boolean pressed) {
                Intrinsics.j(state, "state");
                if (Intrinsics.e(ZoomSwitchControl.this.getCurrentZoomState(), state) && ZoomSwitchControl.this.f127005b.b() == pressed) {
                    ZoomSwitchControl.this.a();
                }
            }
        });
        view.b(new m(this));
        view.a(new n(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void a() {
        String str;
        try {
            Bitmap bitmapA = this.f127004a.a(this.currentZoomState, this.f127005b.b());
            if (bitmapA != null) {
                ToggleImageButton toggleImageButton = this.f127005b;
                toggleImageButton.getClass();
                ViewExtensionsKt.runOnMainThread(toggleImageButton, new com.scandit.datacapture.core.internal.module.ui.control.d(bitmapA, toggleImageButton));
            }
            ToggleImageButton toggleImageButton2 = this.f127005b;
            ZoomState zoomState = this.currentZoomState;
            if (Intrinsics.e(zoomState, ZoomState.ZoomedIn.INSTANCE)) {
                str = this.f127007d;
            } else {
                if (!Intrinsics.e(zoomState, ZoomState.ZoomedOut.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = this.f127006c;
            }
            toggleImageButton2.setContentDescription(str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @JvmStatic
    public static final ZoomSwitchControl fromJson(Context context, String str) {
        return INSTANCE.fromJson(context, str);
    }

    public static /* synthetic */ void getCurrentZoomState$scandit_capture_core$annotations() {
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _removeChildControl(Control control) {
        Control.DefaultImpls._removeChildControl(this, control);
    }

    public final void setZoomedInImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f127004a.a(value);
    }

    public final void setZoomedInPressedImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f127004a.b(value);
    }

    public final void setZoomedOutImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f127004a.c(value);
    }

    public final void setZoomedOutPressedImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f127004a.d(value);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "", "ZoomedIn", "ZoomedOut", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState$ZoomedIn;", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState$ZoomedOut;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static abstract class ZoomState {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState$ZoomedIn;", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
        public static final class ZoomedIn extends ZoomState {
            public static final ZoomedIn INSTANCE = new ZoomedIn();

            private ZoomedIn() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState$ZoomedOut;", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl$ZoomState;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
        public static final class ZoomedOut extends ZoomState {
            public static final ZoomedOut INSTANCE = new ZoomedOut();

            private ZoomedOut() {
                super(null);
            }
        }

        public ZoomState(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final void access$toggleZoom(ZoomSwitchControl zoomSwitchControl) {
        ZoomState zoomState;
        ZoomState zoomState2 = zoomSwitchControl.currentZoomState;
        if (zoomState2 instanceof ZoomState.ZoomedOut) {
            DataCaptureView dataCaptureView = (DataCaptureView) zoomSwitchControl.f127010g.get();
            if (dataCaptureView != null) {
                dataCaptureView._performUiTriggeredZoomIn();
            }
            zoomState = ZoomState.ZoomedIn.INSTANCE;
        } else {
            if (!(zoomState2 instanceof ZoomState.ZoomedIn)) {
                throw new NoWhenBranchMatchedException();
            }
            DataCaptureView dataCaptureView2 = (DataCaptureView) zoomSwitchControl.f127010g.get();
            if (dataCaptureView2 != null) {
                dataCaptureView2._performUiTriggeredZoomOut();
            }
            zoomState = ZoomState.ZoomedOut.INSTANCE;
        }
        zoomSwitchControl.currentZoomState = zoomState;
        zoomSwitchControl.a();
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureViewChanged(DataCaptureView dataCaptureView) {
        this.f127010g = new WeakReference(dataCaptureView);
        ZoomGesture zoomGesture = dataCaptureView != null ? dataCaptureView.getZoomGesture() : null;
        if (Intrinsics.e(this.f127009f, zoomGesture)) {
            return;
        }
        ZoomGesture zoomGesture2 = this.f127009f;
        if (zoomGesture2 != null) {
            zoomGesture2.removeListener(this.f127013j);
        }
        this.f127009f = zoomGesture;
        ZoomGesture zoomGesture3 = this.f127009f;
        if (zoomGesture3 != null) {
            zoomGesture3.addListener(this.f127013j);
        }
        ZoomGesture zoomGesture4 = this.f127009f;
        if (zoomGesture4 != null) {
            zoomGesture4.triggerZoomOut();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.scandit.datacapture.core.source.FrameSourceListener, com.scandit.datacapture.core.ui.control.ZoomSwitchControl$_onFrameSourceChanged$2] */
    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onFrameSourceChanged(FrameSource frameSource) {
        FrameSource frameSource2;
        DataCaptureView dataCaptureView = (DataCaptureView) this.f127010g.get();
        if (dataCaptureView != null) {
            dataCaptureView._performUiTriggeredZoomOut();
        }
        this.currentZoomState = ZoomState.ZoomedOut.INSTANCE;
        a();
        AnonymousClass2 anonymousClass2 = this.f127012i;
        if (anonymousClass2 != null && (frameSource2 = (FrameSource) this.f127011h.get()) != null) {
            frameSource2.removeListener(anonymousClass2);
        }
        WeakReference weakReference = new WeakReference(frameSource);
        this.f127011h = weakReference;
        ?? r32 = new FrameSourceListener() { // from class: com.scandit.datacapture.core.ui.control.ZoomSwitchControl._onFrameSourceChanged.2
            @Override // com.scandit.datacapture.core.source.FrameSourceListener
            public void onStateChanged(FrameSource frameSource3, FrameSourceState newState) {
                Intrinsics.j(frameSource3, "frameSource");
                Intrinsics.j(newState, "newState");
                if (newState == FrameSourceState.STARTING) {
                    ZoomSwitchControl.this.currentZoomState = ZoomState.ZoomedOut.INSTANCE;
                    ZoomSwitchControl.this.a();
                }
            }

            @Override // com.scandit.datacapture.core.source.FrameSourceListener
            public void onFrameOutput(FrameSource frameSource3, FrameData frameData) {
                FrameSourceListener.DefaultImpls.onFrameOutput(this, frameSource3, frameData);
            }

            @Override // com.scandit.datacapture.core.source.FrameSourceListener
            public void onObservationStarted(FrameSource frameSource3) {
                FrameSourceListener.DefaultImpls.onObservationStarted(this, frameSource3);
            }

            @Override // com.scandit.datacapture.core.source.FrameSourceListener
            public void onObservationStopped(FrameSource frameSource3) {
                FrameSourceListener.DefaultImpls.onObservationStopped(this, frameSource3);
            }
        };
        FrameSource frameSource3 = (FrameSource) weakReference.get();
        if (frameSource3 != 0) {
            frameSource3.addListener(r32);
        }
        this.f127012i = r32;
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onRemoveControl() {
        FrameSource frameSource;
        AnonymousClass2 anonymousClass2 = this.f127012i;
        if (anonymousClass2 != null && (frameSource = (FrameSource) this.f127011h.get()) != null) {
            frameSource.removeListener(anonymousClass2);
        }
        this.f127012i = null;
        this.f127011h.clear();
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onZoomGestureChanged(ZoomGesture zoomGesture) {
        if (Intrinsics.e(this.f127009f, zoomGesture)) {
            return;
        }
        ZoomGesture zoomGesture2 = this.f127009f;
        if (zoomGesture2 != null) {
            zoomGesture2.removeListener(this.f127013j);
        }
        this.f127009f = zoomGesture;
        ZoomGesture zoomGesture3 = this.f127009f;
        if (zoomGesture3 != null) {
            zoomGesture3.addListener(this.f127013j);
        }
        ZoomGesture zoomGesture4 = this.f127009f;
        if (zoomGesture4 != null) {
            zoomGesture4.triggerZoomOut();
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public <T extends Control> void _removeChildControl(Class<T> cls) {
        Control.DefaultImpls._removeChildControl(this, cls);
    }

    /* renamed from: getCurrentZoomState$scandit_capture_core, reason: from getter */
    public final ZoomState getCurrentZoomState() {
        return this.currentZoomState;
    }

    public final Bitmap getDefaultZoomedInImage() {
        return this.f127004a.a();
    }

    public final Bitmap getDefaultZoomedInPressedImage() {
        return this.f127004a.b();
    }

    public final Bitmap getDefaultZoomedOutImage() {
        return this.f127004a.c();
    }

    public final Bitmap getDefaultZoomedOutPressedImage() {
        return this.f127004a.d();
    }

    public final Bitmap getZoomedInImage() {
        return this.f127004a.e();
    }

    public final Bitmap getZoomedInPressedImage() {
        return this.f127004a.f();
    }

    public final Bitmap getZoomedOutImage() {
        return this.f127004a.g();
    }

    public final Bitmap getZoomedOutPressedImage() {
        return this.f127004a.h();
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public View get_view() {
        return this.f127005b;
    }

    public final void setZoomedInImage(int resId) {
        ZoomControlIconsHandler zoomControlIconsHandler = this.f127004a;
        zoomControlIconsHandler.getClass();
        zoomControlIconsHandler.a(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setZoomedInPressedImage(int resId) {
        ZoomControlIconsHandler zoomControlIconsHandler = this.f127004a;
        zoomControlIconsHandler.getClass();
        zoomControlIconsHandler.b(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setZoomedOutImage(int resId) {
        ZoomControlIconsHandler zoomControlIconsHandler = this.f127004a;
        zoomControlIconsHandler.getClass();
        zoomControlIconsHandler.c(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setZoomedOutPressedImage(int resId) {
        ZoomControlIconsHandler zoomControlIconsHandler = this.f127004a;
        zoomControlIconsHandler.getClass();
        zoomControlIconsHandler.d(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void updateFromJson(String json) {
        Intrinsics.j(json, "json");
        ZoomSwitchControlDeserializer.updateFromJson(this, new JsonValue(json));
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureContextChanged(DataCaptureContext dataCaptureContext) {
        Control.DefaultImpls._onDataCaptureContextChanged(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public List<Control> get_childControls() {
        return Control.DefaultImpls.get_childControls(this);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public boolean get_isControlGroup() {
        return Control.DefaultImpls.get_isControlGroup(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomSwitchControl(Context context) {
        this(new ZoomControlIconsHandler(), new ToggleImageButton(context));
        Intrinsics.j(context, "context");
    }
}
