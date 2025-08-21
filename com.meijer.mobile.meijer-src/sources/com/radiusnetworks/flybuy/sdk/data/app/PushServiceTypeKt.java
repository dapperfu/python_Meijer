package com.radiusnetworks.flybuy.sdk.data.app;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toPushServiceType", "Lcom/radiusnetworks/flybuy/sdk/data/app/PushServiceType;", "", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushServiceTypeKt {
    public static final PushServiceType toPushServiceType(String str) {
        String lowerCase;
        if (str != null) {
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            lowerCase = str.toLowerCase(US);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        PushServiceType pushServiceType = PushServiceType.FCM;
        if (Intrinsics.e(lowerCase, pushServiceType.getTypeString())) {
            return pushServiceType;
        }
        PushServiceType pushServiceType2 = PushServiceType.AIRSHIP;
        if (Intrinsics.e(lowerCase, pushServiceType2.getTypeString())) {
            return pushServiceType2;
        }
        PushServiceType pushServiceType3 = PushServiceType.ONE_SIGNAL;
        if (Intrinsics.e(lowerCase, pushServiceType3.getTypeString())) {
            return pushServiceType3;
        }
        PushServiceType pushServiceType4 = PushServiceType.APNS;
        if (Intrinsics.e(lowerCase, pushServiceType4.getTypeString())) {
            return pushServiceType4;
        }
        return null;
    }
}
