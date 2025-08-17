package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.ui.annotations.statusicon.BarcodeArStatusIconAnnotationAnchor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArStatusIconAnnotationAnchorDeserializer;", "", "", "json", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArStatusIconAnnotationAnchorDeserializer {
    public static final BarcodeArStatusIconAnnotationAnchorDeserializer INSTANCE = new BarcodeArStatusIconAnnotationAnchorDeserializer();

    @JvmStatic
    public static final BarcodeArStatusIconAnnotationAnchor fromJson(String json) {
        Intrinsics.j(json, "json");
        int iHashCode = json.hashCode();
        if (iHashCode != -1383228885) {
            if (iHashCode != 115029) {
                if (iHashCode != 3317767) {
                    if (iHashCode == 108511772 && json.equals("right")) {
                        return BarcodeArStatusIconAnnotationAnchor.RIGHT;
                    }
                } else if (json.equals("left")) {
                    return BarcodeArStatusIconAnnotationAnchor.LEFT;
                }
            } else if (json.equals("top")) {
                return BarcodeArStatusIconAnnotationAnchor.TOP;
            }
        } else if (json.equals("bottom")) {
            return BarcodeArStatusIconAnnotationAnchor.BOTTOM;
        }
        throw new IllegalArgumentException("No match found for ".concat(json));
    }

    private BarcodeArStatusIconAnnotationAnchorDeserializer() {
    }
}
