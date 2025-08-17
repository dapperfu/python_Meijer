package com.scandit.datacapture.core.ui.icon;

import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.internal.sdk.utils.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/ui/icon/ScanditIconSerializer;", "", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "scanditIcon", "", "toJson", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;)Ljava/lang/String;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ScanditIconSerializer {
    public static final ScanditIconSerializer INSTANCE = new ScanditIconSerializer();

    @JvmStatic
    public static final String toJson(ScanditIcon scanditIcon) throws JSONException {
        Intrinsics.j(scanditIcon, "scanditIcon");
        JSONObject jSONObject = new JSONObject();
        ScanditIconType icon = scanditIcon.getCom.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer.FIELD_ICON java.lang.String();
        if (icon != null) {
            jSONObject.put(BarcodePickDeserializer.FIELD_ICON, ScanditIconTypeSerializer.toJson(icon));
        }
        Integer iconColor = scanditIcon.getIconColor();
        if (iconColor != null) {
            jSONObject.put("iconColor", ColorExtensionsKt.toColorJsonValue(iconColor.intValue()));
        }
        Integer backgroundColor = scanditIcon.getBackgroundColor();
        if (backgroundColor != null) {
            jSONObject.put("backgroundColor", ColorExtensionsKt.toColorJsonValue(backgroundColor.intValue()));
        }
        Integer backgroundStrokeColor = scanditIcon.getBackgroundStrokeColor();
        if (backgroundStrokeColor != null) {
            jSONObject.put("backgroundStrokeColor", ColorExtensionsKt.toColorJsonValue(backgroundStrokeColor.intValue()));
        }
        ScanditIconShape backgroundShape = scanditIcon.getBackgroundShape();
        if (backgroundShape != null) {
            jSONObject.put("backgroundShape", ScanditIconShapeSerializer.toJson(backgroundShape));
        }
        jSONObject.put("backgroundStrokeWidth", Float.valueOf(scanditIcon.getBackgroundStrokeWidth()));
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    private ScanditIconSerializer() {
    }
}
