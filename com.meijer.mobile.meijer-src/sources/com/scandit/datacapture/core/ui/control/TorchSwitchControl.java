package com.scandit.datacapture.core.ui.control;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton;
import com.scandit.datacapture.core.internal.module.ui.control.torch.TorchControlIconsHandler;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.torch.TorchSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.TorchListener;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.gesture.ZoomGesture;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0017R\"\u0010!\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000fR\"\u0010%\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010\u000fR\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R$\u0010/\u001a\u00020*2\u0006\u0010+\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b\u0018\u0010.R$\u00101\u001a\u00020*2\u0006\u0010+\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010-\"\u0004\b\u0019\u0010.R$\u00103\u001a\u00020*2\u0006\u0010+\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010-\"\u0004\b\u001a\u0010.R$\u00105\u001a\u00020*2\u0006\u0010+\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010-\"\u0004\b\u001b\u0010.R\u0011\u00107\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b6\u0010-R\u0011\u00109\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b8\u0010-R\u0011\u0010;\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b:\u0010-R\u0011\u0010=\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b<\u0010-¨\u0006?"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl;", "Lcom/scandit/datacapture/core/ui/control/Control;", "Lcom/scandit/datacapture/core/internal/module/ui/control/torch/TorchControlIconsHandler;", "iconsHandler", "Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;", "view", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/control/torch/TorchControlIconsHandler;Lcom/scandit/datacapture/core/internal/module/ui/control/ToggleImageButton;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "", "json", "", "updateFromJson", "(Ljava/lang/String;)V", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_onFrameSourceChanged", "(Lcom/scandit/datacapture/core/source/FrameSource;)V", "", "resId", "setImageResource", "(I)V", "setTorchOnImage", "setTorchOnPressedImage", "setTorchOffImage", "setTorchOffPressedImage", "c", "Ljava/lang/String;", "getContentDescriptionWhenOff", "()Ljava/lang/String;", "setContentDescriptionWhenOff", "contentDescriptionWhenOff", "d", "getContentDescriptionWhenOn", "setContentDescriptionWhenOn", "contentDescriptionWhenOn", "Landroid/view/View;", "get_view", "()Landroid/view/View;", "_view", "Landroid/graphics/Bitmap;", "value", "getTorchOnImage", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "torchOnImage", "getTorchOnPressedImage", "torchOnPressedImage", "getTorchOffImage", "torchOffImage", "getTorchOffPressedImage", "torchOffPressedImage", "getDefaultTorchOnImage", "defaultTorchOnImage", "getDefaultTorchOnPressedImage", "defaultTorchOnPressedImage", "getDefaultTorchOffImage", "defaultTorchOffImage", "getDefaultTorchOffPressedImage", "defaultTorchOffPressedImage", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TorchSwitchControl implements Control {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final TorchControlIconsHandler f126996a;

    /* renamed from: b, reason: collision with root package name */
    private final ToggleImageButton f126997b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String contentDescriptionWhenOff;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String contentDescriptionWhenOn;

    /* renamed from: e, reason: collision with root package name */
    private final TorchSwitchControl$torchListener$1 f127000e;

    /* renamed from: f, reason: collision with root package name */
    private Camera f127001f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl$Companion;", "", "Landroid/content/Context;", "context", "", "json", "Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl;", "fromJson", "(Landroid/content/Context;Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final TorchSwitchControl fromJson(Context context, String json) {
            Intrinsics.j(context, "context");
            Intrinsics.j(json, "json");
            return TorchSwitchControlDeserializer.fromJson(context, new JsonValue(json));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TorchState.values().length];
            try {
                iArr[TorchState.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TorchState.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TorchState.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.scandit.datacapture.core.ui.control.TorchSwitchControl$torchListener$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.scandit.datacapture.core.ui.control.TorchSwitchControl$1] */
    public TorchSwitchControl(TorchControlIconsHandler iconsHandler, ToggleImageButton view) {
        Intrinsics.j(iconsHandler, "iconsHandler");
        Intrinsics.j(view, "view");
        this.f126996a = iconsHandler;
        this.f126997b = view;
        String string = view.getContext().getString(R.string.sc_cd_torch_off);
        Intrinsics.i(string, "getString(...)");
        this.contentDescriptionWhenOff = string;
        String string2 = view.getContext().getString(R.string.sc_cd_torch_on);
        Intrinsics.i(string2, "getString(...)");
        this.contentDescriptionWhenOn = string2;
        this.f127000e = new TorchListener() { // from class: com.scandit.datacapture.core.ui.control.TorchSwitchControl$torchListener$1
            @Override // com.scandit.datacapture.core.source.TorchListener
            public void onTorchStateChanged(TorchState state) {
                Intrinsics.j(state, "state");
                this.f127003a.a(state);
            }
        };
        iconsHandler.a((AnonymousClass1) new com.scandit.datacapture.core.internal.module.ui.control.torch.c() { // from class: com.scandit.datacapture.core.ui.control.TorchSwitchControl.1
            @Override // com.scandit.datacapture.core.internal.module.ui.control.torch.c
            public void onIconsChanged(TorchState torchState, Bitmap image, boolean pressed) {
                Intrinsics.j(torchState, "torchState");
                Intrinsics.j(image, "image");
                Camera camera = TorchSwitchControl.this.f127001f;
                if ((camera != null ? camera.getDesiredTorchState() : null) == torchState && TorchSwitchControl.this.f126997b.b() == pressed) {
                    TorchSwitchControl.this.a(torchState);
                }
            }
        });
        view.b(new i(this));
        view.a(new j(this));
    }

    @JvmStatic
    public static final TorchSwitchControl fromJson(Context context, String str) {
        return INSTANCE.fromJson(context, str);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _removeChildControl(Control control) {
        Control.DefaultImpls._removeChildControl(this, control);
    }

    public final void setTorchOffImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f126996a.a(value);
    }

    public final void setTorchOffPressedImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f126996a.b(value);
    }

    public final void setTorchOnImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f126996a.c(value);
    }

    public final void setTorchOnPressedImage(Bitmap value) {
        Intrinsics.j(value, "value");
        this.f126996a.d(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(TorchState torchState) {
        Bitmap bitmapA = this.f126996a.a(torchState, this.f126997b.b());
        if (bitmapA != null) {
            ToggleImageButton toggleImageButton = this.f126997b;
            toggleImageButton.getClass();
            ViewExtensionsKt.runOnMainThread(toggleImageButton, new com.scandit.datacapture.core.internal.module.ui.control.d(bitmapA, toggleImageButton));
        }
        this.f126997b.setContentDescription(WhenMappings.$EnumSwitchMapping$0[torchState.ordinal()] == 1 ? this.contentDescriptionWhenOn : this.contentDescriptionWhenOff);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void access$onFrameSourceStarted(com.scandit.datacapture.core.ui.control.TorchSwitchControl r2, com.scandit.datacapture.core.source.FrameSource r3) {
        /*
            com.scandit.datacapture.core.internal.module.ui.control.ToggleImageButton r0 = r2.f126997b
            boolean r1 = r3 instanceof com.scandit.datacapture.core.source.Camera
            if (r1 == 0) goto L9
            com.scandit.datacapture.core.source.Camera r3 = (com.scandit.datacapture.core.source.Camera) r3
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L14
            boolean r3 = r3.isTorchAvailable()
            r1 = 1
            if (r3 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r0.getClass()
            com.scandit.datacapture.core.internal.module.ui.control.c r3 = new com.scandit.datacapture.core.internal.module.ui.control.c
            r3.<init>(r0, r1)
            com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt.runOnMainThread(r0, r3)
            com.scandit.datacapture.core.source.Camera r3 = r2.f127001f
            if (r3 == 0) goto L2d
            com.scandit.datacapture.core.source.TorchState r3 = r3.getDesiredTorchState()
            if (r3 == 0) goto L2d
            r2.a(r3)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.ui.control.TorchSwitchControl.access$onFrameSourceStarted(com.scandit.datacapture.core.ui.control.TorchSwitchControl, com.scandit.datacapture.core.source.FrameSource):void");
    }

    public static final void access$showImageForCurrentTorchState(TorchSwitchControl torchSwitchControl) {
        TorchState desiredTorchState;
        Camera camera = torchSwitchControl.f127001f;
        if (camera == null || (desiredTorchState = camera.getDesiredTorchState()) == null) {
            return;
        }
        torchSwitchControl.a(desiredTorchState);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onFrameSourceChanged(FrameSource frameSource) {
        TorchState desiredTorchState;
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (!Intrinsics.e(this.f127001f, camera)) {
            Camera camera2 = this.f127001f;
            if (camera2 != null) {
                camera2._removeWeakTorchListener$scandit_capture_core(this.f127000e);
            }
            this.f127001f = camera;
            if (camera != null) {
                k action = new k(this);
                Intrinsics.j(camera, "<this>");
                Intrinsics.j(action, "action");
                camera.addListener(new com.scandit.datacapture.core.internal.module.ui.control.torch.a(SetsKt.i(FrameSourceState.STANDBY, FrameSourceState.ON), action));
            }
            Camera camera3 = this.f127001f;
            if (camera3 != null) {
                camera3._addWeakTorchListener$scandit_capture_core(this.f127000e);
            }
        }
        Camera camera4 = this.f127001f;
        if (camera4 == null || (desiredTorchState = camera4.getDesiredTorchState()) == null) {
            return;
        }
        a(desiredTorchState);
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public <T extends Control> void _removeChildControl(Class<T> cls) {
        Control.DefaultImpls._removeChildControl(this, cls);
    }

    public final String getContentDescriptionWhenOff() {
        return this.contentDescriptionWhenOff;
    }

    public final String getContentDescriptionWhenOn() {
        return this.contentDescriptionWhenOn;
    }

    public final Bitmap getDefaultTorchOffImage() {
        return this.f126996a.a();
    }

    public final Bitmap getDefaultTorchOffPressedImage() {
        return this.f126996a.b();
    }

    public final Bitmap getDefaultTorchOnImage() {
        return this.f126996a.c();
    }

    public final Bitmap getDefaultTorchOnPressedImage() {
        return this.f126996a.d();
    }

    public final Bitmap getTorchOffImage() {
        return this.f126996a.e();
    }

    public final Bitmap getTorchOffPressedImage() {
        return this.f126996a.f();
    }

    public final Bitmap getTorchOnImage() {
        return this.f126996a.g();
    }

    public final Bitmap getTorchOnPressedImage() {
        return this.f126996a.h();
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public View get_view() {
        return this.f126997b;
    }

    public final void setContentDescriptionWhenOff(String str) {
        Intrinsics.j(str, "<set-?>");
        this.contentDescriptionWhenOff = str;
    }

    public final void setContentDescriptionWhenOn(String str) {
        Intrinsics.j(str, "<set-?>");
        this.contentDescriptionWhenOn = str;
    }

    public final void setTorchOffImage(int resId) {
        TorchControlIconsHandler torchControlIconsHandler = this.f126996a;
        torchControlIconsHandler.getClass();
        torchControlIconsHandler.a(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setTorchOffPressedImage(int resId) {
        TorchControlIconsHandler torchControlIconsHandler = this.f126996a;
        torchControlIconsHandler.getClass();
        torchControlIconsHandler.b(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setTorchOnImage(int resId) {
        TorchControlIconsHandler torchControlIconsHandler = this.f126996a;
        torchControlIconsHandler.getClass();
        torchControlIconsHandler.c(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void setTorchOnPressedImage(int resId) {
        TorchControlIconsHandler torchControlIconsHandler = this.f126996a;
        torchControlIconsHandler.getClass();
        torchControlIconsHandler.d(BitmapExtensionsKt.bitmapFromResource(resId));
    }

    public final void updateFromJson(String json) {
        Intrinsics.j(json, "json");
        TorchSwitchControlDeserializer.updateFromJson(this, new JsonValue(json));
    }

    public static final void access$toggleTorchOnOff(TorchSwitchControl torchSwitchControl, Camera camera) {
        TorchState torchState;
        torchSwitchControl.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[camera.getDesiredTorchState().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    torchState = TorchState.AUTO;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                torchState = TorchState.ON;
            }
        } else {
            torchState = TorchState.OFF;
        }
        camera.getBehaviorDelegate().a(torchState, new l(torchSwitchControl));
    }

    @Override // com.scandit.datacapture.core.ui.control.Control
    public void _onDataCaptureContextChanged(DataCaptureContext dataCaptureContext) {
        Control.DefaultImpls._onDataCaptureContextChanged(this, dataCaptureContext);
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

    public final void setImageResource(int resId) {
        setTorchOnImage(resId);
        setTorchOnPressedImage(resId);
        setTorchOffImage(resId);
        setTorchOffPressedImage(resId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TorchSwitchControl(Context context) {
        this(new TorchControlIconsHandler(), new ToggleImageButton(context));
        Intrinsics.j(context, "context");
    }
}
