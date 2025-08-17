package com.scandit.datacapture.barcode.internal.sdk.utils;

import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R0\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\b\u0010\t\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/utils/DeviceUtils;", "", "", "isXCoverDevice$scandit_barcode_capture", "()Z", "isXCoverDevice", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "getModelName$scandit_barcode_capture", "()Ljava/lang/String;", "setModelName$scandit_barcode_capture", "(Ljava/lang/String;)V", "getModelName$scandit_barcode_capture$annotations", "()V", "modelName", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class DeviceUtils {
    public static final DeviceUtils INSTANCE = new DeviceUtils();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static String modelName = Build.MODEL;

    public static /* synthetic */ void getModelName$scandit_barcode_capture$annotations() {
    }

    public final String getModelName$scandit_barcode_capture() {
        return modelName;
    }

    public final boolean isXCoverDevice$scandit_barcode_capture() {
        List listP = CollectionsKt.p("(sm-g388|sm-g389).*", "(sm-g390|sm-g398).*", "(sm-g525).*", "(sm-g715).*", "(sm-g736).*");
        if ((listP instanceof Collection) && listP.isEmpty()) {
            return false;
        }
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            Regex regex = new Regex((String) it.next(), RegexOption.f147463c);
            INSTANCE.getClass();
            String str = modelName;
            Intrinsics.g(str);
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.i(ENGLISH, "ENGLISH");
            String lowerCase = str.toLowerCase(ENGLISH);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            if (regex.j(StringsKt.y1(StringsKt.Q(lowerCase, "samsung-", "", false, 4, null)).toString())) {
                return true;
            }
        }
        return false;
    }

    public final void setModelName$scandit_barcode_capture(String str) {
        modelName = str;
    }

    private DeviceUtils() {
    }
}
