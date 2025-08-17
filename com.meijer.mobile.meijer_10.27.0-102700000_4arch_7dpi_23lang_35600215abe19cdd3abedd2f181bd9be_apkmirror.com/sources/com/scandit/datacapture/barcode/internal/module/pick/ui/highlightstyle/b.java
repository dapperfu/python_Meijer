package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class b {
    public static final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c a(BarcodePickViewHighlightStyle barcodePickViewHighlightStyle) {
        Intrinsics.j(barcodePickViewHighlightStyle, "<this>");
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            return new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.b();
        }
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            return com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.e.f122776b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String a(BarcodePickViewHighlightStyle barcodePickViewHighlightStyle, String json) throws JSONException {
        BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder;
        Intrinsics.j(barcodePickViewHighlightStyle, "<this>");
        Intrinsics.j(json, "json");
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            barcodePickHighlightStyleIconsHolder = ((BarcodePickViewHighlightStyle.RectangularWithIcons) barcodePickViewHighlightStyle).get_iconsHolder();
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            barcodePickHighlightStyleIconsHolder = ((BarcodePickViewHighlightStyle.DotWithIcons) barcodePickViewHighlightStyle).get_iconsHolder();
        } else {
            if (!(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView)) {
                throw new NoWhenBranchMatchedException();
            }
            barcodePickHighlightStyleIconsHolder = null;
        }
        if (barcodePickHighlightStyleIconsHolder == null) {
            return json;
        }
        JSONObject jSONObject = new JSONObject(json);
        Intrinsics.j(barcodePickHighlightStyleIconsHolder, "<this>");
        JSONArray jSONArrayA = e.a(new c(barcodePickHighlightStyleIconsHolder));
        if (jSONArrayA != null) {
            jSONObject.put(BarcodePickDeserializer.FIELD_ICONS_FOR_STATE, jSONArrayA);
        }
        Intrinsics.j(barcodePickHighlightStyleIconsHolder, "<this>");
        JSONArray jSONArrayA2 = e.a(new d(barcodePickHighlightStyleIconsHolder));
        if (jSONArrayA2 != null) {
            jSONObject.put(BarcodePickDeserializer.FIELD_SELECTED_ICONS_FOR_STATE, jSONArrayA2);
        }
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
