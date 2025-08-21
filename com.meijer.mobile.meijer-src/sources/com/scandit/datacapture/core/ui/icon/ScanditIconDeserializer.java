package com.scandit.datacapture.core.ui.icon;

import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/ui/icon/ScanditIconDeserializer;", "", "", "json", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ScanditIconDeserializer {
    public static final ScanditIconDeserializer INSTANCE = new ScanditIconDeserializer();

    @JvmStatic
    public static final ScanditIcon fromJson(String json) {
        Intrinsics.j(json, "json");
        JsonValue jsonValue = new JsonValue(json);
        ScanditIconBuilder scanditIconBuilderBuilder = ScanditIcon.INSTANCE.builder();
        String byKeyAsString = jsonValue.getByKeyAsString(BarcodePickDeserializer.FIELD_ICON, "");
        Integer byKeyAsNullableColor = jsonValue.getByKeyAsNullableColor("iconColor", null);
        Integer byKeyAsNullableColor2 = jsonValue.getByKeyAsNullableColor("backgroundColor", null);
        Integer byKeyAsNullableColor3 = jsonValue.getByKeyAsNullableColor("backgroundStrokeColor", null);
        float byKeyAsFloat = jsonValue.getByKeyAsFloat("backgroundStrokeWidth", 2.0f);
        String byKeyAsString2 = jsonValue.getByKeyAsString("backgroundShape", "");
        if (byKeyAsString.length() > 0) {
            scanditIconBuilderBuilder.withIcon(ScanditIconTypeDeserializer.fromJson(byKeyAsString));
        }
        if (byKeyAsString2.length() > 0) {
            scanditIconBuilderBuilder.withBackgroundShape(ScanditIconShapeDeserializer.fromJson(byKeyAsString2));
        }
        scanditIconBuilderBuilder.withBackgroundStrokeWidth(byKeyAsFloat);
        if (byKeyAsNullableColor != null) {
            scanditIconBuilderBuilder.withIconColor(Integer.valueOf(byKeyAsNullableColor.intValue()));
        }
        if (byKeyAsNullableColor2 != null) {
            scanditIconBuilderBuilder.withBackgroundColor(Integer.valueOf(byKeyAsNullableColor2.intValue()));
        }
        if (byKeyAsNullableColor3 != null) {
            scanditIconBuilderBuilder.withBackgroundStrokeColor(Integer.valueOf(byKeyAsNullableColor3.intValue()));
        }
        return scanditIconBuilderBuilder.build();
    }

    private ScanditIconDeserializer() {
    }
}
