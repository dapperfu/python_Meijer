package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/MapEditorUtils;", "", "", "backgroundColor", "uiElementColorOnBackground", "(I)I", "", "text", "charCount", "ellipsizeTextIfTooLong", "(Ljava/lang/String;I)Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class MapEditorUtils {
    public static final MapEditorUtils INSTANCE = new MapEditorUtils();

    public final String ellipsizeTextIfTooLong(String text, int charCount) {
        Intrinsics.j(text, "text");
        String string = StringsKt.y1(text).toString();
        if (string.length() <= charCount) {
            return text;
        }
        return "••" + StringsKt.y1(StringsKt.K1(string, charCount)).toString();
    }

    private MapEditorUtils() {
    }

    public final int uiElementColorOnBackground(int backgroundColor) {
        if (((Color.blue(backgroundColor) * 0.114d) + ((Color.green(backgroundColor) * 0.587d) + (Color.red(backgroundColor) * 0.299d))) / 255.0d < 0.5d) {
            return BinsView.UI_ELEMENT_ON_DARK_COLOR;
        }
        return BinsView.UI_ELEMENT_ON_LIGHT_COLOR;
    }
}
