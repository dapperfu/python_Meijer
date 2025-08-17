package com.scandit.datacapture.core.internal.sdk.common.camera;

import android.content.Context;
import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.JsonExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/camera/CameraSwitchControlDeserializer;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl;", "fromJson", "(Landroid/content/Context;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl;", "control", "", "updateFromJson", "(Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl;Lcom/scandit/datacapture/core/json/JsonValue;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class CameraSwitchControlDeserializer {
    public static final CameraSwitchControlDeserializer INSTANCE = new CameraSwitchControlDeserializer();

    private static void a(CameraSwitchControl cameraSwitchControl, JsonValue jsonValue) {
        Bitmap bitmapBitmapFromResource;
        Bitmap bitmapBitmapFromResource2;
        Bitmap bitmapBitmapFromResource3;
        Bitmap bitmapBitmapByKey;
        int i10 = R.drawable.sc_ic_camera_primary;
        int i11 = R.drawable.sc_ic_camera_primary_pressed;
        int i12 = R.drawable.sc_ic_camera_secondary;
        int i13 = R.drawable.sc_ic_camera_secondary_pressed;
        Bitmap bitmapBitmapFromResource4 = null;
        JsonValue byKeyAsObject = jsonValue.getByKeyAsObject(BarcodePickDeserializer.FIELD_ICON, null);
        if (byKeyAsObject != null) {
            JsonValue byKeyAsObject2 = byKeyAsObject.getByKeyAsObject("primaryCamera", null);
            if (byKeyAsObject2 != null) {
                bitmapBitmapByKey = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "default");
                bitmapBitmapFromResource2 = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "pressed");
            } else {
                bitmapBitmapFromResource2 = null;
                bitmapBitmapByKey = null;
            }
            JsonValue byKeyAsObject3 = byKeyAsObject.getByKeyAsObject("secondaryCamera", null);
            if (byKeyAsObject3 != null) {
                Bitmap bitmapBitmapByKey2 = JsonExtensionsKt.bitmapByKey(byKeyAsObject3, "default");
                bitmapBitmapFromResource3 = JsonExtensionsKt.bitmapByKey(byKeyAsObject3, "pressed");
                bitmapBitmapFromResource = bitmapBitmapByKey2;
            } else {
                bitmapBitmapFromResource = null;
                bitmapBitmapFromResource3 = null;
            }
            bitmapBitmapFromResource4 = bitmapBitmapByKey;
        } else {
            bitmapBitmapFromResource = null;
            bitmapBitmapFromResource2 = null;
            bitmapBitmapFromResource3 = null;
        }
        if (bitmapBitmapFromResource4 == null) {
            bitmapBitmapFromResource4 = BitmapExtensionsKt.bitmapFromResource(i10);
        }
        cameraSwitchControl.setPrimaryCameraImage(bitmapBitmapFromResource4);
        if (bitmapBitmapFromResource2 == null) {
            bitmapBitmapFromResource2 = BitmapExtensionsKt.bitmapFromResource(i11);
        }
        cameraSwitchControl.setPrimaryCameraPressedImage(bitmapBitmapFromResource2);
        if (bitmapBitmapFromResource == null) {
            bitmapBitmapFromResource = BitmapExtensionsKt.bitmapFromResource(i12);
        }
        cameraSwitchControl.setSecondaryCameraImage(bitmapBitmapFromResource);
        if (bitmapBitmapFromResource3 == null) {
            bitmapBitmapFromResource3 = BitmapExtensionsKt.bitmapFromResource(i13);
        }
        cameraSwitchControl.setSecondaryCameraPressedImage(bitmapBitmapFromResource3);
    }

    @JvmStatic
    public static final CameraSwitchControl fromJson(Context context, JsonValue json) {
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        CameraSwitchControlDeserializer cameraSwitchControlDeserializer = INSTANCE;
        JsonValue jsonValueRequireByKeyAsObject = json.requireByKeyAsObject("primaryCamera");
        cameraSwitchControlDeserializer.getClass();
        CameraSwitchControl cameraSwitchControl = new CameraSwitchControl(context, a(jsonValueRequireByKeyAsObject), a(json.requireByKeyAsObject("secondaryCamera")));
        a(cameraSwitchControl, json);
        return cameraSwitchControl;
    }

    @JvmStatic
    public static final void updateFromJson(CameraSwitchControl control, JsonValue json) {
        Intrinsics.j(control, "control");
        Intrinsics.j(json, "json");
        JsonValue byKeyAsObject = json.getByKeyAsObject("primaryCamera", null);
        if (byKeyAsObject != null) {
            INSTANCE.getClass();
            control.set_primaryCamera$scandit_capture_core(a(byKeyAsObject));
        }
        JsonValue byKeyAsObject2 = json.getByKeyAsObject("secondaryCamera", null);
        if (byKeyAsObject2 != null) {
            INSTANCE.getClass();
            control.set_secondaryCamera$scandit_capture_core(a(byKeyAsObject2));
        }
        INSTANCE.getClass();
        a(control, json);
    }

    private CameraSwitchControlDeserializer() {
    }

    private static Camera a(JsonValue jsonValue) {
        FrameSource frameSourceFrameSourceFromJsonValue$scandit_capture_core = new FrameSourceDeserializer(CollectionsKt.m()).frameSourceFromJsonValue$scandit_capture_core(jsonValue);
        Camera camera = frameSourceFrameSourceFromJsonValue$scandit_capture_core instanceof Camera ? (Camera) frameSourceFrameSourceFromJsonValue$scandit_capture_core : null;
        if (camera != null) {
            return camera;
        }
        throw new IllegalStateException((jsonValue.getAbsolutePath() + ": not a valid camera").toString());
    }
}
