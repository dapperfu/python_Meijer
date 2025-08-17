package com.radiusnetworks.flybuy.sdk.data.common;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toInputType", "Lcom/radiusnetworks/flybuy/sdk/data/common/InputType;", "", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputTypeKt {
    public static final InputType toInputType(String str) {
        String lowerCase;
        if (str != null) {
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            lowerCase = str.toLowerCase(US);
            Intrinsics.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        } else {
            lowerCase = null;
        }
        InputType inputType = InputType.TEXT;
        if (!Intrinsics.e(lowerCase, inputType.getAsString())) {
            InputType inputType2 = InputType.NUMBER;
            if (Intrinsics.e(lowerCase, inputType2.getAsString())) {
                return inputType2;
            }
        }
        return inputType;
    }
}
