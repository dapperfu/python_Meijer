package com.scandit.datacapture.core.internal.sdk.common.torch;

import android.content.Context;
import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.JsonExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/torch/TorchSwitchControlDeserializer;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl;", "fromJson", "(Landroid/content/Context;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl;", "control", "", "updateFromJson", "(Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl;Lcom/scandit/datacapture/core/json/JsonValue;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TorchSwitchControlDeserializer {
    public static final TorchSwitchControlDeserializer INSTANCE = new TorchSwitchControlDeserializer();

    @JvmStatic
    public static final TorchSwitchControl fromJson(Context context, JsonValue json) {
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        TorchSwitchControl torchSwitchControl = new TorchSwitchControl(context);
        updateFromJson(torchSwitchControl, json);
        return torchSwitchControl;
    }

    @JvmStatic
    public static final void updateFromJson(TorchSwitchControl control, JsonValue json) {
        Bitmap bitmapBitmapFromResource;
        Bitmap bitmapBitmapFromResource2;
        Bitmap bitmapBitmapFromResource3;
        Bitmap bitmapBitmapByKey;
        Intrinsics.j(control, "control");
        Intrinsics.j(json, "json");
        Bitmap bitmapBitmapFromResource4 = null;
        JsonValue byKeyAsObject = json.getByKeyAsObject(BarcodePickDeserializer.FIELD_ICON, null);
        if (byKeyAsObject != null) {
            JsonValue byKeyAsObject2 = byKeyAsObject.getByKeyAsObject("on", null);
            if (byKeyAsObject2 != null) {
                bitmapBitmapByKey = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "default");
                bitmapBitmapFromResource2 = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "pressed");
            } else {
                bitmapBitmapFromResource2 = null;
                bitmapBitmapByKey = null;
            }
            JsonValue byKeyAsObject3 = byKeyAsObject.getByKeyAsObject("off", null);
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
        int i10 = R.drawable.sc_ic_torch_on;
        int i11 = R.drawable.sc_ic_torch_on_pressed;
        int i12 = R.drawable.sc_ic_torch_off;
        int i13 = R.drawable.sc_ic_torch_off_pressed;
        if (bitmapBitmapFromResource4 == null) {
            bitmapBitmapFromResource4 = BitmapExtensionsKt.bitmapFromResource(i10);
        }
        control.setTorchOnImage(bitmapBitmapFromResource4);
        if (bitmapBitmapFromResource2 == null) {
            bitmapBitmapFromResource2 = BitmapExtensionsKt.bitmapFromResource(i11);
        }
        control.setTorchOnPressedImage(bitmapBitmapFromResource2);
        if (bitmapBitmapFromResource == null) {
            bitmapBitmapFromResource = BitmapExtensionsKt.bitmapFromResource(i12);
        }
        control.setTorchOffImage(bitmapBitmapFromResource);
        if (bitmapBitmapFromResource3 == null) {
            bitmapBitmapFromResource3 = BitmapExtensionsKt.bitmapFromResource(i13);
        }
        control.setTorchOffPressedImage(bitmapBitmapFromResource3);
    }

    private TorchSwitchControlDeserializer() {
    }
}
