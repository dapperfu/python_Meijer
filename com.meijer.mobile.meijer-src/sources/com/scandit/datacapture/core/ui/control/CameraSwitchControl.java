package com.scandit.datacapture.core.ui.control;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton;
import com.scandit.datacapture.core.internal.module.ui.control.camera.CameraControlIconsHandler;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.camera.CameraSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001QB)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00102\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00102\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\u00102\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001eR\"\u0010(\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00102\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u0012R\"\u00106\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u0010\u0012R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b;\u0010%R\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010%R$\u0010B\u001a\u00020=2\u0006\u0010>\u001a\u00020=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\b\u001d\u0010AR$\u0010D\u001a\u00020=2\u0006\u0010>\u001a\u00020=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010@\"\u0004\b\u001f\u0010AR$\u0010F\u001a\u00020=2\u0006\u0010>\u001a\u00020=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010@\"\u0004\b \u0010AR$\u0010H\u001a\u00020=2\u0006\u0010>\u001a\u00020=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010@\"\u0004\b!\u0010AR\u0011\u0010J\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bI\u0010@R\u0011\u0010L\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bK\u0010@R\u0011\u0010N\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bM\u0010@R\u0011\u0010P\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bO\u0010@¨\u0006R"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl;", "Lcom/scandit/datacapture/core/ui/control/Control;", "Lcom/scandit/datacapture/core/source/Camera;", "primaryCamera", "secondaryCamera", "Lcom/scandit/datacapture/core/internal/module/ui/control/camera/CameraControlIconsHandler;", "iconsHandler", "Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;", "view", "<init>", "(Lcom/scandit/datacapture/core/source/Camera;Lcom/scandit/datacapture/core/source/Camera;Lcom/scandit/datacapture/core/internal/module/ui/control/camera/CameraControlIconsHandler;Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Lcom/scandit/datacapture/core/source/Camera;Lcom/scandit/datacapture/core/source/Camera;)V", "", "json", "", "updateFromJson", "(Ljava/lang/String;)V", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_onDataCaptureContextChanged", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_onFrameSourceChanged", "(Lcom/scandit/datacapture/core/source/FrameSource;)V", "", "resId", "setPrimaryCameraImage", "(I)V", "setPrimaryCameraPressedImage", "setSecondaryCameraImage", "setSecondaryCameraPressedImage", "e", "Lcom/scandit/datacapture/core/source/Camera;", "get_primaryCamera$scandit_capture_core", "()Lcom/scandit/datacapture/core/source/Camera;", "set_primaryCamera$scandit_capture_core", "(Lcom/scandit/datacapture/core/source/Camera;)V", "_primaryCamera", "f", "get_secondaryCamera$scandit_capture_core", "set_secondaryCamera$scandit_capture_core", "_secondaryCamera", "g", "Ljava/lang/String;", "getContentDescriptionWhenUserFacing", "()Ljava/lang/String;", "setContentDescriptionWhenUserFacing", "contentDescriptionWhenUserFacing", "h", "getContentDescriptionWhenWorldFacing", "setContentDescriptionWhenWorldFacing", "contentDescriptionWhenWorldFacing", "Landroid/view/View;", "get_view", "()Landroid/view/View;", "_view", "getPrimaryCamera", "getSecondaryCamera", "Landroid/graphics/Bitmap;", "value", "getPrimaryCameraImage", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "primaryCameraImage", "getPrimaryCameraPressedImage", "primaryCameraPressedImage", "getSecondaryCameraImage", "secondaryCameraImage", "getSecondaryCameraPressedImage", "secondaryCameraPressedImage", "getDefaultPrimaryCameraImage", "defaultPrimaryCameraImage", "getDefaultPrimaryCameraPressedImage", "defaultPrimaryCameraPressedImage", "getDefaultSecondaryCameraImage", "defaultSecondaryCameraImage", "getDefaultSecondaryCameraPressedImage", "defaultSecondaryCameraPressedImage", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CameraSwitchControl implements Control {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final CameraControlIconsHandler f126975a;

    /* renamed from: b, reason: collision with root package name */
    private final ToggleImageButton f126976b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f126977c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Camera f126978d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Camera _primaryCamera;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Camera _secondaryCamera;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String contentDescriptionWhenUserFacing;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String contentDescriptionWhenWorldFacing;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl$Companion;", "", "Landroid/content/Context;", "context", "", "json", "Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl;", "fromJson", "(Landroid/content/Context;Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final CameraSwitchControl fromJson(Context context, String json) {
            Intrinsics.j(context, "context");
            Intrinsics.j(json, "json");
            return CameraSwitchControlDeserializer.fromJson(context, new JsonValue(json));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraPosition.values().length];
            try {
                iArr[CameraPosition.USER_FACING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.scandit.datacapture.core.ui.control.CameraSwitchControl$1] */
    public CameraSwitchControl(Camera primaryCamera, Camera secondaryCamera, CameraControlIconsHandler iconsHandler, ToggleImageButton view) {
        Intrinsics.j(primaryCamera, "primaryCamera");
        Intrinsics.j(secondaryCamera, "secondaryCamera");
        Intrinsics.j(iconsHandler, "iconsHandler");
        Intrinsics.j(view, "view");
        this.f126975a = iconsHandler;
        this.f126976b = view;
        this.f126977c = new WeakReference(null);
        this.f126978d = primaryCamera;
        this._primaryCamera = primaryCamera;
        this._secondaryCamera = secondaryCamera;
        String string = view.getContext().getString(R.string.sc_cd_camera_user_facing);
        Intrinsics.i(string, "getString(...)");
        this.contentDescriptionWhenUserFacing = string;
        String string2 = view.getContext().getString(R.string.sc_cd_camera_world_facing);
        Intrinsics.i(string2, "getString(...)");
        this.contentDescriptionWhenWorldFacing = string2;
        iconsHandler.a((AnonymousClass1) new com.scandit.datacapture.core.internal.module.ui.control.camera.b() { // from class: com.scandit.datacapture.core.ui.control.CameraSwitchControl.1
            @Override // com.scandit.datacapture.core.internal.module.ui.control.camera.b
            public void onIconsChanged(Camera camera, Bitmap image, boolean pressed) {
                Intrinsics.j(camera, "camera");
                Intrinsics.j(image, "image");
                if (Intrinsics.e(CameraSwitchControl.this.f126978d, camera) && CameraSwitchControl.this.f126976b.b() == pressed) {
                    CameraSwitchControl.this.a();
                }
            }
        });
        view.b(new a(this));
        view.a(new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void a() {
        try {
            Bitmap bitmapA = this.f126975a.a(this.f126978d, this.f126976b.b());
            if (bitmapA != null) {
                ToggleImageButton toggleImageButton = this.f126976b;
                toggleImageButton.getClass();
                ViewExtensionsKt.runOnMainThread(toggleImageButton, new com.scandit.datacapture.core.internal.module.ui.control.d(bitmapA, toggleImageButton));
            }
            this.f126976b.setContentDescription(WhenMappings.$EnumSwitchMapping$0[this.f126978d.getPosition().ordinal()] == 1 ? this.contentDescriptionWhenUserFacing : this.contentDescriptionWhenWorldFacing);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @JvmStatic
    public static final CameraSwitchControl fromJson(Context context, String str) {
        return INSTANCE.fromJson(context, str);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _removeChildControl(Control control) {
        Control.DefaultImpls._removeChildControl(this, control);
    }

    public final void setPrimaryCameraImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f126975a.a(value);
    }

    public final void setPrimaryCameraPressedImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f126975a.b(value);
    }

    public final void setSecondaryCameraImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f126975a.c(value);
    }

    public final void setSecondaryCameraPressedImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f126975a.d(value);
    }

    public static final void access$toggleCamera(CameraSwitchControl cameraSwitchControl) {
        Camera camera = cameraSwitchControl.f126978d;
        Camera camera2 = Intrinsics.e(camera, cameraSwitchControl.get_primaryCamera()) ? cameraSwitchControl.get_secondaryCamera() : Intrinsics.e(camera, cameraSwitchControl.get_secondaryCamera()) ? cameraSwitchControl.get_primaryCamera() : cameraSwitchControl.get_primaryCamera();
        DataCaptureContext dataCaptureContext = (DataCaptureContext) cameraSwitchControl.f126977c.get();
        if (dataCaptureContext != null) {
            FrameSource frameSource = dataCaptureContext.get_frameSource();
            c cVar = new c(dataCaptureContext, camera2);
            if (frameSource != null) {
                FrameSourceState currentState = frameSource.getCurrentState();
                FrameSourceState frameSourceState = FrameSourceState.OFF;
                if (currentState != frameSourceState) {
                    frameSource.switchToDesiredState(frameSourceState, LambdaExtensionsKt.Callback(new d(cVar)));
                    return;
                }
            }
            cVar.invoke();
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureContextChanged(DataCaptureContext dataCaptureContext) {
        this.f126977c = new WeakReference(dataCaptureContext);
        if (dataCaptureContext != null) {
            Camera camera = this.f126978d;
            FrameSource frameSource = dataCaptureContext.get_frameSource();
            c cVar = new c(dataCaptureContext, camera);
            if (frameSource != null) {
                FrameSourceState currentState = frameSource.getCurrentState();
                FrameSourceState frameSourceState = FrameSourceState.OFF;
                if (currentState != frameSourceState) {
                    frameSource.switchToDesiredState(frameSourceState, LambdaExtensionsKt.Callback(new d(cVar)));
                    return;
                }
            }
            cVar.invoke();
        }
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onFrameSourceChanged(FrameSource frameSource) {
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (Intrinsics.e(camera, get_primaryCamera()) || Intrinsics.e(camera, get_secondaryCamera())) {
            this.f126978d = camera;
        }
        a();
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public <T extends Control> void _removeChildControl(Class<T> cls) {
        Control.DefaultImpls._removeChildControl(this, cls);
    }

    public final String getContentDescriptionWhenUserFacing() {
        return this.contentDescriptionWhenUserFacing;
    }

    public final String getContentDescriptionWhenWorldFacing() {
        return this.contentDescriptionWhenWorldFacing;
    }

    public final Bitmap getDefaultPrimaryCameraImage() {
        return this.f126975a.a();
    }

    public final Bitmap getDefaultPrimaryCameraPressedImage() {
        return this.f126975a.b();
    }

    public final Bitmap getDefaultSecondaryCameraImage() {
        return this.f126975a.c();
    }

    public final Bitmap getDefaultSecondaryCameraPressedImage() {
        return this.f126975a.d();
    }

    /* renamed from: getPrimaryCamera, reason: from getter */
    public final Camera get_primaryCamera() {
        return this._primaryCamera;
    }

    public final Bitmap getPrimaryCameraImage() {
        return this.f126975a.e();
    }

    public final Bitmap getPrimaryCameraPressedImage() {
        return this.f126975a.f();
    }

    /* renamed from: getSecondaryCamera, reason: from getter */
    public final Camera get_secondaryCamera() {
        return this._secondaryCamera;
    }

    public final Bitmap getSecondaryCameraImage() {
        return this.f126975a.g();
    }

    public final Bitmap getSecondaryCameraPressedImage() {
        return this.f126975a.h();
    }

    public final Camera get_primaryCamera$scandit_capture_core() {
        return this._primaryCamera;
    }

    public final Camera get_secondaryCamera$scandit_capture_core() {
        return this._secondaryCamera;
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public View get_view() {
        return this.f126976b;
    }

    public final void setContentDescriptionWhenUserFacing(String str) {
        Intrinsics.j(str, "<set-?>");
        this.contentDescriptionWhenUserFacing = str;
    }

    public final void setContentDescriptionWhenWorldFacing(String str) {
        Intrinsics.j(str, "<set-?>");
        this.contentDescriptionWhenWorldFacing = str;
    }

    public final void setPrimaryCameraImage(int resId) {
        CameraControlIconsHandler cameraControlIconsHandler = this.f126975a;
        cameraControlIconsHandler.getClass();
        cameraControlIconsHandler.a(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setPrimaryCameraPressedImage(int resId) {
        CameraControlIconsHandler cameraControlIconsHandler = this.f126975a;
        cameraControlIconsHandler.getClass();
        cameraControlIconsHandler.b(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setSecondaryCameraImage(int resId) {
        CameraControlIconsHandler cameraControlIconsHandler = this.f126975a;
        cameraControlIconsHandler.getClass();
        cameraControlIconsHandler.c(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setSecondaryCameraPressedImage(int resId) {
        CameraControlIconsHandler cameraControlIconsHandler = this.f126975a;
        cameraControlIconsHandler.getClass();
        cameraControlIconsHandler.d(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void set_primaryCamera$scandit_capture_core(Camera camera) {
        Intrinsics.j(camera, "<set-?>");
        this._primaryCamera = camera;
    }

    public final void set_secondaryCamera$scandit_capture_core(Camera camera) {
        Intrinsics.j(camera, "<set-?>");
        this._secondaryCamera = camera;
    }

    public final void updateFromJson(String json) {
        Intrinsics.j(json, "json");
        CameraSwitchControlDeserializer.updateFromJson(this, new JsonValue(json));
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureViewChanged(DataCaptureView dataCaptureView) {
        Control.DefaultImpls._onDataCaptureViewChanged(this, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onRemoveControl() {
        Control.DefaultImpls._onRemoveControl(this);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onZoomGestureChanged(ZoomGesture zoomGesture) {
        Control.DefaultImpls._onZoomGestureChanged(this, zoomGesture);
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
    public CameraSwitchControl(Context context, Camera primaryCamera, Camera secondaryCamera) {
        this(primaryCamera, secondaryCamera, new CameraControlIconsHandler(primaryCamera, secondaryCamera), new ToggleImageButton(context));
        Intrinsics.j(context, "context");
        Intrinsics.j(primaryCamera, "primaryCamera");
        Intrinsics.j(secondaryCamera, "secondaryCamera");
    }
}
